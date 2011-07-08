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
	 * @param _default
	 *            optional default value if property is not found
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
	 * @param _default
	 *            optional default value if property is not found
	 */
	public static native float getDouble(String property, float _default)
	/*-{
		return Titanium.App.Properties.getDouble(property, _default);
	}-*/;

	/**
	 * Return an integer value
	 * 
	 * @param property
	 *            return a integer value for property
	 * @param _default
	 *            optional default value if property is not found
	 */
	public static native float getInt(String property, float _default)
	/*-{
		return Titanium.App.Properties.getInt(property, _default);
	}-*/;

	/**
	 * Return a value as an array
	 * 
	 * @param property
	 *            return an array value for property
	 * @param _default
	 *            optional default value if property is not found
	 */
	public static native Object[] getList(String property, Object[] _default)
	/*-{
		return Titanium.App.Properties.getList(property, _default);
	}-*/;

	/**
	 * Return a string value
	 * 
	 * @param property
	 *            return a string value for property
	 * @param _default
	 *            optional default value if property is not found
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
	public static native Object[] listProperties()
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
	public static native void setDouble(String property, float value)
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
	public static native void setInt(String property, float value)
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
	public static native void setList(String property, Object[] value)
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

}
