/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

import com.nmote.iim4j.About;

/**
 * InvalidDataSetException is thrown when attempting to instantiate dataset with
 * invalid record numbers or some other violation.
 */
public class InvalidDataSetException extends Exception {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	public InvalidDataSetException() {
	}

	public InvalidDataSetException(String message) {
		super(message);
	}

	public InvalidDataSetException(Throwable cause) {
		super(cause);
	}

	public InvalidDataSetException(String message, Throwable cause) {
		super(message, cause);
	}
}