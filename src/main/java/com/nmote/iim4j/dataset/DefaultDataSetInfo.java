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

	public DefaultDataSetInfo(int dataSetNumber, String name, Serializer serializer, boolean repeatable,
			boolean mandatory) {
		this.dataSet = dataSetNumber;
		this.name = name;
		this.serializer = serializer;
		this.repetable = repeatable;
		this.mandatory = mandatory;
	}

	public int compareTo(DataSetInfo dsi) {
		return getDataSetNumber() - dsi.getDataSetNumber();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DataSetInfo)) {
			return false;
		}
		return ((DataSetInfo) obj).getDataSetNumber() == getDataSetNumber();
	}

	public int getDataSetNumber() {
		return dataSet;
	}

	public String getName() {
		return name;
	}

	public Serializer getSerializer() {
		return serializer;
	}

	@Override
	public int hashCode() {
		return dataSet;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public boolean isRepeatable() {
		return repetable;
	}

	public String toString() {
		int recordNumber = (dataSet >> 8) & 0xFF;
		int dataSetNumber = dataSet & 0xFF;

		return Integer.toString(recordNumber) + ":" + dataSetNumber;
	}

	private int dataSet;
	private boolean mandatory;
	private String name;
	private boolean repetable;
	private Serializer serializer;
}
