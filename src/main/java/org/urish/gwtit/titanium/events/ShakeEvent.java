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
public class ShakeEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "shake";

	protected ShakeEvent() {
	}

	/**
	 * timestamp reference since previous shake
	 */
	public final native float getTimestamp()
	/*-{
		return this.timestamp;
	}-*/;

	/**
	 * x coordinate of the shake event
	 */
	public final native float getX()
	/*-{
		return this.x;
	}-*/;

	/**
	 * y coordinate of the shake event
	 */
	public final native float getY()
	/*-{
		return this.y;
	}-*/;

	/**
	 * z coordinate of the shake event
	 */
	public final native float getZ()
	/*-{
		return this.z;
	}-*/;

}
