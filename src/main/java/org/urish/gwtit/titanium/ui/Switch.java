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

import org.urish.gwtit.titanium.ui.events.SwitchChangeHandler;

/**
 * A switch is created by the method
 * {@link org.urish.gwtit.titanium.ui.createswitch}.
 * <p>
 * Notes:
 * 
 * @since 0.8
 */
public class Switch extends org.urish.gwtit.titanium.ui.View {
	protected Switch() {
	}

	/**
	 * @return Boolean for the state of the switch
	 */
	public final native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public final native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return One of ti.ui.android.switch_style_checkbox or
	 *         ti.ui.android.switch_style_togglebutton (default). (android only)
	 * @platforms android
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
	 * @return Text to display with checkbox. used if style is
	 *         ti.ui.android.switch_style_checkbox (android only)
	 * @platforms android
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return Text to display when value is `false`. used if style is
	 *         ti.ui.android.switch_style_togglebutton (android only)
	 * @platforms android
	 */
	public final native String getTitleOff()
	/*-{
		return this.titleOff;
	}-*/;

	public final native void setTitleOff(String value)
	/*-{
		this.titleOff = value;
	}-*/;

	/**
	 * @return Text to display when value is `true`. used if style is
	 *         ti.ui.android.switch_style_togglebutton (android only)
	 * @platforms android
	 */
	public final native String getTitleOn()
	/*-{
		return this.titleOn;
	}-*/;

	public final native void setTitleOn(String value)
	/*-{
		this.titleOn = value;
	}-*/;

	/**
	 * @return Boolean value of the switch where true is the switch is `on` and
	 *         false the switch if `off`
	 */
	public final native boolean getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(boolean value)
	/*-{
		this.value = value;
	}-*/;

	public final native void addChangeHandler(SwitchChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SwitchChangeHandler::onSwitchChange(Lorg/urish/gwtit/titanium/ui/events/SwitchChangeEvent;)(e); } );
	}-*/;

}
