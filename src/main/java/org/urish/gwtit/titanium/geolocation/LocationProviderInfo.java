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

package org.urish.gwtit.titanium.geolocation;

import com.google.gwt.core.client.JavaScriptObject;
import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.event.AbstractTitaniumEvent;
import org.urish.gwtit.client.event.TouchEvent;

/**
 * A callback for when dialog is completed/cancelled
 */
public class LocationProviderInfo extends JavaScriptObject {
	protected LocationProviderInfo() {
	}

	/**
	 * 
	 */
	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	/**
	 * 
	 */
	public final native float getAccuracy()
	/*-{
		return this.accuracy;
	}-*/;

	/**
	 * 
	 */
	public final native Object getPower()
	/*-{
		return this.power;
	}-*/;

	/**
	 * 
	 */
	public final native Object getProvider()
	/*-{
		return this.provider;
	}-*/;

}
