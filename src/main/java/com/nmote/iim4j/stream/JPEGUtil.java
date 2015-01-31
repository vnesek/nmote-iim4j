/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import com.nmote.iim4j.IIMFile;
import com.nmote.iim4j.IIMWriter;
import com.nmote.iim4j.dataset.DataSet;

/**
 * JPEGUtil contains constants and utility functions used for processing of JPEG
 * images with embedded IIM record.
 */
public class JPEGUtil {

	/** APPD JPEG segment identifier, IPTC data */
	static final int APPD = 0xED;

	/** JPEG segment start identifier */
	static final int START = 0xFF;

	/** JPEG Start-Of-Scan, image data, last segment */
	static final int SOS = 0xDA;

	private static final String PHOTOSHOP30_HEADER = "Photoshop 3.0\u00008BIM\u0004\u0004\u0000\u0000\u0000\u0000";

	public static void insertIIMIntoJPEG(OutputStream out, IIMFile file, InputStream jpegIn) throws IOException {
		IIMFile clone = (IIMFile) file.clone();

		// Filter out all records except 2
		for (Iterator<DataSet> i = clone.getDataSets().iterator(); i.hasNext();) {
			DataSet ds = (DataSet) i.next();
			if ((ds.getInfo().getDataSetNumber() >> 8) != 2) {
				i.remove();
			}
		}

		// Write IIM to byte array
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		IIMWriter writer = new IIMWriter(new DefaultIIMOutputStream(buffer));
		clone.writeTo(writer);
		writer.close();

		insertIIMIntoJPEG(out, buffer.toByteArray(), jpegIn);
	}

	public static void insertIIMIntoJPEG(OutputStream out, byte[] iim, InputStream jpegIn) throws IOException {
		// Copy all segments except APPD to output from jpegIn, stop
		// at SOS

		// Check JPEG header magic number
		if (readInt8(jpegIn) != START || readInt8(jpegIn) != 0xD8) {
			throw new IOException("not a JPEG file (invalid magic number)");
		}
		out.write(START);
		out.write(0xD8);

		for (;;) {
			// SegmentStart - 0xFF
			if (readInt8(jpegIn) != START) {
				throw new IOException("expected JPEG segment start identifier");
			}

			// SegmentMarker
			int segmentMarker = readInt8(jpegIn);

			// This is last segment and no IIM data was found
			if (segmentMarker == SOS) {
				break;
			}

			// SegmentSize: High-byte Low-byte
			int segmentSize = readInt16(jpegIn);

			if (segmentMarker == APPD) {
				// Skip this segment
				jpegIn.skip(segmentSize - 2);
				continue;
			}

			// Copy segment to output
			out.write(START);
			out.write(segmentMarker);
			writeInt16(out, segmentSize);
			copyStream(jpegIn, out, segmentSize - 2);
		}

		byte[] ps30Header = PHOTOSHOP30_HEADER.getBytes("iso-8859-1");

		int fillCount = iim.length % 4;
		if (fillCount > 0)
			fillCount = 4 - fillCount;

		// Write marker for IIM application data
		out.write(START);
		out.write(APPD);

		// Write APPD length
		writeInt16(out, ps30Header.length + 2 + iim.length + 2 + fillCount);

		// Write Photoshop header
		out.write(ps30Header);
		writeInt16(out, iim.length);

		// Write IIM
		out.write(iim);

		// Fill stream with 0-s
		if (fillCount > 0) {
			for (int i = 0; i < fillCount; ++i) {
				out.write(0);
			}
		}

		out.write(START);
		out.write(SOS);
		copyStream(jpegIn, out);
		out.close();
		jpegIn.close();
	}

	static int readInt16(IIMInputStream in) throws IOException {
		int hi = readInt8(in);
		int lo = readInt8(in);
		return (hi << 8) | lo;
	}

	static int readInt8(IIMInputStream in) throws IOException {
		int r = in.read();
		if (r < 0)
			throw new EOFException();
		return r;
	}

	static int readInt16(InputStream in) throws IOException {
		int hi = readInt8(in);
		int lo = readInt8(in);
		return (hi << 8) | lo;
	}

	static int readInt8(InputStream in) throws IOException {
		int r = in.read();
		if (r < 0)
			throw new EOFException();
		return r;
	}

	static void writeInt16(OutputStream out, int i) throws IOException {
		writeInt8(out, (i >> 8) & 0xFF);
		writeInt8(out, i & 0xFF);
	}

	static void writeInt8(OutputStream out, int i) throws IOException {
		out.write(i);
	}

	static void copyStream(InputStream in, OutputStream out, int len) throws IOException {
		byte[] buffer = new byte[4096];
		for (int i = 0; i < len;) {
			int toRead = Math.min(buffer.length, len - i);
			int r = in.read(buffer, 0, toRead);
			if (r < 0) {
				throw new EOFException();
			}
			i += r;
			out.write(buffer, 0, r);
		}
	}

	static void copyStream(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[4096];
		for (;;) {
			int r = in.read(buffer);
			if (r < 0) {
				break;
			}
			out.write(buffer, 0, r);
		}
	}
}
