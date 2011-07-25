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

package org.urish.gwtit.titanium.xml;


/**
 * Represents a notation declared in the dtd. see [dom level 2
 * spec](http://www.w3
 * .org/tr/2000/rec-dom-level-2-core-20001113/core.html#id-5431d1b9)
 * 
 * @since 0.9
 */
public class Notation extends org.urish.gwtit.titanium.Proxy {
	protected Notation() {
	}

	/**
	 * @return The public identifier of this notation. if the public identifier
	 *         was not specified, this is `null`.
	 */
	public final native String getPublicId()
	/*-{
		return this.publicId;
	}-*/;

	public final native void setPublicId(String value)
	/*-{
		this.publicId = value;
	}-*/;

	/**
	 * @return The system identifier of this notation. if the system identifier
	 *         was not specified, this is `null`.
	 */
	public final native String getSystemId()
	/*-{
		return this.systemId;
	}-*/;

	public final native void setSystemId(String value)
	/*-{
		this.systemId = value;
	}-*/;

}
