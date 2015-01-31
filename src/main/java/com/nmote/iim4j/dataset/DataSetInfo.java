/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.Serializer;

/**
 * DataSetInfo contains meta-information about an instance of IIM DataSet.
 */
public interface DataSetInfo {

	/**
	 * Returns DataSet number.
	 *
	 * @return DataSet number
	 */
	int getDataSetNumber();

	/**
	 * Returns DataSet name.
	 *
	 * @return DataSet name
	 */
	String getName();

	/**
	 * Returns true if DataSet is repeatable.
	 *
	 * @return true if DataSet is repeatable
	 */
	boolean isRepeatable();

	/**
	 * Returns true if DataSet is mandatory.
	 *
	 * @return true if DataSet is repeatable
	 */
	// public boolean isMandatory();

	/**
	 * Returns serializer for this dataset.
	 *
	 * @return serializer for this dataset
	 */
	Serializer getSerializer();
}