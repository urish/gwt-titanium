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
 * The alert dialog is created by
 * {@link org.urish.gwtit.titanium.ui.createalertdialog} and allows you to show
 * a modal application dialog.
 * <p>
 * Notes: the global method `alert` is aliased to this object and can be invoked
 * with a single message. For example:
 * 
 * alert("this is a message");
 * 
 * Note: you should be careful not to call alert more than once while a pending
 * alert is visible.
 * 
 * On iOS 4, alert dialogs will automatically be cancelled upon application
 * suspend.
 * 
 * @since 0.8
 */
public class AlertDialog extends org.urish.gwtit.titanium.Proxy {
	protected AlertDialog() {
	}

	/**
	 * @return Array of button names as strings
	 */
	public native Object[] getButtonNames()
	/*-{
		return this.buttonNames;
	}-*/;

	public native void setButtonNames(Object[] value)
	/*-{
		this.buttonNames = value;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button
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
	 * @return The message of the dialog
	 */
	public native String getMessage()
	/*-{
		return this.message;
	}-*/;

	public native void setMessage(String value)
	/*-{
		this.message = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the message property
	 */
	public native String getMessageid()
	/*-{
		return this.messageid;
	}-*/;

	public native void setMessageid(String value)
	/*-{
		this.messageid = value;
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
	 * Cause the dialog to become hidden
	 */
	public native void hide()
	/*-{
		return this.hide();
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