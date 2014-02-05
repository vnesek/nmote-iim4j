/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.IOException;

import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.stream.IIMOutputStream;

/**
 * IIMWriter
 */
public class IIMWriter {

	/**
	 * 
	 */
	public IIMWriter(IIMOutputStream out) {
		this.output = out;
	}

	public void write(DataSet ds) throws IOException {
		if (output == null) {
			throw new IOException("output was closed");
		}

		synchronized (output) {
			// Write tag
			output.write(0x1C);

			// Write dataset identifaction
			DataSetInfo info = ds.getInfo();
			int dsn = info.getDataSetNumber();
			output.write((dsn >> 8) & 0xFF);
			output.write(dsn & 0xFF);

			// Write length
			int len = ds.getLength();
			if (len <= 32767) {
				output.write((len >> 8) & 0xFF);
				output.write(len & 0xFF);
			} else {
				// Extended tag
				int count = 1;
				for (int i = len >> 8; i > 0; i >>= 8) {
					++count;
				}
				output.write(0x80);
				output.write(count);
				for (int i = count - 1; i >= 0; --i) {
					output.write((len >> (8 * i)) & 0xFF);
				}
			}

			if (ds instanceof CachedDataSet) {
				// Optimization for CachedDataSet
				((CachedDataSet) ds).writeDataTo(output);
			} else {
				// Output data
				output.write(ds.getData());
			}
		}
	}

	public void close() throws IOException {
		if (output != null) {
			output.close();
			output = null;
		}
	}

	private IIMOutputStream output;

}
