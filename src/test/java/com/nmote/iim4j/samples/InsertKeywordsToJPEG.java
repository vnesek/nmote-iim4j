/*
 * Copyright (c) Nmote Ltd. 2004-2018. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.samples;

import com.nmote.iim4j.IIM;
import com.nmote.iim4j.IIMFile;
import com.nmote.iim4j.stream.JPEGUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Inserts IIM encoded IPTC segment with keywords into JPEG file.
 */
public class InsertKeywordsToJPEG {

    public static void main(String[] args) throws Exception {
        IIMFile iimFile = new IIMFile();
        iimFile.add(IIM.KEYWORDS, "cute");
        iimFile.add(IIM.KEYWORDS, "cat");
        iimFile.validate();

        InputStream in = new FileInputStream("oskar.jpg");
        OutputStream out = new FileOutputStream("keywords.jpg");

        JPEGUtil.insertIIMIntoJPEG(out, iimFile, in);
    }
}
