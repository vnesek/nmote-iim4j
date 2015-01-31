/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.srs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * DefaultSubjectReferenceSystem
 */
public class DefaultSubjectReferenceSystem implements SubjectReferenceSystem {

	public SubjectReference get(String number) {
		SubjectReference result = references.get(number);
		if (result == null) {
			result = new SubjectReference(number);
		}
		return result;
	}

	public SubjectReference getParent(SubjectReference ref) {
		SubjectReference parent;
		if (ref.isSubjectDetailDefined()) {
			parent = get(ref.getNumber().substring(0, 5) + "000");
		} else if (ref.isSubjectMatterDefined()) {
			parent = get(ref.getNumber().substring(0, 2) + "000000");
		} else {
			parent = null;
		}

		return parent;
	}

	public String getName(SubjectReference ref) {
		return names.get(ref.getNumber());
	}

	public String getDescription(SubjectReference ref) {
		return descriptions.get(ref.getNumber());
	}

	public Collection<SubjectReference> getChildren(SubjectReference ref) {
		String prefix;
		String suffix;
		if (ref == null) {
			throw new NullPointerException("ref == null");
		} else if (ref.isSubjectDetailDefined()) {
			prefix = null;
			suffix = null;
		} else if (ref.isSubjectMatterDefined()) {
			prefix = ref.getNumber().substring(0, 5);
			suffix = "";
		} else {
			prefix = ref.getNumber().substring(0, 2);
			suffix = "000";
		}

		Collection<SubjectReference> result;
		if (prefix != null) {
			result = new ArrayList<SubjectReference>();
			for (Iterator<String> iter = references.keySet().iterator(); iter.hasNext();) {
				String key = iter.next();
				if (key.startsWith(prefix) && key.endsWith(suffix) && (ref == null || !key.equals(ref.getNumber()))) {
					result.add(get(key));
				}
			}
		} else {
			result = Collections.emptySet();
		}
		return result;
	}

	public void add(SubjectReferenceSystem srs, SubjectReference sr) {
		add(sr.getNumber(), srs.getName(sr), srs.getDescription(sr));
	}

	public void add(String number, String name, String description) {
		if (number == null) {
			throw new NullPointerException("number == null");
		}

		if (number.length() != 8) {
			throw new IllegalArgumentException("invalid subject reference number length (expected 8): " + number);
		}

		// Just a test if number is a 'number'
		Long.parseLong(number);

		references.put(number, new SubjectReference(number));

		if (name != null) {
			names.put(number, name);
		}

		if (description != null) {
			descriptions.put(number, description);
		}
	}

	public void addIPTC(String iptc) {
		// Split IPTC SR
		String[] parts = Pattern.compile(":", Pattern.LITERAL).split(iptc);

		if (iptc.length() != 5) {
			throw new IllegalArgumentException("invalid subject reference: " + iptc);
		}

		if (!"IPTC".equals(parts[0])) {
			throw new IllegalArgumentException("unknown IPR: " + parts[0]);
		}

		addIfNotDefined(parts[1].substring(0, 2) + "000000", parts[2]);
		addIfNotDefined(parts[1].substring(0, 5) + "000", parts[3]);
		addIfNotDefined(parts[1], parts[4]);
	}

	private void addIfNotDefined(String number, String name) {
		if (!references.containsKey(number)) {
			add(number, name, null);
		}
	}

	public Collection<SubjectReference> getTopSubjectReferences() {
		Collection<SubjectReference> result = new ArrayList<SubjectReference>();
		for (Iterator<SubjectReference> iter = references.values().iterator(); iter.hasNext();) {
			SubjectReference ref = iter.next();
			if (!ref.isSubjectDetailDefined() && !ref.isSubjectMatterDefined()) {
				result.add(ref);
			}
		}
		return result;
	}

	public Collection<SubjectReference> getAllSubjectReferences() {
		return references.values();
	}

	private SortedMap<String, SubjectReference> references = new TreeMap<String, SubjectReference>();
	private Map<String, String> names = new HashMap<String, String>();
	private Map<String, String> descriptions = new HashMap<String, String>();
}
