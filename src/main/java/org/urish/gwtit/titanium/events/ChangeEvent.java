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

package org.urish.gwtit.titanium.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class ChangeEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "change";

	protected ChangeEvent() {
	}

	/**
	 * the new network type as a string
	 */
	public final native String getNetworkTypeName()
	/*-{
		return this.networkTypeName;
	}-*/;

	/**
	 * boolean to indicate if the network is online
	 */
	public final native boolean getOnline()
	/*-{
		return this.online;
	}-*/;

	/**
	 * the new network type
	 */
	public final native int getNetworkType()
	/*-{
		return this.networkType;
	}-*/;

}
