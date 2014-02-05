/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.BinarySerializer;

/**
 * DefaultDataSetInfoFactory just instantiated DataSetInfo instances from passed
 * recordNumber and dataSetNumber;
 */
public class DefaultDataSetInfoFactory implements DataSetInfoFactory {

	/**
	 * @see com.nmote.iim4j.DataSetInfoFactory#create(int, int)
	 */
	public DataSetInfo create(int dataSet) throws InvalidDataSetException {
		int recordNumber = (dataSet >> 8) & 0xFF;
		int dataSetNumber = dataSet & 0xFF;
		if (recordNumber < 0 || recordNumber > 9) {
			throw new InvalidDataSetException("record number: " + recordNumber);
		}
		if (dataSetNumber < 0 || dataSetNumber > 255) {
			throw new InvalidDataSetException("dataset number: " + dataSetNumber);
		}
		return new DefaultDataSetInfo(dataSet, "<unknown>", new BinarySerializer(null), true);
	}
}
