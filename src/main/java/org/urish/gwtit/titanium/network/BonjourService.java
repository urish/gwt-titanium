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

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * The bonjourservice instance returned either from
 * {@link org.urish.gwtit.titanium.network.createbonjourservice} or via the
 * service list from a bonjourbrowser `updatedservices` event. this object
 * describes a service on the network which is published by bonjour.
 * <p>
 * Notes: You can only publish Bonjour services attached to a socket which is
 * currently listening; you cannot publish a service for a remotely connected
 * socket. If you stop the Bonjour service and wish to close the socket it uses,
 * it is strongly recommended that you stop the service first. When a window
 * which publishes a Bonjour service is closed, you must stop the service if the
 * associated socket is also to be closed, or if it is no longer necessary to
 * publish. Unlike other network operations, Bonjour service resolution and
 * publishing is synchronous, so be aware that your code may block while
 * resolution is going on. In particular, you may wish to display UI elements
 * indicating background activity before beginning resolution.
 * 
 * @platforms iphone, ipad
 * @since 1.2.0
 */
public class BonjourService extends org.urish.gwtit.titanium.Proxy {
	protected BonjourService() {
	}

	/**
	 * @return The domain of the service
	 */
	public final native String getDomain()
	/*-{
		return this.domain;
	}-*/;

	public final native void setDomain(String value)
	/*-{
		this.domain = value;
	}-*/;

	/**
	 * @return Whether or not the service is local to the device
	 */
	public final native boolean getIsLocal()
	/*-{
		return this.isLocal;
	}-*/;

	public final native void setIsLocal(boolean value)
	/*-{
		this.isLocal = value;
	}-*/;

	/**
	 * @return The name of the service
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native void setName(String value)
	/*-{
		this.name = value;
	}-*/;

	/**
	 * @return The tcpsocket object that is used to connect to the service
	 */
	public final native Object getSocket()
	/*-{
		return this.socket;
	}-*/;

	public final native void setSocket(Object value)
	/*-{
		this.socket = value;
	}-*/;

	/**
	 * @return The type of the service
	 */
	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	public final native void setType(String value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * Publish a bonjour service to the network. only works if islocal is true
	 * 
	 * @param socket
	 *            a TCPSocket object to associate with the Bonjour service.
	 */
	public final native void publish(Object socket)
	/*-{
		return this.publish(socket);
	}-*/;

	/**
	 * Resolve a bonjour service from the network. must be done before
	 * attempting to access the service's socket information, if a remote
	 * service. you cannot resolve a locally published service.
	 * 
	 * @param timeout
	 *            the timeout for service resolution, in seconds. Optional,
	 *            default is 120s.
	 */
	public final native void resolve(double timeout)
	/*-{
		return this.resolve(timeout);
	}-*/;

	/**
	 * Halts publication of a service.
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

}
