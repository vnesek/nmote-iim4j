/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * Binary data Serializer.
 */
public class BinarySerializer implements Serializer {

	public BinarySerializer() {
		this(null);
	}

	public BinarySerializer(String def) {
		maxLength = def != null ? Integer.parseInt(def) : Integer.MAX_VALUE;
	}

	public Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException {
		return data;
	}

	public byte[] serialize(Object o, SerializationContext ctx) throws SerializationException {
		return (byte[]) o;
	}

	@SuppressWarnings("unused")
	private final int maxLength;
}
