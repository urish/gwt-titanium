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
 * Deprecated: use {@link org.urish.gwtit.titanium.network.socket.tcp} where
 * possible. the tcpsocket instance returned from
 * {@link org.urish.gwtit.titanium.network.createtcpsocket}. this object
 * represents a socket which either listens locally on the device for
 * connections, or connects to a remote machine.
 * 
 * <p>
 * Notes: Sockets are nontrivial; it is recommended that anyone using them be
 * familiar with the basics of BSD sockets. All sockets use TCP connections, and
 * are asynchronous for read operations, so your program should be ready to
 * receive 'read' events at any point. Socket references cannot be transferred
 * to socket objects, and vice-versa - socket references are an internal
 * mechanism which is used only to determine which sockets to send data to and
 * read data from. For listening sockets, it is highly recommended that you use
 * the <Titanium.Network.INADDR_ANY> constant as the host name. If a window
 * containing a socket is closed, the socket MUST be closed also unless you
 * intend to continue to receive data, otherwise the socket will consume
 * resources (and potentially cause conflicts with opening the window again, if
 * a listener) until the program is restarted. Be aware of the differences
 * between the listen() and connect() functions; attempting to use one when you
 * mean the other may result in errors, unpredictable behavior, or both.
 * 
 * @platforms iphone, ipad
 * @since 1.2.0
 */
public class TCPSocket extends org.urish.gwtit.titanium.Proxy {
	protected TCPSocket() {
	}

	/**
	 * @return The host name to connect to. must be
	 *         {@link org.urish.gwtit.titanium.network.inaddr_any} or an
	 *         identifier for the local device in order to listen
	 */
	public final native String getHostName()
	/*-{
		return this.hostName;
	}-*/;

	public final native void setHostName(String value)
	/*-{
		this.hostName = value;
	}-*/;

	/**
	 * @return Whether or not the socket is valid
	 */
	public final native boolean getIsValid()
	/*-{
		return this.isValid;
	}-*/;

	public final native void setIsValid(boolean value)
	/*-{
		this.isValid = value;
	}-*/;

	/**
	 * @return The socket's mode
	 */
	public final native float getMode()
	/*-{
		return this.mode;
	}-*/;

	public final native void setMode(float value)
	/*-{
		this.mode = value;
	}-*/;

	/**
	 * @return The port to connect/listen on
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
	 * @return Strip terminating null character when sending string data;
	 *         default is false
	 */
	public final native boolean getStripTerminator()
	/*-{
		return this.stripTerminator;
	}-*/;

	public final native void setStripTerminator(boolean value)
	/*-{
		this.stripTerminator = value;
	}-*/;

	/**
	 * Close the socket
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Connect the scocket to a tcp server
	 */
	public final native void connect()
	/*-{
		return this.connect();
	}-*/;

	/**
	 * Set up the socket to receive connections
	 */
	public final native void listen()
	/*-{
		return this.listen();
	}-*/;

	/**
	 * Write data to the socket, if the mode is write_mode or read_write_mode
	 * 
	 * @param data
	 *            either a string or blob object representing the data to be
	 *            transferred
	 * @param sendTo
	 *            the socket reference to send the data to. Default is to send
	 *            to all connected sockets
	 */
	public final native void write(Object data, float sendTo)
	/*-{
		return this.write(data, sendTo);
	}-*/;

	public final native void addReadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('read', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addReadErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('readError', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addWriteErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('writeError', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
