/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.io.IOException;

import com.nmote.iim4j.About;

/**
 * SerializationException is throws if value can't be serialized or deserialized
 * from binary format.
 */
public class SerializationException extends IOException {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	public SerializationException() {
	}

	public SerializationException(String message) {
		super(message);
	}
}
