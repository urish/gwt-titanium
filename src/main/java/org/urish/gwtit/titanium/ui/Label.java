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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Label is created by the method
 * {@link org.urish.gwtit.titanium.ui.createLabel}.
 * 
 * @since 0.8
 */
public class Label extends org.urish.gwtit.titanium.ui.View {
	protected Label() {
	}

	/**
	 * @return One of Ti.UI.Android.LINKIFY constants. Automatically create
	 *         clickable links for the specified type. (Android Only)
	 * @platforms android
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
	 * @return The number of pixels to extend the background image past the
	 *         label on the bottom
	 */
	public final native int getBackgroundPaddingBottom()
	/*-{
		return this.backgroundPaddingBottom;
	}-*/;

	public final native void setBackgroundPaddingBottom(int value)
	/*-{
		this.backgroundPaddingBottom = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the left
	 */
	public final native int getBackgroundPaddingLeft()
	/*-{
		return this.backgroundPaddingLeft;
	}-*/;

	public final native void setBackgroundPaddingLeft(int value)
	/*-{
		this.backgroundPaddingLeft = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the right
	 */
	public final native int getBackgroundPaddingRight()
	/*-{
		return this.backgroundPaddingRight;
	}-*/;

	public final native void setBackgroundPaddingRight(int value)
	/*-{
		this.backgroundPaddingRight = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the top
	 */
	public final native int getBackgroundPaddingTop()
	/*-{
		return this.backgroundPaddingTop;
	}-*/;

	public final native void setBackgroundPaddingTop(int value)
	/*-{
		this.backgroundPaddingTop = value;
	}-*/;

	/**
	 * @return The color of the label
	 */
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	public final native void setColor(String value)
	/*-{
		this.color = value;
	}-*/;

	/**
	 * @default False
	 * @return Turn on/off the addition of ellipses at the end of the label if
	 *         the text is too large to fit. (Android Only, default false)
	 * @platforms android
	 */
	public final native boolean getEllipsize()
	/*-{
		return this.ellipsize;
	}-*/;

	public final native void setEllipsize(boolean value)
	/*-{
		this.ellipsize = value;
	}-*/;

	/**
	 * @return The label font object properties
	 */
	public final native org.urish.gwtit.client.font.Font getFont()
	/*-{
		return this.font;
	}-*/;

	public final native void setFont(org.urish.gwtit.client.font.Font value)
	/*-{
		this.font = value;
	}-*/;

	/**
	 * @return The color of the label when in the highlighted state
	 */
	public final native String getHighlightedColor()
	/*-{
		return this.highlightedColor;
	}-*/;

	public final native void setHighlightedColor(String value)
	/*-{
		this.highlightedColor = value;
	}-*/;

	/**
	 * @return Simple html formatting. (Android Only)
	 * @platforms android
	 */
	public final native String getHtml()
	/*-{
		return this.html;
	}-*/;

	public final native void setHtml(String value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return The minimum size of the font when the font is sized based on the
	 *         contents. Enables font scaling to fit and forces the label
	 *         content to be limited to a single line
	 */
	public final native int getMinimumFontSize()
	/*-{
		return this.minimumFontSize;
	}-*/;

	public final native void setMinimumFontSize(int value)
	/*-{
		this.minimumFontSize = value;
	}-*/;

	/**
	 * @return The text shadow color
	 */
	public final native String getShadowColor()
	/*-{
		return this.shadowColor;
	}-*/;

	public final native void setShadowColor(String value)
	/*-{
		this.shadowColor = value;
	}-*/;

	/**
	 * @return The shadow offset as a dictionary with the properties `x` and `y`
	 */
	public final native JavaScriptObject getShadowOffset()
	/*-{
		return this.shadowOffset;
	}-*/;

	public final native void setShadowOffset(JavaScriptObject value)
	/*-{
		this.shadowOffset = value;
	}-*/;

	/**
	 * @return The text of the label
	 */
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	public final native void setText(String value)
	/*-{
		this.text = value;
	}-*/;

	public final native void setTextAlign(String value)
	/*-{
		this.textAlign = value;
	}-*/;

	public final native void setTextAlign(float value)
	/*-{
		this.textAlign = value;
	}-*/;

	/**
	 * @return The alignment constant or string value such as `left`, `center`
	 *         or `right`
	 */
	public final native JavaScriptObject getTextAlign()
	/*-{
		return this.textAlign;
	}-*/;

	/**
	 * @return The key in the locale file to use for the text property
	 */
	public final native String getTextid()
	/*-{
		return this.textid;
	}-*/;

	public final native void setTextid(String value)
	/*-{
		this.textid = value;
	}-*/;

	/**
	 * @default True
	 * @return Turn on/off word wrapping in the label. (Android Only - default
	 *         true)
	 * @platforms android
	 */
	public final native boolean getWordWrap()
	/*-{
		return this.wordWrap;
	}-*/;

	public final native void setWordWrap(boolean value)
	/*-{
		this.wordWrap = value;
	}-*/;

}
