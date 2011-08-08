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

package org.urish.gwtit.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * The titanium binding of an [android
 * intent](http://developer.android.com/reference/android/content/intent.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Intent extends org.urish.gwtit.titanium.Proxy {
	protected Intent() {
	}

	/**
	 * @return An action constant from {@link org.urish.gwtit.titanium.android}
	 */
	public final native String getAction()
	/*-{
		return this.action;
	}-*/;

	public final native void setAction(String value)
	/*-{
		this.action = value;
	}-*/;

	/**
	 * @return The java class name of the activity (packagename must also be
	 *         set)
	 */
	public final native String getClassName()
	/*-{
		return this.className;
	}-*/;

	public final native void setClassName(String value)
	/*-{
		this.className = value;
	}-*/;

	/**
	 * @return The intent's data uri. see also android's
	 *         [intent.setdata](http://
	 *         developer.android.com/reference/android/content
	 *         /intent.html#setdata(android.net.uri))
	 */
	public final native String getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(String value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return Intent flags. see the flags constants in
	 *         {@link org.urish.gwtit.titanium.android}.
	 */
	public final native float getFlags()
	/*-{
		return this.flags;
	}-*/;

	public final native void setFlags(float value)
	/*-{
		this.flags = value;
	}-*/;

	/**
	 * @return The fully-qualified java package name of the activity
	 */
	public final native String getPackageName()
	/*-{
		return this.packageName;
	}-*/;

	public final native void setPackageName(String value)
	/*-{
		this.packageName = value;
	}-*/;

	/**
	 * @return The mime type for this intent. see also android's
	 *         [intent.settype]
	 *         (http://developer.android.com/reference/android/content
	 *         /intent.html#settype(java.lang.string))
	 */
	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	public final native void setType(String value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * @return The url to a titanium javascript activity
	 */
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * Add a category to this intent. see the category constants in
	 * {@link org.urish.gwtit.titanium.android}.
	 * 
	 * @param name
	 *            The category name. See the category constants in
	 *            {@link org.urish.gwtit.titanium.Android}
	 */
	public final native void addCategory(String name)
	/*-{
		return this.addCategory(name);
	}-*/;

	/**
	 * Augment the existing flags on the intent.
	 * 
	 * @param flags
	 *            the flags to add to the existing set.
	 */
	public final native void addFlags(float flags)
	/*-{
		return this.addFlags(flags);
	}-*/;

	/**
	 * Get a boolean property from this intent
	 * 
	 * @param name
	 *            The boolean property to get
	 */
	public final native boolean getBooleanExtra(String name)
	/*-{
		return this.getBooleanExtra(name);
	}-*/;

	/**
	 * Get a double property from this intent
	 * 
	 * @param name
	 *            The double property to get
	 */
	public final native float getDoubleExtra(String name)
	/*-{
		return this.getDoubleExtra(name);
	}-*/;

	/**
	 * Get a int property from this intent
	 * 
	 * @param name
	 *            The int property to get
	 */
	public final native float getIntExtra(String name)
	/*-{
		return this.getIntExtra(name);
	}-*/;

	/**
	 * Get a long property from this intent
	 * 
	 * @param name
	 *            The long property to get
	 */
	public final native float getLongExtra(String name)
	/*-{
		return this.getLongExtra(name);
	}-*/;

	/**
	 * Get a string property from this intent
	 * 
	 * @param name
	 *            The string property to get
	 */
	public final native String getStringExtra(String name)
	/*-{
		return this.getStringExtra(name);
	}-*/;

	/**
	 * Returns whether or not this intent has a property
	 * 
	 * @param name
	 *            The property name to check for
	 */
	public final native boolean hasExtra(String name)
	/*-{
		return this.hasExtra(name);
	}-*/;

	/**
	 * Put an extra property on this intent
	 * 
	 * @param name
	 *            The property name
	 * @param value
	 *            The property value
	 */
	public final native void putExtra(String name, Object value)
	/*-{
		return this.putExtra(name, value);
	}-*/;

	/**
	 * Put a uri property on this intent (useful for
	 * {@link org.urish.gwtit.titanium.android.extra_stream})
	 * 
	 * @param name
	 *            The property name
	 * @param value
	 *            The URI string
	 */
	public final native void putExtraUri(String name, String value)
	/*-{
		return this.putExtraUri(name, value);
	}-*/;

}
