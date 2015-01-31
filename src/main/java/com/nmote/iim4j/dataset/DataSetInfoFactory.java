/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

/**
 * DataSetInfoFactory creates DataSetInfo instances from record and dataset
 * numbers.
 */
public interface DataSetInfoFactory {

	/**
	 * @param dataSet
	 *            dataset record number
	 * @return dataset info instance
	 * @throws InvalidDataSetException
	 *             if dataset number is invalid.
	 */
	DataSetInfo create(int dataSet) throws InvalidDataSetException;
}
