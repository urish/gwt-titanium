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


/**
 * Iostream is the interface that all stream types implement
 * 
 * @since 1.7
 */
public class IOStream extends org.urish.gwtit.titanium.Proxy {
	protected IOStream() {
	}

	/**
	 * Reads data from stream into a buffer
	 * 
	 * @param buffer
	 *            buffer to read stream data into
	 * @return Number of bytes read.
	 */
	public final native float read(org.urish.gwtit.titanium.Buffer buffer)
	/*-{
		return this.read(buffer);
	}-*/;

	/**
	 * Reads data from stream into a buffer
	 * 
	 * @param buffer
	 *            buffer to read stream data into
	 * @param offset
	 *            offset to start reading buffer data from
	 * @param length
	 *            length of data to read from buffer
	 * @return Number of bytes read.
	 */
	public final native float read(org.urish.gwtit.titanium.Buffer buffer, float offset, float length)
	/*-{
		return this.read(buffer, offset, length);
	}-*/;

	/**
	 * Writes data from buffer to stream
	 * 
	 * @param buffer
	 *            buffer to write to stream
	 * @return Number of bytes written.
	 */
	public final native float write(org.urish.gwtit.titanium.Buffer buffer)
	/*-{
		return this.write(buffer);
	}-*/;

	/**
	 * Reads data from stream into a buffer
	 * 
	 * @param buffer
	 *            buffer to write to stream
	 * @param offset
	 *            offset to start writing buffer data from
	 * @param length
	 *            length of data to write from buffer
	 * @return Number of bytes written.
	 */
	public final native float write(org.urish.gwtit.titanium.Buffer buffer, float offset, float length)
	/*-{
		return this.write(buffer, offset, length);
	}-*/;

	/**
	 * Whether stream is writeable.
	 * 
	 * @return true if stream is writeable, false otherwise
	 */
	public final native boolean isWriteable()
	/*-{
		return this.isWriteable();
	}-*/;

	/**
	 * Whether stream is readable.
	 * 
	 * @return true if stream is readable, false otherwise
	 */
	public final native boolean isReadable()
	/*-{
		return this.isReadable();
	}-*/;

	/**
	 * Closes stream and throws exception on error
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

}
