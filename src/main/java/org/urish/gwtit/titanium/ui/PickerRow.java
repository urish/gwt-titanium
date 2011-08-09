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
 * The picker row object created by
 * [titanium.ui.createpickerrow](titanium.ui.createpickerrow).
 * 
 * @since 0.9
 */
public class PickerRow extends org.urish.gwtit.titanium.ui.View {
	protected PickerRow() {
	}

	/**
	 * @return The font size when displaying the text. ignored when using a
	 *         custom view
	 */
	public final native int getFontSize()
	/*-{
		return this.fontSize;
	}-*/;

	public final native void setFontSize(int value)
	/*-{
		this.fontSize = value;
	}-*/;

	/**
	 * @return When used in the constructor, set the row to selected on initial
	 *         display
	 */
	public final native boolean getSelected()
	/*-{
		return this.selected;
	}-*/;

	public final native void setSelected(boolean value)
	/*-{
		this.selected = value;
	}-*/;

	/**
	 * @return The display text
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

}
