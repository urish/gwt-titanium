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

package org.urish.gwtit.titanium.ui.ios;

import org.urish.gwtit.client.EventCallback;

/**
 * The adview is a view for display apple iads. the view is created by the
 * method {@link org.urish.gwtit.titanium.ui.ios.createadview}.
 * 
 * @platforms iphone, ipad
 * @since 1.4
 */
public class AdView extends org.urish.gwtit.titanium.ui.View {
	protected AdView() {
	}

	/**
	 * @return Constant for 320x50 ad sizes
	 */
	public final native String getSIZE_320x50()
	/*-{
		return this.SIZE_320x50;
	}-*/;

	public final native void setSIZE_320x50(String value)
	/*-{
		this.SIZE_320x50 = value;
	}-*/;

	/**
	 * @return Constant for 480x32 ad sizes
	 */
	public final native String getSIZE_480x32()
	/*-{
		return this.SIZE_480x32;
	}-*/;

	public final native void setSIZE_480x32(String value)
	/*-{
		this.SIZE_480x32 = value;
	}-*/;

	/**
	 * A banner view action can cover your application's user interface.
	 * however, your application continues to run, and receives events normally.
	 * if your application receives an event that requires the user's attention,
	 * it can programmatically cancel the action and uncover its interface by
	 * calling cancelaction. canceling actions frequently can cause a loss of
	 * revenue for your application.
	 */
	public final native void cancelAction()
	/*-{
		return this.cancelAction();
	}-*/;

	public final class ActionEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "action";

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

	public final native void addActionHandler(EventCallback<ActionEvent> handler)
	/*-{
		return this.addEventListener('action', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class ErrorEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "error";

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
		 * the error message
		 */
		public final native Object getMessage()
		/*-{
			return this.message;
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

	public final native void addErrorHandler(EventCallback<ErrorEvent> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class LoadEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "load";

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

	public final native void addLoadHandler(EventCallback<LoadEvent> handler)
	/*-{
		return this.addEventListener('load', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
