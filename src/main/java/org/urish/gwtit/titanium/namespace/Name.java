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

package org.urish.gwtit.titanium.namespace;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A proxy
 * <p>
 * Notes: An example note
 * 
 * @since 1.7.0
 */
public class Name extends org.urish.gwtit.titanium.Proxy {
	protected Name() {
	}

	/**
	 * @return A property
	 */
	public final native String getExampleProperty()
	/*-{
		return this.exampleProperty;
	}-*/;

	public final native void setExampleProperty(String value)
	/*-{
		this.exampleProperty = value;
	}-*/;

	/**
	 * A method
	 */
	public final native void exampleMethod()
	/*-{
		return this.exampleMethod();
	}-*/;

	public final native void addExampleEventHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('exampleEvent', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
