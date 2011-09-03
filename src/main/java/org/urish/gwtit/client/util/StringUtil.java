/*
 * Copyright 2011 Uri Shaked
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
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
