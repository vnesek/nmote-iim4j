/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.samples;

import java.io.File;

import com.nmote.iim4j.IIMDataSetInfoFactory;
import com.nmote.iim4j.IIMFile;
import com.nmote.iim4j.IIMReader;
import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.stream.FileIIMInputStream;
import com.nmote.iim4j.stream.JPEGIIMInputStream;

/**
 * Dump's contents of IIM encoded IPTC segment in JPEG file(s) specified on
 * command line.
 */
public class DumpJPEG {

	public static void dump(File file) throws Exception {
		System.out.println("IPTC segment for " + file);
		IIMFile iimFile = new IIMFile();
		IIMReader reader = new IIMReader(new JPEGIIMInputStream(new FileIIMInputStream(file)),
				new IIMDataSetInfoFactory());
		iimFile.readFrom(reader, 20);
		for (DataSet ds : iimFile.getDataSets()) {
			Object value = ds.getValue();
			if (value instanceof byte[]) {
				value = "<bytes " + ((byte[]) value).length + ">";
			}
			DataSetInfo info = ds.getInfo();
			System.out.println(info.toString() + " " + info.getName() + ": " + value);
		}
		reader.close();
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			dump(new File(args[i]));
		}
	}
}
