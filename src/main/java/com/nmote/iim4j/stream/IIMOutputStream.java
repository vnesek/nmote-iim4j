/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.Closeable;
import java.io.IOException;

/**
 * IIMOutputStream
 */
public interface IIMOutputStream extends Closeable {

	void write(int ch) throws IOException;

	void write(byte[] buffer) throws IOException;

	void write(byte[] buffer, int offset, int length) throws IOException;

	void close() throws IOException;

}
