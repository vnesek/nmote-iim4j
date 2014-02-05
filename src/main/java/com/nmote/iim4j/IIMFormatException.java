/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.IOException;

/**
 * IIMFormatException
 */
public class IIMFormatException extends IOException {

	private static final long serialVersionUID = 1L;

	public IIMFormatException() {}

	/**
	 * @param s
	 */
	public IIMFormatException(String s) {
		super(s);
	}
}
