/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.io.UnsupportedEncodingException;

/**
 * Serializer for charsets.
 */
public class CodedCharsetSerializer implements Serializer {

	public CodedCharsetSerializer(String def) {
		maxLength = def != null ? Integer.parseInt(def) : Integer.MAX_VALUE;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		try {
			String s = new String(data, "ISO-8859-1");
			if ("CP-1250".equalsIgnoreCase(s)) {
				s = "Cp1250";
			}
			return s;
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("unsupported character set");
		}
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		try {
			String s = ((String) o);
			if (s.equalsIgnoreCase("Cp1250")) {
				s = "CP-1250";
			}
			return s.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("unsupported character set");
		}
	}

	@SuppressWarnings("unused")
	private final int maxLength;
}
