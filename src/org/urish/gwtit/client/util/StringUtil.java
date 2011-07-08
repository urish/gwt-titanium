package org.urish.gwtit.client.util;

import java.util.Date;

/**
 * Locale-aware string formatting utilities
 * 
 * @author Uri Shaked
 */
public class StringUtil {
	public static native String formatDate(Date date)
	/*-{
		return String.formatDate(date);
	}-*/;

	public static native String formatDate(Date date, String format)
	/*-{
		return String.formatDate(date, format);
	}-*/;

	public static native String formatTime(Date date)
	/*-{
		return String.formatTime(date);
	}-*/;

	public static native String formatCurrency(float currency)
	/*-{
		return String.formatCurrency(currency);
	}-*/;

	public static native String formatCurrency(double currency)
	/*-{
		return String.formatCurrency(currency);
	}-*/;

	public static native String formatDecimal(float decimal)
	/*-{
		return String.formatDecimal(decimal);
	}-*/;

	public static native String formatDecimal(double decimal)
	/*-{
		return String.formatDecimal(decimal);
	}-*/;

	public static native String format(String string, Object... args)
	/*-{
		args.unshift(string);
		return String.format.apply(String, args);
	}-*/;
}
