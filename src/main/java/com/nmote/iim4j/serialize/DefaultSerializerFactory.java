/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

import java.lang.reflect.Constructor;

/**
 * DefaultSerializerFactory is default implementation of SerializerFactory. It
 * is used by IIMDataSetInfoFactory to create Serializers.
 */
public class DefaultSerializerFactory implements SerializerFactory {

	/**
	 * @see com.nmote.iim4j.serialize.SerializerFactory#create(java.lang.String)
	 */
	public Serializer create(String spec) {
		String type, def;
		int lparen = spec.indexOf('(');
		if (lparen != -1) {
			type = spec.substring(0, lparen);
			def = spec.substring(lparen + 1, spec.length() - 1);
		} else {
			type = spec;
			def = null;
		}

		Serializer result;
		try {
			// Instantiate serializer
			Class<?> c = Class.forName("com.nmote.iim4j.serialize." + type + "Serializer");
			Constructor<?> constructor = c.getConstructor(new Class[] { String.class });
			result = (Serializer) constructor.newInstance(new Object[] { def });
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
}