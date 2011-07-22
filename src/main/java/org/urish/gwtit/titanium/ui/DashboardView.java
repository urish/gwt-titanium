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

	public final native void addCommitHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('commit', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addDeleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('delete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addEditHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('edit', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final native void addMoveHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('move', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
