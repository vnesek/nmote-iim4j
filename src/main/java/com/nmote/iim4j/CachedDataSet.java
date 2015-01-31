/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.EOFException;
import java.io.IOException;

import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.dataset.DefaultDataSet;
import com.nmote.iim4j.stream.IIMInputStream;
import com.nmote.iim4j.stream.IIMOutputStream;

/**
 * CachedDataSet is a DataSet implementation that uses cached IIMInputStream for
 * input
 */
class CachedDataSet extends DefaultDataSet {

	public CachedDataSet(IIMInputStream input, long pos, int length, DataSetInfo info) {
		super(info);
		this.input = input;
		this.pos = pos;
		this.length = length;
	}

	/**
	 * @see com.nmote.iim4j.DataSet#getData()
	 */
	public byte[] getData() {
		synchronized (this) {
			byte[] data = super.getData();
			if (data == null && input != null) {
				try {
					synchronized (input) {
						input.seek(pos);
						data = IIMReader.readFully(input, length);
					}
					super.setData(data);
				} catch (IOException e) {
					throw new RuntimeException("failed to read DataSet data: " + e);
				} finally {
					input = null;
				}
			}
			return data;
		}
	}

	void writeDataTo(IIMOutputStream out) throws IOException {
		synchronized (this) {
			byte[] data = super.getData();
			if (data != null) {
				out.write(data);
			} else if (input != null) {
				synchronized (input) {
					input.seek(pos);
					byte[] buffer = new byte[Math.min(length, 2048)];
					int copied = 0;
					while (copied < length) {
						int r = input.read(buffer);
						if (r < 0)
							throw new EOFException("premature end-of-file reached");
						copied += r;
						out.write(buffer);
					}
				}
			} else {
				throw new IOException("invalid state");
			}
		}
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return this.length;
	}

	private IIMInputStream input;
	private long pos;
	private int length;
}
