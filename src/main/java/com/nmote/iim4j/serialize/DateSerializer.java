/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.io.UnsupportedEncodingException;

/**
 * Serializer for dates.
 */
public class DateSerializer implements Serializer {

	public DateSerializer(String format) {
		this.format = format;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		try {
			return new String(data, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("impossible");
		}
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		try {
			return ((String) o).getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("impossible");
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return format;
	}

	private final String format;
}