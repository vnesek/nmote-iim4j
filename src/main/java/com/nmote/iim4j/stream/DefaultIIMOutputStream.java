/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * DefaultIIMOutputStream
 */
public class DefaultIIMOutputStream implements IIMOutputStream {

	public DefaultIIMOutputStream(OutputStream out) {
		this.out = out;
	}

	public DefaultIIMOutputStream(File f) throws FileNotFoundException {
		this(new FileOutputStream(f));
	}

	public void close() throws IOException {
		this.out.close();
	}

	public void write(byte[] b) throws IOException {
		this.out.write(b);
	}

	public void write(byte[] b, int off, int len) throws IOException {
		this.out.write(b, off, len);
	}

	public void write(int b) throws IOException {
		this.out.write(b);
	}

	protected OutputStream out;
}
