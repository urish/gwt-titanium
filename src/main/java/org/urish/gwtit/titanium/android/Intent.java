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

/**
 * The Titanium binding of an [Android
 * Intent](http://developer.android.com/reference/android/content/Intent.html)
 * 
 * @platforms android
 * @since 1.5
 */
public class Intent extends org.urish.gwtit.titanium.Proxy {
	protected Intent() {
	}

	/**
	 * @return An action constant from {@link org.urish.gwtit.titanium.Android}
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
	 * @return The Java class name of the activity (packageName must also be
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
	 * @return The Intent's Data URI. See also Android's
	 *         [Intent.setData](http://
	 *         developer.android.com/reference/android/content
	 *         /Intent.html#setData(android.net.Uri))
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
	 * @return Intent flags. See the flags constants in
	 *         {@link org.urish.gwtit.titanium.Android}.
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
	 * @return The fully-qualified Java package name of the activity
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
	 * @return The mime type for this Intent. See also Android's
	 *         [Intent.setType]
	 *         (http://developer.android.com/reference/android/content
	 *         /Intent.html#setType(java.lang.String))
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
	 * @return The URL to a Titanium Javascript Activity
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
	 * Add a category to this Intent. See the category constants in
	 * {@link org.urish.gwtit.titanium.Android}.
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
	 * Augment the existing flags on the Intent.
	 * 
	 * @param flags
	 *            the flags to add to the existing set.
	 */
	public final native void addFlags(float flags)
	/*-{
		return this.addFlags(flags);
	}-*/;

	/**
	 * Get a boolean property from this Intent
	 * 
	 * @param name
	 *            The boolean property to get
	 */
	public final native boolean getBooleanExtra(String name)
	/*-{
		return this.getBooleanExtra(name);
	}-*/;

	/**
	 * Get a double property from this Intent
	 * 
	 * @param name
	 *            The double property to get
	 */
	public final native float getDoubleExtra(String name)
	/*-{
		return this.getDoubleExtra(name);
	}-*/;

	/**
	 * Get a int property from this Intent
	 * 
	 * @param name
	 *            The int property to get
	 */
	public final native float getIntExtra(String name)
	/*-{
		return this.getIntExtra(name);
	}-*/;

	/**
	 * Get a long property from this Intent
	 * 
	 * @param name
	 *            The long property to get
	 */
	public final native float getLongExtra(String name)
	/*-{
		return this.getLongExtra(name);
	}-*/;

	/**
	 * Get a string property from this Intent
	 * 
	 * @param name
	 *            The string property to get
	 */
	public final native String getStringExtra(String name)
	/*-{
		return this.getStringExtra(name);
	}-*/;

	/**
	 * Returns whether or not this Intent has a property
	 * 
	 * @param name
	 *            The property name to check for
	 */
	public final native boolean hasExtra(String name)
	/*-{
		return this.hasExtra(name);
	}-*/;

	/**
	 * Put an extra property on this Intent
	 * 
	 * @param name
	 *            The property name
	 * @param value
	 *            The property value
	 */
	public final native void putExtra(String name, JavaScriptObject value)
	/*-{
		return this.putExtra(name, value);
	}-*/;

	/**
	 * Put a URI property on this Intent (useful for
	 * {@link org.urish.gwtit.titanium.Android.EXTRA_STREAM})
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
