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
 * A progress bar is created by the method
 * {@link org.urish.gwtit.titanium.ui.createprogressbar}.
 * <p>
 * Notes: For iPhone, progress bar styles are constants defined in
 * [Titanium.UI.iPhone.ProgressBarStyle](Titanium.UI.iPhone.ProgressBarStyle).
 * 
 * @since 0.8
 */
public class ProgressBar extends org.urish.gwtit.titanium.Proxy {
	protected ProgressBar() {
	}

	/**
	 * @return The color of the progress bar text
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
	 * @return The font object for the progress bar text
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
	 * @return The maximum value of the progress bar
	 */
	public native float getMax()
	/*-{
		return this.max;
	}-*/;

	public native void setMax(float value)
	/*-{
		this.max = value;
	}-*/;

	/**
	 * @return The progress bar message
	 */
	public native String getMessage()
	/*-{
		return this.message;
	}-*/;

	public native void setMessage(String value)
	/*-{
		this.message = value;
	}-*/;

	/**
	 * @return The minimum value of the progress bar
	 */
	public native float getMin()
	/*-{
		return this.min;
	}-*/;

	public native void setMin(float value)
	/*-{
		this.min = value;
	}-*/;

	/**
	 * @return The style of the progress bar
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
	 * @return The current value of the progress bar
	 */
	public native float getValue()
	/*-{
		return this.value;
	}-*/;

	public native void setValue(float value)
	/*-{
		this.value = value;
	}-*/;

}
