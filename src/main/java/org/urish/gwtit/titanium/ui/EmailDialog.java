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

import org.urish.gwtit.titanium.ui.events.EmailDialogCompleteHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Email Dialog is created by
 * {@link org.urish.gwtit.titanium.ui.createEmailDialog} and allows you to send
 * in application emails on behalf of the application user.
 * <p>
 * Notes:
 * 
 * @since 0.8
 */
public class EmailDialog extends org.urish.gwtit.titanium.Proxy {
	protected EmailDialog() {
	}

	private static native final int value_CANCELLED()
	/*-{
		return Titanium.UI.EmailDialog.CANCELLED;
	}-*/;

	public static final int CANCELLED = value_CANCELLED();

	private static native final int value_FAILED()
	/*-{
		return Titanium.UI.EmailDialog.FAILED;
	}-*/;

	public static final int FAILED = value_FAILED();

	private static native final int value_SAVED()
	/*-{
		return Titanium.UI.EmailDialog.SAVED;
	}-*/;

	public static final int SAVED = value_SAVED();

	private static native final int value_SENT()
	/*-{
		return Titanium.UI.EmailDialog.SENT;
	}-*/;

	public static final int SENT = value_SENT();

	/**
	 * @return The bar color of the email dialog window when opened
	 */
	public final native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public final native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return Array of email BCC: recipients
	 */
	public final native String[] getBccRecipients()
	/*-{
		return this.bccRecipients;
	}-*/;

	public final native void setBccRecipients(String[] value)
	/*-{
		this.bccRecipients = value;
	}-*/;

	/**
	 * @return Array of email CC: recipients
	 */
	public final native String[] getCcRecipients()
	/*-{
		return this.ccRecipients;
	}-*/;

	public final native void setCcRecipients(String[] value)
	/*-{
		this.ccRecipients = value;
	}-*/;

	/**
	 * @return Boolean to indicate whether the email messageBody should be sent
	 *         as HTML content type. defaults to false. (Android note: you
	 *         should not use html messages in 1.6: after that is okay.)
	 */
	public final native boolean getHtml()
	/*-{
		return this.html;
	}-*/;

	public final native void setHtml(boolean value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return The email message body
	 */
	public final native String getMessageBody()
	/*-{
		return this.messageBody;
	}-*/;

	public final native void setMessageBody(String value)
	/*-{
		this.messageBody = value;
	}-*/;

	/**
	 * @return The subject line for the email
	 */
	public final native String getSubject()
	/*-{
		return this.subject;
	}-*/;

	public final native void setSubject(String value)
	/*-{
		this.subject = value;
	}-*/;

	/**
	 * @return Array of email recipients
	 */
	public final native String[] getToRecipients()
	/*-{
		return this.toRecipients;
	}-*/;

	public final native void setToRecipients(String[] value)
	/*-{
		this.toRecipients = value;
	}-*/;

	/**
	 * Add an attachment to the email. The attachment can either be a Blob or
	 * File object. Note: Versions before 1.7.1 will only support one attachment
	 * in Android. Since version 1.7.1, our Android implementation will accept
	 * multiple attachments, but multiple attachments will only work if the user
	 * chooses to send via the Android Gmail app; the Android "Mail" app (which
	 * is anyway not available on some handsets) will only accept one attachment
	 * from a Titanium app. K9 has also been tested successfully with multiple
	 * attachments.
	 * 
	 * @param attachment
	 *            attachment object as either a Blob or File object
	 */
	public final native void addAttachment(JavaScriptObject attachment)
	/*-{
		return this.addAttachment(attachment);
	}-*/;

	/**
	 * Return whether or not sending email is supported
	 */
	public final native void isSupported()
	/*-{
		return this.isSupported();
	}-*/;

	/**
	 * Open the email dialog. the email dialog itself is a modal window
	 */
	public final native void open()
	/*-{
		return this.open();
	}-*/;

	/**
	 * Open the email dialog. the email dialog itself is a modal window
	 * 
	 * @param properties
	 *            object of animation properties. pass `animated` property (as
	 *            boolean) to indicate if the dialog should be animated on open.
	 */
	public final native void open(JavaScriptObject properties)
	/*-{
		return this.open(properties);
	}-*/;

	public final native void addCompleteHandler(EmailDialogCompleteHandler handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.titanium.ui.events.EmailDialogCompleteHandler::onEmailDialogComplete(Lorg/urish/gwtit/titanium/ui/events/EmailDialogCompleteEvent;)(e); } );
	}-*/;

}
