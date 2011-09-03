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
 * A pair of coordinates used to describe the location of a
 * {@link org.urish.gwtit.titanium.ui.View}
 * 
 * @since 1.8.0
 */
public class Point extends JavaScriptObject {
	protected Point() {
	}

	/**
	 * @return The x-axis coordinate of this point
	 */
	public final native float getX()
	/*-{
		return this.x;
	}-*/;

	public final native void setX(float value)
	/*-{
		this.x = value;
	}-*/;

	/**
	 * @return The y-axis coordinate of this point
	 */
	public final native float getY()
	/*-{
		return this.y;
	}-*/;

	public final native void setY(float value)
	/*-{
		this.y = value;
	}-*/;

}
