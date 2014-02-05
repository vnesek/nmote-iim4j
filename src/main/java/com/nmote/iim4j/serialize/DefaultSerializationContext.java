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
	
	/**
	 * @see com.nmote.iim4j.serialize.SerializationContext#getCharacterSet()
	 */
	public String getCharacterSet() {
		return characterSet;
	}
	
	/**
	 * @param cs
	 */
	public void setCharacterSet(String cs) {
		if (cs != null) {
			characterSetAssigned = true;
			characterSet = cs;
		} else {
			characterSetAssigned = false;
			characterSet =  "ISO-8859-1";
		}
	}

	
	/**
	 * @return Returns the characterSetAssigned.
	 */
	public boolean isCharacterSetAssigned() {
		return this.characterSetAssigned;
	}

	private String characterSet;
	private boolean characterSetAssigned;
}
