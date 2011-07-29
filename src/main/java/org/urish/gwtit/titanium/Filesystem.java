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
 * The top level filesystem module. the filesystem module is used for reading
 * and saving files and directories on the device.
 * 
 * @since 0.1
 */
public class Filesystem extends org.urish.gwtit.titanium.Module {
	protected Filesystem() {
	}

	private static native final float value_MODE_APPEND()
	/*-{
		return Titanium.Filesystem.MODE_APPEND;
	}-*/;

	public static final float MODE_APPEND = value_MODE_APPEND();

	private static native final float value_MODE_READ()
	/*-{
		return Titanium.Filesystem.MODE_READ;
	}-*/;

	public static final float MODE_READ = value_MODE_READ();

	private static native final float value_MODE_WRITE()
	/*-{
		return Titanium.Filesystem.MODE_WRITE;
	}-*/;

	public static final float MODE_WRITE = value_MODE_WRITE();

	/**
	 * @return Readonly constant where your application data directory is
	 *         located. this directory should be used to place
	 *         applications-specific files. on iphone, this directory is also
	 *         backed up.
	 */
	public static native String getApplicationDataDirectory()
	/*-{
		return Titanium.Filesystem.applicationDataDirectory;
	}-*/;

	/**
	 * @return Readonly constant where your application is located
	 */
	public static native String getApplicationDirectory()
	/*-{
		return Titanium.Filesystem.applicationDirectory;
	}-*/;

	/**
	 * @return Readonly platform specific line ending constant
	 */
	public static native String getLineEnding()
	/*-{
		return Titanium.Filesystem.lineEnding;
	}-*/;

	/**
	 * @return Readonly constant where your application resources are located
	 */
	public static native String getResourcesDirectory()
	/*-{
		return Titanium.Filesystem.resourcesDirectory;
	}-*/;

	/**
	 * @return Readonly path separator constant
	 */
	public static native String getSeparator()
	/*-{
		return Titanium.Filesystem.separator;
	}-*/;

	/**
	 * @return Readonly constant where your application can place temporary
	 *         files
	 */
	public static native String getTempDirectory()
	/*-{
		return Titanium.Filesystem.tempDirectory;
	}-*/;

	public static native org.urish.gwtit.titanium.filesystem.File createFile()
	/*-{
		return Titanium.Filesystem.createFile();
	}-*/;

	public static native org.urish.gwtit.titanium.filesystem.FileStream createFileStream()
	/*-{
		return Titanium.Filesystem.createFileStream();
	}-*/;

	/**
	 * Create temp file and return a
	 * {@link org.urish.gwtit.titanium.filesystem.file}
	 */
	public static native org.urish.gwtit.titanium.filesystem.File createTempDirectory()
	/*-{
		return Titanium.Filesystem.createTempDirectory();
	}-*/;

	/**
	 * Create a temp file and return a
	 * {@link org.urish.gwtit.titanium.filesystem.file}
	 */
	public static native org.urish.gwtit.titanium.filesystem.File createTempFile()
	/*-{
		return Titanium.Filesystem.createTempFile();
	}-*/;

	/**
	 * Return a fully formed file path as a
	 * {@link org.urish.gwtit.titanium.filesystem.file} object
	 * 
	 * @param path
	 *            one or more path arguments to form the full path joined
	 *            together with the platform specific path separator. if a
	 *            relative path is passed, the full path will be relative to the
	 *            application resource folder.
	 */
	public static native org.urish.gwtit.titanium.filesystem.File getFile(String path)
	/*-{
		return Titanium.Filesystem.getFile(path);
	}-*/;

	/**
	 * Returns true if the android device supports external storage such as an
	 * sd card. returns false on ios.
	 */
	public static native boolean isExternalStoragePresent()
	/*-{
		return Titanium.Filesystem.isExternalStoragePresent();
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
		return Titanium.Filesystem.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Filesystem.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Filesystem.fireEvent(name, event);
	}-*/;

}
