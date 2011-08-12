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

package org.urish.gwtit.titanium.ui;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A module used for accessing clipboard data.
 * 
 * @since 1.5
 */
public class Clipboard extends org.urish.gwtit.titanium.Module {
	protected Clipboard() {
	}

	/**
	 * Clear data of the given mime-type from the clipboard. if no mime-type is
	 * given, clear all data from the clipboard.
	 * 
	 * @param type
	 *            (optional) The mime-type of the data to clear.
	 */
	public static native void clearData(String type)
	/*-{
		return Titanium.UI.Clipboard.clearData(type);
	}-*/;

	/**
	 * Clear the text portion of the clipboard.
	 */
	public static native void clearText()
	/*-{
		return Titanium.UI.Clipboard.clearText();
	}-*/;

	/**
	 * Get the data on the clipboard from the portion which contains data of the
	 * given mime-type.
	 * 
	 * @param type
	 *            The mime-type of the data to get.
	 */
	public static native void getData(String type)
	/*-{
		return Titanium.UI.Clipboard.getData(type);
	}-*/;

	/**
	 * Get the current text on the clipboard.
	 */
	public static native void getText()
	/*-{
		return Titanium.UI.Clipboard.getText();
	}-*/;

	/**
	 * Return true if there is any content of the given mime-type on the
	 * clipboard.
	 * 
	 * @param type
	 *            (optional) The mime-type of the data to check.
	 */
	public static native void hasData(String type)
	/*-{
		return Titanium.UI.Clipboard.hasData(type);
	}-*/;

	/**
	 * Return true if there is any content in the text portion of the clipboard.
	 */
	public static native void hasText()
	/*-{
		return Titanium.UI.Clipboard.hasText();
	}-*/;

	/**
	 * Set the data on the clipboard given a mime-type and the new data. this
	 * method will set data on the appropriate portion of the clipboard for the
	 * given mime-type.
	 * 
	 * @param type
	 *            The mime-type of the data to set.
	 * @param data
	 *            The new clipboard text.
	 */
	public static native void setData(String type, JavaScriptObject data)
	/*-{
		return Titanium.UI.Clipboard.setData(type, data);
	}-*/;

	/**
	 * Set the text on the clipboard. this will overwrite the current contents
	 * of the clipboard.
	 * 
	 * @param text
	 *            The new clipboard text. If the text is an empty string
	 */
	public static native void setText(String text)
	/*-{
		return Titanium.UI.Clipboard.setText(text);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.UI.Clipboard.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.UI.Clipboard.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.UI.Clipboard.fireEvent(name, event);
	}-*/;

}
