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

package org.urish.gwtit.titanium.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class LoginEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "login";

	protected LoginEvent() {
	}

	/**
	 * the user id returned by Facebook if the login was successful.
	 */
	public final native String getUid()
	/*-{
		return this.uid;
	}-*/;

	/**
	 * true if the login was successful
	 */
	public final native boolean getSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * data returned by Facebook when we query for the uid (using graph path
	 * "me") after successful login. Data is in JSON format. Includes
	 * information such as user name, locale and gender.
	 */
	public final native JavaScriptObject getData()
	/*-{
		return this.data;
	}-*/;

	/**
	 * error message if success was false
	 */
	public final native String getError()
	/*-{
		return this.error;
	}-*/;

	/**
	 * true if the user cancelled the request by closing the dialog
	 */
	public final native boolean getCancelled()
	/*-{
		return this.cancelled;
	}-*/;

}
