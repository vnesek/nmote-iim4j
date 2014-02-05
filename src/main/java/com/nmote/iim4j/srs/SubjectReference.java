/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.srs;

import java.io.Serializable;

/**
 * SubjectReference
 */
public class SubjectReference implements Serializable, Comparable<SubjectReference> {

	private static final long serialVersionUID = 100L;

	private static String toIPTCHelper(String s) {
		String result;
		if (s != null) {
			int idx = s.lastIndexOf(':');
			if (idx != -1) {
				result = s.substring(idx + 1);
			} else {
				result = s;
			}
		} else {
			result = "";
		}
		return result;
	}

	public SubjectReference(String number) {
		if (number.length() != 8) {
			throw new IllegalArgumentException("Subject reference length not equal 8: " + number);
		}
		this.number = number;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(SubjectReference ref) {
		return this.number.compareTo(ref.number);
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return obj == this
				|| (obj instanceof SubjectReference && ((SubjectReference) obj).getNumber().equals(getNumber()));
	}

	public String getNumber() {
		return number;
	}

	public String getSubjectDetailNumber() {
		return number.substring(5, 8);
	}

	public String getSubjectMatterNumber() {
		return number.substring(2, 5);
	}

	public String getSubjectNumber() {
		return number.substring(0, 2);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return number.hashCode();
	}

	public boolean isSubjectDetailDefined() {
		return !"000".equals(getSubjectDetailNumber());
	}

	public boolean isSubjectMatterDefined() {
		return !"000".equals(getSubjectMatterNumber());
	}

	/**
	 * Formats an IPTC string for this reference using information obtained from
	 * sms SUbject Reference System.
	 * 
	 * @param srs
	 * @return IPTC formatted reference
	 */
	public String toIPTC(SubjectReferenceSystem srs) {
		StringBuffer b = new StringBuffer();
		b.append("IPTC:");
		b.append(getNumber());
		b.append(":");
		if (getNumber().endsWith("000000")) {
			b.append(toIPTCHelper(srs.getName(this)));
			b.append("::");
		} else if (getNumber().endsWith("000")) {
			b.append(toIPTCHelper(srs.getName(srs.get(getNumber().substring(0, 2) + "000000"))));
			b.append(":");
			b.append(toIPTCHelper(srs.getName(this)));
			b.append(":");
		} else {
			b.append(toIPTCHelper(srs.getName(srs.get(getNumber().substring(0, 2) + "000000"))));
			b.append(":");
			b.append(toIPTCHelper(srs.getName(srs.get(getNumber().substring(0, 5) + "000"))));
			b.append(":");
			b.append(toIPTCHelper(srs.getName(this)));
		}
		return b.toString();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return number.toString();
	}

	protected String number;
}