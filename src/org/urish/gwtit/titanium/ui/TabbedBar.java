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

package org.urish.gwtit.titanium.ui;


/**
 * A tabbed bar is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtabbedbar}. the difference between
 * the tabbed bar and the button bar is that the tabbed bar visually maintains a
 * state (visually distinguished as a pressed or selected look).
 * <p>
 * Notes: For iPhone, the style constants are available in the constants defined
 * in
 * [Titanium.UI.iPhone.SystemButtonStyle](Titanium.UI.iPhone.SystemButtonStyle).
 * 
 * @platforms iphone, ipad
 * @since 0.8
 */
public class TabbedBar extends org.urish.gwtit.titanium.ui.View {
	protected TabbedBar() {
	}

	/**
	 * @return The selected index
	 */
	public final native float getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex(float value)
	/*-{
		this.index = value;
	}-*/;

	/**
	 * @return The array of labels for the tabbed bar. each object should have
	 *         the properties `title`, `image`, `width` and `enabled`.
	 */
	public final native Object[] getLabels()
	/*-{
		return this.labels;
	}-*/;

	public final native void setLabels(Object[] value)
	/*-{
		this.labels = value;
	}-*/;

	/**
	 * @return The style of the tabbed bar
	 */
	public final native float getStyle()
	/*-{
		return this.style;
	}-*/;

	public final native void setStyle(float value)
	/*-{
		this.style = value;
	}-*/;

}
