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

package org.urish.gwtit.titanium.app;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The app properties module is used for storing application related
 * property/value pairs which persist beyond application sessions.
 * 
 * @since 0.5
 */
public class Properties extends org.urish.gwtit.titanium.Module {
	protected Properties() {
	}

	/**
	 * Return a boolean value
	 * 
	 * @param property
	 *            return a boolean value for property
	 */
	public static native boolean getBool(String property, boolean _default)
	/*-{
		return Titanium.App.Properties.getBool(property, _default);
	}-*/;

	/**
	 * Return a double value
	 * 
	 * @param property
	 *            return a double value for property
	 */
	public static native double getDouble(String property, double _default)
	/*-{
		return Titanium.App.Properties.getDouble(property, _default);
	}-*/;

	/**
	 * Return an integer value
	 * 
	 * @param property
	 *            return a integer value for property
	 */
	public static native int getInt(String property, int _default)
	/*-{
		return Titanium.App.Properties.getInt(property, _default);
	}-*/;

	/**
	 * Return a value as an array
	 * 
	 * @param property
	 *            return an array value for property
	 */
	public static native JavaScriptObject[] getList(String property, JavaScriptObject[] _default)
	/*-{
		return Titanium.App.Properties.getList(property, _default);
	}-*/;

	/**
	 * Return a string value
	 * 
	 * @param property
	 *            return a string value for property
	 */
	public static native String getString(String property, String _default)
	/*-{
		return Titanium.App.Properties.getString(property, _default);
	}-*/;

	/**
	 * Returns true if the property exists
	 * 
	 * @param property
	 *            property name to check
	 */
	public static native boolean hasProperty(String property)
	/*-{
		return Titanium.App.Properties.hasProperty(property);
	}-*/;

	/**
	 * Return an array of property propertys
	 */
	public static native JavaScriptObject[] listProperties()
	/*-{
		return Titanium.App.Properties.listProperties();
	}-*/;

	/**
	 * Remove an existing property
	 * 
	 * @param property
	 *            property name to remove
	 */
	public static native void removeProperty(String property)
	/*-{
		return Titanium.App.Properties.removeProperty(property);
	}-*/;

	/**
	 * Set a property as a boolean value
	 * 
	 * @param property
	 *            property name
	 * @param value
	 *            value
	 */
	public static native void setBool(String property, boolean value)
	/*-{
		return Titanium.App.Properties.setBool(property, value);
	}-*/;

	/**
	 * Set a property as a double value
	 * 
	 * @param property
	 *            property name
	 * @param value
	 *            value
	 */
	public static native void setDouble(String property, double value)
	/*-{
		return Titanium.App.Properties.setDouble(property, value);
	}-*/;

	/**
	 * Set a property as an integer value
	 * 
	 * @param property
	 *            property name
	 * @param value
	 *            value
	 */
	public static native void setInt(String property, int value)
	/*-{
		return Titanium.App.Properties.setInt(property, value);
	}-*/;

	/**
	 * Set a property as an array value
	 * 
	 * @param property
	 *            property name
	 * @param value
	 *            value
	 */
	public static native void setList(String property, JavaScriptObject[] value)
	/*-{
		return Titanium.App.Properties.setList(property, value);
	}-*/;

	/**
	 * Set a property as a string value
	 * 
	 * @param property
	 *            property name
	 * @param value
	 *            value
	 */
	public static native void setString(String property, String value)
	/*-{
		return Titanium.App.Properties.setString(property, value);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.App.Properties.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.App.Properties.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.App.Properties.fireEvent(name, event);
	}-*/;

}
