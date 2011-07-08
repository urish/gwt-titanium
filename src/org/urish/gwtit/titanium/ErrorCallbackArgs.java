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

package org.urish.gwtit.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The callback to be fired after the socket enters the error state
 * 
 * @since 1.7
 */
public class ErrorCallbackArgs extends JavaScriptObject {
	protected ErrorCallbackArgs() {
	}

	/**
	 * @return Socket that experienced the error
	 */
	public native org.urish.gwtit.titanium.network.socket.TCP getSocket()
	/*-{
		return this.socket;
	}-*/;

	public native void setSocket(org.urish.gwtit.titanium.network.socket.TCP value)
	/*-{
		this.socket = value;
	}-*/;

	/**
	 * @return A stringified description of the error
	 */
	public native String getError()
	/*-{
		return this.error;
	}-*/;

	public native void setError(String value)
	/*-{
		this.error = value;
	}-*/;

	/**
	 * @return The error code of the error (potentially system-dependent)
	 */
	public native float getErrorCode()
	/*-{
		return this.errorCode;
	}-*/;

	public native void setErrorCode(float value)
	/*-{
		this.errorCode = value;
	}-*/;

}
