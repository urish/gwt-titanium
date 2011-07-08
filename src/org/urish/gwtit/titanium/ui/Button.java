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
 * A button is created by the method
 * {@link org.urish.gwtit.titanium.ui.createbutton}.
 * 
 * @since 0.8
 */
public class Button extends org.urish.gwtit.titanium.ui.View {
	protected Button() {
	}

	/**
	 * @return The foreground color of the button text
	 */
	public native String getColor()
	/*-{
		return this.color;
	}-*/;

	public native void setColor(String value)
	/*-{
		this.color = value;
	}-*/;

	/**
	 * @return Boolean that indicates if the button is enabled or not
	 */
	public native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return The font properties of the button
	 */
	public native Object getFont()
	/*-{
		return this.font;
	}-*/;

	public native void setFont(Object value)
	/*-{
		this.font = value;
	}-*/;

	/**
	 * @return The image to display on the button to the left of the title
	 */
	public native String getImage()
	/*-{
		return this.image;
	}-*/;

	public native void setImage(String value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return The selected color of the button text when the button is in the
	 *         selected state
	 */
	public native String getSelectedColor()
	/*-{
		return this.selectedColor;
	}-*/;

	public native void setSelectedColor(String value)
	/*-{
		this.selectedColor = value;
	}-*/;

	/**
	 * @return Style constant for the type of button
	 */
	public native float getStyle()
	/*-{
		return this.style;
	}-*/;

	public native void setStyle(float value)
	/*-{
		this.style = value;
	}-*/;

	/**
	 * @return Button title
	 */
	public native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 * @since 1.5
	 */
	public native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

}
