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
package org.urish.gwtit.client;

import com.google.gwt.core.client.JavaScriptObject;

public interface TitaniumEventable<T extends JavaScriptObject> {
	/**
	 * Add an event listener for the instance to receive view triggered events
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 */
	void addEventListener(String name, EventCallback<T> callback);

	/***
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event
	 * @param event
	 *            event object
	 */
	void fireEvent(String name, T event);

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 * @param callback
	 *            callback function passed in addEventListener
	 */
	void removeEventListener(String name, EventCallback<T> callback);
}
