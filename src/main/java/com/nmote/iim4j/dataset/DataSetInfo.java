/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.Serializer;

/**
 * DataSetInfo contains meta-information about a IIM DataSet.
 */
public interface DataSetInfo {

	/**
	 * Returns DataSet number.
	 * 
	 * @return DataSet number
	 */
	public int getDataSetNumber();

	/**
	 * Returns DataSet name.
	 * 
	 * @return DataSet name
	 */
	public String getName();

	/**
	 * Returns true if DataSet is repeatable.
	 * 
	 * @return true if DataSet is repeatable
	 */
	public boolean isRepeatable();

	/**
	 * Returns true if DataSet is mandatory.
	 * 
	 * @return true if DataSet is repeatable
	 */
	// public boolean isMandatory();

	/**
	 * Returs serializer for this dataset.
	 * 
	 * @return
	 */
	public Serializer getSerializer();
}