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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Tcp socket that implements the `titanium.iostream` interface. created by
 * `titanium.network.socket.createtcp`
 * 
 * @since 1.7
 */
public class TCP extends org.urish.gwtit.titanium.Proxy {
	protected TCP() {
	}

	/**
	 * @return The host to connect to or listen on. cannot be modified when not
	 *         in the initialized state. supports both ipv4 and ipv6
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
	 * @return The port to connect to or listen on. cannot be modified when not
	 *         in the initialized state
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
	 *         listen() is called. any incoming connections received while the
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
	 * @return The callback to be fired after the socket enters the "connected"
	 *         state. only invoked following a successful connect() call
	 */
	public final native EventCallback<JavaScriptObject> getConnected()
	/*-{
		return this.connected;
	}-*/;

	public final native void setConnected(EventCallback<JavaScriptObject> value)
	/*-{
		this.connected = value;
	}-*/;

	/**
	 * @return The callback to be fired after the socket enters the error state
	 */
	public final native EventCallback<JavaScriptObject> getError()
	/*-{
		return this.error;
	}-*/;

	public final native void setError(EventCallback<JavaScriptObject> value)
	/*-{
		this.error = value;
	}-*/;

	/**
	 * @return The callback to be fired when a listener accepts a connection
	 */
	public final native EventCallback<JavaScriptObject> getAccepted()
	/*-{
		return this.accepted;
	}-*/;

	public final native void setAccepted(EventCallback<JavaScriptObject> value)
	/*-{
		this.accepted = value;
	}-*/;

	/**
	 * @return Current state of the socket
	 */
	public final native float getState()
	/*-{
		return this.state;
	}-*/;

	public final native void setState(float value)
	/*-{
		this.state = value;
	}-*/;

	/**
	 * Attempts to connect the socket to its host/port. throws exception if the
	 * socket is in a connected or listening state. throws exception if a valid
	 * host and port has not been set on the proxy. nonblocking; connection
	 * attempts are asynchronous
	 */
	public final native void connect()
	/*-{
		return this.connect();
	}-*/;

	/**
	 * Attempts to start listening on the socket's host/port. listen() call will
	 * attempt to listen on the specified host and/or port property for the
	 * socket if they are set. this function blocks execution and throws an
	 * exception on error (and sets the socket state to error) but does not fire
	 * the error callback in this event. throws exception if the socket is in a
	 * listening or connected state
	 */
	public final native void listen()
	/*-{
		return this.listen();
	}-*/;

	/**
	 * Tells a listening socket to accept a connection request at the top of a
	 * listener's request queue when one becomes available. takes an argument, a
	 * box object which assigns callbacks to the created socket. note that the
	 * connected callback is not called (the socket does not "transition to" the
	 * connected state - it's created in the connected state) on the newly
	 * created socket. the accepted callback is called when a new connection is
	 * accepted as a result of calling accept(). if the socket is already
	 * flagged to accept the next connection, the existing accept options will
	 * be update to use the newly specified options object. throws an exception
	 * if the socket is not in a listening state
	 * 
	 * @param params
	 *            parameters that contain callbacks to be set on next accepted
	 *            socket
	 */
	public final native void accept(org.urish.gwtit.titanium.AcceptParams params)
	/*-{
		return this.accept(params);
	}-*/;

	/**
	 * Closes a socket. throws exception if the socket is not in a connected or
	 * listening state. blocking
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

}
