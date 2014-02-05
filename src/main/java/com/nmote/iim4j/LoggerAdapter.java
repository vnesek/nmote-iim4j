/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

/**
 * Simple logger adapter so you can use any logging system you desire
 */
public interface LoggerAdapter {

	void debug(String message);
	
	void error(String message);
}
