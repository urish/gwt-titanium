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
	public native float getAutocapitalization()
	/*-{
		return this.autocapitalization;
	}-*/;

	public native void setAutocapitalization(float value)
	/*-{
		this.autocapitalization = value;
	}-*/;

	/**
	 * @return The border style constant for the field
	 */
	public native float getBorderStyle()
	/*-{
		return this.borderStyle;
	}-*/;

	public native void setBorderStyle(float value)
	/*-{
		this.borderStyle = value;
	}-*/;

	/**
	 * @return The mode constant for how to handle displaying the clear button
	 */
	public native float getClearButtonMode()
	/*-{
		return this.clearButtonMode;
	}-*/;

	public native void setClearButtonMode(float value)
	/*-{
		this.clearButtonMode = value;
	}-*/;

	/**
	 * @return Boolean that indicates if the value of the field is cleared upon
	 *         editing
	 */
	public native boolean getClearOnEdit()
	/*-{
		return this.clearOnEdit;
	}-*/;

	public native void setClearOnEdit(boolean value)
	/*-{
		this.clearOnEdit = value;
	}-*/;

	/**
	 * @return Boolean indicating if the field is editable
	 */
	public native boolean getEditable()
	/*-{
		return this.editable;
	}-*/;

	public native void setEditable(boolean value)
	/*-{
		this.editable = value;
	}-*/;

	/**
	 * @return Boolean indicating the enabled state of the field
	 */
	public native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return The hint text to display when the field is unfocused
	 */
	public native String getHintText()
	/*-{
		return this.hintText;
	}-*/;

	public native void setHintText(String value)
	/*-{
		this.hintText = value;
	}-*/;

	/**
	 * @return Array of toolbar button objects to be used when the keyboard is
	 *         displayed
	 */
	public native Object[] getKeyboardToolbar()
	/*-{
		return this.keyboardToolbar;
	}-*/;

	public native void setKeyboardToolbar(Object[] value)
	/*-{
		this.keyboardToolbar = value;
	}-*/;

	/**
	 * @return The color of the keyboard toolbar
	 */
	public native String getKeyboardToolbarColor()
	/*-{
		return this.keyboardToolbarColor;
	}-*/;

	public native void setKeyboardToolbarColor(String value)
	/*-{
		this.keyboardToolbarColor = value;
	}-*/;

	/**
	 * @return The height of the keyboard toolbar
	 */
	public native float getKeyboardToolbarHeight()
	/*-{
		return this.keyboardToolbarHeight;
	}-*/;

	public native void setKeyboardToolbarHeight(float value)
	/*-{
		this.keyboardToolbarHeight = value;
	}-*/;

	/**
	 * @return The left button view
	 */
	public native Object getLeftButton()
	/*-{
		return this.leftButton;
	}-*/;

	public native void setLeftButton(Object value)
	/*-{
		this.leftButton = value;
	}-*/;

	/**
	 * @return The mode of the left button view
	 */
	public native float getLeftButtonMode()
	/*-{
		return this.leftButtonMode;
	}-*/;

	public native void setLeftButtonMode(float value)
	/*-{
		this.leftButtonMode = value;
	}-*/;

	/**
	 * @return The left padding of the space between the button and the edge of
	 *         the field
	 */
	public native float getLeftButtonPadding()
	/*-{
		return this.leftButtonPadding;
	}-*/;

	public native void setLeftButtonPadding(float value)
	/*-{
		this.leftButtonPadding = value;
	}-*/;

	/**
	 * @return The minimum size of the font when the font is sized based on the
	 *         contents. enables font scaling to fit
	 */
	public native float getMinimumFontSize()
	/*-{
		return this.minimumFontSize;
	}-*/;

	public native void setMinimumFontSize(float value)
	/*-{
		this.minimumFontSize = value;
	}-*/;

	/**
	 * @return The left padding of the text field
	 */
	public native float getPaddingLeft()
	/*-{
		return this.paddingLeft;
	}-*/;

	public native void setPaddingLeft(float value)
	/*-{
		this.paddingLeft = value;
	}-*/;

	/**
	 * @return The right padding of the text field
	 */
	public native float getPaddingRight()
	/*-{
		return this.paddingRight;
	}-*/;

	public native void setPaddingRight(float value)
	/*-{
		this.paddingRight = value;
	}-*/;

	/**
	 * @return The right button view
	 */
	public native Object getRightButton()
	/*-{
		return this.rightButton;
	}-*/;

	public native void setRightButton(Object value)
	/*-{
		this.rightButton = value;
	}-*/;

	/**
	 * @return The mode of the right button view
	 */
	public native float getRightButtonMode()
	/*-{
		return this.rightButtonMode;
	}-*/;

	public native void setRightButtonMode(float value)
	/*-{
		this.rightButtonMode = value;
	}-*/;

	/**
	 * @return The right padding of the space between the button and the edge of
	 *         the field
	 */
	public native float getRightButtonPadding()
	/*-{
		return this.rightButtonPadding;
	}-*/;

	public native void setRightButtonPadding(float value)
	/*-{
		this.rightButtonPadding = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the return key should be suppressed during
	 *         entry
	 */
	public native boolean getSuppressReturn()
	/*-{
		return this.suppressReturn;
	}-*/;

	public native void setSuppressReturn(boolean value)
	/*-{
		this.suppressReturn = value;
	}-*/;

	/**
	 * @return Value of the field
	 */
	public native String getValue()
	/*-{
		return this.value;
	}-*/;

	public native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public native void setVerticalAlign(float value)
	/*-{
		this.verticalAlign = value;
	}-*/;

	public native void setVerticalAlign(String value)
	/*-{
		this.verticalAlign = value;
	}-*/;

	/**
	 * @return The constant or string value for the fields vertical alignment.
	 */
	public native Object getVerticalAlign()
	/*-{
		return this.verticalAlign;
	}-*/;

	/**
	 * Force the field to lose focus
	 */
	public native void blur()
	/*-{
		return this.blur();
	}-*/;

	/**
	 * Force the field to gain focus
	 */
	public native void focus()
	/*-{
		return this.focus();
	}-*/;

	/**
	 * Return boolean (true) if the field has text
	 */
	public native void hasText()
	/*-{
		return this.hasText();
	}-*/;

	public native void addBlurHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addChangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addFocusHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addReturnHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('return', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
