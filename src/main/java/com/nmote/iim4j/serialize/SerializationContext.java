/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.serialize;

/**
 * SerializationContext is used to pass additional parameters to serializer
 * while (de)serializing.
 */
public interface SerializationContext {

	public String getCharacterSet();
}
