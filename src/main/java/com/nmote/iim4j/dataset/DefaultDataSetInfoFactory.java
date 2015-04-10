/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.BinarySerializer;

/**
 * DefaultDataSetInfoFactory just creates DataSetInfo instances from passed
 * recordNumber and dataSetNumber; it has no knowledge of actual format and uses
 * {@link BinarySerializer} for reading and writing.
 */
public class DefaultDataSetInfoFactory implements DataSetInfoFactory {

	public DataSetInfo create(int dataSet) throws InvalidDataSetException {
		int recordNumber = (dataSet >> 8) & 0xFF;
		int dataSetNumber = dataSet & 0xFF;
		if (recordNumber < 0 || recordNumber > 9) {
			throw new InvalidDataSetException("record number: " + recordNumber);
		}
		if (dataSetNumber < 0 || dataSetNumber > 255) {
			throw new InvalidDataSetException("dataset number: " + dataSetNumber);
		}
		return new DefaultDataSetInfo(dataSet, "<unknown>", new BinarySerializer(null), true, false);
	}
}
