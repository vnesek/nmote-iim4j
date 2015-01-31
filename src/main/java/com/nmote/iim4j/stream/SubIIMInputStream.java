/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved.
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.stream;

import java.io.EOFException;
import java.io.IOException;

/**
 * SubIIMInputStream is an IIMInputStream that is subset of another
 * IIMInputStream from a given offset with a given length.
 */
public class SubIIMInputStream implements IIMInputStream {

	/**
	 * Constructs a SubIIMInputStream from a given stream, offset and length.
	 *
	 * @param subStream
	 *            underlying stream
	 * @param offset
	 *            byte offset
	 * @param length
	 *            byte length
	 * @throws IOException
	 *             if underlying stream can't be read
	 */
	public SubIIMInputStream(IIMInputStream subStream, long offset, int length) throws IOException {
		this(subStream);
		setOffsetAndLength(offset, length);
	}

	/**
	 * This constructor should be used by subclasses that can't determine offset
	 * and length. Such subclasses should call setOffsetAndLength() from
	 * constructor to finish initialization.
	 *
	 * @param subStream
	 *            underlying stream
	 * @throws IOException
	 *             if underlying stream can't be read
	 */
	protected SubIIMInputStream(IIMInputStream subStream) throws IOException {
		if (!subStream.isCached()) {
			throw new IOException("SubIIMInputStream can only be constructed from cached IIMINputStreams");
		}
		this.subStream = subStream;

	}

	/**
	 * This should be called from a subclass constructor, if offset or length
	 * are unknown at a time when SubIIMInputStream constructor is called. This
	 * method shouldn't be called more than once.
	 *
	 * @param offset
	 *            byte offset
	 * @param length
	 *            byte length
	 * @throws IOException
	 *             if underlying stream can't be read
	 */
	protected void setOffsetAndLength(long offset, int length) throws IOException {
		this.offset = offset;
		this.length = length;
		this.position = 0;

		if (subStream.position() != offset) {
			subStream.seek(offset);
		}
	}

	public boolean isCached() {
		return true;
	}

	public void seek(long position) throws IOException {
		if (position > length) {
			throw new EOFException("seek past end of file (pos=" + position + ", length=" + length);
		}
		this.position = position;
	}

	public long position() throws IOException {
		return position;
	}

	public int read() throws IOException {
		subStream.seek(position + offset);
		int r;
		if (position >= length) {
			r = -1;
		} else {
			++position;
			r = subStream.read();
		}
		return r;
	}

	public int read(byte[] buffer) throws IOException {
		return read(buffer, 0, buffer.length);
	}

	public int read(byte[] buffer, int boffset, int blength) throws IOException {
		subStream.seek(position + offset);
		if (position + blength > length) {
			blength = (int) (length - position);
		}
		int r = subStream.read(buffer, boffset, blength);
		if (r > 0) {
			position += r;
		}
		return r;
	}

	public void close() throws IOException {
		subStream.close();
	}

	private final IIMInputStream subStream;
	private long position;
	private long offset;
	private int length;
}
