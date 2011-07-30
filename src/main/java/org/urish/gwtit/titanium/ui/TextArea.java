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
 * A text area is created by the method
 * {@link org.urish.gwtit.titanium.ui.createtextarea}. the text area is a
 * multiline field.
 * <p>
 * Notes: Both Text Areas and Text Fields can control the buttons displayed in a
 * button bar above the keyboard when it's visible.
 * 
 * Example using a custom keyboard toolbar:
 * 
 * var textfield = Titanium.UI.createTextField({ color:'#336699', value:'Focus
 * to see keyboard w/ toolbar', height:35, width:300, top:10,
 * borderStyle:Titanium.UI.INPUT_BORDERSTYLE_ROUNDED,
 * keyboardToolbar:[flexSpace,camera, flexSpace,tf,flexSpace, send,flexSpace],
 * keyboardToolbarColor: '#999', keyboardToolbarHeight: 40, });
 * 
 * @since 0.8
 */
public class TextArea extends org.urish.gwtit.titanium.ui.View {
	protected TextArea() {
	}

	/**
	 * @return Whether or not to convert text within this area to clickable
	 *         links. ios only.
	 * @platforms iphone, ipad
	 */
	public final native int getAutoLink()
	/*-{
		return this.autoLink;
	}-*/;

	public final native void setAutoLink(int value)
	/*-{
		this.autoLink = value;
	}-*/;

	/**
	 * @return One of
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_none},
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_words}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_sentences}
	 *         , or
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_all}
	 *         to indicate how the field should be capitalized during typing.
	 *         (only android)
	 * @platforms android
	 */
	public final native int getAutocapitalization()
	/*-{
		return this.autocapitalization;
	}-*/;

	public final native void setAutocapitalization(int value)
	/*-{
		this.autocapitalization = value;
	}-*/;

	/**
	 * @return Boolean indicating if the field is editable
	 */
	public final native boolean getEditable()
	/*-{
		return this.editable;
	}-*/;

	public final native void setEditable(boolean value)
	/*-{
		this.editable = value;
	}-*/;

	/**
	 * @return Boolean indicating the enabled state of the field
	 */
	public final native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public final native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return Array of toolbar button objects to be used when the keyboard is
	 *         displayed
	 */
	public final native Object[] getKeyboardToolbar()
	/*-{
		return this.keyboardToolbar;
	}-*/;

	public final native void setKeyboardToolbar(Object[] value)
	/*-{
		this.keyboardToolbar = value;
	}-*/;

	/**
	 * @return The color of the keyboard toolbar
	 */
	public final native String getKeyboardToolbarColor()
	/*-{
		return this.keyboardToolbarColor;
	}-*/;

	public final native void setKeyboardToolbarColor(String value)
	/*-{
		this.keyboardToolbarColor = value;
	}-*/;

	/**
	 * @return The height of the keyboard toolbar
	 */
	public final native float getKeyboardToolbarHeight()
	/*-{
		return this.keyboardToolbarHeight;
	}-*/;

	public final native void setKeyboardToolbarHeight(float value)
	/*-{
		this.keyboardToolbarHeight = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the return key should be suppressed during
	 *         entry
	 */
	public final native boolean getSuppressReturn()
	/*-{
		return this.suppressReturn;
	}-*/;

	public final native void setSuppressReturn(boolean value)
	/*-{
		this.suppressReturn = value;
	}-*/;

	/**
	 * @return Value of the field
	 */
	public final native String getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * @return True (default) if textarea can be scrolled
	 */
	public final native boolean getScrollable()
	/*-{
		return this.scrollable;
	}-*/;

	public final native void setScrollable(boolean value)
	/*-{
		this.scrollable = value;
	}-*/;

	/**
	 * Force the field to lose focus
	 */
	public final native void blur()
	/*-{
		return this.blur();
	}-*/;

	/**
	 * Force the field to gain focus
	 */
	public final native void focus()
	/*-{
		return this.focus();
	}-*/;

	/**
	 * Return boolean (true) if the field has text
	 */
	public final native void hasText()
	/*-{
		return this.hasText();
	}-*/;

	public final static class BlurEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "blur";

		protected BlurEvent() {
		}

		/**
		 * the value of the field upon blur
		 */
		public final native Object getValue()
		/*-{
			return this.value;
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

	public final native void addBlurHandler(EventCallback<BlurEvent> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ChangeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "change";

		protected ChangeEvent() {
		}

		/**
		 * the value of the field upon change
		 */
		public final native Object getValue()
		/*-{
			return this.value;
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

	public final static class FocusEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "focus";

		protected FocusEvent() {
		}

		/**
		 * the value of the field upon focus
		 */
		public final native Object getValue()
		/*-{
			return this.value;
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

	public final native void addFocusHandler(EventCallback<FocusEvent> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class ReturnEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "return";

		protected ReturnEvent() {
		}

		/**
		 * the value of the field upon return
		 */
		public final native Object getValue()
		/*-{
			return this.value;
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

	public final native void addReturnHandler(EventCallback<ReturnEvent> handler)
	/*-{
		return this.addEventListener('return', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final static class SelectedEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "selected";

		protected SelectedEvent() {
		}

		/**
		 * the range of text. range is an object with the properties `location`
		 * and `length`.
		 */
		public final native Object getRange()
		/*-{
			return this.range;
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

	public final native void addSelectedHandler(EventCallback<SelectedEvent> handler)
	/*-{
		return this.addEventListener('selected', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
