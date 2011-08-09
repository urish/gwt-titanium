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
import org.urish.gwtit.titanium.events.ChangeHandler;

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

	private static native final String value_INADDR_ANY()
	/*-{
		return Titanium.Network.INADDR_ANY;
	}-*/;

	public static final String INADDR_ANY = value_INADDR_ANY();

	private static native final int value_NETWORK_LAN()
	/*-{
		return Titanium.Network.NETWORK_LAN;
	}-*/;

	public static final int NETWORK_LAN = value_NETWORK_LAN();

	private static native final int value_NETWORK_MOBILE()
	/*-{
		return Titanium.Network.NETWORK_MOBILE;
	}-*/;

	public static final int NETWORK_MOBILE = value_NETWORK_MOBILE();

	private static native final int value_NETWORK_NONE()
	/*-{
		return Titanium.Network.NETWORK_NONE;
	}-*/;

	public static final int NETWORK_NONE = value_NETWORK_NONE();

	private static native final int value_NETWORK_UNKNOWN()
	/*-{
		return Titanium.Network.NETWORK_UNKNOWN;
	}-*/;

	public static final int NETWORK_UNKNOWN = value_NETWORK_UNKNOWN();

	private static native final int value_NETWORK_WIFI()
	/*-{
		return Titanium.Network.NETWORK_WIFI;
	}-*/;

	public static final int NETWORK_WIFI = value_NETWORK_WIFI();

	private static native final int value_NOTIFICATION_TYPE_ALERT()
	/*-{
		return Titanium.Network.NOTIFICATION_TYPE_ALERT;
	}-*/;

	public static final int NOTIFICATION_TYPE_ALERT = value_NOTIFICATION_TYPE_ALERT();

	private static native final int value_NOTIFICATION_TYPE_BADGE()
	/*-{
		return Titanium.Network.NOTIFICATION_TYPE_BADGE;
	}-*/;

	public static final int NOTIFICATION_TYPE_BADGE = value_NOTIFICATION_TYPE_BADGE();

	private static native final int value_NOTIFICATION_TYPE_SOUND()
	/*-{
		return Titanium.Network.NOTIFICATION_TYPE_SOUND;
	}-*/;

	public static final int NOTIFICATION_TYPE_SOUND = value_NOTIFICATION_TYPE_SOUND();

	private static native final int value_READ_MODE()
	/*-{
		return Titanium.Network.READ_MODE;
	}-*/;

	public static final int READ_MODE = value_READ_MODE();

	private static native final int value_READ_WRITE_MODE()
	/*-{
		return Titanium.Network.READ_WRITE_MODE;
	}-*/;

	public static final int READ_WRITE_MODE = value_READ_WRITE_MODE();

	private static native final int value_SOCKET_CLOSED()
	/*-{
		return Titanium.Network.SOCKET_CLOSED;
	}-*/;

	public static final int SOCKET_CLOSED = value_SOCKET_CLOSED();

	private static native final int value_SOCKET_CONNECTED()
	/*-{
		return Titanium.Network.SOCKET_CONNECTED;
	}-*/;

	public static final int SOCKET_CONNECTED = value_SOCKET_CONNECTED();

	private static native final int value_SOCKET_ERROR()
	/*-{
		return Titanium.Network.SOCKET_ERROR;
	}-*/;

	public static final int SOCKET_ERROR = value_SOCKET_ERROR();

	private static native final int value_SOCKET_INITIALIZED()
	/*-{
		return Titanium.Network.SOCKET_INITIALIZED;
	}-*/;

	public static final int SOCKET_INITIALIZED = value_SOCKET_INITIALIZED();

	private static native final int value_SOCKET_LISTENING()
	/*-{
		return Titanium.Network.SOCKET_LISTENING;
	}-*/;

	public static final int SOCKET_LISTENING = value_SOCKET_LISTENING();

	private static native final int value_WRITE_MODE()
	/*-{
		return Titanium.Network.WRITE_MODE;
	}-*/;

	public static final int WRITE_MODE = value_WRITE_MODE();

	/**
	 * @return The network type value as a constant.
	 */
	public static native int getNetworkType()
	/*-{
		return Titanium.Network.networkType;
	}-*/;

	public static native void setNetworkType(int value)
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
	 */
	public static native void addConnectivityListener(EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Network.addConnectivityListener(function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourbrowser}
	 * 
	 * @platforms iphone, ipad
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 */
	public static native org.urish.gwtit.titanium.network.BonjourBrowser createBonjourBrowser(String serviceType)
	/*-{
		return Titanium.Network.createBonjourBrowser(serviceType);
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
			String domain, org.urish.gwtit.titanium.network.BonjourBrowser parameters)
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
	 */
	public static native org.urish.gwtit.titanium.network.BonjourService createBonjourService(String name, String type)
	/*-{
		return Titanium.Network.createBonjourService(name, type);
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
			String domain, org.urish.gwtit.titanium.network.BonjourService parameters)
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
	public static native org.urish.gwtit.titanium.network.TCPSocket createTCPSocket(String hostName, int port,
			int mode, Object parameters)
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
	 */
	public static native void removeConnectivityListener(EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Network.removeConnectivityListener(function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Network.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.Network.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, Object event)
	/*-{
		return Titanium.Network.fireEvent(name, event);
	}-*/;

	public static native void addChangeHandler(ChangeHandler handler)
	/*-{
		return Titanium.Network.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.events.ChangeHandler::onChange(Lorg/urish/gwtit/titanium/events/ChangeEvent;)(e); } );
	}-*/;

}
