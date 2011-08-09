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

/* Automatically generated code, don't edit ! */

package org.urish.gwtit.titanium;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level locale module. the locale module works with localization files
 * to which are generated during compilation into the operating system specific
 * localization formats. the locale module provides locale-specific strings
 * which can be referenced at runtime. additionally, the module contains a few
 * methods and properties for querying device locale information.
 * <p>
 * Notes: The macro `L` can also be used which aliases the method
 * <Titanium.Locale.getString>.
 * 
 * @since 1.5
 */
public class Locale extends org.urish.gwtit.titanium.Module {
	protected Locale() {
	}

	/**
	 * @return Return the current (default) iso 2-letter country code for the
	 *         device.
	 */
	public static native String getCurrentCountry()
	/*-{
		return Titanium.Locale.currentCountry;
	}-*/;

	public static native void setCurrentCountry(String value)
	/*-{
		Titanium.Locale.currentCountry = value;
	}-*/;

	/**
	 * @return Return the current language for the device based on the user's
	 *         settings (readonly)
	 */
	public static native String getCurrentLanguage()
	/*-{
		return Titanium.Locale.currentLanguage;
	}-*/;

	public static native void setCurrentLanguage(String value)
	/*-{
		Titanium.Locale.currentLanguage = value;
	}-*/;

	/**
	 * @return Return the current locale string for the device based on the
	 *         user's settings (e.g., en-us). (readonly) (android only)
	 * @platforms android
	 */
	public static native String getCurrentLocale()
	/*-{
		return Titanium.Locale.currentLocale;
	}-*/;

	public static native void setCurrentLocale(String value)
	/*-{
		Titanium.Locale.currentLocale = value;
	}-*/;

	/**
	 * Format a telephone number according to the current locale.
	 * 
	 * @param number
	 *            the phone number to format
	 */
	public static native String formatTelephoneNumber(String number)
	/*-{
		return Titanium.Locale.formatTelephoneNumber(number);
	}-*/;

	/**
	 * Return a currency code for a given locale. (android only)
	 * 
	 * @param locale
	 *            the locale for which you want to the currency code, e.g.
	 *            getCurrencyCode('en-US') -> 'USD'
	 */
	public static native String getCurrencyCode(String locale)
	/*-{
		return Titanium.Locale.getCurrencyCode(locale);
	}-*/;

	/**
	 * Return a currency symbol for the given currency code. (android only)
	 * 
	 * @platforms android
	 * @param currencyCode
	 *            the currency for which you want the symbol, e.g.
	 *            getCurrencySymbol('USD') -> '$'
	 */
	public static native String getCurrencySymbol(String currencyCode)
	/*-{
		return Titanium.Locale.getCurrencySymbol(currencyCode);
	}-*/;

	/**
	 * Return a currency symbol for the given locale. (android only)
	 * 
	 * @platforms android
	 * @param locale
	 *            the locale whose currency symbol you want, e.g.
	 *            getLocaleCurrencySymbol('en-US') -> '$'
	 */
	public static native String getLocaleCurrencySymbol(String locale)
	/*-{
		return Titanium.Locale.getLocaleCurrencySymbol(locale);
	}-*/;

	/**
	 * Return a localization string
	 * 
	 * @param key
	 *            the key to use when mapping into the localization file
	 */
	public static native String getString(String key)
	/*-{
		return Titanium.Locale.getString(key);
	}-*/;

	/**
	 * Return a localization string
	 * 
	 * @param key
	 *            the key to use when mapping into the localization file
	 * @param hint
	 *            the text to use if no key found in the localization file
	 */
	public static native String getString(String key, String hint)
	/*-{
		return Titanium.Locale.getString(key, hint);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Locale.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.Locale.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Locale.fireEvent(name, event);
	}-*/;

}
