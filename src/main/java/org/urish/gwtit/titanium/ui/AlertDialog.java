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

import org.urish.gwtit.titanium.ui.events.AlertDialogClickHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Alert Dialog is created by
 * {@link org.urish.gwtit.titanium.ui.createAlertDialog} and allows you to show
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
	 * @return Text for the OK button. Useful for when you only want one button
	 *         and therefore don't want to use the `buttonNames` property. If
	 *         you do use `buttonNames`, this property will be ignored.
	 */
	public final native String getOk()
	/*-{
		return this.ok;
	}-*/;

	public final native void setOk(String value)
	/*-{
		this.ok = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the `ok` property. Note
	 *         that if you use the `buttonNames` property to set the button
	 *         titles, this will be ignored.
	 */
	public final native String getOkid()
	/*-{
		return this.okid;
	}-*/;

	public final native void setOkid(String value)
	/*-{
		this.okid = value;
	}-*/;

	/**
	 * @return Titanium view that should be loaded inside the alert dialog
	 */
	public final native org.urish.gwtit.titanium.ui.View getAndroidView()
	/*-{
		return this.androidView;
	}-*/;

	public final native void setAndroidView(org.urish.gwtit.titanium.ui.View value)
	/*-{
		this.androidView = value;
	}-*/;

	/**
	 * Shows the alert dialog and blocks the background view like a modal window
	 */
	public final native void show()
	/*-{
		return this.show();
	}-*/;

	/**
	 * Hides the alert dialog and unblocks the background view
	 */
	public final native void hide()
	/*-{
		return this.hide();
	}-*/;

	public final native void addClickHandler(AlertDialogClickHandler handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AlertDialogClickHandler::onAlertDialogClick(Lorg/urish/gwtit/titanium/ui/events/AlertDialogClickEvent;)(e); } );
	}-*/;

}
