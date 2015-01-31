/**
 * Copyright (c) Nmote Ltd. 2004. All rights reserved.
 */
package com.nmote.iim4j.serialize;


/**
 * DefaultSerializationContext
 */
public class DefaultSerializationContext implements SerializationContext {

	public DefaultSerializationContext() {
		this(null);
	}

	public DefaultSerializationContext(String characterSet) {
		setCharacterSet(characterSet);
	}

	public String getCharacterSet() {
		return characterSet;
	}

	public void setCharacterSet(String cs) {
		if (cs != null) {
			characterSetAssigned = true;
			characterSet = cs;
		} else {
			characterSetAssigned = false;
			characterSet =  "ISO-8859-1";
		}
	}


	public boolean isCharacterSetAssigned() {
		return this.characterSetAssigned;
	}

	private String characterSet;
	private boolean characterSetAssigned;
}
