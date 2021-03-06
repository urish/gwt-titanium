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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Buffer is a container for raw data. A buffer is created by the method
 * `Titanium.createBuffer`.
 * 
 * @since 1.7
 */
public class Buffer extends org.urish.gwtit.titanium.Proxy {
	protected Buffer() {
	}

	/**
	 * @default 0, unless `value` is specified, at which case the length of the
	 *          encoded data is used
	 * @return The length of the buffer in bytes. When `length` is modified the
	 *         buffer will be re-sized while preserving existing data where
	 *         possible. If the new buffer length is smaller than the length of
	 *         the existing data then the existing data will be truncated down
	 *         to the size of the new buffer. Resizing the buffer via setting
	 *         length should be used sparingly due to the associated overhead.
	 */
	public final native float getLength()
	/*-{
		return this.length;
	}-*/;

	public final native void setLength(float value)
	/*-{
		this.length = value;
	}-*/;

	public final native void setValue(float value)
	/*-{
		this.value = value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * @return Data to be encoded. If `value` is a Number, `type` must also be
	 *         set. (this is simply a convenient way of calling
	 *         {@link org.urish.gwtit.titanium.codec.encodeString} or
	 *         {@link org.urish.gwtit.titanium.codec.encodeNumber}).
	 */
	public final native JavaScriptObject getValue()
	/*-{
		return this.value;
	}-*/;

	/**
	 * @return The type of data encoding to use with `value`. Required when
	 *         `value` is a Number. When `value` is a String,
	 *         {@link org.urish.gwtit.titanium.Codec.CHARSET_UTF8} is the
	 *         default.
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
	 * @return The byte order of this buffer. The OS native byte order is used
	 *         by default.
	 */
	public final native float getByteOrder()
	/*-{
		return this.byteOrder;
	}-*/;

	public final native void setByteOrder(float value)
	/*-{
		this.byteOrder = value;
	}-*/;

	/**
	 * Appends `sourceBuffer` to the current buffer. Buffer is grown dynamically
	 * to accommodate the additional data if need be.
	 * 
	 * @param sourceBuffer
	 *            buffer to append to current buffer
	 * @return The number of bytes appended.
	 */
	public final native float append(org.urish.gwtit.titanium.Buffer sourceBuffer)
	/*-{
		return this.append(sourceBuffer);
	}-*/;

	/**
	 * Same as normal append except this allows appending only `sourceLength`
	 * bytes from the `sourceBuffer` starting at `sourceOffset`.
	 * 
	 * @param sourceBuffer
	 *            buffer to append to current buffer
	 * @param sourceOffset
	 *            offset to start reading buffer data from
	 * @param sourceLength
	 *            length of data to read from buffer
	 * @return The number of bytes appended.
	 */
	public final native float append(org.urish.gwtit.titanium.Buffer sourceBuffer, float sourceOffset,
			float sourceLength)
	/*-{
		return this.append(sourceBuffer, sourceOffset, sourceLength);
	}-*/;

	/**
	 * Inserts `sourceBuffer` into the current buffer at `offset`. Buffer is
	 * grown to accommodate the new data.
	 * 
	 * @param sourceBuffer
	 *            buffer to insert into current buffer
	 * @param offset
	 *            offset to insert new buffer at
	 * @return The number of bytes inserted.
	 */
	public final native float insert(org.urish.gwtit.titanium.Buffer sourceBuffer, float offset)
	/*-{
		return this.insert(sourceBuffer, offset);
	}-*/;

	/**
	 * Inserts `sourceLength` amount of data starting at `sourceOffset` from
	 * `sourceBuffer` into current buffer at `offset`. Buffer is grown to
	 * accommodate the new data.
	 * 
	 * @param sourceBuffer
	 *            buffer to insert into current buffer
	 * @param offset
	 *            offset to insert new buffer at
	 * @param sourceOffset
	 *            offset of sourceBuffer to insert data from
	 * @param sourceLength
	 *            length of data from sourceBuffer to insert
	 * @return The number of bytes inserted.
	 */
	public final native float insert(org.urish.gwtit.titanium.Buffer sourceBuffer, float offset, float sourceOffset,
			float sourceLength)
	/*-{
		return this.insert(sourceBuffer, offset, sourceOffset, sourceLength);
	}-*/;

	/**
	 * Copies the contents of `sourceBuffer` into the current buffer at
	 * `offset`. will not expand buffer if there is not enough room in the
	 * current buffer to accomodate all the requested data from `sourceBuffer`.
	 * 
	 * @param sourceBuffer
	 *            buffer to copy into current buffer
	 * @param offset
	 *            offset to copy new buffer at
	 * @return The number of bytes copied.
	 */
	public final native float copy(org.urish.gwtit.titanium.Buffer sourceBuffer, float offset)
	/*-{
		return this.copy(sourceBuffer, offset);
	}-*/;

	/**
	 * Copies `sourceLength` contents from `sourceBuffer` starting at
	 * `sourceOffset` into the current buffer at `offset`. will not expand
	 * buffer if there is not enough room in the current buffer to accomodate
	 * all the request data from `sourceBuffer`.
	 * 
	 * @param sourceBuffer
	 *            buffer to copy into current buffer
	 * @param offset
	 *            offset to copy new buffer at
	 * @param sourceOffset
	 *            offset of sourceBuffer to copy data from
	 * @param sourceLength
	 *            length of data from sourceBuffer to copy
	 * @return The number of bytes copied.
	 */
	public final native float copy(org.urish.gwtit.titanium.Buffer sourceBuffer, float offset, float sourceOffset,
			float sourceLength)
	/*-{
		return this.copy(sourceBuffer, offset, sourceOffset, sourceLength);
	}-*/;

	/**
	 * Create new copy of the current buffer
	 */
	public final native org.urish.gwtit.titanium.Buffer clone()
	/*-{
		return this.clone();
	}-*/;

	/**
	 * Creates a new buffer from the original buffer contents starting at
	 * `offset` and ending at `offset` + `length`
	 * 
	 * @param offset
	 *            offset of buffer to start clone
	 * @param length
	 *            length of buffer data starting at offset to clone
	 */
	public final native org.urish.gwtit.titanium.Buffer clone(float offset, float length)
	/*-{
		return this.clone(offset, length);
	}-*/;

	/**
	 * Fills buffer with `fillByte`
	 * 
	 * @param fillByte
	 *            byte to fill buffer with
	 */
	public final native void fill(float fillByte)
	/*-{
		return this.fill(fillByte);
	}-*/;

	/**
	 * Fills buffer starting from `offset` until `length` number of `fillByte`
	 * has been written or the end of the buffer is reached
	 * 
	 * @param fillByte
	 *            byte to fill buffer with
	 * @param offset
	 *            offset of where to start fill
	 * @param length
	 *            number of bytes to fill
	 */
	public final native void fill(float fillByte, float offset, float length)
	/*-{
		return this.fill(fillByte, offset, length);
	}-*/;

	/**
	 * Clears buffer contents but does not change the size of the buffer
	 */
	public final native void clear()
	/*-{
		return this.clear();
	}-*/;

	/**
	 * Releases the space allocated to the buffer, sets length to 0. This is
	 * effectively the same as `buffer.length = 0`
	 */
	public final native void release()
	/*-{
		return this.release();
	}-*/;

	/**
	 * Converts this buffer to a String
	 */
	public final native String toString_()
	/*-{
		return this.toString();
	}-*/;

	/**
	 * Converts this buffer to a {@link org.urish.gwtit.titanium.Blob}
	 */
	public final native org.urish.gwtit.titanium.Blob toBlob()
	/*-{
		return this.toBlob();
	}-*/;

}
