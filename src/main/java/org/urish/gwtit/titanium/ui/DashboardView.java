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

import org.urish.gwtit.titanium.ui.events.CommitHandler;
import org.urish.gwtit.titanium.ui.events.DashboardViewDeleteHandler;
import org.urish.gwtit.titanium.ui.events.DashboardViewMoveHandler;
import org.urish.gwtit.titanium.ui.events.EditHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Dashboard View provides a view that supports the ability to have
 * Springboard-like view of icons which can be reordered by dragging and can
 * contain multiple pages of icons in a scrollable view. The Dashboard View is
 * created by the method {@link org.urish.gwtit.titanium.ui.createDashboardView}
 * .
 * 
 * @platforms iphone, ipad
 * @since 1.2
 */
public class DashboardView extends org.urish.gwtit.titanium.ui.View {
	protected DashboardView() {
	}

	/**
	 * @return An array of {@link org.urish.gwtit.titanium.ui.DashboardItem}
	 *         objects to display in the view
	 */
	public final native JavaScriptObject[] getData()
	/*-{
		return this.data;
	}-*/;

	public final native void setData(JavaScriptObject[] value)
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

	public final native void addCommitHandler(CommitHandler handler)
	/*-{
		return this.addEventListener('commit', function(e) { handler.@org.urish.gwtit.titanium.ui.events.CommitHandler::onCommit(Lorg/urish/gwtit/titanium/ui/events/CommitEvent;)(e); } );
	}-*/;

	public final native void addDeleteHandler(DashboardViewDeleteHandler handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DashboardViewDeleteHandler::onDashboardViewDelete(Lorg/urish/gwtit/titanium/ui/events/DashboardViewDeleteEvent;)(e); } );
	}-*/;

	public final native void addEditHandler(EditHandler handler)
	/*-{
		return this.addEventListener('edit', function(e) { handler.@org.urish.gwtit.titanium.ui.events.EditHandler::onEdit(Lorg/urish/gwtit/titanium/ui/events/EditEvent;)(e); } );
	}-*/;

	public final native void addMoveHandler(DashboardViewMoveHandler handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.titanium.ui.events.DashboardViewMoveHandler::onDashboardViewMove(Lorg/urish/gwtit/titanium/ui/events/DashboardViewMoveEvent;)(e); } );
	}-*/;

}
