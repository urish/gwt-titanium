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
 * {@link org.urish.gwtit.titanium.ui.createtextfield}. the text field is a
 * single line field.
 * <p>
 * Notes: On iPhone, the borderStyle can be set with a constant from
 * [Titanium.UI](Titanium.UI).
 * 
 * Both Text Areas and Text Fields can control the buttons displayed in a button
 * bar above the keyboard when it's visible.
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
public class TextField extends org.urish.gwtit.titanium.ui.View {
	protected TextField() {
	}

	/**
	 * @return One of
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_none},
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_words}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_sentences}
	 *         , or
	 *         {@link org.urish.gwtit.titanium.ui.text_autocapitalization_all}
	 *         to indicate how the field should be capitalized during typing.
	 */
	public final native float getAutocapitalization()
	/*-{
		return this.autocapitalization;
	}-*/;

	public final native void setAutocapitalization(float value)
	/*-{
		this.autocapitalization = value;
	}-*/;

	/**
	 * @return The border style constant for the field
	 */
	public final native float getBorderStyle()
	/*-{
		return this.borderStyle;
	}-*/;

	public final native void setBorderStyle(float value)
	/*-{
		this.borderStyle = value;
	}-*/;

	/**
	 * @return The mode constant for how to handle displaying the clear button
	 */
	public final native float getClearButtonMode()
	/*-{
		return this.clearButtonMode;
	}-*/;

	public final native void setClearButtonMode(float value)
	/*-{
		this.clearButtonMode = value;
	}-*/;

	/**
	 * @return Boolean that indicates if the value of the field is cleared upon
	 *         editing
	 */
	public final native boolean getClearOnEdit()
	/*-{
		return this.clearOnEdit;
	}-*/;

	public final native void setClearOnEdit(boolean value)
	/*-{
		this.clearOnEdit = value;
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
	 * @return The hint text to display when the field is unfocused
	 */
	public final native String getHintText()
	/*-{
		return this.hintText;
	}-*/;

	public final native void setHintText(String value)
	/*-{
		this.hintText = value;
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
	 * @return The left button view
	 */
	public final native Object getLeftButton()
	/*-{
		return this.leftButton;
	}-*/;

	public final native void setLeftButton(Object value)
	/*-{
		this.leftButton = value;
	}-*/;

	/**
	 * @return The mode of the left button view
	 */
	public final native float getLeftButtonMode()
	/*-{
		return this.leftButtonMode;
	}-*/;

	public final native void setLeftButtonMode(float value)
	/*-{
		this.leftButtonMode = value;
	}-*/;

	/**
	 * @return The left padding of the space between the button and the edge of
	 *         the field
	 */
	public final native float getLeftButtonPadding()
	/*-{
		return this.leftButtonPadding;
	}-*/;

	public final native void setLeftButtonPadding(float value)
	/*-{
		this.leftButtonPadding = value;
	}-*/;

	/**
	 * @return The minimum size of the font when the font is sized based on the
	 *         contents. enables font scaling to fit
	 */
	public final native float getMinimumFontSize()
	/*-{
		return this.minimumFontSize;
	}-*/;

	public final native void setMinimumFontSize(float value)
	/*-{
		this.minimumFontSize = value;
	}-*/;

	/**
	 * @return The left padding of the text field
	 */
	public final native float getPaddingLeft()
	/*-{
		return this.paddingLeft;
	}-*/;

	public final native void setPaddingLeft(float value)
	/*-{
		this.paddingLeft = value;
	}-*/;

	/**
	 * @return The right padding of the text field
	 */
	public final native float getPaddingRight()
	/*-{
		return this.paddingRight;
	}-*/;

	public final native void setPaddingRight(float value)
	/*-{
		this.paddingRight = value;
	}-*/;

	/**
	 * @return The right button view
	 */
	public final native Object getRightButton()
	/*-{
		return this.rightButton;
	}-*/;

	public final native void setRightButton(Object value)
	/*-{
		this.rightButton = value;
	}-*/;

	/**
	 * @return The mode of the right button view
	 */
	public final native float getRightButtonMode()
	/*-{
		return this.rightButtonMode;
	}-*/;

	public final native void setRightButtonMode(float value)
	/*-{
		this.rightButtonMode = value;
	}-*/;

	/**
	 * @return The right padding of the space between the button and the edge of
	 *         the field
	 */
	public final native float getRightButtonPadding()
	/*-{
		return this.rightButtonPadding;
	}-*/;

	public final native void setRightButtonPadding(float value)
	/*-{
		this.rightButtonPadding = value;
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

	public final native void setVerticalAlign(float value)
	/*-{
		this.verticalAlign = value;
	}-*/;

	public final native void setVerticalAlign(String value)
	/*-{
		this.verticalAlign = value;
	}-*/;

	/**
	 * @return The constant or string value for the fields vertical alignment.
	 */
	public final native Object getVerticalAlign()
	/*-{
		return this.verticalAlign;
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

	public final native void addReturnHandler(EventCallback<ReturnEvent> handler)
	/*-{
		return this.addEventListener('return', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
