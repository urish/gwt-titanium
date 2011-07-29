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
 * An item that represents a visual icon in the
 * {@link org.urish.gwtit.titanium.ui.dashboardview}. the dashboard item is
 * created by the method {@link org.urish.gwtit.titanium.ui.createdashboarditem}
 * .
 * 
 * @platforms iphone, ipad
 * @since 1.2
 */
public class DashboardItem extends org.urish.gwtit.titanium.Proxy {
	protected DashboardItem() {
	}

	/**
	 * @return The badge value or `0` to remove the badge
	 */
	public final native float getBadge()
	/*-{
		return this.badge;
	}-*/;

	public final native void setBadge(float value)
	/*-{
		this.badge = value;
	}-*/;

	/**
	 * @return A boolean to indicate if this item can be deleted when it edit
	 *         mode
	 */
	public final native boolean getCanDelete()
	/*-{
		return this.canDelete;
	}-*/;

	public final native void setCanDelete(boolean value)
	/*-{
		this.canDelete = value;
	}-*/;

	/**
	 * @return The url to the image
	 */
	public final native String getImage()
	/*-{
		return this.image;
	}-*/;

	public final native void setImage(String value)
	/*-{
		this.image = value;
	}-*/;

	/**
	 * @return The url to the image to display when the item is depressed
	 *         (clicked)
	 */
	public final native String getSelectedImage()
	/*-{
		return this.selectedImage;
	}-*/;

	public final native void setSelectedImage(String value)
	/*-{
		this.selectedImage = value;
	}-*/;

	public final static class ClickEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "click";

		protected ClickEvent() {
		}

		/**
		 * the location object with the properties `x` and `y` of where in the
		 * parent view the click was
		 */
		public final native Object getLocation()
		/*-{
			return this.location;
		}-*/;

		/**
		 * the <Titanium.UI.DashboardItem> that was clicked
		 */
		public final native Object getItem()
		/*-{
			return this.item;
		}-*/;

	}

	public final native void addClickHandler(EventCallback<ClickEvent> handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class DeleteEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "delete";

		protected DeleteEvent() {
		}

		/**
		 * the <Titanium.UI.DashboardItem> that was deleted
		 */
		public final native Object getItem()
		/*-{
			return this.item;
		}-*/;

	}

	public final native void addDeleteHandler(EventCallback<DeleteEvent> handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class MoveEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "move";

		protected MoveEvent() {
		}

		/**
		 * the pending data array in the new order (uncommitted)
		 */
		public final native Object getItems()
		/*-{
			return this.items;
		}-*/;

		/**
		 * the <Titanium.UI.DashboardItem> that was moved
		 */
		public final native Object getItem()
		/*-{
			return this.item;
		}-*/;

	}

	public final native void addMoveHandler(EventCallback<MoveEvent> handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}