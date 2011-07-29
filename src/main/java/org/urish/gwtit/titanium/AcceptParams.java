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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Parameters that contain callbacks to be set on next accepted socket.
 * 
 * @since 1.7
 */
public class AcceptParams extends JavaScriptObject {
	protected AcceptParams() {
	}

	/**
	 * @return The timeout for connect() and all i/o write() operations. cannot
	 *         be modified when not in the initialized state
	 */
	public final native float getTimeout()
	/*-{
		return this.timeout;
	}-*/;

	public final native void setTimeout(float value)
	/*-{
		this.timeout = value;
	}-*/;

	/**
	 * @return The callback to be fired after the socket enters the error state
	 */
	public final native EventCallback<org.urish.gwtit.titanium.ErrorCallbackArgs> getError()
	/*-{
		return this.error._javaObj;
	}-*/;

	public final native void setError(EventCallback<org.urish.gwtit.titanium.ErrorCallbackArgs> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } )
		callback._javaObj = value;
		this.error = callback;
	}-*/;

}
