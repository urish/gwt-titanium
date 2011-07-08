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
 * The bonjourbrowser instance returned from
 * {@link org.urish.gwtit.titanium.network.createbonjourbrowser}. this object is
 * a browser for the discovery and retrieval of bonjour services available on
 * the network.
 * <p>
 * Notes: If your application publishes Bonjour services itself, that service
 * will be discovered by the browser if necessary; be prepared to perform a
 * check if you do not want to list local services as available. Bonjour service
 * browsing is an asynchronous operation, meaning that you should be extremely
 * careful when caching values from the 'services' property returned by the
 * updatedServices event. In particular, if you maintain a local copy of
 * available services and a user tries to connect to one, you should be prepared
 * to handle failures gracefully; the next updatedServices event should provide
 * the new services list, but you should not rely on it being delivered before
 * user input. When a window which uses Bonjour browsing is closed, if you do
 * not want to continue searching, you must call the stop() method.
 * 
 * @platforms iphone, ipad
 * @since 1.2.0
 */
public class BonjourBrowser extends org.urish.gwtit.titanium.Proxy {
	protected BonjourBrowser() {
	}

	/**
	 * @return The domain the browser is searching in
	 */
	public final native String getDomain()
	/*-{
		return this.domain;
	}-*/;

	public final native void setDomain(String value)
	/*-{
		this.domain = value;
	}-*/;

	/**
	 * @return Whether or not the browser is currently searching
	 */
	public final native boolean getIsSearching()
	/*-{
		return this.isSearching;
	}-*/;

	public final native void setIsSearching(boolean value)
	/*-{
		this.isSearching = value;
	}-*/;

	/**
	 * @return The type of the service the browser searches for
	 */
	public final native String getServiceType()
	/*-{
		return this.serviceType;
	}-*/;

	public final native void setServiceType(String value)
	/*-{
		this.serviceType = value;
	}-*/;

	/**
	 * Conduct a search for bonjour services matching the type and domain
	 * specified during creation
	 */
	public final native void search()
	/*-{
		return this.search();
	}-*/;

	/**
	 * Halt an ongoing search
	 */
	public final native void stopSearch()
	/*-{
		return this.stopSearch();
	}-*/;

	public final native void addUpdatedServicesHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('updatedServices', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
