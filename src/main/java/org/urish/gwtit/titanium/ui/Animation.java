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

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

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
	public final native boolean getAutoreverse()
	/*-{
		return this.autoreverse;
	}-*/;

	public final native void setAutoreverse(boolean value)
	/*-{
		this.autoreverse = value;
	}-*/;

	/**
	 * @return Value of the backgroundcolor property to change during animation
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
	 * @return Value of the bottom property to change during animation
	 */
	public final native float getBottom()
	/*-{
		return this.bottom;
	}-*/;

	public final native void setBottom(float value)
	/*-{
		this.bottom = value;
	}-*/;

	/**
	 * @return Value of the center property to change during animation
	 */
	public final native Object getCenter()
	/*-{
		return this.center;
	}-*/;

	public final native void setCenter(Object value)
	/*-{
		this.center = value;
	}-*/;

	/**
	 * @return Value of the color property to change during animation
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
	 * @return The curve of the animation
	 */
	public final native int getCurve()
	/*-{
		return this.curve;
	}-*/;

	public final native void setCurve(int value)
	/*-{
		this.curve = value;
	}-*/;

	/**
	 * @return The duration of time in milliseconds before starting the
	 *         animation
	 */
	public final native float getDelay()
	/*-{
		return this.delay;
	}-*/;

	public final native void setDelay(float value)
	/*-{
		this.delay = value;
	}-*/;

	/**
	 * @return The duration of time in milliseconds to perform the animation
	 */
	public final native float getDuration()
	/*-{
		return this.duration;
	}-*/;

	public final native void setDuration(float value)
	/*-{
		this.duration = value;
	}-*/;

	/**
	 * @return Value of the height property to change during animation
	 */
	public final native float getHeight()
	/*-{
		return this.height;
	}-*/;

	public final native void setHeight(float value)
	/*-{
		this.height = value;
	}-*/;

	/**
	 * @return Value of the left property to change during animation
	 */
	public final native float getLeft()
	/*-{
		return this.left;
	}-*/;

	public final native void setLeft(float value)
	/*-{
		this.left = value;
	}-*/;

	/**
	 * @return Value of the opacity property to change during animation
	 */
	public final native float getOpacity()
	/*-{
		return this.opacity;
	}-*/;

	public final native void setOpacity(float value)
	/*-{
		this.opacity = value;
	}-*/;

	/**
	 * @return Value of the opaque property to change during animation
	 */
	public final native boolean getOpaque()
	/*-{
		return this.opaque;
	}-*/;

	public final native void setOpaque(boolean value)
	/*-{
		this.opaque = value;
	}-*/;

	/**
	 * @return The number of times the animation should be performed
	 */
	public final native int getRepeat()
	/*-{
		return this.repeat;
	}-*/;

	public final native void setRepeat(int value)
	/*-{
		this.repeat = value;
	}-*/;

	/**
	 * @return Value of the right property to change during animation
	 */
	public final native float getRight()
	/*-{
		return this.right;
	}-*/;

	public final native void setRight(float value)
	/*-{
		this.right = value;
	}-*/;

	/**
	 * @return Value of the top property to change during animation
	 */
	public final native float getTop()
	/*-{
		return this.top;
	}-*/;

	public final native void setTop(float value)
	/*-{
		this.top = value;
	}-*/;

	/**
	 * @return Value of the transform property to change during animation
	 */
	public final native Object getTransform()
	/*-{
		return this.transform;
	}-*/;

	public final native void setTransform(Object value)
	/*-{
		this.transform = value;
	}-*/;

	/**
	 * @return During a transition animation, this is the constant to the type
	 *         of transition to use
	 */
	public final native int getTransition()
	/*-{
		return this.transition;
	}-*/;

	public final native void setTransition(int value)
	/*-{
		this.transition = value;
	}-*/;

	/**
	 * @return Value of the visible property to change during animation
	 */
	public final native boolean getVisible()
	/*-{
		return this.visible;
	}-*/;

	public final native void setVisible(boolean value)
	/*-{
		this.visible = value;
	}-*/;

	/**
	 * @return Value of the width property to change during animation
	 */
	public final native float getWidth()
	/*-{
		return this.width;
	}-*/;

	public final native void setWidth(float value)
	/*-{
		this.width = value;
	}-*/;

	/**
	 * @return Value of the zindex property to change during animation
	 */
	public final native int getZIndex()
	/*-{
		return this.zIndex;
	}-*/;

	public final native void setZIndex(int value)
	/*-{
		this.zIndex = value;
	}-*/;

	public final static class CompleteEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "complete";

		protected CompleteEvent() {
		}

	}

	public interface CompleteHandler {
		public void onComplete(CompleteEvent event);
	}

	public final native void addCompleteHandler(CompleteHandler handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.titanium.ui.Animation.CompleteHandler::onComplete(Lorg/urish/gwtit/titanium/ui/Animation/CompleteEvent;)(e); } );
	}-*/;

	public final static class StartEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "start";

		protected StartEvent() {
		}

	}

	public interface StartHandler {
		public void onStart(StartEvent event);
	}

	public final native void addStartHandler(StartHandler handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.titanium.ui.Animation.StartHandler::onStart(Lorg/urish/gwtit/titanium/ui/Animation/StartEvent;)(e); } );
	}-*/;

}
