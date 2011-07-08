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


/**
 * A label is created by the method
 * {@link org.urish.gwtit.titanium.ui.createlabel}.
 * 
 * @since 0.8
 */
public class Label extends org.urish.gwtit.titanium.ui.View {
	protected Label() {
	}

	/**
	 * @return One of ti.ui.android.linkify constants. automatically create
	 *         clickable links for the specified type. (android only)
	 * @platforms android
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
	 * @return The number of pixels to extend the background image past the
	 *         label on the bottom
	 */
	public native float getBackgroundPaddingBottom()
	/*-{
		return this.backgroundPaddingBottom;
	}-*/;

	public native void setBackgroundPaddingBottom(float value)
	/*-{
		this.backgroundPaddingBottom = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the left
	 */
	public native float getBackgroundPaddingLeft()
	/*-{
		return this.backgroundPaddingLeft;
	}-*/;

	public native void setBackgroundPaddingLeft(float value)
	/*-{
		this.backgroundPaddingLeft = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the right
	 */
	public native float getBackgroundPaddingRight()
	/*-{
		return this.backgroundPaddingRight;
	}-*/;

	public native void setBackgroundPaddingRight(float value)
	/*-{
		this.backgroundPaddingRight = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the top
	 */
	public native float getBackgroundPaddingTop()
	/*-{
		return this.backgroundPaddingTop;
	}-*/;

	public native void setBackgroundPaddingTop(float value)
	/*-{
		this.backgroundPaddingTop = value;
	}-*/;

	/**
	 * @return The color of the label
	 */
	public native String getColor()
	/*-{
		return this.color;
	}-*/;

	public native void setColor(String value)
	/*-{
		this.color = value;
	}-*/;

	/**
	 * @return Turn on/off the addition of ellipses at the end of the label if
	 *         the text is too large to fit. (android only, default false)
	 * @platforms android
	 */
	public native boolean getEllipsize()
	/*-{
		return this.ellipsize;
	}-*/;

	public native void setEllipsize(boolean value)
	/*-{
		this.ellipsize = value;
	}-*/;

	/**
	 * @return The label font object properties
	 */
	public native Object getFont()
	/*-{
		return this.font;
	}-*/;

	public native void setFont(Object value)
	/*-{
		this.font = value;
	}-*/;

	/**
	 * @return The color of the label when in the highlighted state
	 */
	public native String getHighlightedColor()
	/*-{
		return this.highlightedColor;
	}-*/;

	public native void setHighlightedColor(String value)
	/*-{
		this.highlightedColor = value;
	}-*/;

	/**
	 * @return Simple html formatting. (android only)
	 * @platforms android
	 */
	public native String getHtml()
	/*-{
		return this.html;
	}-*/;

	public native void setHtml(String value)
	/*-{
		this.html = value;
	}-*/;

	/**
	 * @return The minimum size of the font when the font is sized based on the
	 *         contents. enables font scaling to fit and forces the label
	 *         content to be limited to a single line
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
	 * @return The text shadow color
	 */
	public native String getShadowColor()
	/*-{
		return this.shadowColor;
	}-*/;

	public native void setShadowColor(String value)
	/*-{
		this.shadowColor = value;
	}-*/;

	/**
	 * @return The shadow offset as a dictionary with the properties `x` and `y`
	 */
	public native Object getShadowOffset()
	/*-{
		return this.shadowOffset;
	}-*/;

	public native void setShadowOffset(Object value)
	/*-{
		this.shadowOffset = value;
	}-*/;

	/**
	 * @return The text of the label
	 */
	public native String getText()
	/*-{
		return this.text;
	}-*/;

	public native void setText(String value)
	/*-{
		this.text = value;
	}-*/;

	public native void setTextAlign(String value)
	/*-{
		this.textAlign = value;
	}-*/;

	public native void setTextAlign(float value)
	/*-{
		this.textAlign = value;
	}-*/;

	/**
	 * @return The alignment constant or string value such as `left`, `center`
	 *         or `right`
	 */
	public native Object getTextAlign()
	/*-{
		return this.textAlign;
	}-*/;

	/**
	 * @return The key in the locale file to use for the text property
	 */
	public native String getTextid()
	/*-{
		return this.textid;
	}-*/;

	public native void setTextid(String value)
	/*-{
		this.textid = value;
	}-*/;

	/**
	 * @return Turn on/off word wrapping in the label. (android only - default
	 *         true)
	 * @platforms android
	 */
	public native boolean getWordWrap()
	/*-{
		return this.wordWrap;
	}-*/;

	public native void setWordWrap(boolean value)
	/*-{
		this.wordWrap = value;
	}-*/;

}
