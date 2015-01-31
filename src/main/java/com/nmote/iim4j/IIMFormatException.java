/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.IOException;

/**
 * Throwed if there is a format violation found while reading IIM file.
 */
public class IIMFormatException extends IOException {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	public IIMFormatException() {}

	public IIMFormatException(String s) {
		super(s);
	}
}
