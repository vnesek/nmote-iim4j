/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
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

	/**
	 * @throws java.io.IOException
	 */
	public void close() throws IOException {
		this.out.close();
	}

	/**
	 * @param b
	 * @throws java.io.IOException
	 */
	public void write(byte[] b) throws IOException {
		this.out.write(b);
	}

	/**
	 * @param b
	 * @param off
	 * @param len
	 * @throws java.io.IOException
	 */
	public void write(byte[] b, int off, int len) throws IOException {
		this.out.write(b, off, len);
	}

	/**
	 * @param b
	 * @throws java.io.IOException
	 */
	public void write(int b) throws IOException {
		this.out.write(b);
	}

	protected OutputStream out;
}
