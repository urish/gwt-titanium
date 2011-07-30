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
 * The tab group allows you to manage a tabbed ui of one or more windows. the
 * tab group is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtabgroup}.
 * <p>
 * Notes: Note that when opening a tab group, if one or more of its tabs have
 * been set 'active' prior to opening, or if setActiveTab() has been called
 * while a tab is 'active', the result of which tab is initially selected is
 * undefined.
 * 
 * @since 0.9
 */
public class TabGroup extends org.urish.gwtit.titanium.ui.View {
	protected TabGroup() {
	}

	/**
	 * @return The active tab
	 */
	public final native Object getActiveTab()
	/*-{
		return this.activeTab;
	}-*/;

	public final native void setActiveTab(Object value)
	/*-{
		this.activeTab = value;
	}-*/;

	/**
	 * @return Whether or not the user can configure the tab group via the
	 *         'more' tab's edit functionality. iphone/ipad only
	 * @platforms iphone, ipad
	 */
	public final native boolean getAllowUserCustomization()
	/*-{
		return this.allowUserCustomization;
	}-*/;

	public final native void setAllowUserCustomization(boolean value)
	/*-{
		this.allowUserCustomization = value;
	}-*/;

	/**
	 * @return The default navigation bar color (typically for the "more" tab)
	 */
	public final native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public final native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return The title for the 'more' tab edit button. iphone/ipad only
	 * @platforms iphone, ipad
	 */
	public final native String getEditButtonTitle()
	/*-{
		return this.editButtonTitle;
	}-*/;

	public final native void setEditButtonTitle(String value)
	/*-{
		this.editButtonTitle = value;
	}-*/;

	/**
	 * @return Array of tab objects that are managed by the tab group
	 */
	public final native Object[] getTabs()
	/*-{
		return this.tabs;
	}-*/;

	public final native void setTabs(Object[] value)
	/*-{
		this.tabs = value;
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
	public final native int getWindowSoftInputMode()
	/*-{
		return this.windowSoftInputMode;
	}-*/;

	public final native void setWindowSoftInputMode(int value)
	/*-{
		this.windowSoftInputMode = value;
	}-*/;

	/**
	 * Add a tab to the tab group
	 * 
	 * @param tab
	 *            The tab to add
	 */
	public final native void addTab(org.urish.gwtit.titanium.ui.Tab tab)
	/*-{
		return this.addTab(tab);
	}-*/;

	/**
	 * Close the tab group and remove it from the ui
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Open the tab group and make it visible
	 */
	public final native void open()
	/*-{
		return this.open();
	}-*/;

	/**
	 * Remove a tab from the tab group
	 */
	public final native void removeTab()
	/*-{
		return this.removeTab();
	}-*/;

	public final static class BlurEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "blur";

		protected BlurEvent() {
		}

		/**
		 * the tab index
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
		}-*/;

		/**
		 * the previous tab index
		 */
		public final native Object getPreviousIndex()
		/*-{
			return this.previousIndex;
		}-*/;

		/**
		 * the tab object
		 */
		public final native Object getTab()
		/*-{
			return this.tab;
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

		/**
		 * the previous tab object
		 */
		public final native Object getPreviousTab()
		/*-{
			return this.previousTab;
		}-*/;

	}

	public final native void addBlurHandler(EventCallback<BlurEvent> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class CloseEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "close";

		protected CloseEvent() {
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

	public final native void addCloseHandler(EventCallback<CloseEvent> handler)
	/*-{
		return this.addEventListener('close', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class FocusEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "focus";

		protected FocusEvent() {
		}

		/**
		 * the tab index
		 */
		public final native Object getIndex()
		/*-{
			return this.index;
		}-*/;

		/**
		 * the previous tab index
		 */
		public final native Object getPreviousIndex()
		/*-{
			return this.previousIndex;
		}-*/;

		/**
		 * the tab object
		 */
		public final native Object getTab()
		/*-{
			return this.tab;
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

		/**
		 * the previous tab object
		 */
		public final native Object getPreviousTab()
		/*-{
			return this.previousTab;
		}-*/;

	}

	public final native void addFocusHandler(EventCallback<FocusEvent> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class OpenEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "open";

		protected OpenEvent() {
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

	public final native void addOpenHandler(EventCallback<OpenEvent> handler)
	/*-{
		return this.addEventListener('open', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
