/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.About;
import com.nmote.iim4j.IIMFile;

/**
 * Thrown when dataset for which we don't have metadata is encountered in
 * {@link IIMFile}
 */
public class UnsupportedDataSetException extends InvalidDataSetException {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	public UnsupportedDataSetException() {
	}

	public UnsupportedDataSetException(String message) {
		super(message);
	}
}
