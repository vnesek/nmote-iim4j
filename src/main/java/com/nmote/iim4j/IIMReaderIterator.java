/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.dataset.InvalidDataSetException;

/**
 * IIMReaderIterator takes IIMReader and exposes it as
 * an Iterator.
 */
public class IIMReaderIterator implements Iterator<DataSet> {

	public IIMReaderIterator(IIMReader reader) {
		this.reader = reader;
	}

	/**
	 * @see java.util.Iterator#remove()
	 */
	public void remove() {
	}

	/**
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext() {
		try {
			next = reader.read();
			return next != null; 
		} catch (IOException e) {
			next = null;
			return false;
		} catch (InvalidDataSetException e) {
			next = null;
			return false;
		}
	}

	/**
	 * @see java.util.Iterator#next()
	 */
	public DataSet next() {
		if (next == null && !hasNext()) {
			throw new NoSuchElementException();
		}
		return next;
	}
	
	private DataSet next;
	private final IIMReader reader;
}