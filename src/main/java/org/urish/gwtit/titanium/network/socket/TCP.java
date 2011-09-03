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

package org.urish.gwtit.titanium.network.socket;

import org.urish.gwtit.client.EventCallback;

/**
 * TCP socket that implements the `Titanium.IOStream` interface. Created by
 * `Titanium.Network.Socket.createTCP`
 * 
 * @since 1.7
 */
public class TCP extends org.urish.gwtit.titanium.Proxy {
	protected TCP() {
	}

	/**
	 * @return The host to connect to or listen on. Cannot be modified when not
	 *         in the INITIALIZED state. Supports both IPv4 and IPv6
	 */
	public final native String getHost()
	/*-{
		return this.host;
	}-*/;

	public final native void setHost(String value)
	/*-{
		this.host = value;
	}-*/;

	/**
	 * @return The port to connect to or listen on. Cannot be modified when not
	 *         in the INITIALIZED state
	 */
	public final native float getPort()
	/*-{
		return this.port;
	}-*/;

	public final native void setPort(float value)
	/*-{
		this.port = value;
	}-*/;

	/**
	 * @return Max number of pending incoming connections to be allowed when
	 *         listen() is called. Any incoming connections received while the
	 *         max number of pending connections has been reached will be
	 *         rejected.
	 */
	public final native float getListenQueueSize()
	/*-{
		return this.listenQueueSize;
	}-*/;

	public final native void setListenQueueSize(float value)
	/*-{
		this.listenQueueSize = value;
	}-*/;

	/**
	 * @return The timeout for connect() and all I/O write() operations. Cannot
	 *         be modified when not in the INITIALIZED state
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
	 * @return The callback to be fired after the socket enters the "connected"
	 *         state. Only invoked following a successful connect() call
	 */
	public final native EventCallback<org.urish.gwtit.titanium.ConnectedCallbackArgs> getConnected()
	/*-{
		return this.connected._javaObj;
	}-*/;

	public final native void setConnected(EventCallback<org.urish.gwtit.titanium.ConnectedCallbackArgs> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.connected = callback;
	}-*/;

	/**
	 * @return The callback to be fired after the socket enters the ERROR state
	 */
	public final native EventCallback<org.urish.gwtit.titanium.ErrorCallbackArgs> getError()
	/*-{
		return this.error._javaObj;
	}-*/;

	public final native void setError(EventCallback<org.urish.gwtit.titanium.ErrorCallbackArgs> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.error = callback;
	}-*/;

	/**
	 * @return The callback to be fired when a listener accepts a connection
	 */
	public final native EventCallback<org.urish.gwtit.titanium.AcceptedCallbackArgs> getAccepted()
	/*-{
		return this.accepted._javaObj;
	}-*/;

	public final native void setAccepted(EventCallback<org.urish.gwtit.titanium.AcceptedCallbackArgs> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.accepted = callback;
	}-*/;

	/**
	 * @return Current state of the socket
	 */
	public final native float getState()
	/*-{
		return this.state;
	}-*/;

	/**
	 * Attempts to connect the socket to its host/port. Throws exception if the
	 * socket is in a CONNECTED or LISTENING state. Throws exception if a valid
	 * host and port has not been set on the proxy. Nonblocking; connection
	 * attempts are asynchronous
	 */
	public final native void connect()
	/*-{
		return this.connect();
	}-*/;

	/**
	 * Attempts to start listening on the socket's host/port. listen() call will
	 * attempt to listen on the specified host and/or port property for the
	 * socket if they are set. This function blocks execution and throws an
	 * exception on error (and sets the socket state to ERROR) but does not fire
	 * the error callback in this event. Throws exception if the socket is in a
	 * LISTENING or CONNECTED state
	 */
	public final native void listen()
	/*-{
		return this.listen();
	}-*/;

	/**
	 * Tells a LISTENING socket to accept a connection request at the top of a
	 * listener's request queue when one becomes available. Takes an argument, a
	 * box object which assigns callbacks to the created socket. Note that the
	 * connected callback is not called (the socket does not "transition to" the
	 * CONNECTED state - it's created in the CONNECTED state) on the newly
	 * created socket. The accepted callback is called when a new connection is
	 * accepted as a result of calling accept(). If the socket is already
	 * flagged to accept the next connection, the existing accept options will
	 * be update to use the newly specified options object. Throws an exception
	 * if the socket is not in a LISTENING state
	 * 
	 * @param options
	 *            options that contain callbacks to be set on next accepted
	 *            socket
	 */
	public final native void accept(org.urish.gwtit.titanium.AcceptDict options)
	/*-{
		return this.accept(options);
	}-*/;

	/**
	 * Closes a socket. Throws exception if the socket is not in a CONNECTED or
	 * LISTENING state. Blocking
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

}
