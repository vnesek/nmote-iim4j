/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

/**
 * Prints information about IIM4J library version and copyright to a standard
 * output.
 */
public class About {

	public static final String VERSION = "1.0.0";
	public static final String COPYRIGHT = "Copyright (c) 2004, 2015 Nmote Ltd.";
	public static final String LICENSE = "BSD Style";
	public static final long SERIAL_VERSION_UID = 100L;

	public static void main(String[] args) {
		System.out.println("IIM4J " + VERSION + ". (https://github.com/vnesek/nmote-iim4j.git)");
		System.out.println(COPYRIGHT + "  (http://www.nmote.com)");
	}
}
