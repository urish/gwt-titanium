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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

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

	public static final Const ANIMATION_CURVE_EASE_IN = new ConstImpl("Titanium.UI.ANIMATION_CURVE_EASE_IN");

	public static final Const ANIMATION_CURVE_EASE_IN_OUT = new ConstImpl("Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT");

	public static final Const ANIMATION_CURVE_EASE_OUT = new ConstImpl("Titanium.UI.ANIMATION_CURVE_EASE_OUT");

	public static final Const ANIMATION_CURVE_LINEAR = new ConstImpl("Titanium.UI.ANIMATION_CURVE_LINEAR");

	public static final Const AUTODETECT_ADDRESS = new ConstImpl("Titanium.UI.AUTODETECT_ADDRESS");

	public static final Const AUTODETECT_ALL = new ConstImpl("Titanium.UI.AUTODETECT_ALL");

	public static final Const AUTODETECT_CALENDAR = new ConstImpl("Titanium.UI.AUTODETECT_CALENDAR");

	public static final Const AUTODETECT_LINK = new ConstImpl("Titanium.UI.AUTODETECT_LINK");

	public static final Const AUTODETECT_NONE = new ConstImpl("Titanium.UI.AUTODETECT_NONE");

	public static final Const AUTODETECT_PHONE = new ConstImpl("Titanium.UI.AUTODETECT_PHONE");

	public static final Const BLEND_MODE_CLEAR = new ConstImpl("Titanium.UI.BLEND_MODE_CLEAR");

	public static final Const BLEND_MODE_COLOR = new ConstImpl("Titanium.UI.BLEND_MODE_COLOR");

	public static final Const BLEND_MODE_COLOR_BURN = new ConstImpl("Titanium.UI.BLEND_MODE_COLOR_BURN");

	public static final Const BLEND_MODE_COLOR_DODGE = new ConstImpl("Titanium.UI.BLEND_MODE_COLOR_DODGE");

	public static final Const BLEND_MODE_COPY = new ConstImpl("Titanium.UI.BLEND_MODE_COPY");

	public static final Const BLEND_MODE_DARKEN = new ConstImpl("Titanium.UI.BLEND_MODE_DARKEN");

	public static final Const BLEND_MODE_DESTINATION_ATOP = new ConstImpl("Titanium.UI.BLEND_MODE_DESTINATION_ATOP");

	public static final Const BLEND_MODE_DESTINATION_IN = new ConstImpl("Titanium.UI.BLEND_MODE_DESTINATION_IN");

	public static final Const BLEND_MODE_DESTINATION_OUT = new ConstImpl("Titanium.UI.BLEND_MODE_DESTINATION_OUT");

	public static final Const BLEND_MODE_DESTINATION_OVER = new ConstImpl("Titanium.UI.BLEND_MODE_DESTINATION_OVER");

	public static final Const BLEND_MODE_DIFFERENCE = new ConstImpl("Titanium.UI.BLEND_MODE_DIFFERENCE");

	public static final Const BLEND_MODE_EXCLUSION = new ConstImpl("Titanium.UI.BLEND_MODE_EXCLUSION");

	public static final Const BLEND_MODE_HARD_LIGHT = new ConstImpl("Titanium.UI.BLEND_MODE_HARD_LIGHT");

	public static final Const BLEND_MODE_HUE = new ConstImpl("Titanium.UI.BLEND_MODE_HUE");

	public static final Const BLEND_MODE_LIGHTEN = new ConstImpl("Titanium.UI.BLEND_MODE_LIGHTEN");

	public static final Const BLEND_MODE_LUMINOSITY = new ConstImpl("Titanium.UI.BLEND_MODE_LUMINOSITY");

	public static final Const BLEND_MODE_MULTIPLY = new ConstImpl("Titanium.UI.BLEND_MODE_MULTIPLY");

	public static final Const BLEND_MODE_NORMAL = new ConstImpl("Titanium.UI.BLEND_MODE_NORMAL");

	public static final Const BLEND_MODE_OVERLAY = new ConstImpl("Titanium.UI.BLEND_MODE_OVERLAY");

	public static final Const BLEND_MODE_PLUS_DARKER = new ConstImpl("Titanium.UI.BLEND_MODE_PLUS_DARKER");

	public static final Const BLEND_MODE_PLUS_LIGHTER = new ConstImpl("Titanium.UI.BLEND_MODE_PLUS_LIGHTER");

	public static final Const BLEND_MODE_SATURATION = new ConstImpl("Titanium.UI.BLEND_MODE_SATURATION");

	public static final Const BLEND_MODE_SCREEN = new ConstImpl("Titanium.UI.BLEND_MODE_SCREEN");

	public static final Const BLEND_MODE_SOFT_LIGHT = new ConstImpl("Titanium.UI.BLEND_MODE_SOFT_LIGHT");

	public static final Const BLEND_MODE_SOURCE_ATOP = new ConstImpl("Titanium.UI.BLEND_MODE_SOURCE_ATOP");

	public static final Const BLEND_MODE_SOURCE_IN = new ConstImpl("Titanium.UI.BLEND_MODE_SOURCE_IN");

	public static final Const BLEND_MODE_SOURCE_OUT = new ConstImpl("Titanium.UI.BLEND_MODE_SOURCE_OUT");

	public static final Const BLEND_MODE_XOR = new ConstImpl("Titanium.UI.BLEND_MODE_XOR");

	public static final Const FACE_DOWN = new ConstImpl("Titanium.UI.FACE_DOWN");

	public static final Const FACE_UP = new ConstImpl("Titanium.UI.FACE_UP");

	public static final Const INPUT_BORDERSTYLE_BEZEL = new ConstImpl("Titanium.UI.INPUT_BORDERSTYLE_BEZEL");

	public static final Const INPUT_BORDERSTYLE_LINE = new ConstImpl("Titanium.UI.INPUT_BORDERSTYLE_LINE");

	public static final Const INPUT_BORDERSTYLE_NONE = new ConstImpl("Titanium.UI.INPUT_BORDERSTYLE_NONE");

	public static final Const INPUT_BORDERSTYLE_ROUNDED = new ConstImpl("Titanium.UI.INPUT_BORDERSTYLE_ROUNDED");

	public static final Const INPUT_BUTTONMODE_ALWAYS = new ConstImpl("Titanium.UI.INPUT_BUTTONMODE_ALWAYS");

	public static final Const INPUT_BUTTONMODE_NEVER = new ConstImpl("Titanium.UI.INPUT_BUTTONMODE_NEVER");

	public static final Const INPUT_BUTTONMODE_ONBLUR = new ConstImpl("Titanium.UI.INPUT_BUTTONMODE_ONBLUR");

	public static final Const INPUT_BUTTONMODE_ONFOCUS = new ConstImpl("Titanium.UI.INPUT_BUTTONMODE_ONFOCUS");

	public static final Const KEYBOARD_APPEARANCE_ALERT = new ConstImpl("Titanium.UI.KEYBOARD_APPEARANCE_ALERT");

	public static final Const KEYBOARD_APPEARANCE_DEFAULT = new ConstImpl("Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT");

	public static final Const KEYBOARD_ASCII = new ConstImpl("Titanium.UI.KEYBOARD_ASCII");

	public static final Const KEYBOARD_DEFAULT = new ConstImpl("Titanium.UI.KEYBOARD_DEFAULT");

	public static final Const KEYBOARD_EMAIL = new ConstImpl("Titanium.UI.KEYBOARD_EMAIL");

	public static final Const KEYBOARD_NAMEPHONE_PAD = new ConstImpl("Titanium.UI.KEYBOARD_NAMEPHONE_PAD");

	public static final Const KEYBOARD_NUMBERS_PUNCTUATION = new ConstImpl("Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION");

	public static final Const KEYBOARD_NUMBER_PAD = new ConstImpl("Titanium.UI.KEYBOARD_NUMBER_PAD");

	public static final Const KEYBOARD_PHONE_PAD = new ConstImpl("Titanium.UI.KEYBOARD_PHONE_PAD");

	public static final Const KEYBOARD_URL = new ConstImpl("Titanium.UI.KEYBOARD_URL");

	public static final Const LANDSCAPE_LEFT = new ConstImpl("Titanium.UI.LANDSCAPE_LEFT");

	public static final Const LANDSCAPE_RIGHT = new ConstImpl("Titanium.UI.LANDSCAPE_RIGHT");

	public static final Const NOTIFICATION_DURATION_LONG = new ConstImpl("Titanium.UI.NOTIFICATION_DURATION_LONG");

	public static final Const NOTIFICATION_DURATION_SHORT = new ConstImpl("Titanium.UI.NOTIFICATION_DURATION_SHORT");

	public static final Const PICKER_TYPE_COUNT_DOWN_TIMER = new ConstImpl("Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER");

	public static final Const PICKER_TYPE_DATE = new ConstImpl("Titanium.UI.PICKER_TYPE_DATE");

	public static final Const PICKER_TYPE_DATE_AND_TIME = new ConstImpl("Titanium.UI.PICKER_TYPE_DATE_AND_TIME");

	public static final Const PICKER_TYPE_PLAIN = new ConstImpl("Titanium.UI.PICKER_TYPE_PLAIN");

	public static final Const PICKER_TYPE_TIME = new ConstImpl("Titanium.UI.PICKER_TYPE_TIME");

	public static final Const PORTRAIT = new ConstImpl("Titanium.UI.PORTRAIT");

	public static final Const RETURNKEY_DEFAULT = new ConstImpl("Titanium.UI.RETURNKEY_DEFAULT");

	public static final Const RETURNKEY_DONE = new ConstImpl("Titanium.UI.RETURNKEY_DONE");

	public static final Const RETURNKEY_EMERGENCY_CALL = new ConstImpl("Titanium.UI.RETURNKEY_EMERGENCY_CALL");

	public static final Const RETURNKEY_GO = new ConstImpl("Titanium.UI.RETURNKEY_GO");

	public static final Const RETURNKEY_GOOGLE = new ConstImpl("Titanium.UI.RETURNKEY_GOOGLE");

	public static final Const RETURNKEY_JOIN = new ConstImpl("Titanium.UI.RETURNKEY_JOIN");

	public static final Const RETURNKEY_NEXT = new ConstImpl("Titanium.UI.RETURNKEY_NEXT");

	public static final Const RETURNKEY_ROUTE = new ConstImpl("Titanium.UI.RETURNKEY_ROUTE");

	public static final Const RETURNKEY_SEARCH = new ConstImpl("Titanium.UI.RETURNKEY_SEARCH");

	public static final Const RETURNKEY_SEND = new ConstImpl("Titanium.UI.RETURNKEY_SEND");

	public static final Const RETURNKEY_YAHOO = new ConstImpl("Titanium.UI.RETURNKEY_YAHOO");

	public static final Const TEXT_ALIGNMENT_CENTER = new ConstImpl("Titanium.UI.TEXT_ALIGNMENT_CENTER");

	public static final Const TEXT_ALIGNMENT_LEFT = new ConstImpl("Titanium.UI.TEXT_ALIGNMENT_LEFT");

	public static final Const TEXT_ALIGNMENT_RIGHT = new ConstImpl("Titanium.UI.TEXT_ALIGNMENT_RIGHT");

	public static final Const TEXT_AUTOCAPITALIZATION_ALL = new ConstImpl("Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL");

	public static final Const TEXT_AUTOCAPITALIZATION_NONE = new ConstImpl("Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE");

	public static final Const TEXT_AUTOCAPITALIZATION_SENTENCES = new ConstImpl(
			"Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES");

	public static final Const TEXT_AUTOCAPITALIZATION_WORDS = new ConstImpl("Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS");

	public static final Const TEXT_VERTICAL_ALIGNMENT_BOTTOM = new ConstImpl(
			"Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM");

	public static final Const TEXT_VERTICAL_ALIGNMENT_CENTER = new ConstImpl(
			"Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER");

	public static final Const TEXT_VERTICAL_ALIGNMENT_TOP = new ConstImpl("Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP");

	public static final Const UNKNOWN = new ConstImpl("Titanium.UI.UNKNOWN");

	public static final Const UPSIDE_PORTRAIT = new ConstImpl("Titanium.UI.UPSIDE_PORTRAIT");

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

	public static native org.urish.gwtit.titanium.ui._2DMatrix create_2DMatrix()
	/*-{
		return Titanium.UI.create_2DMatrix();
	}-*/;

	public static native org.urish.gwtit.titanium.ui._3DMatrix create_3DMatrix()
	/*-{
		return Titanium.UI.create_3DMatrix();
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
