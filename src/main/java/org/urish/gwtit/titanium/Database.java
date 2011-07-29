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
 * The top level database module. the database module is used for creating and
 * accessing the in-application database.
 * 
 * @since 0.1
 */
public class Database extends org.urish.gwtit.titanium.Module {
	protected Database() {
	}

	private static native final float value_FIELD_TYPE_DOUBLE()
	/*-{
		return Titanium.Database.FIELD_TYPE_DOUBLE;
	}-*/;

	public static final float FIELD_TYPE_DOUBLE = value_FIELD_TYPE_DOUBLE();

	private static native final float value_FIELD_TYPE_FLOAT()
	/*-{
		return Titanium.Database.FIELD_TYPE_FLOAT;
	}-*/;

	public static final float FIELD_TYPE_FLOAT = value_FIELD_TYPE_FLOAT();

	private static native final float value_FIELD_TYPE_INT()
	/*-{
		return Titanium.Database.FIELD_TYPE_INT;
	}-*/;

	public static final float FIELD_TYPE_INT = value_FIELD_TYPE_INT();

	private static native final float value_FIELD_TYPE_STRING()
	/*-{
		return Titanium.Database.FIELD_TYPE_STRING;
	}-*/;

	public static final float FIELD_TYPE_STRING = value_FIELD_TYPE_STRING();

	public static native org.urish.gwtit.titanium.database.DB createDB()
	/*-{
		return Titanium.Database.createDB();
	}-*/;

	public static native org.urish.gwtit.titanium.database.ResultSet createResultSet()
	/*-{
		return Titanium.Database.createResultSet();
	}-*/;

	/**
	 * Install a database from the application resources folder (at build time)
	 * and return a reference to the opened database. it is safe to call this
	 * method multiple times since this method will only install once if it
	 * doesn't already exist on the device.
	 * 
	 * @param path
	 *            the path (relative to the main application Resources folder at
	 *            build time) to the db to install. this file must be in the
	 *            SQLite 3 file format.
	 * @param name
	 *            the name of the database
	 */
	public static native org.urish.gwtit.titanium.database.DB install(String path, String name)
	/*-{
		return Titanium.Database.install(path, name);
	}-*/;

	/**
	 * Open a database. if it doesn't yet exist, create it.
	 * 
	 * @param name
	 *            the name of the database
	 */
	public static native org.urish.gwtit.titanium.database.DB open(String name)
	/*-{
		return Titanium.Database.open(name);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Database.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.Database.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Database.fireEvent(name, event);
	}-*/;

}
