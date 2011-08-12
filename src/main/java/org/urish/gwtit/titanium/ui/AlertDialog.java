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
	public final native JavaScriptObject[] getButtonNames()
	/*-{
		return this.buttonNames;
	}-*/;

	public final native void setButtonNames(JavaScriptObject[] value)
	/*-{
		this.buttonNames = value;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button
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
	 * @return The message of the dialog
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;

	public final native void setMessage(String value)
	/*-{
		this.message = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the message property
	 */
	public final native String getMessageid()
	/*-{
		return this.messageid;
	}-*/;

	public final native void setMessageid(String value)
	/*-{
		this.messageid = value;
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
	 * Cause the dialog to become hidden
	 */
	public final native void hide()
	/*-{
		return this.hide();
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
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ClickHandler::onClick(Lorg/urish/gwtit/titanium/ui/events/ClickEvent;)(e); } );
	}-*/;

}
