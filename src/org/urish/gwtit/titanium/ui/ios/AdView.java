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

package org.urish.gwtit.titanium.ui.ios;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The adview is a view for display apple iads. the view is created by the
 * method {@link org.urish.gwtit.titanium.ui.ios.createadview}.
 * 
 * @platforms iphone, ipad
 * @since 1.4
 */
public class AdView extends org.urish.gwtit.titanium.ui.View {
	protected AdView() {
	}

	/**
	 * @return Constant for 320x50 ad sizes
	 */
	public native String getSIZE_320x50()
	/*-{
		return this.SIZE_320x50;
	}-*/;

	public native void setSIZE_320x50(String value)
	/*-{
		this.SIZE_320x50 = value;
	}-*/;

	/**
	 * @return Constant for 480x32 ad sizes
	 */
	public native String getSIZE_480x32()
	/*-{
		return this.SIZE_480x32;
	}-*/;

	public native void setSIZE_480x32(String value)
	/*-{
		this.SIZE_480x32 = value;
	}-*/;

	/**
	 * A banner view action can cover your application's user interface.
	 * however, your application continues to run, and receives events normally.
	 * if your application receives an event that requires the user's attention,
	 * it can programmatically cancel the action and uncover its interface by
	 * calling cancelaction. canceling actions frequently can cause a loss of
	 * revenue for your application.
	 */
	public native void cancelAction()
	/*-{
		return this.cancelAction();
	}-*/;

	public native void addActionHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('action', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addLoadHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}