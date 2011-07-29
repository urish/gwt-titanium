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
 * A tableview row object created by the method
 * {@link org.urish.gwtit.titanium.ui.createtableviewrow}.
 * <p>
 * Notes: Make sure you set the tableClass on each row instance if using more
 * than one type of row layout. You can use the same value for each instance of
 * a row where the layout is the same - even if the value of the elements inside
 * the row have different values. For example, if the text is the only thing
 * different between two cells but the layout is the same, both row instances
 * should have the same value for tableClass.
 * 
 * You can listen for table row events on all rows by adding an event listener
 * to the table view instance. Events automatically propagate to parent views.
 * 
 * @since 0.9
 */
public class TableViewRow extends org.urish.gwtit.titanium.ui.View {
	protected TableViewRow() {
	}

	/**
	 * @return The class name of the table. each table view cell must have a
	 *         unique class name if the cell layout is different. however, use
	 *         the same name for rows that have the same structural layout (even
	 *         if the content is different) to provide maximum rendering
	 *         performance.
	 */
	public final native String getClassName()
	/*-{
		return this.className;
	}-*/;

	public final native void setClassName(String value)
	/*-{
		this.className = value;
	}-*/;

	/**
	 * @return Default color of the row when not selected
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
	 * @return Render a system provided check mark in the right image area of
	 *         the row cell
	 */
	public final native boolean getHasCheck()
	/*-{
		return this.hasCheck;
	}-*/;

	public final native void setHasCheck(boolean value)
	/*-{
		this.hasCheck = value;
	}-*/;

	/**
	 * @return Render a system provided right arrow in the right image area of
	 *         the row cell
	 */
	public final native boolean getHasChild()
	/*-{
		return this.hasChild;
	}-*/;

	public final native void setHasChild(boolean value)
	/*-{
		this.hasChild = value;
	}-*/;

	/**
	 * @return Render a system provided blue indicator icon in the right image
	 *         area of the row cell
	 */
	public final native boolean getHasDetail()
	/*-{
		return this.hasDetail;
	}-*/;

	public final native void setHasDetail(boolean value)
	/*-{
		this.hasDetail = value;
	}-*/;

	/**
	 * @return The indention level for the cell (defaults to 0)
	 */
	public final native float getIndentionLevel()
	/*-{
		return this.indentionLevel;
	}-*/;

	public final native void setIndentionLevel(float value)
	/*-{
		this.indentionLevel = value;
	}-*/;

	/**
	 * @return The layout algorithm to use for the layout. either absolute
	 *         (default) or vertical.
	 */
	public final native String getLayout()
	/*-{
		return this.layout;
	}-*/;

	public final native void setLayout(String value)
	/*-{
		this.layout = value;
	}-*/;

	/**
	 * @return Image url to render in the left image area of the row cell
	 */
	public final native String getLeftImage()
	/*-{
		return this.leftImage;
	}-*/;

	public final native void setLeftImage(String value)
	/*-{
		this.leftImage = value;
	}-*/;

	/**
	 * @return Image url to render in the right image area of the row cell
	 */
	public final native String getRightImage()
	/*-{
		return this.rightImage;
	}-*/;

	public final native void setRightImage(String value)
	/*-{
		this.rightImage = value;
	}-*/;

	/**
	 * @return The background color to render when the row cell is selected
	 */
	public final native String getSelectedBackgroundColor()
	/*-{
		return this.selectedBackgroundColor;
	}-*/;

	public final native void setSelectedBackgroundColor(String value)
	/*-{
		this.selectedBackgroundColor = value;
	}-*/;

	/**
	 * @return The background image to render when the row cell is selected
	 */
	public final native String getSelectedBackgroundImage()
	/*-{
		return this.selectedBackgroundImage;
	}-*/;

	public final native void setSelectedBackgroundImage(String value)
	/*-{
		this.selectedBackgroundImage = value;
	}-*/;

	/**
	 * @return Color of the row during selection
	 */
	public final native String getSelectedColor()
	/*-{
		return this.selectedColor;
	}-*/;

	public final native void setSelectedColor(String value)
	/*-{
		this.selectedColor = value;
	}-*/;

	/**
	 * @return A selection style constant to control the selection color. for
	 *         iphone, use the constants from
	 *         titanium.ui.iphone.tableviewcellselectionstyle
	 */
	public final native float getSelectionStyle()
	/*-{
		return this.selectionStyle;
	}-*/;

	public final native void setSelectionStyle(float value)
	/*-{
		this.selectionStyle = value;
	}-*/;

	/**
	 * @return The title cell value. do not specify if using views as children
	 *         of the row
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

}