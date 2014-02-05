/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.dataset;

/**
 * InvalidDataSetException
 */
public class InvalidDataSetException extends Exception {

	private static final long serialVersionUID = 100L;

	public InvalidDataSetException() {
	}

	/**
	 * @param message
	 */
	public InvalidDataSetException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidDataSetException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidDataSetException(String message, Throwable cause) {
		super(message, cause);
	}
}