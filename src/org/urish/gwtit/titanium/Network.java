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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;
import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level network module. the network module is used accessing networking
 * related functionality, including
 * [titanium.network.socket](titanium.network.socket-module.html)
 * 
 * @since 0.1
 */
public class Network extends org.urish.gwtit.titanium.Module {
	protected Network() {
	}

	public static final Const INADDR_ANY = new ConstImpl("Titanium.Network.INADDR_ANY");

	public static final Const NETWORK_LAN = new ConstImpl("Titanium.Network.NETWORK_LAN");

	public static final Const NETWORK_MOBILE = new ConstImpl("Titanium.Network.NETWORK_MOBILE");

	public static final Const NETWORK_NONE = new ConstImpl("Titanium.Network.NETWORK_NONE");

	public static final Const NETWORK_UNKNOWN = new ConstImpl("Titanium.Network.NETWORK_UNKNOWN");

	public static final Const NETWORK_WIFI = new ConstImpl("Titanium.Network.NETWORK_WIFI");

	public static final Const NOTIFICATION_TYPE_ALERT = new ConstImpl("Titanium.Network.NOTIFICATION_TYPE_ALERT");

	public static final Const NOTIFICATION_TYPE_BADGE = new ConstImpl("Titanium.Network.NOTIFICATION_TYPE_BADGE");

	public static final Const NOTIFICATION_TYPE_SOUND = new ConstImpl("Titanium.Network.NOTIFICATION_TYPE_SOUND");

	public static final Const READ_MODE = new ConstImpl("Titanium.Network.READ_MODE");

	public static final Const READ_WRITE_MODE = new ConstImpl("Titanium.Network.READ_WRITE_MODE");

	public static final Const SOCKET_CLOSED = new ConstImpl("Titanium.Network.SOCKET_CLOSED");

	public static final Const SOCKET_CONNECTED = new ConstImpl("Titanium.Network.SOCKET_CONNECTED");

	public static final Const SOCKET_ERROR = new ConstImpl("Titanium.Network.SOCKET_ERROR");

	public static final Const SOCKET_INITIALIZED = new ConstImpl("Titanium.Network.SOCKET_INITIALIZED");

	public static final Const SOCKET_LISTENING = new ConstImpl("Titanium.Network.SOCKET_LISTENING");

	public static final Const WRITE_MODE = new ConstImpl("Titanium.Network.WRITE_MODE");

	/**
	 * @return The network type value as a constant.
	 */
	public static native float getNetworkType()
	/*-{
		return Titanium.Network.networkType;
	}-*/;

	public static native void setNetworkType(float value)
	/*-{
		Titanium.Network.networkType = value;
	}-*/;

	/**
	 * @return The network type name constant. returns one of `none`, `wifi`,
	 *         `lan` or `mobile`.
	 */
	public static native String getNetworkTypeName()
	/*-{
		return Titanium.Network.networkTypeName;
	}-*/;

	public static native void setNetworkTypeName(String value)
	/*-{
		Titanium.Network.networkTypeName = value;
	}-*/;

	/**
	 * @return Readonly boolean value that indicates if the network is reachable
	 *         to the internet either via wifi or carrier network
	 */
	public static native boolean getOnline()
	/*-{
		return Titanium.Network.online;
	}-*/;

	/**
	 * @return The remote device uuid if the device was registered with the
	 *         apple push notification service or null if not set. only
	 *         available on iphone.
	 * @platforms iphone, ipad
	 */
	public static native String getRemoteDeviceUUID()
	/*-{
		return Titanium.Network.remoteDeviceUUID;
	}-*/;

	public static native void setRemoteDeviceUUID(String value)
	/*-{
		Titanium.Network.remoteDeviceUUID = value;
	}-*/;

	/**
	 * @return Returns an array of network type constants enabled for the
	 *         application. only available on iphone.
	 * @platforms iphone, ipad
	 */
	public static native Object[] getRemoteNotificationTypes()
	/*-{
		return Titanium.Network.remoteNotificationTypes;
	}-*/;

	public static native void setRemoteNotificationTypes(Object[] value)
	/*-{
		Titanium.Network.remoteNotificationTypes = value;
	}-*/;

	/**
	 * @return Returns true if remote notifications have been enabled. only
	 *         available on iphone.
	 * @platforms iphone, ipad
	 */
	public static native boolean getRemoteNotificationsEnabled()
	/*-{
		return Titanium.Network.remoteNotificationsEnabled;
	}-*/;

	public static native void setRemoteNotificationsEnabled(boolean value)
	/*-{
		Titanium.Network.remoteNotificationsEnabled = value;
	}-*/;

	public static native org.urish.gwtit.titanium.network.HTTPClient createHTTPClient()
	/*-{
		return Titanium.Network.createHTTPClient();
	}-*/;

	public static native org.urish.gwtit.titanium.network.Socket createSocket()
	/*-{
		return Titanium.Network.createSocket();
	}-*/;

	/**
	 * Adds a connectivity listener to listen for network changes. this method
	 * has been deprecated in favor of listening for a `change` event.
	 * 
	 * @param callback
	 *            callback function to invoke upon network connectivity changes
	 */
	public static native void addConnectivityListener(Object callback)
	/*-{
		return Titanium.Network.addConnectivityListener(callback);
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourbrowser}
	 * 
	 * @platforms iphone, ipad
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 * @param domain
	 *            the Bonjour service domain to conduct the search in. Default
	 *            value is 'local.'
	 * @param parameters
	 *            A dictionary object of properties defined in
	 *            {@link org.urish.gwtit.titanium.network.BonjourBrowser}
	 */
	public static native org.urish.gwtit.titanium.network.BonjourBrowser createBonjourBrowser(String serviceType,
			String domain)
	/*-{
		return Titanium.Network.createBonjourBrowser(serviceType, domain);
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourbrowser}
	 * 
	 * @platforms iphone, ipad
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 * @param domain
	 *            the Bonjour service domain to conduct the search in. Default
	 *            value is 'local.'
	 * @param parameters
	 *            A dictionary object of properties defined in
	 *            {@link org.urish.gwtit.titanium.network.BonjourBrowser}
	 */
	public static native org.urish.gwtit.titanium.network.BonjourBrowser createBonjourBrowser(String serviceType,
			String domain, Object parameters)
	/*-{
		return Titanium.Network.createBonjourBrowser(serviceType, domain, parameters);
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourservice}
	 * 
	 * @platforms iphone, ipad
	 * @param name
	 *            the name of the service. Must be a unique identifier for this
	 *            service type and domain.
	 * @param type
	 *            the type of service. Must include the protocol identifier
	 *            (._tcp)
	 * @param domain
	 *            the domain to publish the service in. Default value is
	 *            'local.'
	 * @param parameters
	 *            A dictionary object with properties defined in
	 *            {@link org.urish.gwtit.titanium.network.BonjourService}
	 */
	public static native org.urish.gwtit.titanium.network.BonjourService createBonjourService(String name, String type,
			String domain)
	/*-{
		return Titanium.Network.createBonjourService(name, type, domain);
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourservice}
	 * 
	 * @platforms iphone, ipad
	 * @param name
	 *            the name of the service. Must be a unique identifier for this
	 *            service type and domain.
	 * @param type
	 *            the type of service. Must include the protocol identifier
	 *            (._tcp)
	 * @param domain
	 *            the domain to publish the service in. Default value is
	 *            'local.'
	 * @param parameters
	 *            A dictionary object with properties defined in
	 *            {@link org.urish.gwtit.titanium.network.BonjourService}
	 */
	public static native org.urish.gwtit.titanium.network.BonjourService createBonjourService(String name, String type,
			String domain, Object parameters)
	/*-{
		return Titanium.Network.createBonjourService(name, type, domain, parameters);
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.tcpsocket}
	 * 
	 * @platforms iphone, ipad
	 * @param hostName
	 *            the host name to connect to/listen on
	 * @param port
	 *            the port for the socket
	 * @param mode
	 *            the socket's mode; one of
	 *            {@link org.urish.gwtit.titanium.Network.READ_MODE},
	 *            {@link org.urish.gwtit.titanium.Network.WRITE_MODE},
	 *            {@link org.urish.gwtit.titanium.Network.READ_WRITE_MODE}
	 * @param parameters
	 *            A dictionary object with properties defined in
	 *            {@link org.urish.gwtit.titanium.network.TCPSocket}
	 */
	public static native org.urish.gwtit.titanium.network.TCPSocket createTCPSocket(String hostName, float port,
			float mode, Object parameters)
	/*-{
		return Titanium.Network.createTCPSocket(hostName, port, mode, parameters);
	}-*/;

	/**
	 * Decode a uri component part using uri encoding
	 * 
	 * @param value
	 *            input value to be decoded
	 */
	public static native String decodeURIComponent(String value)
	/*-{
		return Titanium.Network.decodeURIComponent(value);
	}-*/;

	/**
	 * Encode a uri component part using uri encoding
	 * 
	 * @param value
	 *            input value to be encoded
	 */
	public static native String encodeURIComponent(String value)
	/*-{
		return Titanium.Network.encodeURIComponent(value);
	}-*/;

	/**
	 * Register for push notifications with the apple push notification service.
	 * only available on iphone.
	 * 
	 * @param config
	 *            dictionary of the following: `types` is an array of type
	 *            constants that the application would like to receive,
	 *            `success` is a callback function that is called when the push
	 *            registration is successfully completed, `error` is a callback
	 *            function that is called when an error is received during
	 *            registration and `callback` is a callback function that is
	 *            invoked upon receiving a new push notification. This method
	 *            should be called at application startup.
	 */
	public static native void registerForPushNotifications(Object config)
	/*-{
		return Titanium.Network.registerForPushNotifications(config);
	}-*/;

	/**
	 * Removes a connectivity listener. this method has been deprecated in favor
	 * of listening for a `change` event.
	 * 
	 * @param callback
	 *            callback function to remove
	 */
	public static native void removeConnectivityListener(Object callback)
	/*-{
		return Titanium.Network.removeConnectivityListener(callback);
	}-*/;

	public static native void addChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Network.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
