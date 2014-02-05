/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * Serializer for variable length encoded binary numbers.
 */
public class VarBinaryNumberSerializer implements Serializer {

	public VarBinaryNumberSerializer(String def) {
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		if (data.length > 8) {
			throw new SerializationException("data too long: " + data.length);
		}
		long r = 0;
		for (int i = 0; i < data.length; i++) {
			r = (r << 8) | data[i] & 0xFF;
		}
		return new Long(r);
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		long n = ((Number) o).longValue();
		if (n < 0) {
			throw new SerializationException("negative number: " + n);
		}

		// Calculate length
		int length = 0;
		for (long n1 = n; n1 > 0; ++length) {
			n1 >>= 8;
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
}
