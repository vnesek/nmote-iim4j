/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
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
	 * this type
	 * 
	 * @param data
	 * @param ctx
	 * @return Java object
	 * @throws SerializationException
	 */
	Object deserialize(byte[] data, SerializationContext ctx) throws SerializationException;

	/**
	 * Serializes Java object to its IIM specified format
	 * 
	 * @param o
	 * @param ctx
	 * @return IIM data
	 * @throws SerializationException
	 */
	byte[] serialize(Object o, SerializationContext ctx) throws SerializationException;
}
