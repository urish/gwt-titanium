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
 * The dashboard view provides a view that supports the ability to have
 * springboard-like view of icons which can be reordered by dragging and can
 * contain multiple pages of icons in a scrollable view. the dashboard view is
 * created by the method {@link org.urish.gwtit.titanium.ui.createdashboardview}
 * .
 * 
 * @platforms iphone, ipad
 * @since 1.2
 */
public class DashboardView extends org.urish.gwtit.titanium.ui.View {
	protected DashboardView() {
	}

	/**
	 * @return An array of {@link org.urish.gwtit.titanium.ui.dashboarditem}
	 *         objects to display in the view
	 */
	public final native Object[] getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(Object[] value)
	/*-{
		this.data = value;
	}-*/;

	/**
	 * @return True (default) to wobble during edit, false to disable wobble
	 *         effect
	 */
	public final native boolean getWobble()
	/*-{
		return this.wobble;
	}-*/;

	public final native void setWobble(boolean value)
	/*-{
		this.wobble = value;
	}-*/;

	/**
	 * Put the dashboard in edit mode
	 */
	public final native void startEditing()
	/*-{
		return this.startEditing();
	}-*/;

	/**
	 * Cancel editing
	 */
	public final native void stopEditing()
	/*-{
		return this.stopEditing();
	}-*/;

	public final static class CommitEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "commit";

		protected CommitEvent() {
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

	public interface CommitHandler {
		public void onCommit(CommitEvent event);
	}

	public final native void addCommitHandler(CommitHandler handler)
	/*-{
		return this.addEventListener('commit', function(e) { handler.@org.urish.gwtit.titanium.ui.DashboardView.CommitHandler::onCommit(Lorg/urish/gwtit/titanium/ui/DashboardView/CommitEvent;)(e); } );
	}-*/;

	public final static class DeleteEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "delete";

		protected DeleteEvent() {
		}

		/**
		 * the <Titanium.UI.DashboardItem> that was deleted
		 */
		public final native Object getItem()
		/*-{
			return this.item;
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

	public interface DeleteHandler {
		public void onDelete(DeleteEvent event);
	}

	public final native void addDeleteHandler(DeleteHandler handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.titanium.ui.DashboardView.DeleteHandler::onDelete(Lorg/urish/gwtit/titanium/ui/DashboardView/DeleteEvent;)(e); } );
	}-*/;

	public final static class EditEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "edit";

		protected EditEvent() {
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

	public interface EditHandler {
		public void onEdit(EditEvent event);
	}

	public final native void addEditHandler(EditHandler handler)
	/*-{
		return this.addEventListener('edit', function(e) { handler.@org.urish.gwtit.titanium.ui.DashboardView.EditHandler::onEdit(Lorg/urish/gwtit/titanium/ui/DashboardView/EditEvent;)(e); } );
	}-*/;

	public final static class MoveEvent extends AbstractTitaniumEvent {
		public final static String NATIVE_EVENT_NAME = "move";

		protected MoveEvent() {
		}

		/**
		 * the <Titanium.UI.DashboardItem> that was moved
		 */
		public final native Object getItem()
		/*-{
			return this.item;
		}-*/;

		/**
		 * the pending data array in the new order (uncommitted)
		 */
		public final native Object getItems()
		/*-{
			return this.items;
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

	public interface MoveHandler {
		public void onMove(MoveEvent event);
	}

	public final native void addMoveHandler(MoveHandler handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.titanium.ui.DashboardView.MoveHandler::onMove(Lorg/urish/gwtit/titanium/ui/DashboardView/MoveEvent;)(e); } );
	}-*/;

}
