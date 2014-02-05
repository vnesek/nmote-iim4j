/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.SerializationException;

/**
 * DataSet is an instance of a DataSet in IIM record.
 */
public interface DataSet {

	/**
	 * @return
	 */
	public DataSetInfo getInfo();

	/**
	 * @return
	 */
	public byte[] getData();
	
	public int getLength();
	
	public Object getValue() throws SerializationException;
}
