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
 * The callback to be fired when writeStream operation finishes
 * 
 * @since 1.7
 */
public class WriteStreamCallbackArgs extends JavaScriptObject {
	protected WriteStreamCallbackArgs() {
	}

	/**
	 * @return Stream being read from
	 */
	public final native org.urish.gwtit.titanium.IOStream getFromStream()
	/*-{
		return this.fromStream;
	}-*/;

	public final native void setFromStream(org.urish.gwtit.titanium.IOStream value)
	/*-{
		this.fromStream = value;
	}-*/;

	/**
	 * @return Stream being written to
	 */
	public final native org.urish.gwtit.titanium.IOStream getToStream()
	/*-{
		return this.toStream;
	}-*/;

	public final native void setToStream(org.urish.gwtit.titanium.IOStream value)
	/*-{
		this.toStream = value;
	}-*/;

	/**
	 * @return Number of bytes processed
	 */
	public final native float getBytesProcessed()
	/*-{
		return this.bytesProcessed;
	}-*/;

	public final native void setBytesProcessed(float value)
	/*-{
		this.bytesProcessed = value;
	}-*/;

	/**
	 * @return State representing error
	 */
	public final native String getErrorState()
	/*-{
		return this.errorState;
	}-*/;

	public final native void setErrorState(String value)
	/*-{
		this.errorState = value;
	}-*/;

	/**
	 * @return Description of the error
	 */
	public final native String getErrorDescription()
	/*-{
		return this.errorDescription;
	}-*/;

	public final native void setErrorDescription(String value)
	/*-{
		this.errorDescription = value;
	}-*/;

}
