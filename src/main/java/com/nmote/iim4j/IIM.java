/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

/**
 * IIM contains symbolic constants for IIMv4 datasets
 */
public final class IIM {

	/**
	 * Returns a dataset number for a given record and dataset.
	 *
	 * @param record record number
	 * @param dataSet data set number
	 * @return combined dataset number as used by IIM4j
	 */
	public static int DS(int record, int dataSet) {
		return (record << 8) | dataSet;
	}

	/** 2:95 Province/State */
	public static final int PROVINCE_STATE = DS(2, 95);

	/** 3:140 Maximum Density Range */
	public static final int MAXIMUM_DENSITY_RANGE = DS(3, 140);

	/** 3:86 Number of Bits per Sample */
	public static final int NUMBER_OF_BITS_PER_SAMPLE = DS(3, 86);

	/** 3:64 Interchange Colour Space */
	public static final int INTERCHANGE_COLOUR_SPACE = DS(3, 64);

	/** 3:0 Record Version */
	public static final int RECORD_3_VERSION = DS(3, 0);

	/** 1:30 Service Identifier */
	public static final int SERVICE_IDENTIFIER = DS(1, 30);

	/** 3:30 Number of Lines */
	public static final int NUMBER_OF_LINES = DS(3, 30);

	/** 2:122 Writer/Editor */
	public static final int WRITER_EDITOR = DS(2, 122);

	/** 1:60 Envelope Priority */
	public static final int ENVELOPE_PRIORITY = DS(1, 60);

	/** 2:30 Release Date */
	public static final int RELEASE_DATE = DS(2, 30);

	/** 3:145 Gamma Compensated Value */
	public static final int GAMMA_COMPENSATED_VALUE = DS(3, 145);

	/** 2:63 Digital Creation Time */
	public static final int DIGITAL_CREATION_TIME = DS(2, 63);

	/** 3:60 Colour Representation */
	public static final int COLOUR_REPRESENTATION = DS(3, 60);

	/** 1:122 ARM Version */
	public static final int ARM_VERSION = DS(1, 122);

	/** 2:60 Time Created */
	public static final int TIME_CREATED = DS(2, 60);

	/** 1:100 UNO */
	public static final int UNO = DS(1, 100);

	/** 2:118 Contact */
	public static final int CONTACT = DS(2, 118);

	/** 1:120 ARM Identifier */
	public static final int ARM_IDENTIFIER = DS(1, 120);

	/** 7:95 Maximum ObjectData Size */
	public static final int MAXIMUM_OBJECTDATA_SIZE = DS(7, 95);

	/** 2:5 Object Name */
	public static final int OBJECT_NAME = DS(2, 5);

	/** 2:120 Caption/Abstract */
	public static final int CAPTION_ABSTRACT = DS(2, 120);

	/** 2:115 Source */
	public static final int SOURCE = DS(2, 115);

	/** 2:131 Image Orientation */
	public static final int IMAGE_ORIENTATION = DS(2, 131);

	/** 2:4 ObjectAttribute Reference */
	public static final int OBJECTATTRIBUTE_REFERENCE = DS(2, 4);

	/** 2:105 Headline */
	public static final int HEADLINE = DS(2, 105);

	/** 2:151 Audio Sampling Rate */
	public static final int AUDIO_SAMPLING_RATE = DS(2, 151);

	/** 2:150 Audio Type */
	public static final int AUDIO_TYPE = DS(2, 150);

	/** 3:120 Quantisation Method */
	public static final int QUANTISATION_METHOD = DS(3, 120);

	/** 2:3 Object Type Reference Object */
	public static final int OBJECT_TYPE_REFERENCE_OBJECT = DS(2, 3);

	/** 2:35 Release Time */
	public static final int RELEASE_TIME = DS(2, 35);

	/** 2:25 Keywords */
	public static final int KEYWORDS = DS(2, 25);

	/** 2:153 Audio Duration */
	public static final int AUDIO_DURATION = DS(2, 153);

	/** 3:65 Colour Sequence */
	public static final int COLOUR_SEQUENCE = DS(3, 65);

	/** 2:27 Content Location Name */
	public static final int CONTENT_LOCATION_NAME = DS(2, 27);

	/** 2:45 Reference Service */
	public static final int REFERENCE_SERVICE = DS(2, 45);

	/** 2:200 ObjectData Preview File Format */
	public static final int OBJECTDATA_PREVIEW_FILE_FORMAT = DS(2, 200);

	/** 3:55 Supplement Type */
	public static final int SUPPLEMENT_TYPE = DS(3, 55);

	/** 2:55 Date Created */
	public static final int DATE_CREATED = DS(2, 55);

	/** 2:201 ObjectData Preview File Format Version */
	public static final int OBJECTDATA_PREVIEW_FILE_FORMAT_VERSION = DS(2, 201);

	/** 2:65 Originating Program */
	public static final int ORIGINATING_PROGRAM = DS(2, 65);

	/** 2:125 Rasterized Caption */
	public static final int RASTERIZED_CAPTION = DS(2, 125);

	/** 2:202 ObjectData Preview Data */
	public static final int OBJECTDATA_PREVIEW_DATA = DS(2, 202);

	/** 2:15 Category */
	public static final int CATEGORY = DS(2, 15);

	/** 1:5 Destination */
	public static final int DESTINATION = DS(1, 5);

	/** 3:85 ColourPalette */
	public static final int COLOURPALETTE = DS(3, 85);

	/** 2:26 Content Location Code */
	public static final int CONTENT_LOCATION_CODE = DS(2, 26);

	/** 2:85 By-line Title */
	public static final int BY_LINE_TITLE = DS(2, 85);

	/** 2:154 Audio Outcue */
	public static final int AUDIO_OUTCUE = DS(2, 154);

	/** 3:125 End Points */
	public static final int END_POINTS = DS(3, 125);

	/** 1:70 Date Sent */
	public static final int DATE_SENT = DS(1, 70);

	/** 2:12 Subject Reference */
	public static final int SUBJECT_REFERENCE = DS(2, 12);

	/** 1:80 Time Sent */
	public static final int TIME_SENT = DS(1, 80);

	/** 2:42 Action Advised */
	public static final int ACTION_ADVISED = DS(2, 42);

	/** 2:75 Object Cycle */
	public static final int OBJECT_CYCLE = DS(2, 75);

	/** 3:70 Colour Calibration Matrix Table */
	public static final int COLOUR_CALIBRATION_MATRIX_TABLE = DS(3, 70);

	/** 2:70 Program Version */
	public static final int PROGRAM_VERSION = DS(2, 70);

	/** 2:80 By-line */
	public static final int BY_LINE = DS(2, 80);

	/** 3:50 Pixel Size Perpendicular To Scanning Direction */
	public static final int PIXEL_SIZE_PERPENDICULAR_TO_SCANNING_DIRECTION = DS(3, 50);

	/** 2:37 Expiration Date */
	public static final int EXPIRATION_DATE = DS(2, 37);

	/** 3:135 Bits Per Component */
	public static final int BITS_PER_COMPONENT = DS(3, 135);

	/** 2:101 Country/Primary Location Name */
	public static final int COUNTRY_PRIMARY_LOCATION_NAME = DS(2, 101);

	/** 2:8 Editorial Update */
	public static final int EDITORIAL_UPDATE = DS(2, 8);

	/** 3:80 Lookup Table */
	public static final int LOOKUP_TABLE = DS(3, 80);

	/** 2:50 Reference Number */
	public static final int REFERENCE_NUMBER = DS(2, 50);

	/** 2:135 Language Identifier */
	public static final int LANGUAGE_IDENTIFIER = DS(2, 135);

	/** 2:130 Image Type */
	public static final int IMAGE_TYPE = DS(2, 130);

	/** 2:7 Edit Status */
	public static final int EDIT_STATUS = DS(2, 7);

	/** 2:103 Original Transmission Reference */
	public static final int ORIGINAL_TRANSMISSION_REFERENCE = DS(2, 103);

	/** 3:66 ICC Input Colour Profile */
	public static final int ICC_INPUT_COLOUR_PROFILE = DS(3, 66);

	/** 2:47 Reference Date */
	public static final int REFERENCE_DATE = DS(2, 47);

	/** 3:102 Image Rotation */
	public static final int IMAGE_ROTATION = DS(3, 102);

	/** 3:130 Excursion Tolerance */
	public static final int EXCURSION_TOLERANCE = DS(3, 130);

	/** 2:38 Expiration Time */
	public static final int EXPIRATION_TIME = DS(2, 38);

	/** 2:116 Copyright Notice */
	public static final int COPYRIGHT_NOTICE = DS(2, 116);

	/** 2:152 Audio Sampling Resolution */
	public static final int AUDIO_SAMPLING_RESOLUTION = DS(2, 152);

	/** 2:100 Country/Primary Location Code */
	public static final int COUNTRY_PRIMARY_LOCATION_CODE = DS(2, 100);

	/** 1:22 File Format Version */
	public static final int FILE_FORMAT_VERSION = DS(1, 22);

	/** 3:100 Scanning Direction */
	public static final int SCANNING_DIRECTION = DS(3, 100);

	/** 9:10 Confirmed ObjectData Size */
	public static final int CONFIRMED_OBJECTDATA_SIZE = DS(9, 10);

	/** 1:40 Envelope Number */
	public static final int ENVELOPE_NUMBER = DS(1, 40);

	/** 3:84 Number of Index Entries */
	public static final int NUMBER_OF_INDEX_ENTRIES = DS(3, 84);

	/** 3:20 Pixels Per Line In Scanning Direction */
	public static final int PIXELS_PER_LINE_IN_SCANNING_DIRECTION = DS(3, 20);

	/** 2:22 Fixture Identifier */
	public static final int FIXTURE_IDENTIFIER = DS(2, 22);

	/** 8:10 Subfile */
	public static final int SUBFILE = DS(8, 10);

	/** 7:20 Max Subfile Size */
	public static final int MAX_SUBFILE_SIZE = DS(7, 20);

	/** 2:20 Supplemental Category */
	public static final int SUPPLEMENTAL_CATEGORY = DS(2, 20);

	/** 1:90 Coded Character Set */
	public static final int CODED_CHARACTER_SET = DS(1, 90);

	/** 7:10 Size Mode */
	public static final int SIZE_MODE = DS(7, 10);

	/** 3:40 Pixel Size In Scanning Direction */
	public static final int PIXEL_SIZE_IN_SCANNING_DIRECTION = DS(3, 40);

	/** 1:50 Product */
	public static final int PRODUCT = DS(1, 50);

	/** 2:40 Special Instructions */
	public static final int SPECIAL_INSTRUCTIONS = DS(2, 40);

	/** 3:90 Sampling Structure */
	public static final int SAMPLING_STRUCTURE = DS(3, 90);

	/** 2:92 Sub-location */
	public static final int SUB_LOCATION = DS(2, 92);

	/** 2:110 Credit */
	public static final int CREDIT = DS(2, 110);

	/** 1:0 Model Version */
	public static final int MODEL_VERSION = DS(1, 0);

	/** 2:10 Urgency */
	public static final int URGENCY = DS(2, 10);

	/** 3:10 Picture Number */
	public static final int PICTURE_NUMBER = DS(3, 10);

	/** 2:0 Record Version */
	public static final int RECORD_2_VERSION = DS(2, 0);

	/** 2:90 City */
	public static final int CITY = DS(2, 90);

	/** 2:62 Digital Creation Date */
	public static final int DIGITAL_CREATION_DATE = DS(2, 62);

	/** 7:90 ObjectData Size Announced */
	public static final int OBJECTDATA_SIZE_ANNOUNCED = DS(7, 90);

	/** 1:20 File Format */
	public static final int FILE_FORMAT = DS(1, 20);

	/** 3:110 Data Compression Method */
	public static final int DATA_COMPRESSION_METHOD = DS(3, 110);

}