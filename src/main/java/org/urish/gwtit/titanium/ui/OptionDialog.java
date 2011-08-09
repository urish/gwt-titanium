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

import org.urish.gwtit.titanium.ui.events.ClickHandler;

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
	public final native Object getAndroidView()
	/*-{
		return this.androidView;
	}-*/;

	public final native void setAndroidView(Object value)
	/*-{
		this.androidView = value;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button. if
	 *         no button should be the cancel button, use -1. if there is a
	 *         cancel button, it must be the last button for use on ipad.
	 */
	public final native int getCancel()
	/*-{
		return this.cancel;
	}-*/;

	public final native void setCancel(int value)
	/*-{
		this.cancel = value;
	}-*/;

	/**
	 * @return The destructive button (indicated by a visual clue in the ui)
	 */
	public final native int getDestructive()
	/*-{
		return this.destructive;
	}-*/;

	public final native void setDestructive(int value)
	/*-{
		this.destructive = value;
	}-*/;

	/**
	 * @return Array of button names as strings
	 */
	public final native Object[] getOptions()
	/*-{
		return this.options;
	}-*/;

	public final native void setOptions(Object[] value)
	/*-{
		this.options = value;
	}-*/;

	/**
	 * @return Set an initially selected option. only valid when options has
	 *         been specified. (android only)
	 * @platforms android
	 */
	public final native int getSelectedIndex()
	/*-{
		return this.selectedIndex;
	}-*/;

	public final native void setSelectedIndex(int value)
	/*-{
		this.selectedIndex = value;
	}-*/;

	/**
	 * @return The title of the dialog
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public final native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public final native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

	/**
	 * Cause the dialog to become visible
	 */
	public final native void show()
	/*-{
		return this.show();
	}-*/;

	public final native void addClickHandler(ClickHandler handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.titanium.ui.OptionDialog.ClickHandler::onClick(Lorg/urish/gwtit/titanium/ui/OptionDialog/ClickEvent;)(e); } );
	}-*/;

}
