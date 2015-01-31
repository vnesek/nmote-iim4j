/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.io.UnsupportedEncodingException;

/**
 * Serializer for string encoded integers.
 */
public class NumberSerializer implements Serializer {

	public NumberSerializer(String def) {
		length = def != null ? Integer.parseInt(def) : Integer.MAX_VALUE;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		try {
			return new Integer(new String(data, "ISO-8859-1"));
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("impossible");
		}
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		try {
			String s = ((Integer) o).toString();
			if (s.length() < length) {
				StringBuffer b = new StringBuffer(length);
				appendFill0(b, s, length);
				s = b.toString();
			}
			return s.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("impossible");
		}
	}

	private static void appendFill0(StringBuffer b, String s, int n) {
		for (int i = n - s.length(); i > 0; --i) {
			b.append('0');
		}
		b.append(s);
	}

	private final int length;
}