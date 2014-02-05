/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.IOException;

/**
 * IIMInputStream is specialized seekable input stream used by IIMParser.
 */
public interface IIMInputStream {

	/**
	 * Returns true if stream is cached (can be rewind to previous position).
	 * 
	 * @return true if stream is cached
	 */
	boolean isCached();

	void seek(long position) throws IOException;

	long position() throws IOException;

	int read() throws IOException;

	int read(byte[] buffer) throws IOException;

	int read(byte[] buffer, int offset, int length) throws IOException;

	void close() throws IOException;
}
