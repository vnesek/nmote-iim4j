/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * SerializerFactory is used to create instances of Serializer from passed
 * specifications.
 */
public interface SerializerFactory {

	/**
	 * Creates Serializer instance from passed specification
	 * 
	 * @param spec
	 *            Serializer specification
	 * @return Serializer instance
	 */
	Serializer create(String spec);
}
