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
 * A full query descriptor for a filtering predicate.
 * 
 * @platforms iphone, ipad
 * @since 1.8
 */
public class MediaQueryInfoType extends JavaScriptObject {
	protected MediaQueryInfoType() {
	}

	public final native void setValue(float value)
	/*-{
		this.value = value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public final native void setValue(boolean value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * @return The value for the given predicate. See the descriptions in for
	 *         information about which properties require which values.
	 */
	public final native JavaScriptObject getValue()
	/*-{
		return this.value;
	}-*/;

	/**
	 * @return Whether or not the predicate is for an exact match. The default
	 *         is `true`.
	 */
	public final native boolean getExact()
	/*-{
		return this.exact;
	}-*/;

	public final native void setExact(boolean value)
	/*-{
		this.exact = value;
	}-*/;

}
