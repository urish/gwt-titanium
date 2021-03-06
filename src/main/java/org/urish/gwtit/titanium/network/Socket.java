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

package org.urish.gwtit.titanium.network;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Socket module
 * 
 * @since 1.7
 */
public class Socket extends org.urish.gwtit.titanium.Module {
	protected Socket() {
	}

	private static native final float value_INITIALIZED()
	/*-{
		return Titanium.Network.Socket.INITIALIZED;
	}-*/;

	public static final float INITIALIZED = value_INITIALIZED();

	private static native final float value_CONNECTED()
	/*-{
		return Titanium.Network.Socket.CONNECTED;
	}-*/;

	public static final float CONNECTED = value_CONNECTED();

	private static native final float value_LISTENING()
	/*-{
		return Titanium.Network.Socket.LISTENING;
	}-*/;

	public static final float LISTENING = value_LISTENING();

	private static native final float value_CLOSED()
	/*-{
		return Titanium.Network.Socket.CLOSED;
	}-*/;

	public static final float CLOSED = value_CLOSED();

	private static native final float value_ERROR()
	/*-{
		return Titanium.Network.Socket.ERROR;
	}-*/;

	public static final float ERROR = value_ERROR();

	/**
	 * Returns new TCP socket object, takes object containing properties list
	 * defined in `Titanium.Network.Socket.TCP`. Some properties are only needed
	 * based on whether the socket will be a connecting socket or a listening
	 * socket.
	 * 
	 * @param params
	 *            creation parameters
	 * @return New TCP socket.
	 */
	public static native org.urish.gwtit.titanium.network.socket.TCP createTCP(JavaScriptObject params)
	/*-{
		return Titanium.Network.Socket.createTCP(params);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Network.Socket.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Network.Socket.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.Network.Socket.fireEvent(name, event);
	}-*/;

}
