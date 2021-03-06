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

import org.urish.gwtit.titanium.ui.events.CancelHandler;
import org.urish.gwtit.titanium.ui.events.SearchBarBlurHandler;
import org.urish.gwtit.titanium.ui.events.SearchBarChangeHandler;
import org.urish.gwtit.titanium.ui.events.SearchBarFocusHandler;
import org.urish.gwtit.titanium.ui.events.SearchBarReturnHandler;

/**
 * A Search Bar is created by the method
 * {@link org.urish.gwtit.titanium.ui.createSearchBar}.
 * <p>
 * Notes:
 * 
 * @since 0.8
 */
public class SearchBar extends org.urish.gwtit.titanium.ui.View {
	protected SearchBar() {
	}

	/**
	 * @return One of
	 *         {@link org.urish.gwtit.titanium.UI.TEXT_AUTOCAPITALIZATION_NONE},
	 *         {@link org.urish.gwtit.titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES}
	 *         , or
	 *         {@link org.urish.gwtit.titanium.UI.TEXT_AUTOCAPITALIZATION_ALL}
	 *         to indicate how the field should be capitalized during typing.
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
	 * @return Boolean to indicate if the text in the field should be
	 *         autocorrected as typed
	 */
	public final native boolean getAutocorrect()
	/*-{
		return this.autocorrect;
	}-*/;

	public final native void setAutocorrect(boolean value)
	/*-{
		this.autocorrect = value;
	}-*/;

	/**
	 * @return The bar color of the search bar view
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
	 * @return The text to show when the search bar field is not focused
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
	 * @return The key in the locale file to use for the hintText property
	 */
	public final native String getHinttextid()
	/*-{
		return this.hinttextid;
	}-*/;

	public final native void setHinttextid(String value)
	/*-{
		this.hinttextid = value;
	}-*/;

	/**
	 * @return The keyboard type constant to use when the field is focused
	 */
	public final native int getKeyboardType()
	/*-{
		return this.keyboardType;
	}-*/;

	public final native void setKeyboardType(int value)
	/*-{
		this.keyboardType = value;
	}-*/;

	/**
	 * @return A single line of text displayed at the top of the search bar
	 */
	public final native String getPrompt()
	/*-{
		return this.prompt;
	}-*/;

	public final native void setPrompt(String value)
	/*-{
		this.prompt = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the prompt property
	 */
	public final native String getPromptid()
	/*-{
		return this.promptid;
	}-*/;

	public final native void setPromptid(String value)
	/*-{
		this.promptid = value;
	}-*/;

	/**
	 * @return Boolean indicates whether the cancel button is displayed
	 */
	public final native boolean getShowCancel()
	/*-{
		return this.showCancel;
	}-*/;

	public final native void setShowCancel(boolean value)
	/*-{
		this.showCancel = value;
	}-*/;

	/**
	 * @return The value of the search bar
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
	 * Called to force the search bar to lose focus
	 */
	public final native void blur()
	/*-{
		return this.blur();
	}-*/;

	/**
	 * Called to force the search bar to focus
	 */
	public final native void focus()
	/*-{
		return this.focus();
	}-*/;

	public final native void addBlurHandler(SearchBarBlurHandler handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SearchBarBlurHandler::onSearchBarBlur(Lorg/urish/gwtit/titanium/ui/events/SearchBarBlurEvent;)(e); } );
	}-*/;

	public final native void addCancelHandler(CancelHandler handler)
	/*-{
		return this.addEventListener('cancel', function(e) { handler.@org.urish.gwtit.titanium.ui.events.CancelHandler::onCancel(Lorg/urish/gwtit/titanium/ui/events/CancelEvent;)(e); } );
	}-*/;

	public final native void addChangeHandler(SearchBarChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SearchBarChangeHandler::onSearchBarChange(Lorg/urish/gwtit/titanium/ui/events/SearchBarChangeEvent;)(e); } );
	}-*/;

	public final native void addFocusHandler(SearchBarFocusHandler handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SearchBarFocusHandler::onSearchBarFocus(Lorg/urish/gwtit/titanium/ui/events/SearchBarFocusEvent;)(e); } );
	}-*/;

	public final native void addReturnHandler(SearchBarReturnHandler handler)
	/*-{
		return this.addEventListener('return', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SearchBarReturnHandler::onSearchBarReturn(Lorg/urish/gwtit/titanium/ui/events/SearchBarReturnEvent;)(e); } );
	}-*/;

}
