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
 * The window is an empty drawing surface or container. the window is created by
 * the method {@link org.urish.gwtit.titanium.ui.createwindow}. unlike
 * [views](titanium.ui.view-object), windows can be opened and closed and can
 * have special display properties such as `fullscreen` or `modal`.
 * <p>
 * Notes: ### Sub-contexts
 * 
 * Windows can be loaded from another Javascript file by specifying the property
 * `url` and reference a file relative to your application `Resources` folder.
 * It's important to note that Titanium will refuse to load Javascript files
 * from a remote URL. Loading remote Javascript from a URL and providing it with
 * the full capabilities of the Titanium API would be very dangerous.
 * 
 * When you Window is loaded from a separate Javascript file, the code will be
 * executed in a separate Javascript context (called a "sub-context") than your
 * `app.js` global context. It will also execute in its own separate thread.
 * 
 * The special property <Titanium.UI.currentWindow> is available inside a
 * sub-context that points to the Javascript instance by reference in the global
 * context.
 * 
 * 
 * ### Passing Data
 * 
 * By default, sub-context variables cannot access Javascript references in the
 * global context. However, the global context can allow its sub-contexts the
 * ability to have access to properties and functions in the global context by
 * reference assignment. An example best illustrates how to do this.
 * 
 * In `app.js`, you could define a function and a property.
 * 
 * var a = 1; function b() { return "hello"; }
 * 
 * Now, you can create a new Window - let's call it `foo.js` - in your `app.js`.
 * 
 * var w = Titanium.UI.createWindow({ url:'foo.js' });
 * 
 * To _give_ your new window access to both `a` and `b`, you would need to
 * assign them to the new window reference `w`.
 * 
 * w.a = a; w.b = b;
 * 
 * Of course, you could give them a different name than their original names.
 * However, what name you give them in your `app.js` is how you will reference
 * them in `foo.js`. Now, let's look at the code for `foo.js`.
 * 
 * alert("b() = "+Titanium.UI.currentWindow.b());
 * 
 * In the above code, the `foo.js` will execute the function `b` in the global
 * context and return the result. Since `b` is a reference (vs. a copy by
 * value), any changes made to these Javascript references will be immediately
 * available in all sub-contexts.
 * 
 * ### Events
 * 
 * If you'd like to send events to a window from the global context and vice
 * versa, you could use the built-in event mechanism. For example, you could
 * define a custom event called `foo`. The window could listen for this event
 * and then respond with some action. For example, in your sub-context you might
 * define:
 * 
 * Titanium.UI.currentWindow.addEventListener('foo',function(e) {
 * Titanium.API.info("foo event received = "+JSON.stringify(e)); });
 * 
 * You could now fire the event from `app.js` like this:
 * 
 * var window = Titanium.UI.createWindow({ url:'bar.js' }); window.open();
 * window.fireEvent('foo',{a:'b'});
 * 
 * It's worth noting two important limitations of the example above:
 * 
 * You must open the window before you can send events to it. You also may have
 * to fire the event after a specified amount of time if you intend to
 * immediately send data to the window. This is because windows are opened
 * asynchronously and on a separate thread than the caller thread. You can only
 * send JSON-serializable data in a fireEvent. If you attempt to send objects
 * that have function references, they will be null.
 * 
 * 
 * ### Animations
 * 
 * Windows can be animated like any normal [View](Titanium.UI.View). To
 * transition between 2 windows, you can use the `transition` property on an
 * animation. For example, to flip right-to-left between two windows, you could
 * do the following:
 * 
 * var window2 = Titanium.UI.createWindow({url:'foo.js'}); var t =
 * Ti.UI.iPhone.AnimationStyle.FLIP_FROM_LEFT;
 * window1.animate({view:window2,transition:t});
 * 
 * In the above example, the `window2` view will be animated from the
 * right-to-left over `window1`.
 * 
 * Windows can be opened or closed with animation. In the example below, we
 * create a window that will open from small to large with a bounce effect. This
 * is done by applying a transformation at initialization time that scales the
 * original size of the window to 0. When the window is opened, a new 2D
 * transformation is applied that will scale the window size from 0 to 110% of
 * it's original size and then, after 1/20th of a second, will scale it back to
 * it's original size at 100%. This gives the bounce effect during animation.
 * 
 * var t = Titanium.UI.create2DMatrix().scale(0);
 * 
 * // create a window with the initial transform scaled to 0 var w =
 * Titanium.UI.createWindow({ backgroundColor:'#336699', borderWidth:8,
 * borderColor:'#999', height:400, width:300, borderRadius:10, opacity:0.92,
 * transform:t });
 * 
 * // create first transform to go beyond normal size var t1 =
 * Titanium.UI.create2DMatrix().scale(1.1);
 * 
 * var a = Titanium.UI.createAnimation(); a.transform = t1; a.duration = 200;
 * 
 * // when this animation completes, scale to normal size
 * a.addEventListener('complete', function() { // we can use the identity
 * transform to take it back to it's real size var t2 =
 * Titanium.UI.create2DMatrix(); w.animate({transform:t2, duration:200}); });
 * 
 * ### iPad Modal Windows
 * 
 * For iPad, iPhone SDK 3.2 and Titanium 1.2 introduced several new ways of
 * presenting modal windows.
 * 
 * The example below is a modal window.
 * 
 * ![modal](http://img.skitch.com/20100406-bqb3f8pb6e4ger7wkcdcw5mbar.png)
 * 
 * You can create this type of modal window on iPad with the following code
 * snippet:
 * 
 * var window = Titanium.UI.createWindow(); window.open({ modal:true,
 * modalTransitionStyle: Ti.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL,
 * modalStyle: Ti.UI.iPhone.MODAL_PRESENTATION_FORMSHEET })
 * 
 * ### Android "root" Windows
 * 
 * In Android, you may wish to specify that a window which you create (such as
 * the first window) should be considered the root window and that the
 * application should exit when the back button is pressed from that window.
 * This is particularly useful if your application is not using a Tab Group and
 * therefore the splash screen window is appearing whenever you press the back
 * button from your lowest window on the stack.
 * 
 * To indicate that a particular window should cause an application to exit when
 * the back button is pressed, pass `exitOnClose: true` as one of the creation
 * arguments, as shown here:
 * 
 * var win = Titanium.UI.createWindow({ title: 'My Root Window', exitOnClose:
 * true });
 * 
 * @since 0.9
 */
public class Window extends org.urish.gwtit.titanium.ui.View {
	protected Window() {
	}

	/**
	 * @return Title for the back button. only available in iphone. this is only
	 *         valid when the window is a child of a tab.
	 * @platforms iphone, ipad
	 */
	public native String getBackButtonTitle()
	/*-{
		return this.backButtonTitle;
	}-*/;

	public native void setBackButtonTitle(String value)
	/*-{
		this.backButtonTitle = value;
	}-*/;

	/**
	 * @return Url to an image to show as the back button. only available in
	 *         iphone. this is only valid when the window is a child of a tab.
	 * @platforms iphone, ipad
	 */
	public native String getBackButtonTitleImage()
	/*-{
		return this.backButtonTitleImage;
	}-*/;

	public native void setBackButtonTitleImage(String value)
	/*-{
		this.backButtonTitleImage = value;
	}-*/;

	/**
	 * @return Web named color or hex value for the color of the nav bar. only
	 *         available in iphone.
	 * @platforms iphone, ipad
	 */
	public native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return Url to a local image to place as the background of the nav bar.
	 *         only available in iphone.
	 * @platforms iphone, ipad
	 */
	public native String getBarImage()
	/*-{
		return this.barImage;
	}-*/;

	public native void setBarImage(String value)
	/*-{
		this.barImage = value;
	}-*/;

	/**
	 * @return (android only.) boolean indicates if the application should exit
	 *         when the android back button is pressed while the window is being
	 *         shown. you can only set this as a createwindow({...}) option.
	 *         setting it after window creation will no effect.
	 * @platforms android
	 */
	public native boolean getExitOnClose()
	/*-{
		return this.exitOnClose;
	}-*/;

	public native void setExitOnClose(boolean value)
	/*-{
		this.exitOnClose = value;
	}-*/;

	/**
	 * @return Boolean indicates if the window is fullscreen (no device chrome)
	 */
	public native boolean getFullscreen()
	/*-{
		return this.fullscreen;
	}-*/;

	public native void setFullscreen(boolean value)
	/*-{
		this.fullscreen = value;
	}-*/;

	/**
	 * @return View to show in the left nav bar area. only available in iphone.
	 * @platforms iphone, ipad
	 */
	public native Object getLeftNavButton()
	/*-{
		return this.leftNavButton;
	}-*/;

	public native void setLeftNavButton(Object value)
	/*-{
		this.leftNavButton = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the window should be opened modal in front
	 *         of other windows. android note: the combination of
	 *         `fullscreen:true` and `modal:true` will not work as expected.
	 *         android modal windows are translucent, and, in android, the
	 *         contents of a translucent window cannot appear above the status
	 *         bar. i.e., even though you say `fullscreen:true`, the status bar
	 *         will still be visible *if* it was visible in the previous window.
	 *         `navbarhidden` and `modal` do work fine together, however.
	 */
	public native boolean getModal()
	/*-{
		return this.modal;
	}-*/;

	public native void setModal(boolean value)
	/*-{
		this.modal = value;
	}-*/;

	/**
	 * @return For modal windows, hide the nav bar (true) or show the nav bar
	 *         (false, default).
	 */
	public native boolean getNavBarHidden()
	/*-{
		return this.navBarHidden;
	}-*/;

	public native void setNavBarHidden(boolean value)
	/*-{
		this.navBarHidden = value;
	}-*/;

	/**
	 * @return The opacity from 0.0-1.0. android notes: if you set any of
	 *         `windowsoftinputmode`, `fullscreen`, or `navbarhidden`, *and* you
	 *         wish to use the `opacity` property at any time during the
	 *         window's lifetime, be sure to set an `opacity` value before
	 *         opening the window. you can later change that value -- and you
	 *         can set it to 1 for full opacity if you wish -- but the important
	 *         thing is that you set it to a value before opening the window if
	 *         you will want to set it at any time during the window's lifetime.
	 *         the technical reason for this is that if the opacity property is
	 *         present (i.e., has been set to something) and a new android
	 *         activity will be created for the window, then a translucent theme
	 *         will be used for the activity. window transparency (opacity
	 *         values below 1) will only work in android if the activity's theme
	 *         is translucent, and we will only use a translucent theme for an
	 *         activity if you set an opacity property before opening the
	 *         window. additionally, do not use `opacity` and `fullscreen: true`
	 *         together, because translucent themes in android cannot hide the
	 *         status bar. finally, if you do set the `opacity` property, be
	 *         sure to also set a `backgroundimage` or `backgroundcolor`
	 *         property as well, unless you want the window to be completely
	 *         transparent.
	 */
	public native float getOpacity()
	/*-{
		return this.opacity;
	}-*/;

	public native void setOpacity(float value)
	/*-{
		this.opacity = value;
	}-*/;

	/**
	 * @return Array of orientation mode constants defined in [titanium.ui]
	 */
	public native Object[] getOrientationModes()
	/*-{
		return this.orientationModes;
	}-*/;

	public native void setOrientationModes(Object[] value)
	/*-{
		this.orientationModes = value;
	}-*/;

	/**
	 * @return View to show in the right nav bar area. only available in iphone.
	 * @platforms iphone, ipad
	 */
	public native Object getRightNavButton()
	/*-{
		return this.rightNavButton;
	}-*/;

	public native void setRightNavButton(Object value)
	/*-{
		this.rightNavButton = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the tab bar should be hidden. this is only
	 *         valid when the window is a child of a tab.
	 */
	public native boolean getTabBarHidden()
	/*-{
		return this.tabBarHidden;
	}-*/;

	public native void setTabBarHidden(boolean value)
	/*-{
		this.tabBarHidden = value;
	}-*/;

	/**
	 * @return Title of the window.
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
	 * @return View to show in the title area. only available in iphone.
	 * @platforms iphone, ipad
	 */
	public native Object getTitleControl()
	/*-{
		return this.titleControl;
	}-*/;

	public native void setTitleControl(Object value)
	/*-{
		this.titleControl = value;
	}-*/;

	/**
	 * @return Url to a image that show in the title area. only available in
	 *         iphone.
	 * @platforms iphone, ipad
	 */
	public native String getTitleImage()
	/*-{
		return this.titleImage;
	}-*/;

	public native void setTitleImage(String value)
	/*-{
		this.titleImage = value;
	}-*/;

	/**
	 * @return Title prompt for the window. only available in iphone.
	 */
	public native String getTitlePrompt()
	/*-{
		return this.titlePrompt;
	}-*/;

	public native void setTitlePrompt(String value)
	/*-{
		this.titlePrompt = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the titleprompt property
	 */
	public native String getTitlepromptid()
	/*-{
		return this.titlepromptid;
	}-*/;

	public native void setTitlepromptid(String value)
	/*-{
		this.titlepromptid = value;
	}-*/;

	/**
	 * @return Array of button objects to show in the toolbar of the window.
	 *         only available in iphone. this is only valid when the window is a
	 *         child of a tab.
	 * @platforms iphone, ipad
	 */
	public native Object[] getToolbar()
	/*-{
		return this.toolbar;
	}-*/;

	public native void setToolbar(Object[] value)
	/*-{
		this.toolbar = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the nav bar is translucent. only available
	 *         in iphone.
	 * @platforms iphone, ipad
	 */
	public native boolean getTranslucent()
	/*-{
		return this.translucent;
	}-*/;

	public native void setTranslucent(boolean value)
	/*-{
		this.translucent = value;
	}-*/;

	/**
	 * @return Url to a javascript file with the windows instructions. this
	 *         window will create a new javascript sub-context that will run in
	 *         its own thread and global variable space.
	 */
	public native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * @return One of ti.ui.android.soft_input_adjust_pan,
	 *         ti.ui.android.soft_input_adjust_resize, or
	 *         ti.ui.android.soft_input_adjust_unspecified. note: must be passed
	 *         in the creation options. (android only) [android doc:
	 *         window.setsoftinputmode
	 *         ](http://developer.android.com/reference/android
	 *         /view/window.html#setsoftinputmode(int))
	 * 
	 * @platforms android
	 */
	public native float getWindowSoftInputMode()
	/*-{
		return this.windowSoftInputMode;
	}-*/;

	public native void setWindowSoftInputMode(float value)
	/*-{
		this.windowSoftInputMode = value;
	}-*/;

	/**
	 * Close the window
	 * 
	 * @param options
	 *            close the window with optional animation or display properties
	 */
	public native void close(Object options)
	/*-{
		return this.close(options);
	}-*/;

	/**
	 * Open the window
	 * 
	 * @param options
	 *            open the window with optional animation or display properties
	 */
	public native void open(Object options)
	/*-{
		return this.open(options);
	}-*/;

	public native void addAndroidBackHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:back', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addAndroidCameraHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:camera', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addAndroidFocusHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addAndroidSearchHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:search', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addAndroidVoldownHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:voldown', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addAndroidVolupHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('android:volup', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addBlurHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addCloseHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('close', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addFocusHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addOpenHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('open', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}