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
 * An activity indicator is created by the method
 * {@link org.urish.gwtit.titanium.ui.createactivityindicator}. an activity
 * indicator can be used to show the progress of an operation in the ui to let
 * the user know some action is taking place.
 * <p>
 * Notes: For iPhone, the style can be set from the constants
 * <Titanium.UI.iPhone.ActivityIndicatorStyle>.
 * 
 * @since 0.8
 */
public class ActivityIndicator extends org.urish.gwtit.titanium.Proxy {
	protected ActivityIndicator() {
	}

	/**
	 * @return The color of the message label
	 */
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	public final native void setColor(String value)
	/*-{
		this.color = value;
	}-*/;

	/**
	 * @return The font object for the activity message label
	 */
	public final native org.urish.gwtit.client.font.Font getFont()
	/*-{
		return this.font;
	}-*/;

	public final native void setFont(org.urish.gwtit.client.font.Font value)
	/*-{
		this.font = value;
	}-*/;

	/**
	 * @return The activity message label text
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;

	public final native void setMessage(String value)
	/*-{
		this.message = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the message property
	 */
	public final native String getMessageid()
	/*-{
		return this.messageid;
	}-*/;

	public final native void setMessageid(String value)
	/*-{
		this.messageid = value;
	}-*/;

	/**
	 * @return The style constant of the activity indicator
	 */
	public final native int getStyle()
	/*-{
		return this.style;
	}-*/;

	public final native void setStyle(int value)
	/*-{
		this.style = value;
	}-*/;

	/**
	 * Call hide to make the activity indicator hidden and stop spinning
	 */
	public final native void hide()
	/*-{
		return this.hide();
	}-*/;

	/**
	 * Call show to make the activity indicator visible and start spinning
	 */
	public final native void show()
	/*-{
		return this.show();
	}-*/;

}
