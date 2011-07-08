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
 * The httpclient instance returned from
 * {@link org.urish.gwtit.titanium.network.createhttpclient}. this object
 * (mostly) implements the xmlhttprequest specification.
 * 
 * @since 0.1
 */
public class HTTPClient extends org.urish.gwtit.titanium.Proxy {
	protected HTTPClient() {
	}

	public static final Const DONE = new ConstImpl("Titanium.Network.HTTPClient.DONE");

	public static final Const HEADERS_RECEIVED = new ConstImpl("Titanium.Network.HTTPClient.HEADERS_RECEIVED");

	public static final Const LOADING = new ConstImpl("Titanium.Network.HTTPClient.LOADING");

	public static final Const OPENED = new ConstImpl("Titanium.Network.HTTPClient.OPENED");

	public static final Const UNSENT = new ConstImpl("Titanium.Network.HTTPClient.UNSENT");

	/**
	 * @return Boolean to indicate that the response was successful
	 */
	public native boolean getConnected()
	/*-{
		return this.connected;
	}-*/;

	public native void setConnected(boolean value)
	/*-{
		this.connected = value;
	}-*/;

	/**
	 * @return The connection type, normally either `get` or `post`.
	 */
	public native String getConnectionType()
	/*-{
		return this.connectionType;
	}-*/;

	public native void setConnectionType(String value)
	/*-{
		this.connectionType = value;
	}-*/;

	/**
	 * @return File to download contents to. can only be set after calling open.
	 *         ios only
	 */
	public native String getFile()
	/*-{
		return this.file;
	}-*/;

	public native void setFile(String value)
	/*-{
		this.file = value;
	}-*/;

	/**
	 * @return The absolute url of the request
	 */
	public native String getLocation()
	/*-{
		return this.location;
	}-*/;

	public native void setLocation(String value)
	/*-{
		this.location = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called at regular intervals as the request data is being
	 *         received. the `progress` property of the event will contain a
	 *         value from 0.0-1.0 with the progress.
	 */
	public native Object getOndatastream()
	/*-{
		return this.ondatastream;
	}-*/;

	public native void setOndatastream(Object value)
	/*-{
		this.ondatastream = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called upon a error response
	 */
	public native Object getOnerror()
	/*-{
		return this.onerror;
	}-*/;

	public native void setOnerror(Object value)
	/*-{
		this.onerror = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called upon a successful response
	 */
	public native Object getOnload()
	/*-{
		return this.onload;
	}-*/;

	public native void setOnload(Object value)
	/*-{
		this.onload = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called for each readystate change
	 */
	public native Object getOnreadystatechange()
	/*-{
		return this.onreadystatechange;
	}-*/;

	public native void setOnreadystatechange(Object value)
	/*-{
		this.onreadystatechange = value;
	}-*/;

	/**
	 * @return Set this to a function before calling open to cause the function
	 *         to be called at regular intervals as the request data is being
	 *         transmitted. the `progress` property of the event will contain a
	 *         value from 0.0-1.0 with the progress.
	 */
	public native Object getOnsendstream()
	/*-{
		return this.onsendstream;
	}-*/;

	public native void setOnsendstream(Object value)
	/*-{
		this.onsendstream = value;
	}-*/;

	/**
	 * @return The readystate value
	 */
	public native float getReadyState()
	/*-{
		return this.readyState;
	}-*/;

	public native void setReadyState(float value)
	/*-{
		this.readyState = value;
	}-*/;

	/**
	 * @return The response data as a blob object.
	 */
	public native Object getResponseData()
	/*-{
		return this.responseData;
	}-*/;

	public native void setResponseData(Object value)
	/*-{
		this.responseData = value;
	}-*/;

	/**
	 * @return The response as text or null if an error was received or no data
	 *         was returned
	 */
	public native String getResponseText()
	/*-{
		return this.responseText;
	}-*/;

	public native void setResponseText(String value)
	/*-{
		this.responseText = value;
	}-*/;

	/**
	 * @return The response object as an xml domdocument object. returns null if
	 *         the content type returned by the server was not xml or the
	 *         content could not be parsed
	 */
	public native Object getResponseXML()
	/*-{
		return this.responseXML;
	}-*/;

	public native void setResponseXML(Object value)
	/*-{
		this.responseXML = value;
	}-*/;

	/**
	 * @return The response http status code
	 */
	public native float getStatus()
	/*-{
		return this.status;
	}-*/;

	public native void setStatus(float value)
	/*-{
		this.status = value;
	}-*/;

	/**
	 * @return Timeout is milliseconds when the connection should be aborted
	 */
	public native float getTimeout()
	/*-{
		return this.timeout;
	}-*/;

	public native void setTimeout(float value)
	/*-{
		this.timeout = value;
	}-*/;

	/**
	 * @return Set this to control how ssl certification validation is performed
	 *         on connection. defaults to false if in simulator or device
	 *         testing and true if release for distribution mode.
	 */
	public native boolean getValidatesSecureCertificate()
	/*-{
		return this.validatesSecureCertificate;
	}-*/;

	public native void setValidatesSecureCertificate(boolean value)
	/*-{
		this.validatesSecureCertificate = value;
	}-*/;

	/**
	 * Abort a pending request
	 */
	public native void abort()
	/*-{
		return this.abort();
	}-*/;

	/**
	 * Return the response header.
	 * 
	 * @param name
	 *            the header name
	 */
	public native String getResponseHeader(String name)
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
	 * @param async
	 *            optional property to indicate if asynchronous (default) or not
	 */
	public native void open(String method, String url, boolean async)
	/*-{
		return this.open(method, url, async);
	}-*/;

	/**
	 * Send the request (only async is currently supported)
	 * 
	 * @param data
	 *            the data to send in the request. can either be null,
	 *            dictionary, string, File object or Blob.
	 */
	public native void send(Object data)
	/*-{
		return this.send(data);
	}-*/;

	/**
	 * Set the request header. must be called after `open` but before `send`.
	 * 
	 * @param name
	 *            name of the header
	 * @param value
	 *            value of the header. May be null to clearing out a property,
	 *            such as X-Requested-With
	 */
	public native void setRequestHeader(String name, String value)
	/*-{
		return this.setRequestHeader(name, value);
	}-*/;

}
