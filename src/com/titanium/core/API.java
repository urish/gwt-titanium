package com.titanium.core;

/**
 * The top level API module. The API module is mainly used for logging.
 * 
 * @author Uri
 * 
 */
public class API {
	/**
	 * function for logging debug messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void debug(String message) /*-{
		Titanium.API.debug(message);
	}-*/;

	/**
	 * function for logging informational messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void info(String message) /*-{
		Titanium.API.info(message);
	}-*/;

	/**
	 * function for logging warning messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void warn(String message) /*-{
		Titanium.API.warn(message);
	}-*/;

	/**
	 * function for logging error messages
	 * 
	 * @param message
	 *            the message to log
	 */
	public static native void error(String message) /*-{
		Titanium.API.error(message);
	}-*/;

	/**
	 * function for logging custom severity messages
	 * 
	 * @param level
	 *            the log level
	 * @param message
	 *            the message to log
	 */
	public static native void log(String level, String message) /*-{
		Titanium.API.log(level, message);
	}-*/;
}
