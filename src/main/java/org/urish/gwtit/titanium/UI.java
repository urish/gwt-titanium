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


/**
 * The main {@link org.urish.gwtit..titanium.ui} module. the ui module is
 * responsible for native user-interface components and interaction inside
 * titanium. the goal of the ui module is to provide a native experience along
 * with native performance by compiling javascript code into their native
 * counterparts as part of the build process.
 * <p>
 * Notes: ### Design
 * 
 * The UI module is broken down into 3 major area:
 * 
 ***Views** - [Views](Titanium.UI.View-object.html) are containers that host
 * visual elements such as controls or other views. Views can have their
 * properties customized, such as their border color and radius, can fire events
 * such as swipe events or touches, and can optionally contain a hierarchy or
 * other views as children. In Titanium, most views are specialized to perform
 * both a visual function and set of interaction behaviors such as [Table
 * View](Titanium.UI.TableView-object.html) or [Coverflow
 * View](Titanium.UI.CoverFlowView-object.html). Views are always named with the
 * suffix `View`. **Controls** - controls, or sometimes referred as widgets, are
 * visual elements such as [sliders](Titanium.UI.Slider-object.html),
 * [buttons](Titanium.UI.Button-object.html) and
 * [switches](Titanium.UI.Switch-object.html). They provide a visual element
 * which has a defined behavior and typical have special configuration and
 * special events. Controls themselves are views and also inherit a views
 * properties, functions and events. **Windows** -
 * [Windows](Titanium.UI.Window-object.html) are typically top-level visual
 * constructs that are the main part of your interface. An application will
 * always have at least one window and windows can take different shapes and
 * sizes, can have display and interaction properties such as fullscreen or
 * modal and can be customized, such as changing their opacity or background
 * color. Windows themselves are views and also inherit a views properties,
 * functions and events. There are a few specialization of Windows such as a
 * [Tab Group](Titanium.UI.TabGroup-object.html) which offer additional behavior
 * beyond the basic Window.
 * 
 * 
 * Titanium uses the [Factory
 * Pattern](http://en.wikipedia.org/wiki/Factory_method_pattern) for
 * constructing objects and a general naming pattern for APIs. For example, to
 * construct a [Alert Dialog](Titanium.UI.AlertDialog-object.html), you call the
 * method <Titanium.UI.createAlertDialog>. To create a
 * [TextArea](Titanium.UI.TextArea-object.html), you call the method
 * <Titanium.UI.createTextArea>. Once an object is created, it will be available
 * until it goes out of scope.
 * 
 * ### Optimizations
 * 
 * UI objects are optimized by Titanium to not be realized into the drawing
 * context and placed into the device UI surface until needed. That means that
 * you can create UI objects, set their properties and add them to their
 * hierarchy without much worry about memory or performance. When the native
 * drawing surface needs to render a specific view or control, Titanium will
 * automatically create the view as needed. Additionally, Titanium is optimized
 * to also release memory once the view is no longer needed, on screen or in low
 * memory situations. However, it's a good idea to help Titanium along in
 * certain cases where you are no longer using objects. For example, you should
 * call `close` on a [Window](Titanium.UI.Window-object.html) instance when you
 * are no longer using it. You can safely call `open` on the
 * [Window](Titanium.UI.Window-object.html) again to re-open it.
 * 
 * ### Global Context and Threading
 * 
 * Be careful with the objects that are created in `app.js` but only used once.
 * Since the `app.js` context is global and generally is not garbage collected
 * until the application exits, you should think about the design of your
 * application as it relates to this fact.
 * [Window](Titanium.UI.Window-object.html) objects that are opened up with the
 * `url` property to another Javascript file contain a nice way to decompose
 * your application into smaller units. The other benefit is that when a
 * [Window](Titanium.UI.Window-object.html) is closed, its resources can be
 * immediately cleaned up, saving resources such as memory and CPU.
 * Additionally, [Window](Titanium.UI.Window-object.html) objects run in a
 * separate Javascript context and Thread. While all UI processing is done on
 * the main UI thread, other processing inside a Window or the `app.js` that
 * does not have UI interaction will run in its own thread.
 * 
 * 
 * ### Portability
 * 
 * Titanium components are designed to be portable across as many platforms as
 * it supports. However, there are cases where a device either does not support
 * a specific feature or capability or where it support additional
 * functionality. For cases where the device OS supports capabilities that other
 * platforms do not, we attempt to place those capabilities in a separate
 * namespace, such as [Titanium.UI.iPhone](Titanium.UI.iPhone-module.html).
 * However, in cases where the control is in a common namespace and support
 * additional features, we continue to place that functionality directly on the
 * object.
 * 
 * @since 0.4
 */
public class UI extends org.urish.gwtit.titanium.Module {
	protected UI() {
	}

	private static native final int value_ANIMATION_CURVE_EASE_IN()
	/*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN;
	}-*/;

	public static final int ANIMATION_CURVE_EASE_IN = value_ANIMATION_CURVE_EASE_IN();

	private static native final int value_ANIMATION_CURVE_EASE_IN_OUT()
	/*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT;
	}-*/;

	public static final int ANIMATION_CURVE_EASE_IN_OUT = value_ANIMATION_CURVE_EASE_IN_OUT();

	private static native final int value_ANIMATION_CURVE_EASE_OUT()
	/*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_OUT;
	}-*/;

	public static final int ANIMATION_CURVE_EASE_OUT = value_ANIMATION_CURVE_EASE_OUT();

	private static native final int value_ANIMATION_CURVE_LINEAR()
	/*-{
		return Titanium.UI.ANIMATION_CURVE_LINEAR;
	}-*/;

	public static final int ANIMATION_CURVE_LINEAR = value_ANIMATION_CURVE_LINEAR();

	private static native final int value_AUTODETECT_ADDRESS()
	/*-{
		return Titanium.UI.AUTODETECT_ADDRESS;
	}-*/;

	public static final int AUTODETECT_ADDRESS = value_AUTODETECT_ADDRESS();

	private static native final int value_AUTODETECT_ALL()
	/*-{
		return Titanium.UI.AUTODETECT_ALL;
	}-*/;

	public static final int AUTODETECT_ALL = value_AUTODETECT_ALL();

	private static native final int value_AUTODETECT_CALENDAR()
	/*-{
		return Titanium.UI.AUTODETECT_CALENDAR;
	}-*/;

	public static final int AUTODETECT_CALENDAR = value_AUTODETECT_CALENDAR();

	private static native final int value_AUTODETECT_LINK()
	/*-{
		return Titanium.UI.AUTODETECT_LINK;
	}-*/;

	public static final int AUTODETECT_LINK = value_AUTODETECT_LINK();

	private static native final int value_AUTODETECT_NONE()
	/*-{
		return Titanium.UI.AUTODETECT_NONE;
	}-*/;

	public static final int AUTODETECT_NONE = value_AUTODETECT_NONE();

	private static native final int value_AUTODETECT_PHONE()
	/*-{
		return Titanium.UI.AUTODETECT_PHONE;
	}-*/;

	public static final int AUTODETECT_PHONE = value_AUTODETECT_PHONE();

	private static native final int value_BLEND_MODE_CLEAR()
	/*-{
		return Titanium.UI.BLEND_MODE_CLEAR;
	}-*/;

	public static final int BLEND_MODE_CLEAR = value_BLEND_MODE_CLEAR();

	private static native final int value_BLEND_MODE_COLOR()
	/*-{
		return Titanium.UI.BLEND_MODE_COLOR;
	}-*/;

	public static final int BLEND_MODE_COLOR = value_BLEND_MODE_COLOR();

	private static native final int value_BLEND_MODE_COLOR_BURN()
	/*-{
		return Titanium.UI.BLEND_MODE_COLOR_BURN;
	}-*/;

	public static final int BLEND_MODE_COLOR_BURN = value_BLEND_MODE_COLOR_BURN();

	private static native final int value_BLEND_MODE_COLOR_DODGE()
	/*-{
		return Titanium.UI.BLEND_MODE_COLOR_DODGE;
	}-*/;

	public static final int BLEND_MODE_COLOR_DODGE = value_BLEND_MODE_COLOR_DODGE();

	private static native final int value_BLEND_MODE_COPY()
	/*-{
		return Titanium.UI.BLEND_MODE_COPY;
	}-*/;

	public static final int BLEND_MODE_COPY = value_BLEND_MODE_COPY();

	private static native final int value_BLEND_MODE_DARKEN()
	/*-{
		return Titanium.UI.BLEND_MODE_DARKEN;
	}-*/;

	public static final int BLEND_MODE_DARKEN = value_BLEND_MODE_DARKEN();

	private static native final int value_BLEND_MODE_DESTINATION_ATOP()
	/*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_ATOP;
	}-*/;

	public static final int BLEND_MODE_DESTINATION_ATOP = value_BLEND_MODE_DESTINATION_ATOP();

	private static native final int value_BLEND_MODE_DESTINATION_IN()
	/*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_IN;
	}-*/;

	public static final int BLEND_MODE_DESTINATION_IN = value_BLEND_MODE_DESTINATION_IN();

	private static native final int value_BLEND_MODE_DESTINATION_OUT()
	/*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_OUT;
	}-*/;

	public static final int BLEND_MODE_DESTINATION_OUT = value_BLEND_MODE_DESTINATION_OUT();

	private static native final int value_BLEND_MODE_DESTINATION_OVER()
	/*-{
		return Titanium.UI.BLEND_MODE_DESTINATION_OVER;
	}-*/;

	public static final int BLEND_MODE_DESTINATION_OVER = value_BLEND_MODE_DESTINATION_OVER();

	private static native final int value_BLEND_MODE_DIFFERENCE()
	/*-{
		return Titanium.UI.BLEND_MODE_DIFFERENCE;
	}-*/;

	public static final int BLEND_MODE_DIFFERENCE = value_BLEND_MODE_DIFFERENCE();

	private static native final int value_BLEND_MODE_EXCLUSION()
	/*-{
		return Titanium.UI.BLEND_MODE_EXCLUSION;
	}-*/;

	public static final int BLEND_MODE_EXCLUSION = value_BLEND_MODE_EXCLUSION();

	private static native final int value_BLEND_MODE_HARD_LIGHT()
	/*-{
		return Titanium.UI.BLEND_MODE_HARD_LIGHT;
	}-*/;

	public static final int BLEND_MODE_HARD_LIGHT = value_BLEND_MODE_HARD_LIGHT();

	private static native final int value_BLEND_MODE_HUE()
	/*-{
		return Titanium.UI.BLEND_MODE_HUE;
	}-*/;

	public static final int BLEND_MODE_HUE = value_BLEND_MODE_HUE();

	private static native final int value_BLEND_MODE_LIGHTEN()
	/*-{
		return Titanium.UI.BLEND_MODE_LIGHTEN;
	}-*/;

	public static final int BLEND_MODE_LIGHTEN = value_BLEND_MODE_LIGHTEN();

	private static native final int value_BLEND_MODE_LUMINOSITY()
	/*-{
		return Titanium.UI.BLEND_MODE_LUMINOSITY;
	}-*/;

	public static final int BLEND_MODE_LUMINOSITY = value_BLEND_MODE_LUMINOSITY();

	private static native final int value_BLEND_MODE_MULTIPLY()
	/*-{
		return Titanium.UI.BLEND_MODE_MULTIPLY;
	}-*/;

	public static final int BLEND_MODE_MULTIPLY = value_BLEND_MODE_MULTIPLY();

	private static native final int value_BLEND_MODE_NORMAL()
	/*-{
		return Titanium.UI.BLEND_MODE_NORMAL;
	}-*/;

	public static final int BLEND_MODE_NORMAL = value_BLEND_MODE_NORMAL();

	private static native final int value_BLEND_MODE_OVERLAY()
	/*-{
		return Titanium.UI.BLEND_MODE_OVERLAY;
	}-*/;

	public static final int BLEND_MODE_OVERLAY = value_BLEND_MODE_OVERLAY();

	private static native final int value_BLEND_MODE_PLUS_DARKER()
	/*-{
		return Titanium.UI.BLEND_MODE_PLUS_DARKER;
	}-*/;

	public static final int BLEND_MODE_PLUS_DARKER = value_BLEND_MODE_PLUS_DARKER();

	private static native final int value_BLEND_MODE_PLUS_LIGHTER()
	/*-{
		return Titanium.UI.BLEND_MODE_PLUS_LIGHTER;
	}-*/;

	public static final int BLEND_MODE_PLUS_LIGHTER = value_BLEND_MODE_PLUS_LIGHTER();

	private static native final int value_BLEND_MODE_SATURATION()
	/*-{
		return Titanium.UI.BLEND_MODE_SATURATION;
	}-*/;

	public static final int BLEND_MODE_SATURATION = value_BLEND_MODE_SATURATION();

	private static native final int value_BLEND_MODE_SCREEN()
	/*-{
		return Titanium.UI.BLEND_MODE_SCREEN;
	}-*/;

	public static final int BLEND_MODE_SCREEN = value_BLEND_MODE_SCREEN();

	private static native final int value_BLEND_MODE_SOFT_LIGHT()
	/*-{
		return Titanium.UI.BLEND_MODE_SOFT_LIGHT;
	}-*/;

	public static final int BLEND_MODE_SOFT_LIGHT = value_BLEND_MODE_SOFT_LIGHT();

	private static native final int value_BLEND_MODE_SOURCE_ATOP()
	/*-{
		return Titanium.UI.BLEND_MODE_SOURCE_ATOP;
	}-*/;

	public static final int BLEND_MODE_SOURCE_ATOP = value_BLEND_MODE_SOURCE_ATOP();

	private static native final int value_BLEND_MODE_SOURCE_IN()
	/*-{
		return Titanium.UI.BLEND_MODE_SOURCE_IN;
	}-*/;

	public static final int BLEND_MODE_SOURCE_IN = value_BLEND_MODE_SOURCE_IN();

	private static native final int value_BLEND_MODE_SOURCE_OUT()
	/*-{
		return Titanium.UI.BLEND_MODE_SOURCE_OUT;
	}-*/;

	public static final int BLEND_MODE_SOURCE_OUT = value_BLEND_MODE_SOURCE_OUT();

	private static native final int value_BLEND_MODE_XOR()
	/*-{
		return Titanium.UI.BLEND_MODE_XOR;
	}-*/;

	public static final int BLEND_MODE_XOR = value_BLEND_MODE_XOR();

	private static native final int value_FACE_DOWN()
	/*-{
		return Titanium.UI.FACE_DOWN;
	}-*/;

	public static final int FACE_DOWN = value_FACE_DOWN();

	private static native final int value_FACE_UP()
	/*-{
		return Titanium.UI.FACE_UP;
	}-*/;

	public static final int FACE_UP = value_FACE_UP();

	private static native final int value_INPUT_BORDERSTYLE_BEZEL()
	/*-{
		return Titanium.UI.INPUT_BORDERSTYLE_BEZEL;
	}-*/;

	public static final int INPUT_BORDERSTYLE_BEZEL = value_INPUT_BORDERSTYLE_BEZEL();

	private static native final int value_INPUT_BORDERSTYLE_LINE()
	/*-{
		return Titanium.UI.INPUT_BORDERSTYLE_LINE;
	}-*/;

	public static final int INPUT_BORDERSTYLE_LINE = value_INPUT_BORDERSTYLE_LINE();

	private static native final int value_INPUT_BORDERSTYLE_NONE()
	/*-{
		return Titanium.UI.INPUT_BORDERSTYLE_NONE;
	}-*/;

	public static final int INPUT_BORDERSTYLE_NONE = value_INPUT_BORDERSTYLE_NONE();

	private static native final int value_INPUT_BORDERSTYLE_ROUNDED()
	/*-{
		return Titanium.UI.INPUT_BORDERSTYLE_ROUNDED;
	}-*/;

	public static final int INPUT_BORDERSTYLE_ROUNDED = value_INPUT_BORDERSTYLE_ROUNDED();

	private static native final int value_INPUT_BUTTONMODE_ALWAYS()
	/*-{
		return Titanium.UI.INPUT_BUTTONMODE_ALWAYS;
	}-*/;

	public static final int INPUT_BUTTONMODE_ALWAYS = value_INPUT_BUTTONMODE_ALWAYS();

	private static native final int value_INPUT_BUTTONMODE_NEVER()
	/*-{
		return Titanium.UI.INPUT_BUTTONMODE_NEVER;
	}-*/;

	public static final int INPUT_BUTTONMODE_NEVER = value_INPUT_BUTTONMODE_NEVER();

	private static native final int value_INPUT_BUTTONMODE_ONBLUR()
	/*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONBLUR;
	}-*/;

	public static final int INPUT_BUTTONMODE_ONBLUR = value_INPUT_BUTTONMODE_ONBLUR();

	private static native final int value_INPUT_BUTTONMODE_ONFOCUS()
	/*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONFOCUS;
	}-*/;

	public static final int INPUT_BUTTONMODE_ONFOCUS = value_INPUT_BUTTONMODE_ONFOCUS();

	private static native final int value_KEYBOARD_APPEARANCE_ALERT()
	/*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_ALERT;
	}-*/;

	public static final int KEYBOARD_APPEARANCE_ALERT = value_KEYBOARD_APPEARANCE_ALERT();

	private static native final int value_KEYBOARD_APPEARANCE_DEFAULT()
	/*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT;
	}-*/;

	public static final int KEYBOARD_APPEARANCE_DEFAULT = value_KEYBOARD_APPEARANCE_DEFAULT();

	private static native final int value_KEYBOARD_ASCII()
	/*-{
		return Titanium.UI.KEYBOARD_ASCII;
	}-*/;

	public static final int KEYBOARD_ASCII = value_KEYBOARD_ASCII();

	private static native final int value_KEYBOARD_DEFAULT()
	/*-{
		return Titanium.UI.KEYBOARD_DEFAULT;
	}-*/;

	public static final int KEYBOARD_DEFAULT = value_KEYBOARD_DEFAULT();

	private static native final int value_KEYBOARD_EMAIL()
	/*-{
		return Titanium.UI.KEYBOARD_EMAIL;
	}-*/;

	public static final int KEYBOARD_EMAIL = value_KEYBOARD_EMAIL();

	private static native final int value_KEYBOARD_NAMEPHONE_PAD()
	/*-{
		return Titanium.UI.KEYBOARD_NAMEPHONE_PAD;
	}-*/;

	public static final int KEYBOARD_NAMEPHONE_PAD = value_KEYBOARD_NAMEPHONE_PAD();

	private static native final int value_KEYBOARD_NUMBERS_PUNCTUATION()
	/*-{
		return Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION;
	}-*/;

	public static final int KEYBOARD_NUMBERS_PUNCTUATION = value_KEYBOARD_NUMBERS_PUNCTUATION();

	private static native final int value_KEYBOARD_NUMBER_PAD()
	/*-{
		return Titanium.UI.KEYBOARD_NUMBER_PAD;
	}-*/;

	public static final int KEYBOARD_NUMBER_PAD = value_KEYBOARD_NUMBER_PAD();

	private static native final int value_KEYBOARD_PHONE_PAD()
	/*-{
		return Titanium.UI.KEYBOARD_PHONE_PAD;
	}-*/;

	public static final int KEYBOARD_PHONE_PAD = value_KEYBOARD_PHONE_PAD();

	private static native final int value_KEYBOARD_URL()
	/*-{
		return Titanium.UI.KEYBOARD_URL;
	}-*/;

	public static final int KEYBOARD_URL = value_KEYBOARD_URL();

	private static native final int value_LANDSCAPE_LEFT()
	/*-{
		return Titanium.UI.LANDSCAPE_LEFT;
	}-*/;

	public static final int LANDSCAPE_LEFT = value_LANDSCAPE_LEFT();

	private static native final int value_LANDSCAPE_RIGHT()
	/*-{
		return Titanium.UI.LANDSCAPE_RIGHT;
	}-*/;

	public static final int LANDSCAPE_RIGHT = value_LANDSCAPE_RIGHT();

	private static native final int value_NOTIFICATION_DURATION_LONG()
	/*-{
		return Titanium.UI.NOTIFICATION_DURATION_LONG;
	}-*/;

	public static final int NOTIFICATION_DURATION_LONG = value_NOTIFICATION_DURATION_LONG();

	private static native final int value_NOTIFICATION_DURATION_SHORT()
	/*-{
		return Titanium.UI.NOTIFICATION_DURATION_SHORT;
	}-*/;

	public static final int NOTIFICATION_DURATION_SHORT = value_NOTIFICATION_DURATION_SHORT();

	private static native final int value_PICKER_TYPE_COUNT_DOWN_TIMER()
	/*-{
		return Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER;
	}-*/;

	public static final int PICKER_TYPE_COUNT_DOWN_TIMER = value_PICKER_TYPE_COUNT_DOWN_TIMER();

	private static native final int value_PICKER_TYPE_DATE()
	/*-{
		return Titanium.UI.PICKER_TYPE_DATE;
	}-*/;

	public static final int PICKER_TYPE_DATE = value_PICKER_TYPE_DATE();

	private static native final int value_PICKER_TYPE_DATE_AND_TIME()
	/*-{
		return Titanium.UI.PICKER_TYPE_DATE_AND_TIME;
	}-*/;

	public static final int PICKER_TYPE_DATE_AND_TIME = value_PICKER_TYPE_DATE_AND_TIME();

	private static native final int value_PICKER_TYPE_PLAIN()
	/*-{
		return Titanium.UI.PICKER_TYPE_PLAIN;
	}-*/;

	public static final int PICKER_TYPE_PLAIN = value_PICKER_TYPE_PLAIN();

	private static native final int value_PICKER_TYPE_TIME()
	/*-{
		return Titanium.UI.PICKER_TYPE_TIME;
	}-*/;

	public static final int PICKER_TYPE_TIME = value_PICKER_TYPE_TIME();

	private static native final int value_PORTRAIT()
	/*-{
		return Titanium.UI.PORTRAIT;
	}-*/;

	public static final int PORTRAIT = value_PORTRAIT();

	private static native final int value_RETURNKEY_DEFAULT()
	/*-{
		return Titanium.UI.RETURNKEY_DEFAULT;
	}-*/;

	public static final int RETURNKEY_DEFAULT = value_RETURNKEY_DEFAULT();

	private static native final int value_RETURNKEY_DONE()
	/*-{
		return Titanium.UI.RETURNKEY_DONE;
	}-*/;

	public static final int RETURNKEY_DONE = value_RETURNKEY_DONE();

	private static native final int value_RETURNKEY_EMERGENCY_CALL()
	/*-{
		return Titanium.UI.RETURNKEY_EMERGENCY_CALL;
	}-*/;

	public static final int RETURNKEY_EMERGENCY_CALL = value_RETURNKEY_EMERGENCY_CALL();

	private static native final int value_RETURNKEY_GO()
	/*-{
		return Titanium.UI.RETURNKEY_GO;
	}-*/;

	public static final int RETURNKEY_GO = value_RETURNKEY_GO();

	private static native final int value_RETURNKEY_GOOGLE()
	/*-{
		return Titanium.UI.RETURNKEY_GOOGLE;
	}-*/;

	public static final int RETURNKEY_GOOGLE = value_RETURNKEY_GOOGLE();

	private static native final int value_RETURNKEY_JOIN()
	/*-{
		return Titanium.UI.RETURNKEY_JOIN;
	}-*/;

	public static final int RETURNKEY_JOIN = value_RETURNKEY_JOIN();

	private static native final int value_RETURNKEY_NEXT()
	/*-{
		return Titanium.UI.RETURNKEY_NEXT;
	}-*/;

	public static final int RETURNKEY_NEXT = value_RETURNKEY_NEXT();

	private static native final int value_RETURNKEY_ROUTE()
	/*-{
		return Titanium.UI.RETURNKEY_ROUTE;
	}-*/;

	public static final int RETURNKEY_ROUTE = value_RETURNKEY_ROUTE();

	private static native final int value_RETURNKEY_SEARCH()
	/*-{
		return Titanium.UI.RETURNKEY_SEARCH;
	}-*/;

	public static final int RETURNKEY_SEARCH = value_RETURNKEY_SEARCH();

	private static native final int value_RETURNKEY_SEND()
	/*-{
		return Titanium.UI.RETURNKEY_SEND;
	}-*/;

	public static final int RETURNKEY_SEND = value_RETURNKEY_SEND();

	private static native final int value_RETURNKEY_YAHOO()
	/*-{
		return Titanium.UI.RETURNKEY_YAHOO;
	}-*/;

	public static final int RETURNKEY_YAHOO = value_RETURNKEY_YAHOO();

	private static native final int value_TEXT_ALIGNMENT_CENTER()
	/*-{
		return Titanium.UI.TEXT_ALIGNMENT_CENTER;
	}-*/;

	public static final int TEXT_ALIGNMENT_CENTER = value_TEXT_ALIGNMENT_CENTER();

	private static native final int value_TEXT_ALIGNMENT_LEFT()
	/*-{
		return Titanium.UI.TEXT_ALIGNMENT_LEFT;
	}-*/;

	public static final int TEXT_ALIGNMENT_LEFT = value_TEXT_ALIGNMENT_LEFT();

	private static native final int value_TEXT_ALIGNMENT_RIGHT()
	/*-{
		return Titanium.UI.TEXT_ALIGNMENT_RIGHT;
	}-*/;

	public static final int TEXT_ALIGNMENT_RIGHT = value_TEXT_ALIGNMENT_RIGHT();

	private static native final int value_TEXT_AUTOCAPITALIZATION_ALL()
	/*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL;
	}-*/;

	public static final int TEXT_AUTOCAPITALIZATION_ALL = value_TEXT_AUTOCAPITALIZATION_ALL();

	private static native final int value_TEXT_AUTOCAPITALIZATION_NONE()
	/*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE;
	}-*/;

	public static final int TEXT_AUTOCAPITALIZATION_NONE = value_TEXT_AUTOCAPITALIZATION_NONE();

	private static native final int value_TEXT_AUTOCAPITALIZATION_SENTENCES()
	/*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES;
	}-*/;

	public static final int TEXT_AUTOCAPITALIZATION_SENTENCES = value_TEXT_AUTOCAPITALIZATION_SENTENCES();

	private static native final int value_TEXT_AUTOCAPITALIZATION_WORDS()
	/*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS;
	}-*/;

	public static final int TEXT_AUTOCAPITALIZATION_WORDS = value_TEXT_AUTOCAPITALIZATION_WORDS();

	private static native final int value_TEXT_VERTICAL_ALIGNMENT_BOTTOM()
	/*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM;
	}-*/;

	public static final int TEXT_VERTICAL_ALIGNMENT_BOTTOM = value_TEXT_VERTICAL_ALIGNMENT_BOTTOM();

	private static native final int value_TEXT_VERTICAL_ALIGNMENT_CENTER()
	/*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER;
	}-*/;

	public static final int TEXT_VERTICAL_ALIGNMENT_CENTER = value_TEXT_VERTICAL_ALIGNMENT_CENTER();

	private static native final int value_TEXT_VERTICAL_ALIGNMENT_TOP()
	/*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP;
	}-*/;

	public static final int TEXT_VERTICAL_ALIGNMENT_TOP = value_TEXT_VERTICAL_ALIGNMENT_TOP();

	private static native final int value_UNKNOWN()
	/*-{
		return Titanium.UI.UNKNOWN;
	}-*/;

	public static final int UNKNOWN = value_UNKNOWN();

	private static native final int value_UPSIDE_PORTRAIT()
	/*-{
		return Titanium.UI.UPSIDE_PORTRAIT;
	}-*/;

	public static final int UPSIDE_PORTRAIT = value_UPSIDE_PORTRAIT();

	/**
	 * @return This sets the background color of the master uiview (when there
	 *         are no windows/tab groups on it)
	 */
	public static native String getBackgroundColor()
	/*-{
		return Titanium.UI.backgroundColor;
	}-*/;

	public static native void setBackgroundColor(String value)
	/*-{
		Titanium.UI.backgroundColor = value;
	}-*/;

	/**
	 * @return Path/url to an image file for setting a background for the master
	 *         uiview (when there are no windows/tab groups on it).
	 */
	public static native String getBackgroundImage()
	/*-{
		return Titanium.UI.backgroundImage;
	}-*/;

	public static native void setBackgroundImage(String value)
	/*-{
		Titanium.UI.backgroundImage = value;
	}-*/;

	/**
	 * @return The active window associated with the executing javascript
	 *         context.
	 */
	public static native org.urish.gwtit.titanium.ui.Window getCurrentWindow()
	/*-{
		return Titanium.UI.currentWindow;
	}-*/;

	public static native void setCurrentWindow(org.urish.gwtit.titanium.ui.Window value)
	/*-{
		Titanium.UI.currentWindow = value;
	}-*/;

	/**
	 * @return Deprecated. to set an orientation, it is suggested to instead set
	 *         {@link org.urish.gwtit.titanium.window.orientationmodes} to the
	 *         specific orientation desired. when set, this will update the
	 *         orientation of the current window to the specified orientation
	 *         value.
	 */
	public static native float getOrientation()
	/*-{
		return Titanium.UI.orientation;
	}-*/;

	public static native void setOrientation(float value)
	/*-{
		Titanium.UI.orientation = value;
	}-*/;

	public static native org.urish.gwtit.titanium.ui._2DMatrix create_2DMatrix()
	/*-{
		return Titanium.UI.create_2DMatrix();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ActivityIndicator createActivityIndicator()
	/*-{
		return Titanium.UI.createActivityIndicator();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.AlertDialog createAlertDialog()
	/*-{
		return Titanium.UI.createAlertDialog();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Animation createAnimation()
	/*-{
		return Titanium.UI.createAnimation();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Button createButton()
	/*-{
		return Titanium.UI.createButton();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ButtonBar createButtonBar()
	/*-{
		return Titanium.UI.createButtonBar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.CoverFlowView createCoverFlowView()
	/*-{
		return Titanium.UI.createCoverFlowView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.DashboardItem createDashboardItem()
	/*-{
		return Titanium.UI.createDashboardItem();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.DashboardView createDashboardView()
	/*-{
		return Titanium.UI.createDashboardView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.EmailDialog createEmailDialog()
	/*-{
		return Titanium.UI.createEmailDialog();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ImageView createImageView()
	/*-{
		return Titanium.UI.createImageView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Label createLabel()
	/*-{
		return Titanium.UI.createLabel();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.OptionDialog createOptionDialog()
	/*-{
		return Titanium.UI.createOptionDialog();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Picker createPicker()
	/*-{
		return Titanium.UI.createPicker();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.PickerColumn createPickerColumn()
	/*-{
		return Titanium.UI.createPickerColumn();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.PickerRow createPickerRow()
	/*-{
		return Titanium.UI.createPickerRow();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ProgressBar createProgressBar()
	/*-{
		return Titanium.UI.createProgressBar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ScrollableView createScrollableView()
	/*-{
		return Titanium.UI.createScrollableView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ScrollView createScrollView()
	/*-{
		return Titanium.UI.createScrollView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.SearchBar createSearchBar()
	/*-{
		return Titanium.UI.createSearchBar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Slider createSlider()
	/*-{
		return Titanium.UI.createSlider();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Switch createSwitch()
	/*-{
		return Titanium.UI.createSwitch();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Tab createTab()
	/*-{
		return Titanium.UI.createTab();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TabbedBar createTabbedBar()
	/*-{
		return Titanium.UI.createTabbedBar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TabGroup createTabGroup()
	/*-{
		return Titanium.UI.createTabGroup();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TableView createTableView()
	/*-{
		return Titanium.UI.createTableView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TableViewRow createTableViewRow()
	/*-{
		return Titanium.UI.createTableViewRow();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TableViewSection createTableViewSection()
	/*-{
		return Titanium.UI.createTableViewSection();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TextArea createTextArea()
	/*-{
		return Titanium.UI.createTextArea();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.TextField createTextField()
	/*-{
		return Titanium.UI.createTextField();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Toolbar createToolbar()
	/*-{
		return Titanium.UI.createToolbar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.View createView()
	/*-{
		return Titanium.UI.createView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.WebView createWebView()
	/*-{
		return Titanium.UI.createWebView();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Window createWindow()
	/*-{
		return Titanium.UI.createWindow();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Android createAndroid()
	/*-{
		return Titanium.UI.createAndroid();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.Clipboard createClipboard()
	/*-{
		return Titanium.UI.createClipboard();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iOS createiOS()
	/*-{
		return Titanium.UI.createiOS();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iPad createiPad()
	/*-{
		return Titanium.UI.createiPad();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iPhone createiPhone()
	/*-{
		return Titanium.UI.createiPhone();
	}-*/;

}
