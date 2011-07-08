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
 * The option dialog is created by
 * {@link org.urish.gwtit.titanium.ui.createoptiondialog} and allows you to show
 * a modal dialog of one or more options to the user.
 * 
 * @since 0.8
 */
public class OptionDialog extends org.urish.gwtit.titanium.Proxy {
	protected OptionDialog() {
	}

	/**
	 * @return A titanium.ui.view. allows for arbitrary contents inside a native
	 *         dialog. works for any dialog. (android)
	 * @platforms android
	 */
	public native Object getAndroidView()
	/*-{
		return this.androidView;
	}-*/;

	public native void setAndroidView(Object value)
	/*-{
		this.androidView = value;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button. if
	 *         no button should be the cancel button, use -1. if there is a
	 *         cancel button, it must be the last button for use on ipad.
	 */
	public native float getCancel()
	/*-{
		return this.cancel;
	}-*/;

	public native void setCancel(float value)
	/*-{
		this.cancel = value;
	}-*/;

	/**
	 * @return The destructive button (indicated by a visual clue in the ui)
	 */
	public native float getDestructive()
	/*-{
		return this.destructive;
	}-*/;

	public native void setDestructive(float value)
	/*-{
		this.destructive = value;
	}-*/;

	/**
	 * @return Array of button names as strings
	 */
	public native Object[] getOptions()
	/*-{
		return this.options;
	}-*/;

	public native void setOptions(Object[] value)
	/*-{
		this.options = value;
	}-*/;

	/**
	 * @return Set an initially selected option. only valid when options has
	 *         been specified. (android only)
	 * @platforms android
	 */
	public native float getSelectedIndex()
	/*-{
		return this.selectedIndex;
	}-*/;

	public native void setSelectedIndex(float value)
	/*-{
		this.selectedIndex = value;
	}-*/;

	/**
	 * @return The title of the dialog
	 */
	public native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

	/**
	 * Cause the dialog to become visible
	 */
	public native void show()
	/*-{
		return this.show();
	}-*/;

	public native void addClickHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
