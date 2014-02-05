/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.nmote.iim4j.dataset.DataSet;
import com.nmote.iim4j.dataset.DataSetInfo;
import com.nmote.iim4j.dataset.DataSetInfoFactory;
import com.nmote.iim4j.dataset.DefaultDataSet;
import com.nmote.iim4j.dataset.InvalidDataSetException;
import com.nmote.iim4j.dataset.UnsupportedDataSetException;
import com.nmote.iim4j.serialize.DefaultSerializationContext;
import com.nmote.iim4j.serialize.SerializationContext;
import com.nmote.iim4j.serialize.SerializationException;
import com.nmote.iim4j.serialize.Serializer;

/**
 * IIMFile
 */
public class IIMFile extends DefaultSerializationContext implements Serializable, Cloneable {

	private static final long serialVersionUID = 100L;

	public IIMFile() {
		this(IIMDataSetInfoFactory.VERSION_4);
	}

	public IIMFile(DataSetInfoFactory dsiFactory) {
		this.dsiFactory = dsiFactory;
	}

	/**
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		IIMFile file = new IIMFile(dsiFactory);
		file.dataSets = new ArrayList<DataSet>(dataSets);
		file.serializationContext = serializationContext == this ? file : serializationContext;
		file.activeSerializationContext = activeSerializationContext == this ? file : activeSerializationContext;
		return file;
	}

	public void readFrom(IIMReader reader, int recover) throws IOException, InvalidDataSetException {
		final boolean doLog = log != null;
		for (;;) {
			try {
				DataSet ds = reader.read();
				if (ds == null) {
					break;
				}

				if (doLog) {
					log.debug("Read data set " + ds);
				}

				DataSetInfo info = ds.getInfo();
				Serializer s = info.getSerializer();
				if (s != null) {
					if (info.getDataSetNumber() == IIM.DS(1, 90)) {
						setCharacterSet((String) s.deserialize(ds.getData(), activeSerializationContext));
					}
				}

				dataSets.add(ds);

				if (stopAfter9_10 && info.getDataSetNumber() == IIM.DS(9, 10))
					break;
			} catch (IIMFormatException e) {
				if (recoverFromIIMFormat && recover-- > 0) {
					boolean r = reader.recover();
					if (doLog) {
						log.debug(r ? "Recoved from " + e : "Failed to recover from " + e);
					}
					if (!r)
						break;
				} else {
					throw e;
				}
			} catch (UnsupportedDataSetException e) {
				if (recoverFromUnsupportedDataSet && recover-- > 0) {
					boolean r = reader.recover();
					if (doLog) {
						log.debug(r ? "Recoved from " + e : "Failed to recover from " + e);
					}
					if (!r)
						break;
				} else {
					throw e;
				}
			} catch (InvalidDataSetException e) {
				if (recoverFromInvalidDataSet && recover-- > 0) {
					boolean r = reader.recover();
					if (doLog) {
						log.debug(r ? "Recoved from " + e : "Failed to recover from " + e);
					}
					if (!r)
						break;
				} else {
					throw e;
				}
			} catch (IOException e) {
				if (recover-- > 0 && !dataSets.isEmpty()) {
					if (doLog) {
						log.error("IOException while reading, however some data sets where recovered, " + e);
					}
					return;
				} else {
					throw e;
				}
			}
		}
	}

	public void readFrom(IIMReader reader) throws IOException, InvalidDataSetException {
		readFrom(reader, Integer.MAX_VALUE);
	}

	public void writeTo(IIMWriter writer) throws IOException {
		final boolean doLog = log != null;
		for (Iterator<DataSet> i = dataSets.iterator(); i.hasNext();) {
			DataSet ds = i.next();
			writer.write(ds);
			if (doLog) {
				log.debug("Wrote data set " + ds);
			}
		}
	}

	public Object get(int dataSet) throws SerializationException {
		Object result = null;
		for (Iterator<DataSet> i = dataSets.iterator(); i.hasNext();) {
			DataSet ds = i.next();
			DataSetInfo info = ds.getInfo();
			if (info.getDataSetNumber() == dataSet) {
				result = getData(ds);
				break;
			}
		}
		return result;
	}

	private Object getData(DataSet ds) throws SerializationException {
		DataSetInfo info = ds.getInfo();
		Serializer s = info.getSerializer();
		Object result;
		if (s != null) {
			result = s.deserialize(ds.getData(), activeSerializationContext);
		} else {
			result = ds.getData();
		}
		return result;
	}

	public Date getDateTimeHelper(int dateDataSet, int timeDataSet) {
		DataSet dateDS = null;
		DataSet timeDS = null;
		for (Iterator<DataSet> i = dataSets.iterator(); (dateDS == null || timeDS == null) && i.hasNext();) {
			DataSet ds = i.next();
			DataSetInfo info = ds.getInfo();
			if (info.getDataSetNumber() == dateDataSet) {
				dateDS = ds;
			} else if (info.getDataSetNumber() == timeDataSet) {
				timeDS = ds;
			}
		}

		Date result = null;
		if (dateDS != null && timeDS != null) {
			DataSetInfo dateDSI = dateDS.getInfo();
			DataSetInfo timeDSI = timeDS.getInfo();
			SimpleDateFormat format = new SimpleDateFormat(dateDSI.getSerializer().toString()
					+ timeDSI.getSerializer().toString());
			StringBuffer date = new StringBuffer(20);
			try {
				date.append(getData(dateDS));
				date.append(getData(timeDS));
				result = format.parse(date.toString());
			} catch (ParseException e) {
				// FIXME Handle in some way this exception
			} catch (SerializationException e) {
				// FIXME Handle in some way this exception
			}
		}

		return result;
	}

	public void add(int ds, Object value) throws SerializationException, InvalidDataSetException {
		if (value == null)
			return;

		DataSetInfo dsi = dsiFactory.create(ds);
		byte[] data = dsi.getSerializer().serialize(value, activeSerializationContext);
		DataSet dataSet = new DefaultDataSet(dsi, data);
		dataSets.add(dataSet);
	}

	public void add(DataSet dataSet) {
		dataSets.add(dataSet);
	}

	public void addDateTimeHelper(int dsDate, int dsTime, Date date) throws SerializationException,
			InvalidDataSetException {
		if (date == null)
			return;

		addDateTimeHelper(dsDate, date);
		addDateTimeHelper(dsTime, date);
	}

	public void addDateTimeHelper(int ds, Date date) throws SerializationException, InvalidDataSetException {
		if (date == null)
			return;

		DataSetInfo dsi = dsiFactory.create(ds);

		SimpleDateFormat df = new SimpleDateFormat(dsi.getSerializer().toString());
		String value = df.format(date);
		byte[] data = dsi.getSerializer().serialize(value, activeSerializationContext);
		DataSet dataSet = new DefaultDataSet(dsi, data);
		add(dataSet);
	}

	public List<Object> getAll(int dataSet) throws SerializationException {
		List<Object> result = new ArrayList<Object>();
		for (Iterator<DataSet> i = dataSets.iterator(); i.hasNext();) {
			DataSet ds = i.next();
			DataSetInfo info = ds.getInfo();
			if (info.getDataSetNumber() == dataSet) {
				result.add(getData(ds));
			}
		}
		return result;
	}

	public boolean remove(int dataSet) {
		boolean result = false;
		for (Iterator<DataSet> i = dataSets.iterator(); i.hasNext();) {
			DataSet ds = i.next();
			DataSetInfo info = ds.getInfo();
			if (info.getDataSetNumber() == dataSet) {
				i.remove();
				result = true;
			}
		}
		return result;
	}

	public boolean removeRecord(int record) {
		boolean result = false;
		for (Iterator<DataSet> i = dataSets.iterator(); i.hasNext();) {
			DataSet ds = i.next();
			DataSetInfo info = ds.getInfo();
			if ((info.getDataSetNumber() >> 8) == record) {
				i.remove();
				result = true;
			}
		}
		return result;
	}

	/**
	 * @return Returns the serializationContext.
	 */
	public SerializationContext getSerializationContext() {
		return this.serializationContext;
	}

	/**
	 * @param serializationContext
	 *            The serializationContext to set.
	 */
	public void setSerializationContext(SerializationContext serializationContext) {
		this.serializationContext = serializationContext;
		activeSerializationContext = serializationContext != null ? serializationContext : this;
	}

	/**
	 * @return Returns the dataSets.
	 */
	public List<DataSet> getDataSets() {
		return this.dataSets;
	}

	/**
	 * @param dataSets
	 *            The dataSets to set.
	 */
	public void setDataSets(List<DataSet> dataSets) {
		this.dataSets = dataSets;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("IIMFile(");
		b.append("dataSets=");
		b.append(dataSets);
		b.append(')');
		return b.toString();
	}

	/**
	 * Sets logger for this IIMFile.
	 * 
	 * @param log
	 */
	public void setLog(LoggerAdapter log) {
		this.log = log;
	}

	private List<DataSet> dataSets = new ArrayList<DataSet>();
	private SerializationContext serializationContext;
	private SerializationContext activeSerializationContext = this;
	private DataSetInfoFactory dsiFactory;
	private boolean stopAfter9_10 = true;
	private boolean recoverFromUnsupportedDataSet = true;
	private boolean recoverFromInvalidDataSet = true;
	private boolean recoverFromIIMFormat = true;
	private LoggerAdapter log;
}