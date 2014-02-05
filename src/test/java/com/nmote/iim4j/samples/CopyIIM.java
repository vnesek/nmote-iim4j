/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.samples;

import java.io.File;
import java.io.FileOutputStream;

import com.nmote.iim4j.IIMDataSetInfoFactory;
import com.nmote.iim4j.IIMFile;
import com.nmote.iim4j.IIMReader;
import com.nmote.iim4j.IIMWriter;
import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.stream.DefaultIIMOutputStream;
import com.nmote.iim4j.stream.FileIIMInputStream;


/**
 * Reads contents of IIM file(s) specified on command line
 * and dumps it into another one
 */
public class CopyIIM {
	
	public static void copy(File src, File dest) throws Exception {
		System.out.println("Reading " + src);
		IIMFile iimFile = new IIMFile();
		IIMReader reader = new IIMReader(new FileIIMInputStream(src), new IIMDataSetInfoFactory());
		iimFile.readFrom(reader, 1000);
		for (DataSet ds : iimFile.getDataSets()) {
			System.out.println(ds.toString());
		}

		System.out.println("Writing " + dest);
		IIMWriter writer = new IIMWriter(new DefaultIIMOutputStream(new FileOutputStream(dest)));
		iimFile.writeTo(writer);
		writer.close();
		reader.close();
	}

	public static void main(String[] args) throws Exception {
		copy(new File(args[0]), new File(args[1]));
	}
}
