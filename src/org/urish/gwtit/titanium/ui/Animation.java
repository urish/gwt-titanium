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
 * The animation object is used for specifying lower-level animation properties
 * and more low-level control of events during an animation. the animation is
 * created by the method {@link org.urish.gwtit.titanium.ui.createanimation}.
 * <p>
 * Notes:
 * 
 * @since 0.9
 */
public class Animation extends org.urish.gwtit.titanium.Proxy {
	protected Animation() {
	}

	/**
	 * @return The property specifies if the animation should be replayed in
	 *         reverse upon completion
	 */
	public native boolean getAutoreverse()
	/*-{
		return this.autoreverse;
	}-*/;

	public native void setAutoreverse(boolean value)
	/*-{
		this.autoreverse = value;
	}-*/;

	/**
	 * @return Value of the backgroundcolor property to change during animation
	 */
	public native String getBackgroundColor()
	/*-{
		return this.backgroundColor;
	}-*/;

	public native void setBackgroundColor(String value)
	/*-{
		this.backgroundColor = value;
	}-*/;

	/**
	 * @return Value of the bottom property to change during animation
	 */
	public native float getBottom()
	/*-{
		return this.bottom;
	}-*/;

	public native void setBottom(float value)
	/*-{
		this.bottom = value;
	}-*/;

	/**
	 * @return Value of the center property to change during animation
	 */
	public native Object getCenter()
	/*-{
		return this.center;
	}-*/;

	public native void setCenter(Object value)
	/*-{
		this.center = value;
	}-*/;

	/**
	 * @return Value of the color property to change during animation
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
	 * @return The curve of the animation
	 */
	public native float getCurve()
	/*-{
		return this.curve;
	}-*/;

	public native void setCurve(float value)
	/*-{
		this.curve = value;
	}-*/;

	/**
	 * @return The duration of time in milliseconds before starting the
	 *         animation
	 */
	public native float getDelay()
	/*-{
		return this.delay;
	}-*/;

	public native void setDelay(float value)
	/*-{
		this.delay = value;
	}-*/;

	/**
	 * @return The duration of time in milliseconds to perform the animation
	 */
	public native float getDuration()
	/*-{
		return this.duration;
	}-*/;

	public native void setDuration(float value)
	/*-{
		this.duration = value;
	}-*/;

	/**
	 * @return Value of the height property to change during animation
	 */
	public native float getHeight()
	/*-{
		return this.height;
	}-*/;

	public native void setHeight(float value)
	/*-{
		this.height = value;
	}-*/;

	/**
	 * @return Value of the left property to change during animation
	 */
	public native float getLeft()
	/*-{
		return this.left;
	}-*/;

	public native void setLeft(float value)
	/*-{
		this.left = value;
	}-*/;

	/**
	 * @return Value of the opacity property to change during animation
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
	 * @return Value of the opaque property to change during animation
	 */
	public native boolean getOpaque()
	/*-{
		return this.opaque;
	}-*/;

	public native void setOpaque(boolean value)
	/*-{
		this.opaque = value;
	}-*/;

	/**
	 * @return The number of times the animation should be performed
	 */
	public native float getRepeat()
	/*-{
		return this.repeat;
	}-*/;

	public native void setRepeat(float value)
	/*-{
		this.repeat = value;
	}-*/;

	/**
	 * @return Value of the right property to change during animation
	 */
	public native float getRight()
	/*-{
		return this.right;
	}-*/;

	public native void setRight(float value)
	/*-{
		this.right = value;
	}-*/;

	/**
	 * @return Value of the top property to change during animation
	 */
	public native float getTop()
	/*-{
		return this.top;
	}-*/;

	public native void setTop(float value)
	/*-{
		this.top = value;
	}-*/;

	/**
	 * @return Value of the transform property to change during animation
	 */
	public native Object getTransform()
	/*-{
		return this.transform;
	}-*/;

	public native void setTransform(Object value)
	/*-{
		this.transform = value;
	}-*/;

	/**
	 * @return During a transition animation, this is the constant to the type
	 *         of transition to use
	 */
	public native float getTransition()
	/*-{
		return this.transition;
	}-*/;

	public native void setTransition(float value)
	/*-{
		this.transition = value;
	}-*/;

	/**
	 * @return Value of the visible property to change during animation
	 */
	public native boolean getVisible()
	/*-{
		return this.visible;
	}-*/;

	public native void setVisible(boolean value)
	/*-{
		this.visible = value;
	}-*/;

	/**
	 * @return Value of the width property to change during animation
	 */
	public native float getWidth()
	/*-{
		return this.width;
	}-*/;

	public native void setWidth(float value)
	/*-{
		this.width = value;
	}-*/;

	/**
	 * @return Value of the zindex property to change during animation
	 */
	public native float getZIndex()
	/*-{
		return this.zIndex;
	}-*/;

	public native void setZIndex(float value)
	/*-{
		this.zIndex = value;
	}-*/;

	public native void addCompleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addStartHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
