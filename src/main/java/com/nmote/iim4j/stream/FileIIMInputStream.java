/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * FileIIMInputStream is an implementation of IIMInputStream backed up by
 * RandomAccessFile.
 */
public class FileIIMInputStream implements IIMInputStream {

	public FileIIMInputStream(RandomAccessFile file) throws IOException {
		if (file == null) {
			throw new NullPointerException("file == null");
		}
		this.file = file;
	}

	public FileIIMInputStream(File file) throws IOException {
		this(new RandomAccessFile(file, "r"));
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#isCached()
	 */
	public boolean isCached() {
		return true;
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#seek(long)
	 */
	public void seek(long position) throws IOException {
		file.seek(position);
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#read()
	 */
	public int read() throws IOException {
		return file.read();
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#read(byte[])
	 */
	public int read(byte[] buffer) throws IOException {
		return file.read(buffer);
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#read(byte[], int, int)
	 */
	public int read(byte[] buffer, int offset, int length) throws IOException {
		return file.read(buffer, offset, length);
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#close()
	 */
	public void close() throws IOException {
		file.close();
	}

	/**
	 * @see java.lang.Object#finalize()
	 */
	protected void finalize() throws Throwable {
		close();
	}

	/**
	 * @see com.nmote.iim4j.stream.IIMInputStream#position()
	 */
	public long position() throws IOException {
		return file.getFilePointer();
	}

	private final RandomAccessFile file;
}
