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
 * The HttpClient instance returned from
 * {@link org.urish.gwtit.titanium.network.createHTTPClient}. This object
 * (mostly) implements the XMLHttpRequest specification.
 * 
 * @since 0.1
 */
public class HTTPClient extends org.urish.gwtit.titanium.Proxy {
	protected HTTPClient() {
	}

	private static native final int value_DONE()
	/*-{
		return Titanium.Network.HTTPClient.DONE;
	}-*/;

	public static final int DONE = value_DONE();

	private static native final int value_HEADERS_RECEIVED()
	/*-{
		return Titanium.Network.HTTPClient.HEADERS_RECEIVED;
	}-*/;

	public static final int HEADERS_RECEIVED = value_HEADERS_RECEIVED();

	private static native final int value_LOADING()
	/*-{
		return Titanium.Network.HTTPClient.LOADING;
	}-*/;

	public static final int LOADING = value_LOADING();

	private static native final int value_OPENED()
	/*-{
		return Titanium.Network.HTTPClient.OPENED;
	}-*/;

	public static final int OPENED = value_OPENED();

	private static native final int value_UNSENT()
	/*-{
		return Titanium.Network.HTTPClient.UNSENT;
	}-*/;

	public static final int UNSENT = value_UNSENT();

	/**
	 * @return Boolean to indicate that the response was successful
	 */
	public final native boolean getConnected()
	/*-{
		return this.connected;
	}-*/;

	public final native void setConnected(boolean value)
	/*-{
		this.connected = value;
	}-*/;

	/**
	 * @return The connection type, normally either `GET` or `POST`.
	 */
	public final native String getConnectionType()
	/*-{
		return this.connectionType;
	}-*/;

	public final native void setConnectionType(String value)
	/*-{
		this.connectionType = value;
	}-*/;

	/**
	 * @return File to download contents to. Can only be set after calling open.
	 * @platforms iphone, ipad
	 */
	public final native String getFile()
	/*-{
		return this.file;
	}-*/;

	public final native void setFile(String value)
	/*-{
		this.file = value;
	}-*/;

	/**
	 * @return The absolute URL of the request
	 */
	public final native String getLocation()
	/*-{
		return this.location;
	}-*/;

	public final native void setLocation(String value)
	/*-{
		this.location = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called at regular intervals as the request data is being
	 *         received. the `progress` property of the event will contain a
	 *         value from 0.0-1.0 with the progress.
	 */
	public final native EventCallback<JavaScriptObject> getOndatastream()
	/*-{
		return this.ondatastream._javaObj;
	}-*/;

	public final native void setOndatastream(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.ondatastream = callback;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called upon a error response
	 */
	public final native EventCallback<JavaScriptObject> getOnerror()
	/*-{
		return this.onerror._javaObj;
	}-*/;

	public final native void setOnerror(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onerror = callback;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called upon a successful response
	 */
	public final native EventCallback<JavaScriptObject> getOnload()
	/*-{
		return this.onload._javaObj;
	}-*/;

	public final native void setOnload(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onload = callback;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called for each readyState change
	 */
	public final native EventCallback<JavaScriptObject> getOnreadystatechange()
	/*-{
		return this.onreadystatechange._javaObj;
	}-*/;

	public final native void setOnreadystatechange(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onreadystatechange = callback;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called at regular intervals as the request data is being
	 *         transmitted. the `progress` property of the event will contain a
	 *         value from 0.0-1.0 with the progress.
	 */
	public final native EventCallback<JavaScriptObject> getOnsendstream()
	/*-{
		return this.onsendstream._javaObj;
	}-*/;

	public final native void setOnsendstream(EventCallback<JavaScriptObject> value)
	/*-{
		var callback = function(e) { value.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); };
		callback._javaObj = value;
		this.onsendstream = callback;
	}-*/;

	/**
	 * @return The readyState value
	 */
	public final native int getReadyState()
	/*-{
		return this.readyState;
	}-*/;

	public final native void setReadyState(int value)
	/*-{
		this.readyState = value;
	}-*/;

	/**
	 * @return The response data as a Blob object.
	 */
	public final native org.urish.gwtit.titanium.Blob getResponseData()
	/*-{
		return this.responseData;
	}-*/;

	/**
	 * @return The response as text or null if an error was received or no data
	 *         was returned
	 */
	public final native String getResponseText()
	/*-{
		return this.responseText;
	}-*/;

	/**
	 * @return The response object as an XML DOMDocument object. returns null if
	 *         the content type returned by the server was not XML or the
	 *         content could not be parsed
	 */
	public final native org.urish.gwtit.titanium.xml.Document getResponseXML()
	/*-{
		return this.responseXML;
	}-*/;

	/**
	 * @return The response HTTP status code
	 */
	public final native int getStatus()
	/*-{
		return this.status;
	}-*/;

	/**
	 * @return Timeout is milliseconds when the connection should be aborted
	 */
	public final native int getTimeout()
	/*-{
		return this.timeout;
	}-*/;

	public final native void setTimeout(int value)
	/*-{
		this.timeout = value;
	}-*/;

	/**
	 * @return Set this to control how SSL certification validation is performed
	 *         on connection. defaults to false if in simulator or device
	 *         testing and true if release for distribution mode.
	 */
	public final native boolean getValidatesSecureCertificate()
	/*-{
		return this.validatesSecureCertificate;
	}-*/;

	public final native void setValidatesSecureCertificate(boolean value)
	/*-{
		this.validatesSecureCertificate = value;
	}-*/;

	/**
	 * Abort a pending request
	 */
	public final native void abort()
	/*-{
		return this.abort();
	}-*/;

	/**
	 * Return the response header.
	 * 
	 * @param name
	 *            the header name
	 */
	public final native String getResponseHeader(String name)
	/*-{
		return this.getResponseHeader(name);
	}-*/;

	/**
	 * Open the request and ready the connection
	 * 
	 * @param method
	 *            the HTTP method
	 * @param url
	 *            the URL for the request
	 */
	public final native void open(String method, String url)
	/*-{
		return this.open(method, url);
	}-*/;

	/**
	 * Open the request and ready the connection
	 * 
	 * @param method
	 *            the HTTP method
	 * @param url
	 *            the URL for the request
	 * @param async
	 *            optional property to indicate if asynchronous (default) or not
	 */
	public final native void open(String method, String url, boolean async)
	/*-{
		return this.open(method, url, async);
	}-*/;

	/**
	 * Send the request (Only async is currently supported)
	 */
	public final native void send()
	/*-{
		return this.send();
	}-*/;

	/**
	 * Send the request (Only async is currently supported)
	 * 
	 * @param data
	 *            the data to send in the request. can either be null,
	 *            dictionary, string, File object or Blob.
	 */
	public final native void send(Object data)
	/*-{
		return this.send(data);
	}-*/;

	/**
	 * Set the request header. Must be called after `open` but before `send`.
	 * 
	 * @param name
	 *            name of the header
	 * @param value
	 *            value of the header. May be null to clearing out a property,
	 *            such as X-Requested-With
	 */
	public final native void setRequestHeader(String name, String value)
	/*-{
		return this.setRequestHeader(name, value);
	}-*/;

}
