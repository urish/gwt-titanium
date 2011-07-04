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

public class AbstractTitaniumEventable extends JavaScriptObject implements TitaniumEventable<Object> {
	public native void addEventListener(String name, EventCallback<Object> callback) /*-{
		return this.addEventListener(name, callback.@org.urish.gwtit.client.EventCallback::onEvent(Ljava/lang/Object;));
	}-*/;

	public native void fireEvent(String name, Object event) /*-{
		return this.fireEvent(name, event);
	}-*/;

	public native void removeEventListener(String name, EventCallback<Object> callback) /*-{
		return this.removeEventListener(name, callback.@org.urish.gwtit.client.EventCallback::onEvent(Ljava/lang/Object;));
	}-*/;

}
