/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CountryCode represents a listing of country codes according to ISO3166
 * standard. Up-to-date listing of codes is available from <a
 * href="http://www.davros.org/misc/iso3166.html">davros.org</a>
 */
public class CountryCode {

	private CountryCode(String twoLetterCode, String threeLetterCode, String threeDigitCode, String name) {
		this.twoLetterCode = twoLetterCode;
		this.threeLetterCode = threeLetterCode;
		this.threeDigitCode = threeDigitCode;
		this.name = name;
	}

	public static CountryCode get(String key) {
		return byAnyKey.get(key);
	}

	public static List<CountryCode> getCountryCodes() {
		return countryCodes;
	}

	/**
	 * @return Returns the threeDigitCode.
	 */
	public String get3DigitCode() {
		return this.threeDigitCode;
	}

	/**
	 * @return Returns the threeLetterCode.
	 */
	public String get3LetterCode() {
		return this.threeLetterCode;
	}

	/**
	 * @return Returns the twoLetterCode.
	 */
	public String get2LetterCode() {
		return this.twoLetterCode;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return this.name;
	}

	public String toString() {
		return get3LetterCode();
	}

	private String twoLetterCode;
	private String threeLetterCode;
	private String threeDigitCode;
	private String name;

	private static Map<String, CountryCode> byAnyKey;
	private static List<CountryCode> countryCodes;

	static {
		try {
			byAnyKey = new HashMap<String, CountryCode>();
			countryCodes = new ArrayList<CountryCode>(300);
			loadCountryCodeHelper("iso3166.txt");
			loadCountryCodeHelper("iptc_naa.txt");
			countryCodes = Collections.unmodifiableList(countryCodes);
			byAnyKey = Collections.unmodifiableMap(byAnyKey);
		} catch (Exception e) {
			System.err.println("Failed to load country codes: " + e);
		}
	}

	private static void loadCountryCodeHelper(String codeFile) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(CountryCode.class.getResourceAsStream(codeFile)));
		for (;;) {
			String line = r.readLine();
			if (line == null)
				break;
			line = line.trim();
			if (line.startsWith("#") || line.length() == 0)
				continue;
			CountryCode cc = new CountryCode(line.substring(0, 2), line.substring(3, 6), line.substring(7, 10),
					line.substring(11));
			countryCodes.add(cc);
			byAnyKey.put(cc.get2LetterCode(), cc);
			byAnyKey.put(cc.get3LetterCode(), cc);
			byAnyKey.put(cc.get3DigitCode(), cc);
		}
		r.close();
	}

	public static void main(String[] args) {
		System.out.println(CountryCode.getCountryCodes());
	}
}
