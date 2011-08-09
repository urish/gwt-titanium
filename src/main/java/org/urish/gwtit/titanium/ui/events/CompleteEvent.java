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

package org.urish.gwtit.titanium.ui.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class CompleteEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "complete";

	protected CompleteEvent() {
	}

	/**
	 * result status either as SENT, SAVED, CANCELLED or FAILED. (Note: Android
	 * result will be SENT even if user discards or saves the message. SAVED and
	 * CANCELLED are not supported on Android.)
	 */
	public final native Object getResult()
	/*-{
		return this.result;
	}-*/;

	/**
	 * boolean to indicate if the email was successfully sent
	 */
	public final native Object getSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * string message of the error or null if successfully sent
	 */
	public final native Object getError()
	/*-{
		return this.error;
	}-*/;

}
