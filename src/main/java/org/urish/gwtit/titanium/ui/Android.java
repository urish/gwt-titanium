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

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

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

	private static native final int value_LINKIFY_ALL()
	/*-{
		return Titanium.UI.Android.LINKIFY_ALL;
	}-*/;

	public static final int LINKIFY_ALL = value_LINKIFY_ALL();

	private static native final int value_LINKIFY_EMAIL_ADDRESSES()
	/*-{
		return Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES;
	}-*/;

	public static final int LINKIFY_EMAIL_ADDRESSES = value_LINKIFY_EMAIL_ADDRESSES();

	private static native final int value_LINKIFY_MAP_ADDRESSES()
	/*-{
		return Titanium.UI.Android.LINKIFY_MAP_ADDRESSES;
	}-*/;

	public static final int LINKIFY_MAP_ADDRESSES = value_LINKIFY_MAP_ADDRESSES();

	private static native final int value_LINKIFY_MAP_LINKS()
	/*-{
		return Titanium.UI.Android.LINKIFY_MAP_LINKS;
	}-*/;

	public static final int LINKIFY_MAP_LINKS = value_LINKIFY_MAP_LINKS();

	private static native final int value_LINKIFY_PHONE_NUMBERS()
	/*-{
		return Titanium.UI.Android.LINKIFY_PHONE_NUMBERS;
	}-*/;

	public static final int LINKIFY_PHONE_NUMBERS = value_LINKIFY_PHONE_NUMBERS();

	private static native final int value_LINKIFY_WEB_URLS()
	/*-{
		return Titanium.UI.Android.LINKIFY_WEB_URLS;
	}-*/;

	public static final int LINKIFY_WEB_URLS = value_LINKIFY_WEB_URLS();

	private static native final float value_PIXEL_FORMAT_A_8()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_A_8;
	}-*/;

	public static final float PIXEL_FORMAT_A_8 = value_PIXEL_FORMAT_A_8();

	private static native final float value_PIXEL_FORMAT_LA_88()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_LA_88;
	}-*/;

	public static final float PIXEL_FORMAT_LA_88 = value_PIXEL_FORMAT_LA_88();

	private static native final float value_PIXEL_FORMAT_L_8()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_L_8;
	}-*/;

	public static final float PIXEL_FORMAT_L_8 = value_PIXEL_FORMAT_L_8();

	private static native final float value_PIXEL_FORMAT_OPAQUE()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_OPAQUE;
	}-*/;

	public static final float PIXEL_FORMAT_OPAQUE = value_PIXEL_FORMAT_OPAQUE();

	private static native final float value_PIXEL_FORMAT_RGBA_4444()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_4444;
	}-*/;

	public static final float PIXEL_FORMAT_RGBA_4444 = value_PIXEL_FORMAT_RGBA_4444();

	private static native final float value_PIXEL_FORMAT_RGBA_5551()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_5551;
	}-*/;

	public static final float PIXEL_FORMAT_RGBA_5551 = value_PIXEL_FORMAT_RGBA_5551();

	private static native final float value_PIXEL_FORMAT_RGBA_8888()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_8888;
	}-*/;

	public static final float PIXEL_FORMAT_RGBA_8888 = value_PIXEL_FORMAT_RGBA_8888();

	private static native final float value_PIXEL_FORMAT_RGBX_8888()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBX_8888;
	}-*/;

	public static final float PIXEL_FORMAT_RGBX_8888 = value_PIXEL_FORMAT_RGBX_8888();

	private static native final float value_PIXEL_FORMAT_RGB_332()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_332;
	}-*/;

	public static final float PIXEL_FORMAT_RGB_332 = value_PIXEL_FORMAT_RGB_332();

	private static native final float value_PIXEL_FORMAT_RGB_565()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_565;
	}-*/;

	public static final float PIXEL_FORMAT_RGB_565 = value_PIXEL_FORMAT_RGB_565();

	private static native final float value_PIXEL_FORMAT_RGB_888()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_888;
	}-*/;

	public static final float PIXEL_FORMAT_RGB_888 = value_PIXEL_FORMAT_RGB_888();

	private static native final float value_PIXEL_FORMAT_TRANSLUCENT()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_TRANSLUCENT;
	}-*/;

	public static final float PIXEL_FORMAT_TRANSLUCENT = value_PIXEL_FORMAT_TRANSLUCENT();

	private static native final float value_PIXEL_FORMAT_TRANSPARENT()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_TRANSPARENT;
	}-*/;

	public static final float PIXEL_FORMAT_TRANSPARENT = value_PIXEL_FORMAT_TRANSPARENT();

	private static native final float value_PIXEL_FORMAT_UNKNOWN()
	/*-{
		return Titanium.UI.Android.PIXEL_FORMAT_UNKNOWN;
	}-*/;

	public static final float PIXEL_FORMAT_UNKNOWN = value_PIXEL_FORMAT_UNKNOWN();

	private static native final int value_SOFT_INPUT_ADJUST_PAN()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN;
	}-*/;

	public static final int SOFT_INPUT_ADJUST_PAN = value_SOFT_INPUT_ADJUST_PAN();

	private static native final int value_SOFT_INPUT_ADJUST_RESIZE()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE;
	}-*/;

	public static final int SOFT_INPUT_ADJUST_RESIZE = value_SOFT_INPUT_ADJUST_RESIZE();

	private static native final int value_SOFT_INPUT_ADJUST_UNSPECIFIED()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED;
	}-*/;

	public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = value_SOFT_INPUT_ADJUST_UNSPECIFIED();

	private static native final int value_SOFT_INPUT_STATE_HIDDEN()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN;
	}-*/;

	public static final int SOFT_INPUT_STATE_HIDDEN = value_SOFT_INPUT_STATE_HIDDEN();

	private static native final int value_SOFT_INPUT_STATE_UNSPECIFIED()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED;
	}-*/;

	public static final int SOFT_INPUT_STATE_UNSPECIFIED = value_SOFT_INPUT_STATE_UNSPECIFIED();

	private static native final int value_SOFT_INPUT_STATE_VISIBLE()
	/*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE;
	}-*/;

	public static final int SOFT_INPUT_STATE_VISIBLE = value_SOFT_INPUT_STATE_VISIBLE();

	private static native final int value_SOFT_KEYBOARD_DEFAULT_ON_FOCUS()
	/*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS;
	}-*/;

	public static final int SOFT_KEYBOARD_DEFAULT_ON_FOCUS = value_SOFT_KEYBOARD_DEFAULT_ON_FOCUS();

	private static native final int value_SOFT_KEYBOARD_HIDE_ON_FOCUS()
	/*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS;
	}-*/;

	public static final int SOFT_KEYBOARD_HIDE_ON_FOCUS = value_SOFT_KEYBOARD_HIDE_ON_FOCUS();

	private static native final int value_SOFT_KEYBOARD_SHOW_ON_FOCUS()
	/*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS;
	}-*/;

	public static final int SOFT_KEYBOARD_SHOW_ON_FOCUS = value_SOFT_KEYBOARD_SHOW_ON_FOCUS();

	private static native final int value_SWITCH_STYLE_CHECKBOX()
	/*-{
		return Titanium.UI.Android.SWITCH_STYLE_CHECKBOX;
	}-*/;

	public static final int SWITCH_STYLE_CHECKBOX = value_SWITCH_STYLE_CHECKBOX();

	private static native final int value_SWITCH_STYLE_TOGGLEBUTTON()
	/*-{
		return Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON;
	}-*/;

	public static final int SWITCH_STYLE_TOGGLEBUTTON = value_SWITCH_STYLE_TOGGLEBUTTON();

	private static native final float value_WEBVIEW_PLUGINS_OFF()
	/*-{
		return Titanium.UI.Android.WEBVIEW_PLUGINS_OFF;
	}-*/;

	public static final float WEBVIEW_PLUGINS_OFF = value_WEBVIEW_PLUGINS_OFF();

	private static native final float value_WEBVIEW_PLUGINS_ON()
	/*-{
		return Titanium.UI.Android.WEBVIEW_PLUGINS_ON;
	}-*/;

	public static final float WEBVIEW_PLUGINS_ON = value_WEBVIEW_PLUGINS_ON();

	private static native final float value_PLUGIN_STATE_ON_DEMAND()
	/*-{
		return Titanium.UI.Android.PLUGIN_STATE_ON_DEMAND;
	}-*/;

	public static final float PLUGIN_STATE_ON_DEMAND = value_PLUGIN_STATE_ON_DEMAND();

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

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.UI.Android.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.UI.Android.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.UI.Android.fireEvent(name, event);
	}-*/;

}
