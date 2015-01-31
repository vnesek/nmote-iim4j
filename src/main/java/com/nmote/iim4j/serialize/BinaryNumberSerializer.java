/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * Serializer for binary encoded numbers.
 */
public class BinaryNumberSerializer implements Serializer {

	public BinaryNumberSerializer(String def) {
		length = def != null ? Integer.parseInt(def) : Integer.MAX_VALUE;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		if (data.length > 4) {
			throw new SerializationException("data too long: " + data.length);
		}
		int r = 0;
		for (int i = 0; i < data.length; i++) {
			r = (r << 8) | data[i];
		}
		return new Integer(r);
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		int n = ((Number) o).intValue();
		if (n < 0) {
			throw new SerializationException("negative number: " + n);
		}
		byte[] result = new byte[length];
		for (int i = result.length - 1; n > 0 && i >= 0; --i) {
			result[i] = (byte) (n & 0xFF);
			n >>= 8;
		}
		if (n > 0) {
			throw new SerializationException("number too large to fit in " + length + ": " + o);
		}
		return result;
	}

	private final int length;
}
