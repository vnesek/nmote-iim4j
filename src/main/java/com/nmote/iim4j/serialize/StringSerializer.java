/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.io.UnsupportedEncodingException;

/**
 * Serializer for strings.
 */
public class StringSerializer implements Serializer {

	public StringSerializer(String def) {
		maxLength = def != null ? Integer.parseInt(def) : Integer.MAX_VALUE;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		try {
			return new String(data, ctx.getCharacterSet());
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("unsupported character set: " + ctx.getCharacterSet());
		}
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		try {
			return ((String) o).getBytes(ctx.getCharacterSet());
		} catch (UnsupportedEncodingException e) {
			throw new SerializationException("unsupported character set: " + ctx.getCharacterSet());
		}
	}

	@SuppressWarnings("unused")
	private final int maxLength;
}
