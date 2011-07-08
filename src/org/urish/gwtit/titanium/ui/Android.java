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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * The android specific ui capabilities. all properties, methods and events in
 * this namespace will only work on android related devices.
 * 
 * @platforms android
 * @since 1.0
 */
public class Android extends org.urish.gwtit.titanium.Module {
	protected Android() {
	}

	public static final Const LINKIFY_ALL = new ConstImpl("Titanium.UI.Android.LINKIFY_ALL");

	public static final Const LINKIFY_EMAIL_ADDRESSES = new ConstImpl("Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES");

	public static final Const LINKIFY_MAP_ADDRESSES = new ConstImpl("Titanium.UI.Android.LINKIFY_MAP_ADDRESSES");

	public static final Const LINKIFY_MAP_LINKS = new ConstImpl("Titanium.UI.Android.LINKIFY_MAP_LINKS");

	public static final Const LINKIFY_PHONE_NUMBERS = new ConstImpl("Titanium.UI.Android.LINKIFY_PHONE_NUMBERS");

	public static final Const LINKIFY_WEB_URLS = new ConstImpl("Titanium.UI.Android.LINKIFY_WEB_URLS");

	public static final Const SOFT_INPUT_ADJUST_PAN = new ConstImpl("Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN");

	public static final Const SOFT_INPUT_ADJUST_RESIZE = new ConstImpl("Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE");

	public static final Const SOFT_INPUT_ADJUST_UNSPECIFIED = new ConstImpl(
			"Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED");

	public static final Const SOFT_INPUT_STATE_HIDDEN = new ConstImpl("Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN");

	public static final Const SOFT_INPUT_STATE_UNSPECIFIED = new ConstImpl(
			"Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED");

	public static final Const SOFT_INPUT_STATE_VISIBLE = new ConstImpl("Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE");

	public static final Const SOFT_KEYBOARD_DEFAULT_ON_FOCUS = new ConstImpl(
			"Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS");

	public static final Const SOFT_KEYBOARD_HIDE_ON_FOCUS = new ConstImpl(
			"Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS");

	public static final Const SOFT_KEYBOARD_SHOW_ON_FOCUS = new ConstImpl(
			"Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS");

	public static final Const SWITCH_STYLE_CHECKBOX = new ConstImpl("Titanium.UI.Android.SWITCH_STYLE_CHECKBOX");

	public static final Const SWITCH_STYLE_TOGGLEBUTTON = new ConstImpl("Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON");

	/**
	 * Request that the soft keyboard hide. note: it is not currently possible
	 * in the native android api to detect that the keyboard is already visible.
	 * note: it is not possible to globally show the keyboard at this point.
	 */
	public static native void hideSoftKeyboard()
	/*-{
		return Titanium.UI.Android.hideSoftKeyboard();
	}-*/;

	/**
	 * Open android native preferences ui activity. you need to place your
	 * preferences.xml file in the platform/android/res/xml/ folder of your
	 * project. documentation on the file format may be found in the [android
	 * documentation
	 * ](http://developer.android.com/resources/samples/apidemos/res
	 * /xml/preferences.html)
	 */
	public static native void openPreferences()
	/*-{
		return Titanium.UI.Android.openPreferences();
	}-*/;

}
