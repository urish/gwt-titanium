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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Stream module containing stream utility methods
 * 
 * @since 1.7
 */
public class Stream extends org.urish.gwtit.titanium.Module {
	protected Stream() {
	}

	private static native final float value_MODE_READ()
	/*-{
		return Titanium.Stream.MODE_READ;
	}-*/;

	public static final float MODE_READ = value_MODE_READ();

	private static native final float value_MODE_WRITE()
	/*-{
		return Titanium.Stream.MODE_WRITE;
	}-*/;

	public static final float MODE_WRITE = value_MODE_WRITE();

	private static native final float value_MODE_APPEND()
	/*-{
		return Titanium.Stream.MODE_APPEND;
	}-*/;

	public static final float MODE_APPEND = value_MODE_APPEND();

	/**
	 * Creates stream from specified container. returns `titanium.bufferstream`
	 * or `titanium.blobstream` depending on whether a buffer or blob is
	 * provided as the 'source' property in params. write and append mode only
	 * applies to buffer as blob is read only.
	 * 
	 * @param params
	 *            creation arguments
	 */
	public static native org.urish.gwtit.titanium.IOStream createStream(org.urish.gwtit.titanium.CreateStreamArgs params)
	/*-{
		return Titanium.Stream.createStream(params);
	}-*/;

	/**
	 * Async version of read on `titanium.iostream`
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 * @param buffer
	 *            Buffer to read into
	 * @param resultsCallback
	 *            called with result of the read operation
	 */
	public static native void read(org.urish.gwtit.titanium.IOStream sourceStream,
			org.urish.gwtit.titanium.Buffer buffer,
			EventCallback<org.urish.gwtit.titanium.ReadCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.read(sourceStream, buffer, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Async version of read on `titanium.iostream` that takes offset and length
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 * @param buffer
	 *            Buffer to read into
	 * @param offset
	 *            offset to start reading buffer data from
	 * @param length
	 *            length of data to read from buffer
	 * @param resultsCallback
	 *            called with result of the read operation
	 */
	public static native void read(org.urish.gwtit.titanium.IOStream sourceStream,
			org.urish.gwtit.titanium.Buffer buffer, float offset, float length,
			EventCallback<org.urish.gwtit.titanium.ReadCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.read(sourceStream, buffer, offset, length, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Reads all data from `titanium.iostream`
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 */
	public static native org.urish.gwtit.titanium.Buffer readAll(org.urish.gwtit.titanium.IOStream sourceStream)
	/*-{
		return Titanium.Stream.readAll(sourceStream);
	}-*/;

	/**
	 * Async version of readall
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 * @param buffer
	 *            Buffer to read into
	 * @param resultsCallback
	 *            called with result of the read operation
	 */
	public static native void readAll(org.urish.gwtit.titanium.IOStream sourceStream,
			org.urish.gwtit.titanium.Buffer buffer,
			EventCallback<org.urish.gwtit.titanium.ReadCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.readAll(sourceStream, buffer, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Async version of write on `titanium.iostream`
	 * 
	 * @param outputStream
	 *            Stream to write to
	 * @param buffer
	 *            Buffer to write from
	 * @param resultsCallback
	 *            called with result of the write operation
	 */
	public static native void write(org.urish.gwtit.titanium.IOStream outputStream,
			org.urish.gwtit.titanium.Buffer buffer,
			EventCallback<org.urish.gwtit.titanium.WriteCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.write(outputStream, buffer, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Async version of write on `titanium.iostream` that takes offset and
	 * length
	 * 
	 * @param outputStream
	 *            Stream to write to
	 * @param buffer
	 *            Buffer to write from
	 * @param offset
	 *            offset to start writing buffer data from
	 * @param length
	 *            length of data to write from buffer
	 * @param resultsCallback
	 *            called with result of the write operation
	 */
	public static native void write(org.urish.gwtit.titanium.IOStream outputStream,
			org.urish.gwtit.titanium.Buffer buffer, float offset, float length,
			EventCallback<org.urish.gwtit.titanium.WriteCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.write(outputStream, buffer, offset, length, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Writes all data from input stream to output stream
	 * 
	 * @param inputStream
	 *            Stream to read from
	 * @param outputStream
	 *            Stream to write to
	 * @param maxChunkSize
	 *            max size of data to write from inputStream to ouputStream at
	 *            once
	 * @return Number of bytes written
	 */
	public static native float writeStream(org.urish.gwtit.titanium.IOStream inputStream,
			org.urish.gwtit.titanium.IOStream outputStream, float maxChunkSize)
	/*-{
		return Titanium.Stream.writeStream(inputStream, outputStream, maxChunkSize);
	}-*/;

	/**
	 * Async version of writestream
	 * 
	 * @param inputStream
	 *            Stream to read from
	 * @param outputStream
	 *            Stream to write to
	 * @param maxChunkSize
	 *            max size of data to write from inputStream to ouputStream at
	 *            once
	 * @param resultsCallback
	 *            called with result of the writeStream operation
	 */
	public static native void writeStream(org.urish.gwtit.titanium.IOStream inputStream,
			org.urish.gwtit.titanium.IOStream outputStream, float maxChunkSize,
			EventCallback<org.urish.gwtit.titanium.WriteStreamCallbackArgs> resultsCallback)
	/*-{
		return Titanium.Stream.writeStream(inputStream, outputStream, maxChunkSize, function(e) { resultsCallback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Pumps data from input stream to handler method
	 * 
	 * @param inputStream
	 *            Stream to pump from
	 * @param handler
	 *            handler method that will receive the pumped data
	 * @param maxChunkSize
	 *            max size of data to pump from inputStream to the handler
	 *            method at once
	 */
	public static native void pump(org.urish.gwtit.titanium.IOStream inputStream,
			EventCallback<org.urish.gwtit.titanium.PumpCallbackArgs> handler, float maxChunkSize)
	/*-{
		return Titanium.Stream.pump(inputStream, function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); }, maxChunkSize);
	}-*/;

	/**
	 * Variant of pump that allows for setting the async mode
	 * 
	 * @param inputStream
	 *            Stream to pump from
	 * @param handler
	 *            handler method that will receive the pumped data
	 * @param maxChunkSize
	 *            max size of data to pump from inputStream to the handler
	 *            method at once
	 * @param isAsync
	 *            true is pump operation should be async, false is not
	 */
	public static native void pump(org.urish.gwtit.titanium.IOStream inputStream,
			EventCallback<org.urish.gwtit.titanium.PumpCallbackArgs> handler, float maxChunkSize, boolean isAsync)
	/*-{
		return Titanium.Stream.pump(inputStream, function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); }, maxChunkSize, isAsync);
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function to invoke when the event is fired
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Stream.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callbac
	 *            callback function passed in addEventListener
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callbac)
	/*-{
		return Titanium.Stream.removeEventListener(name, function(e) { callbac.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
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
		return Titanium.Stream.fireEvent(name, event);
	}-*/;

}
