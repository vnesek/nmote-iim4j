/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
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

	public boolean isCached() {
		return true;
	}

	public void seek(long position) throws IOException {
		file.seek(position);
	}

	public int read() throws IOException {
		return file.read();
	}

	public int read(byte[] buffer) throws IOException {
		return file.read(buffer);
	}

	public int read(byte[] buffer, int offset, int length) throws IOException {
		return file.read(buffer, offset, length);
	}

	public void close() throws IOException {
		file.close();
	}

	protected void finalize() throws Throwable {
		close();
	}

	public long position() throws IOException {
		return file.getFilePointer();
	}

	private final RandomAccessFile file;
}
