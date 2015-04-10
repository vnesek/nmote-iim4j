package com.nmote.iim4j.dataset;


/**
 * Describes a single violation of IIM data set constraints.
 */
public class ConstraintViolation {

	/**
	 * Binary formatted value is invalid.
	 */
	public static final String INVALID_VALUE = "invalid.value";

	/**
	 * Mandatory data set is missing.
	 */
	public static final String MANDATORY_MISSING = "mandatory.missing";

	/**
	 * Repeatable data set is added multiple times.
	 */
	public static final String REPEATABLE_REPEATED = "repeatable.repeated";

	/**
	 * Constucts new instance.
	 *
	 * @param dataSetInfo
	 *            data set that caused violation
	 * @param message
	 *            message code describing violation
	 */
	public ConstraintViolation(DataSetInfo dataSetInfo, String message) {
		if (dataSetInfo == null) {
			throw new NullPointerException("dataSetInfo == null");
		}
		if (message == null) {
			throw new NullPointerException("message == null");
		}
		this.dataSetInfo = dataSetInfo;
		this.message = message;
	}

	/**
	 * Data set that caused violation.
	 * @return data set that caused violation
	 */
	public DataSetInfo getDataSetInfo() {
		return dataSetInfo;
	}

	/**
	 * Message code describing violation.
	 * @return  message code describing violation
	 */
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return dataSetInfo.toString() + ' ' + dataSetInfo.getName() + ": " + message;
	}

	private final DataSetInfo dataSetInfo;
	private final String message;
}
