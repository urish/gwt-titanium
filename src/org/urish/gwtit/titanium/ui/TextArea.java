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
	public native float getAutoLink()
	/*-{
		return this.autoLink;
	}-*/;

	public native void setAutoLink(float value)
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
	public native float getAutocapitalization()
	/*-{
		return this.autocapitalization;
	}-*/;

	public native void setAutocapitalization(float value)
	/*-{
		this.autocapitalization = value;
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

	public native void addSelectedHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('selected', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
