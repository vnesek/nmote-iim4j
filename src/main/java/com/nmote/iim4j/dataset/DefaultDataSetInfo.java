/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.serialize.Serializer;

/**
 * DefaultDataSetInfo is basic implementation of DataSetInfo interface.
 * Instances of this class are immutable.
 */
public class DefaultDataSetInfo implements DataSetInfo {

	public DefaultDataSetInfo(int dataSetNumber, String name, Serializer serializer, boolean repeatable) {
		this.dataSet = dataSetNumber;
		this.name = name;
		this.serializer = serializer;
		this.repetable = repeatable;
	}

	public int getDataSetNumber() {
		return dataSet;
	}

	public String getName() {
		return name;
	}

	public boolean isRepeatable() {
		return repetable;
	}

	public Serializer getSerializer() {
		return serializer;
	}

	public String toString() {
		int recordNumber = (dataSet >> 8) & 0xFF;
		int dataSetNumber = dataSet & 0xFF;

		return Integer.toString(recordNumber) + ":" + dataSetNumber;
	}

	private int dataSet;
	private String name;
	private Serializer serializer;
	private boolean repetable;
}
