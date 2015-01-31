/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
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
 * an Iterator over data sets.
 */
public class IIMReaderIterator implements Iterator<DataSet> {

	public IIMReaderIterator(IIMReader reader) {
		this.reader = reader;
	}

	public void remove() {
	}

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

	public DataSet next() {
		if (next == null && !hasNext()) {
			throw new NoSuchElementException();
		}
		return next;
	}

	private DataSet next;
	private final IIMReader reader;
}