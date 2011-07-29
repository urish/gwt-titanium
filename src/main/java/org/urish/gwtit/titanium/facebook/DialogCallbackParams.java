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

package org.urish.gwtit.titanium.facebook;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A callback for when dialog is completed/cancelled
 */
public class DialogCallbackParams extends JavaScriptObject {
	protected DialogCallbackParams() {
	}

	/**
	 * 
	 */
	public final native boolean getSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * 
	 */
	public final native String getError()
	/*-{
		return this.error;
	}-*/;

	/**
	 * 
	 */
	public final native boolean getCancelled()
	/*-{
		return this.cancelled;
	}-*/;

	/**
	 * @return The data returned by facebook
	 */
	public final native String getResult()
	/*-{
		return this.result;
	}-*/;

}
