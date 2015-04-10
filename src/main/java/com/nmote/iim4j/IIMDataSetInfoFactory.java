/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.dataset.DataSetInfoFactory;
import com.nmote.iim4j.dataset.DefaultDataSetInfo;
import com.nmote.iim4j.dataset.DefaultDataSetInfoFactory;
import com.nmote.iim4j.dataset.InvalidDataSetException;
import com.nmote.iim4j.dataset.UnsupportedDataSetException;
import com.nmote.iim4j.serialize.DefaultSerializerFactory;
import com.nmote.iim4j.serialize.SerializerFactory;

/**
 * IIMDataSetInfoFactory
 */
public class IIMDataSetInfoFactory extends DefaultDataSetInfoFactory {

	public static final DataSetInfoFactory VERSION_4 = new IIMDataSetInfoFactory();

	public IIMDataSetInfoFactory() {
		this("4", new DefaultSerializerFactory());
	}

	public IIMDataSetInfoFactory(String version, SerializerFactory serializerFactory) {
		String file = "IIMv" + version + ".txt";
		try {
			InputStream in = IIMDataSetInfoFactory.class.getResourceAsStream(file);
			if (in == null) {
				throw new RuntimeException("IIM meta file: " + file + " not found in com.nmote.iim4j package");
			}
			dataSets = load(in, serializerFactory);
		} catch (IOException ioe) {
			throw new RuntimeException("IOException while reading IIM meta file: " + file, ioe);
		}
	}

	private Map<Integer, DataSetInfo> load(InputStream in, SerializerFactory serializerFactory) throws IOException {
		Map<Integer, DataSetInfo> ds = new HashMap<Integer, DataSetInfo>();
		BufferedReader r = new BufferedReader(new InputStreamReader(in, "utf-8"));
		for (;;) {
			String line = r.readLine();
			if (line == null) {
				break;
			}
			line = line.trim();
			if (line.length() == 0 || line.startsWith("#")) {
				continue;
			}
			String[] a = line.split(":");
			DataSetInfo info = new DefaultDataSetInfo(Integer.parseInt(a[0]) << 8 | Integer.parseInt(a[1]),
					a[2].trim(), serializerFactory.create(a[3]), a[4].indexOf('r') != -1, a[4].indexOf('m') != -1);
			ds.put(createKey(info.getDataSetNumber()), info);
		}
		r.close();
		return ds;
	}

	private Integer createKey(int dataSet) {
		return new Integer(dataSet);
	}

	/**
	 * Creates and caches dataset info object. Subsequent invocations will
	 * return same instance.
	 *
	 * @see IIM#DS(int, int)
	 * @param dataSet
	 *            dataset record number
	 * @return dataset info instace
	 */
	public DataSetInfo create(int dataSet) throws InvalidDataSetException {
		DataSetInfo info = dataSets.get(createKey(dataSet));
		if (info == null) {
			int recordNumber = (dataSet >> 8) & 0xFF;
			int dataSetNumber = dataSet & 0xFF;
			throw new UnsupportedDataSetException(recordNumber + ":" + dataSetNumber);
			// info = super.create(dataSet);
		}
		return info;
	}

	private final Map<Integer, DataSetInfo> dataSets;

	public static void main(String[] args) throws Exception {
		IIMDataSetInfoFactory dsf = new IIMDataSetInfoFactory();
		for (Iterator<Map.Entry<Integer, DataSetInfo>> i = dsf.dataSets.entrySet().iterator(); i.hasNext();) {
			Map.Entry<Integer, DataSetInfo> entry = i.next();
			DataSetInfo ds = entry.getValue();
			int dataSet = entry.getKey().intValue();
			int recordNumber = (dataSet >> 8) & 0xFF;
			int dataSetNumber = dataSet & 0xFF;

			System.out.println("\t/** " + recordNumber + ":" + dataSetNumber + " " + ds.getName() + " */");
			System.out.println("\tpublic static final int "
					+ ds.getName().toUpperCase().replace(' ', '_').replace('/', '_').replace('-', '_') + " = DS("
					+ recordNumber + ", " + dataSetNumber + ");");
			System.out.println();
		}

	}
}
