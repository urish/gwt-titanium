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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * Socket module
 * 
 * @since 1.7
 */
public class Socket extends org.urish.gwtit.titanium.Module {
	protected Socket() {
	}

	public static final Const INITIALIZED = new ConstImpl("Titanium.Network.Socket.INITIALIZED");

	public static final Const CONNECTED = new ConstImpl("Titanium.Network.Socket.CONNECTED");

	public static final Const LISTENING = new ConstImpl("Titanium.Network.Socket.LISTENING");

	public static final Const CLOSED = new ConstImpl("Titanium.Network.Socket.CLOSED");

	public static final Const ERROR = new ConstImpl("Titanium.Network.Socket.ERROR");

	/**
	 * Returns new tcp socket object, takes object containing properties list
	 * defined in `titanium.network.socket.tcp`. some properties are only needed
	 * based on whether the socket will be a connecting socket or a listening
	 * socket.
	 * 
	 * @param params
	 *            creation parameters
	 * @return New TCP socket.
	 */
	public static native org.urish.gwtit.titanium.network.socket.TCP createTCP(Object params)
	/*-{
		return Titanium.Network.Socket.createTCP(params);
	}-*/;

}
