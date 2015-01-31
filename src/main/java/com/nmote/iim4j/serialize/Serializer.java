/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * Serializer is used to convert between IIM dataset data types, and Java object
 * representation.
 */
public interface Serializer {

	/**
	 * Deserializes data to Java object according to IIM specified format for
	 * this type.
	 *
	 * @param data
	 *            raw data
	 * @param ctx
	 *            deserialization context
	 * @return Java object
	 * @throws SerializationException
	 *             if raw data can't be deserialized
	 */
	Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException;

	/**
	 * Serializes Java object to its IIM specified format.
	 *
	 * @param o
	 *            object to serialize
	 * @param ctx
	 *            serialization context
	 * @return IIM formatted data
	 * @throws SerializationException
	 *             if object can't be serialized to byte format
	 */
	byte[] serialize(Object o, SerializationContext ctx) throws SerializationException;
}
