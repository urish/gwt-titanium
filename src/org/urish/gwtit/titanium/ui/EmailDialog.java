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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;
import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The email dialog is created by
 * {@link org.urish.gwtit.titanium.ui.createemaildialog} and allows you to send
 * in application emails on behalf of the application user.
 * <p>
 * Notes:
 * 
 * @since 0.8
 */
public class EmailDialog extends org.urish.gwtit.titanium.Proxy {
	protected EmailDialog() {
	}

	public static final Const CANCELLED = new ConstImpl("Titanium.UI.EmailDialog.CANCELLED");

	public static final Const FAILED = new ConstImpl("Titanium.UI.EmailDialog.FAILED");

	public static final Const SAVED = new ConstImpl("Titanium.UI.EmailDialog.SAVED");

	public static final Const SENT = new ConstImpl("Titanium.UI.EmailDialog.SENT");

	/**
	 * @return The bar color of the email dialog window when opened
	 */
	public native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return Array of email bcc: recipients
	 */
	public native Object[] getBccRecipients()
	/*-{
		return this.bccRecipients;
	}-*/;

	public native void setBccRecipients(Object[] value)
	/*-{
		this.bccRecipients = value;
	}-*/;

	/**
	 * @return Array of email cc: recipients
	 */
	public native Object[] getCcRecipients()
	/*-{
		return this.ccRecipients;
	}-*/;

	public native void setCcRecipients(Object[] value)
	/*-{
		this.ccRecipients = value;
	}-*/;

	/**
	 * @return Boolean to indicate whether the email messagebody should be sent
	 *         as html content type. defaults to false. (android note: you
	 *         should not use html messages in 1.6: after that is okay.)
	 */
	public native boolean getHtml()
	/*-{
		return this.html;
	}-*/;

	public native void setHtml(boolean value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return The email message body
	 */
	public native String getMessageBody()
	/*-{
		return this.messageBody;
	}-*/;

	public native void setMessageBody(String value)
	/*-{
		this.messageBody = value;
	}-*/;

	/**
	 * @return The subject line for the email
	 */
	public native String getSubject()
	/*-{
		return this.subject;
	}-*/;

	public native void setSubject(String value)
	/*-{
		this.subject = value;
	}-*/;

	/**
	 * @return Array of email recipients
	 */
	public native Object[] getToRecipients()
	/*-{
		return this.toRecipients;
	}-*/;

	public native void setToRecipients(Object[] value)
	/*-{
		this.toRecipients = value;
	}-*/;

	/**
	 * Add an attachment to the email. the attachment can either be a blob or
	 * file object. note: versions before 1.7.1 will only support one attachment
	 * in android. since version 1.7.1, our android implementation will accept
	 * multiple attachments, but multiple attachments will only work if the user
	 * chooses to send via the android gmail app; the android "mail" app (which
	 * is anyway not available on some handsets) will only accept one attachment
	 * from a titanium app. k9 has also been tested successfully with multiple
	 * attachments.
	 * 
	 * @param attachment
	 *            attachment object as either a Blob or File object
	 */
	public native void addAttachment(Object attachment)
	/*-{
		return this.addAttachment(attachment);
	}-*/;

	/**
	 * Return whether or not sending email is supported
	 */
	public native void isSupported()
	/*-{
		return this.isSupported();
	}-*/;

	/**
	 * Open the email dialog. the email dialog itself is a modal window
	 * 
	 * @param properties
	 *            object of animation properties. pass `animated` property (as
	 *            boolean) to indicate if the dialog should be animated on open.
	 */
	public native void open(Object properties)
	/*-{
		return this.open(properties);
	}-*/;

	public native void addCompleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
