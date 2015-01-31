/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.SerializationException;

/**
 * DataSet is an instance of a DataSet in IIM record.
 */
public interface DataSet {

	/**
	 * @return metadata about this data set
	 */
	DataSetInfo getInfo();

	/**
	 * @return raw data
	 */
	byte[] getData();

	/**
	 * @return data set length in bytes
	 */
	int getLength();

	/**
	 * @return actual, deserialized dataset value
	 * @throws SerializationException
	 *             if raw data can't be deserialized
	 */
	Object getValue() throws SerializationException;
}
