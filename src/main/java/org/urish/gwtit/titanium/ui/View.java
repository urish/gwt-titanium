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
import org.urish.gwtit.titanium.ui.events.ClickHandler;
import org.urish.gwtit.titanium.ui.events.DoubleClickHandler;
import org.urish.gwtit.titanium.ui.events.DoubleTapHandler;
import org.urish.gwtit.titanium.ui.events.LongClickHandler;
import org.urish.gwtit.titanium.ui.events.LongPressHandler;
import org.urish.gwtit.titanium.ui.events.SingleTapHandler;
import org.urish.gwtit.titanium.ui.events.SwipeHandler;
import org.urish.gwtit.titanium.ui.events.TouchCancelHandler;
import org.urish.gwtit.titanium.ui.events.TouchEndHandler;
import org.urish.gwtit.titanium.ui.events.TouchMoveHandler;
import org.urish.gwtit.titanium.ui.events.TouchStartHandler;
import org.urish.gwtit.titanium.ui.events.TwoFingerTapHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The view is an empty drawing surface or container. the view is created by the
 * method {@link org.urish.gwtit.titanium.ui.createview}.
 * 
 * @since 0.9
 */
public class View extends org.urish.gwtit.titanium.Proxy {
	protected View() {
	}

	/**
	 * @return A dictionary with properties x and y to indicate the anchor point
	 *         value. anchor specifies the position by which animation should
	 *         occur. center is 0.5, 0.5
	 */
	public final native org.urish.gwtit.client.util.Point getAnchorPoint()
	/*-{
		return this.anchorPoint;
	}-*/;

	public final native void setAnchorPoint(org.urish.gwtit.client.util.Point value)
	/*-{
		this.anchorPoint = value;
	}-*/;

	/**
	 * @return Read-only object with x and y properties of where the view is
	 *         during animation
	 */
	public final native org.urish.gwtit.client.util.Point getAnimatedCenterPoint()
	/*-{
		return this.animatedCenterPoint;
	}-*/;

	public final native void setAnimatedCenterPoint(org.urish.gwtit.client.util.Point value)
	/*-{
		this.animatedCenterPoint = value;
	}-*/;

	/**
	 * @return The background color of the view
	 */
	public final native String getBackgroundColor()
	/*-{
		return this.backgroundColor;
	}-*/;

	public final native void setBackgroundColor(String value)
	/*-{
		this.backgroundColor = value;
	}-*/;

	/**
	 * @return The disabled background color of the view. (android)
	 * @platforms android
	 */
	public final native String getBackgroundDisabledColor()
	/*-{
		return this.backgroundDisabledColor;
	}-*/;

	public final native void setBackgroundDisabledColor(String value)
	/*-{
		this.backgroundDisabledColor = value;
	}-*/;

	/**
	 * @return The disabled background image url of the view. (android)
	 * @platforms android
	 */
	public final native String getBackgroundDisabledImage()
	/*-{
		return this.backgroundDisabledImage;
	}-*/;

	public final native void setBackgroundDisabledImage(String value)
	/*-{
		this.backgroundDisabledImage = value;
	}-*/;

	/**
	 * @return The focused background color of the view. focusable must be true
	 *         for normal views. (android)
	 * @platforms android
	 */
	public final native String getBackgroundFocusedColor()
	/*-{
		return this.backgroundFocusedColor;
	}-*/;

	public final native void setBackgroundFocusedColor(String value)
	/*-{
		this.backgroundFocusedColor = value;
	}-*/;

	/**
	 * @return The focused background image url of the view. focusable must be
	 *         true for normal views. (android)
	 * @platforms android
	 */
	public final native String getBackgroundFocusedImage()
	/*-{
		return this.backgroundFocusedImage;
	}-*/;

	public final native void setBackgroundFocusedImage(String value)
	/*-{
		this.backgroundFocusedImage = value;
	}-*/;

	/**
	 * @return A background gradient for the view with the properties:
	 *         type,startpoint
	 *         ,endpoint,startradius,endradius,backfillstart,backfillend,colors.
	 */
	public final native JavaScriptObject getBackgroundGradient()
	/*-{
		return this.backgroundGradient;
	}-*/;

	public final native void setBackgroundGradient(JavaScriptObject value)
	/*-{
		this.backgroundGradient = value;
	}-*/;

	/**
	 * @return The background image url of the view
	 */
	public final native String getBackgroundImage()
	/*-{
		return this.backgroundImage;
	}-*/;

	public final native void setBackgroundImage(String value)
	/*-{
		this.backgroundImage = value;
	}-*/;

	/**
	 * @return End caps specify the portion of an image that should not be
	 *         resized when an image is stretched. this technique is used to
	 *         implement buttons and other resizable image-based interface
	 *         elements. when a button with end caps is resized, the resizing
	 *         occurs only in the middle of the button, in the region between
	 *         the end caps. the end caps themselves keep their original size
	 *         and appearance. this property specifies the size of the left end
	 *         cap. the middle (stretchable) portion is assumed to be 1 pixel
	 *         wide. the right end cap is therefore computed by adding the size
	 *         of the left end cap and the middle portion together and then
	 *         subtracting that value from the width of the image
	 */
	public final native float getBackgroundLeftCap()
	/*-{
		return this.backgroundLeftCap;
	}-*/;

	public final native void setBackgroundLeftCap(float value)
	/*-{
		this.backgroundLeftCap = value;
	}-*/;

	/**
	 * @return The selected background color of the view. focusable must be true
	 *         for normal views. (android)
	 * @platforms android
	 */
	public final native String getBackgroundSelectedColor()
	/*-{
		return this.backgroundSelectedColor;
	}-*/;

	public final native void setBackgroundSelectedColor(String value)
	/*-{
		this.backgroundSelectedColor = value;
	}-*/;

	/**
	 * @return The selected background image url of the view. focusable must be
	 *         true for normal views. (android)
	 * @platforms android
	 */
	public final native String getBackgroundSelectedImage()
	/*-{
		return this.backgroundSelectedImage;
	}-*/;

	public final native void setBackgroundSelectedImage(String value)
	/*-{
		this.backgroundSelectedImage = value;
	}-*/;

	/**
	 * @return End caps specify the portion of an image that should not be
	 *         resized when an image is stretched. this technique is used to
	 *         implement buttons and other resizable image-based interface
	 *         elements. when a button with end caps is resized, the resizing
	 *         occurs only in the middle of the button, in the region between
	 *         the end caps. the end caps themselves keep their original size
	 *         and appearance. this property specifies the size of the top end
	 *         cap. the middle (stretchable) portion is assumed to be 1 pixel
	 *         wide. the bottom end cap is therefore computed by adding the size
	 *         of the top end cap and the middle portion together and then
	 *         subtracting that value from the height of the image
	 */
	public final native float getBackgroundTopCap()
	/*-{
		return this.backgroundTopCap;
	}-*/;

	public final native void setBackgroundTopCap(float value)
	/*-{
		this.backgroundTopCap = value;
	}-*/;

	/**
	 * @return The border color of the view
	 */
	public final native String getBorderColor()
	/*-{
		return this.borderColor;
	}-*/;

	public final native void setBorderColor(String value)
	/*-{
		this.borderColor = value;
	}-*/;

	/**
	 * @return The border radius of the view
	 */
	public final native float getBorderRadius()
	/*-{
		return this.borderRadius;
	}-*/;

	public final native void setBorderRadius(float value)
	/*-{
		this.borderRadius = value;
	}-*/;

	/**
	 * @return The border width of the view
	 */
	public final native float getBorderWidth()
	/*-{
		return this.borderWidth;
	}-*/;

	public final native void setBorderWidth(float value)
	/*-{
		this.borderWidth = value;
	}-*/;

	public final native void setBottom(float value)
	/*-{
		this.bottom = value;
	}-*/;

	public final native void setBottom(String value)
	/*-{
		this.bottom = value;
	}-*/;

	/**
	 * @return Property for the view bottom position. this position is relative
	 *         to the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public final native float getBottom()
	/*-{
		return this.bottom;
	}-*/;

	/**
	 * @return A dictionary with properties x and y to indicate the center of
	 *         the views position relative to the parent view
	 */
	public final native org.urish.gwtit.client.util.Point getCenter()
	/*-{
		return this.center;
	}-*/;

	public final native void setCenter(org.urish.gwtit.client.util.Point value)
	/*-{
		this.center = value;
	}-*/;

	/**
	 * @return Set true if you want a view to be focusable when navigating with
	 *         the trackball or d-pad. default: false. (android only)
	 * 
	 * @platforms android
	 */
	public final native boolean getFocusable()
	/*-{
		return this.focusable;
	}-*/;

	public final native void setFocusable(boolean value)
	/*-{
		this.focusable = value;
	}-*/;

	public final native void setHeight(float value)
	/*-{
		this.height = value;
	}-*/;

	public final native void setHeight(String value)
	/*-{
		this.height = value;
	}-*/;

	/**
	 * @return Property for the view height. can be either a float value or a
	 *         dimension string ie 'auto' (default).
	 */
	public final native float getHeight()
	/*-{
		return this.height;
	}-*/;

	public final native void setLeft(float value)
	/*-{
		this.left = value;
	}-*/;

	public final native void setLeft(String value)
	/*-{
		this.left = value;
	}-*/;

	/**
	 * @return Property for the view left position. this position is relative to
	 *         the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public final native float getLeft()
	/*-{
		return this.left;
	}-*/;

	/**
	 * @return The opacity from 0.0-1.0
	 */
	public final native float getOpacity()
	/*-{
		return this.opacity;
	}-*/;

	public final native void setOpacity(float value)
	/*-{
		this.opacity = value;
	}-*/;

	public final native void setRight(float value)
	/*-{
		this.right = value;
	}-*/;

	public final native void setRight(String value)
	/*-{
		this.right = value;
	}-*/;

	/**
	 * @return Property for the view right position. this position is relative
	 *         to the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public final native float getRight()
	/*-{
		return this.right;
	}-*/;

	/**
	 * @return The size of the view as a dictionary of width and height
	 *         properties
	 */
	public final native org.urish.gwtit.client.util.Size getSize()
	/*-{
		return this.size;
	}-*/;

	public final native void setSize(JavaScriptObject value)
	/*-{
		this.size = value;
	}-*/;

	/**
	 * @return One of titanium.ui.android.soft_keyboard_default_on_focus,
	 *         titanium.ui.android.soft_keyboard_hide_on_focus, or
	 *         titanium.ui.android.soft_keyboard_show_on_focus. (android only)
	 * @platforms android
	 */
	public final native int getSoftKeyboardOnFocus()
	/*-{
		return this.softKeyboardOnFocus;
	}-*/;

	public final native void setSoftKeyboardOnFocus(int value)
	/*-{
		this.softKeyboardOnFocus = value;
	}-*/;

	public final native void setTop(float value)
	/*-{
		this.top = value;
	}-*/;

	public final native void setTop(String value)
	/*-{
		this.top = value;
	}-*/;

	/**
	 * @return Property for the view top position. this position is relative to
	 *         the view's parent. can be either a float value or a dimension
	 *         string ie 'auto' (default).
	 */
	public final native float getTop()
	/*-{
		return this.top;
	}-*/;

	/**
	 * @return A boolean indicating if the view should receive touch events
	 *         (true, default) or forward them to peers (false)
	 */
	public final native boolean getTouchEnabled()
	/*-{
		return this.touchEnabled;
	}-*/;

	public final native void setTouchEnabled(boolean value)
	/*-{
		this.touchEnabled = value;
	}-*/;

	/**
	 * @return The transformation matrix to apply to the view
	 */
	public final native JavaScriptObject getTransform()
	/*-{
		return this.transform;
	}-*/;

	public final native void setTransform(JavaScriptObject value)
	/*-{
		this.transform = value;
	}-*/;

	/**
	 * @return A boolean of the visibility of the view
	 */
	public final native boolean getVisible()
	/*-{
		return this.visible;
	}-*/;

	public final native void setVisible(boolean value)
	/*-{
		this.visible = value;
	}-*/;

	public final native void setWidth(float value)
	/*-{
		this.width = value;
	}-*/;

	public final native void setWidth(String value)
	/*-{
		this.width = value;
	}-*/;

	/**
	 * @return Property for the view width. can be either a float value or a
	 *         dimension string ie 'auto' (default).
	 */
	public final native float getWidth()
	/*-{
		return this.width;
	}-*/;

	/**
	 * @return The z index position relative to other sibling views
	 */
	public final native int getZIndex()
	/*-{
		return this.zIndex;
	}-*/;

	public final native void setZIndex(int value)
	/*-{
		this.zIndex = value;
	}-*/;

	/**
	 * Add a child to the view hierarchy
	 * 
	 * @param view
	 *            the view to add to this views hiearchy
	 */
	public final native void add(org.urish.gwtit.titanium.ui.View view)
	/*-{
		return this.add(view);
	}-*/;

	/**
	 * Animate the view
	 * 
	 * @param obj
	 *            either a dictionary of animation properties or an Animation
	 *            object
	 */
	public final native void animate(JavaScriptObject obj, EventCallback<JavaScriptObject> callback)
	/*-{
		return this.animate(obj, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Hide the view
	 */
	public final native void hide()
	/*-{
		return this.hide();
	}-*/;

	/**
	 * Remove a previously add view from the view hiearchy
	 * 
	 * @param view
	 *            the view to remove from this views hiearchy
	 */
	public final native void remove(org.urish.gwtit.titanium.ui.View view)
	/*-{
		return this.remove(view);
	}-*/;

	/**
	 * Make the view visible
	 */
	public final native void show()
	/*-{
		return this.show();
	}-*/;

	/**
	 * Return a blob image of the rendered view
	 */
	public final native JavaScriptObject toImage()
	/*-{
		return this.toImage();
	}-*/;

	/**
	 * Return a blob image of the rendered view
	 */
	public final native JavaScriptObject toImage(EventCallback<JavaScriptObject> f)
	/*-{
		return this.toImage(function(e) { f.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	public final native void addClickHandler(ClickHandler handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.titanium.ui.events.ClickHandler::onClick(Lorg/urish/gwtit/titanium/ui/events/ClickEvent;)(e); } );
	}-*/;

	public final native void addDoubleClickHandler(DoubleClickHandler handler)
	/*-{
		return this.addEventListener('dblclick', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DoubleClickHandler::onDoubleClick(Lorg/urish/gwtit/titanium/ui/events/DoubleClickEvent;)(e); } );
	}-*/;

	public final native void addDoubleTapHandler(DoubleTapHandler handler)
	/*-{
		return this.addEventListener('doubletap', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DoubleTapHandler::onDoubleTap(Lorg/urish/gwtit/titanium/ui/events/DoubleTapEvent;)(e); } );
	}-*/;

	public final native void addLongClickHandler(LongClickHandler handler)
	/*-{
		return this.addEventListener('longclick', function(e) { handler.@org.urish.gwtit.titanium.ui.events.LongClickHandler::onLongClick(Lorg/urish/gwtit/titanium/ui/events/LongClickEvent;)(e); } );
	}-*/;

	public final native void addLongPressHandler(LongPressHandler handler)
	/*-{
		return this.addEventListener('longpress', function(e) { handler.@org.urish.gwtit.titanium.ui.events.LongPressHandler::onLongPress(Lorg/urish/gwtit/titanium/ui/events/LongPressEvent;)(e); } );
	}-*/;

	public final native void addSingleTapHandler(SingleTapHandler handler)
	/*-{
		return this.addEventListener('singletap', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SingleTapHandler::onSingleTap(Lorg/urish/gwtit/titanium/ui/events/SingleTapEvent;)(e); } );
	}-*/;

	public final native void addSwipeHandler(SwipeHandler handler)
	/*-{
		return this.addEventListener('swipe', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SwipeHandler::onSwipe(Lorg/urish/gwtit/titanium/ui/events/SwipeEvent;)(e); } );
	}-*/;

	public final native void addTouchCancelHandler(TouchCancelHandler handler)
	/*-{
		return this.addEventListener('touchcancel', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TouchCancelHandler::onTouchCancel(Lorg/urish/gwtit/titanium/ui/events/TouchCancelEvent;)(e); } );
	}-*/;

	public final native void addTouchEndHandler(TouchEndHandler handler)
	/*-{
		return this.addEventListener('touchend', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TouchEndHandler::onTouchEnd(Lorg/urish/gwtit/titanium/ui/events/TouchEndEvent;)(e); } );
	}-*/;

	public final native void addTouchMoveHandler(TouchMoveHandler handler)
	/*-{
		return this.addEventListener('touchmove', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TouchMoveHandler::onTouchMove(Lorg/urish/gwtit/titanium/ui/events/TouchMoveEvent;)(e); } );
	}-*/;

	public final native void addTouchStartHandler(TouchStartHandler handler)
	/*-{
		return this.addEventListener('touchstart', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TouchStartHandler::onTouchStart(Lorg/urish/gwtit/titanium/ui/events/TouchStartEvent;)(e); } );
	}-*/;

	public final native void addTwoFingerTapHandler(TwoFingerTapHandler handler)
	/*-{
		return this.addEventListener('twofingertap', function(e) { handler.@org.urish.gwtit.titanium.ui.events.TwoFingerTapHandler::onTwoFingerTap(Lorg/urish/gwtit/titanium/ui/events/TwoFingerTapEvent;)(e); } );
	}-*/;

}
