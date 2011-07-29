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

/**
 * An image view is used to display an image or a series of images in an
 * animation. the image view is created by the method
 * {@link org.urish.gwtit.titanium.ui.createimageview}.
 * <p>
 * Notes: If you specify a `width` and/or `height` property on the image, the
 * image will be scaled to fit into this space if the image is larger.
 * 
 * @since 0.9
 */
public class ImageView extends org.urish.gwtit.titanium.ui.View {
	protected ImageView() {
	}

	/**
	 * @return Readonly boolean to indicate if the animation is animating
	 */
	public final native boolean getAnimating()
	/*-{
		return this.animating;
	}-*/;

	/**
	 * @return Allow image to scale (android)
	 */
	public final native boolean getCanScale()
	/*-{
		return this.canScale;
	}-*/;

	public final native void setCanScale(boolean value)
	/*-{
		this.canScale = value;
	}-*/;

	/**
	 * @return Number of times to retry decoding the bitmap at this url (1.7.0 /
	 *         android only. default: 5)
	 * 
	 * @platforms android
	 * @since 1.7.0
	 */
	public final native float getDecodeRetries()
	/*-{
		return this.decodeRetries;
	}-*/;

	public final native void setDecodeRetries(float value)
	/*-{
		this.decodeRetries = value;
	}-*/;

	/**
	 * @return Url to the default image to display while loading a remote image
	 */
	public final native String getDefaultImage()
	/*-{
		return this.defaultImage;
	}-*/;

	public final native void setDefaultImage(String value)
	/*-{
		this.defaultImage = value;
	}-*/;

	/**
	 * @return Amount of time in milliseconds to animate one cycle
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
	 * @return Enable zoom controls on android. default is true for backward
	 *         compatibility. (1.3.0)
	 * @platforms android
	 * @since 1.3.0
	 */
	public final native boolean getEnableZoomControls()
	/*-{
		return this.enableZoomControls;
	}-*/;

	public final native void setEnableZoomControls(boolean value)
	/*-{
		this.enableZoomControls = value;
	}-*/;

	/**
	 * @return Indicates whether or not the source image is in 2x resolution for
	 *         retina displays. use for remote images only. (ios)
	 * @platforms iphone, ipad
	 */
	public final native boolean getHires()
	/*-{
		return this.hires;
	}-*/;

	public final native void setHires(boolean value)
	/*-{
		this.hires = value;
	}-*/;

	/**
	 * @return Image to display either as string url, blob or file
	 */
	public final native Object getImage()
	/*-{
		return this.image;
	}-*/;

	public final native void setImage(Object value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return Array of images (either as string url, blob or file) to display
	 *         in an animation
	 */
	public final native Object[] getImages()
	/*-{
		return this.images;
	}-*/;

	public final native void setImages(Object[] value)
	/*-{
		this.images = value;
	}-*/;

	/**
	 * @return Readonly boolean to indicate if the animation is paused
	 */
	public final native boolean getPaused()
	/*-{
		return this.paused;
	}-*/;

	/**
	 * @return Boolean to indicate if the default image should be displaying
	 *         while loading a remote image
	 */
	public final native boolean getPreventDefaultImage()
	/*-{
		return this.preventDefaultImage;
	}-*/;

	public final native void setPreventDefaultImage(boolean value)
	/*-{
		this.preventDefaultImage = value;
	}-*/;

	/**
	 * @return Number of times to repeat the image animation
	 */
	public final native float getRepeatCount()
	/*-{
		return this.repeatCount;
	}-*/;

	public final native void setRepeatCount(float value)
	/*-{
		this.repeatCount = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the animation should happen in reverse
	 *         (from last to first)
	 */
	public final native boolean getReverse()
	/*-{
		return this.reverse;
	}-*/;

	public final native void setReverse(boolean value)
	/*-{
		this.reverse = value;
	}-*/;

	/**
	 * @return Url to the image to display (note: this property is deprecated.
	 *         use image instead)
	 */
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * Pause a started animation.
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Start the image animation. this method only works if you set multiple
	 * images
	 */
	public final native void start()
	/*-{
		return this.start();
	}-*/;

	/**
	 * Stop a started animation and reset the index to the first image
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	/**
	 * Return the image as a blob object
	 */
	public final native void toBlob()
	/*-{
		return this.toBlob();
	}-*/;

	public final static class ChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "change";

		protected ChangeEvent() {
		}

		/**
		 * the index of the image frame being displayed
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addChangeHandler(EventCallback<ChangeEvent> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class LoadEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "load";

		protected LoadEvent() {
		}

		/**
		 * either `url` to indicate the url property is loaded or `images` when
		 * all the images are loaded
		 */
		public final native Object getState()
		/*-{
			return this.state;
		}-*/;

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

	}

	public final native void addLoadHandler(EventCallback<LoadEvent> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class StartEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "start";

		protected StartEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addStartHandler(EventCallback<StartEvent> handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class StopEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "stop";

		protected StopEvent() {
		}

		/**
		 * the y point of the event, in receiving view coordinates
		 */
		public final native Object getY()
		/*-{
			return this.y;
		}-*/;

		/**
		 * a dictionary with properties x and y describing the point of the
		 * event in screen coordinates
		 */
		public final native Object getGlobalPoint()
		/*-{
			return this.globalPoint;
		}-*/;

		/**
		 * the x point of the event in receiving view coordiantes
		 */
		public final native Object getX()
		/*-{
			return this.x;
		}-*/;

	}

	public final native void addStopHandler(EventCallback<StopEvent> handler)
	/*-{
		return this.addEventListener('stop', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}