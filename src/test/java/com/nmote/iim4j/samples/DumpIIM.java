/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.samples;

import java.io.File;

import com.nmote.iim4j.IIMDataSetInfoFactory;
import com.nmote.iim4j.IIMFile;
import com.nmote.iim4j.IIMReader;
import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.stream.FileIIMInputStream;

/**
 * Dumps contents of IIM file(s) specified on command line.
 */
public class DumpIIM {

	public static void dump(File file) throws Exception {
		System.out.println("Processing " + file);
		IIMFile iimFile = new IIMFile();
		IIMReader reader = new IIMReader(new FileIIMInputStream(file), new IIMDataSetInfoFactory());
		iimFile.readFrom(reader, 10);
		for (DataSet ds : iimFile.getDataSets()) {
			System.out.println(ds);
		}
		reader.close();
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			dump(new File(args[i]));
		}
	}
}
