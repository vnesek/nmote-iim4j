/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.EOFException;
import java.io.IOException;

/**
 * This is an IIMInputStream implementation that parses IPTC data embedded into
 * JFIF (JPEG) files.
 */
public class JPEGIIMInputStream extends SubIIMInputStream {

	public JPEGIIMInputStream(IIMInputStream input) throws IOException {
		super(input);

		// Check JPEG header magic number
		if (JPEGUtil.readInt8(input) != JPEGUtil.START || JPEGUtil.readInt8(input) != 0xD8) {
			throw new IOException("not a JPEG file (invalid magic number)");
		}

		for (;;) {
			// SegmentStart - 0xFF
			if (JPEGUtil.readInt8(input) != JPEGUtil.START) {
				throw new IOException("expected JPEG segment start identifier");
			}

			// SegmentMarker
			int segmentMarker = JPEGUtil.readInt8(input);

			// This is last segment and no IIM data was found
			if (segmentMarker == JPEGUtil.SOS) {
				throw new IIMNotFoundException();
			}

			// SegmentSize: High-byte Low-byte
			int segmentSize = JPEGUtil.readInt16(input);

			// Segment size includes size bytes, so subtract two bytes from size
			segmentSize -= 2;

			if (segmentMarker == JPEGUtil.APPD) {
				if (input.isCached()) {
					findStartTag(input);
				}
				setOffsetAndLength(input.position(), segmentSize);
				break;
			} else {
				// Skip this segment
				input.seek(input.position() + segmentSize);
			}
		}
	}

	private static void findStartTag(IIMInputStream input) throws IOException {
		int tag = input.read();
		while (tag != 28) {
			if (tag == -1) {
				// We've reached EOF, no more datasets to return
				throw new EOFException("Can't find 0x1C marker in APPD segment");
			}
			tag = input.read();
		}

		long pos = input.position() - 1;
		input.seek(pos);
	}

}