/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.EOFException;
import java.io.IOException;

import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.dataset.DataSetInfoFactory;
import com.nmote.iim4j.dataset.DefaultDataSet;
import com.nmote.iim4j.dataset.InvalidDataSetException;
import com.nmote.iim4j.stream.IIMInputStream;

/**
 * IIMParser reads IIM file producing DataSets. IIMReader works in a
 * pull mode, DataSet instances are pulled from parser through standard
 * java.util.Iterator interface or you can use readDataSet() method to
 * read DataSet-s directly.
 */
public class IIMReader {

	public IIMReader(IIMInputStream input) {
		this(input, IIMDataSetInfoFactory.VERSION_4);
	}

	public IIMReader(IIMInputStream input, DataSetInfoFactory dsiFactory) {
		if (input == null) {
			throw new NullPointerException("input == null");
		}
		if (dsiFactory == null) {
			throw new NullPointerException("dsiFactory == null");
		}
		this.input = input;
		this.dsiFactory = dsiFactory;
	}
	
	public DataSet read() throws IOException, InvalidDataSetException {
		if (input == null) {
			throw new IOException("input was closed");
		}
		
		synchronized (input) {
			boolean cached = input.isCached();
			
			// If we are working with a cached input, rewind to
			// recorded position
			if (cached) {
				input.seek(pos);
			}
			
			int tag = input.read();
			if (tag == -1) {
				// We've reached EOF, no more datasets to return
				close();
				return null;
			}
			
			if (tag != 28) {
				throw new IIMFormatException("expected TAG 0x1C"); 
			}
			
			int recordNumber = readAndThrowEOF();
			int dataSetNumber = readAndThrowEOF();
			
			// Get a DataSetInfo
			DataSetInfo info = dsiFactory.create((recordNumber << 8) | dataSetNumber);
			
			// Length
			int oc1 = readAndThrowEOF();
			int oc2 = readAndThrowEOF();
			
			DataSet result = null;
			
			int length = oc1 << 8 | oc2;
			if (length > 32767) {
				// Extended Tag
				int count = length & 0x7FFF;
				if (count < 1) {
					throw new IIMFormatException("too short extended data set count: " + count);					
				}
				if (count > 4) {
					throw new IIMFormatException("too long extended data set count: " + count);
				}
				length = readAndThrowEOF();
				for (int i = 1; i < count; ++i) {
					length = (length << 8) | readAndThrowEOF();
				}
				//System.out.println("Extended: " + info);
			}
			
			if (cached) {
			   result = new CachedDataSet(input, input.position(), length, info);
			   input.seek(input.position() + length);
			} else {
			   result = new DefaultDataSet(info, readFully(input, length));
			}

			pos = input.position();
			
			return result;
		}
	}
	
	/**
	 * Tries to recover from errors that occured during last call to read.
	 * Searches for next start or record tag (0x1C) in input stream. Can
	 * be called only on cached inputs
	 * @return true if IIMReader has recovered from error and you can use read
	 * 	to read next dataset
	 * @throws IOException
	 * @throws IllegalStateException if input isn't cached
	 */
	public boolean recover() throws IOException {
		if (!input.isCached()) {
			throw new IllegalStateException("can't recover using input that isn't cached");
		}
		
		synchronized (input) {
			// Seek a byte after last position
			input.seek(pos + 1);
			
			int tag = input.read();
			while (tag != 28) {
				if (tag == -1) {
					// We've reached EOF, no more datasets to return
					close();
					return false;
				}
				tag = input.read();
			}
			
			pos = input.position() - 1;
			input.seek(pos);
			
			return true;
		}
	}
	
	static byte[] readFully(IIMInputStream input, int length) throws IOException {
		byte[] data = new byte[length];
		for (int offset = 0; offset < length; ) {
			int r = input.read(data, offset, length - offset);
			if (r == -1) {
				throw new EOFException();
			}
			offset += r;
		}
		return data;		
	}
	
	private int readAndThrowEOF() throws IOException {
		int r = input.read();
		if (r == -1) {
			throw new EOFException();
		}
		return r;
	}
	
	public void close() throws IOException {
		try {
			if (input != null && !input.isCached()) {
				input.close();
			}
		} finally {
			input = null;
		}
	}

	private long pos = 0;
	private IIMInputStream input;
	private DataSetInfoFactory dsiFactory;
}