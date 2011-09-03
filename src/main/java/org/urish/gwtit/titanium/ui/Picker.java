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

import org.urish.gwtit.titanium.ui.events.PickerChangeHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Picker is created by the method
 * [Titanium.UI.createPicker](Titanium.UI.createPicker). A Picker can be used to
 * select one or more fixed values.
 * <p>
 * Notes: For Android, note the `useSpinner` property above. By default, when
 * you create a picker you will get Android's native picker control, which looks
 * more like the classic "dropdown" widget. If you'd prefer to use something
 * that looks more like iOS's picker -- which looks like one or more spinning
 * wheels --, you can set `useSpinner: true`.
 * 
 * Titanium's Android picker control (both the native and the `useSpinner`
 * variety) does not support/display views that are added to picker rows. Only
 * the `title` of the row will be displayed within the control. Titanium for
 * Android does not support the DateTime or Count Down Timer picker type.
 * 
 * @since 0.8
 */
public class Picker extends org.urish.gwtit.titanium.Proxy {
	protected Picker() {
	}

	/**
	 * @return Array of column values
	 */
	public final native JavaScriptObject[] getColumns()
	/*-{
		return this.columns;
	}-*/;

	public final native void setColumns(JavaScriptObject[] value)
	/*-{
		this.columns = value;
	}-*/;

	/**
	 * @return The duration value in milliseconds for count down timer pickers.
	 *         (Note that Titanium's Android implementation does not support the
	 *         countdown timer.)
	 */
	public final native double getCountDownDuration()
	/*-{
		return this.countDownDuration;
	}-*/;

	public final native void setCountDownDuration(double value)
	/*-{
		this.countDownDuration = value;
	}-*/;

	/**
	 * @return (applicable only to the
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_TIME} picker.) If
	 *         true, a 24-hour cloc will be used, with hours 0 through 23. If
	 *         false, a 12-hour clock will be used, with hours 1 through 12 and
	 *         am/pm controls. For reasons of backward compatibility, the
	 *         default value depends on the type of time picker being used. For
	 *         the native time picker (when "useSpinner" is either un-set or
	 *         false), the default is false. For the spinner-style time picker,
	 *         the default is true.
	 * @platforms android
	 */
	public final native boolean getFormat24()
	/*-{
		return this.format24;
	}-*/;

	public final native void setFormat24(boolean value)
	/*-{
		this.format24 = value;
	}-*/;

	/**
	 * @return The locale used for displaying Date/Time pickers values
	 */
	public final native String getLocale()
	/*-{
		return this.locale;
	}-*/;

	public final native void setLocale(String value)
	/*-{
		this.locale = value;
	}-*/;

	/**
	 * @return The minimum Date/Time for value for date pickers
	 */
	public final native java.util.Date getMinDate()
	/*-{
		return this.minDate;
	}-*/;

	public final native void setMinDate(java.util.Date value)
	/*-{
		this.minDate = value;
	}-*/;

	/**
	 * @return Property to set the interval displayed by the minutes wheel (for
	 *         example, 15 minutes). The interval value must be evenly divided
	 *         into 60; if it is not, the default value is used. The default and
	 *         minimum values are 1; the maximum value is 30. (Not currently
	 *         supported on Android.)
	 */
	public final native int getMinuteInterval()
	/*-{
		return this.minuteInterval;
	}-*/;

	public final native void setMinuteInterval(int value)
	/*-{
		this.minuteInterval = value;
	}-*/;

	/**
	 * @return For basic picker, boolean value to indicate whether the visual
	 *         selection style is shown. On the iPhone, this is a blue selected
	 *         bar.
	 */
	public final native boolean getSelectionIndicator()
	/*-{
		return this.selectionIndicator;
	}-*/;

	public final native void setSelectionIndicator(boolean value)
	/*-{
		this.selectionIndicator = value;
	}-*/;

	/**
	 * @return The type constant for the picker. One of
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_PLAIN} (default),
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_DATE_AND_TIME},
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_DATE},
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_TIME} or
	 *         {@link org.urish.gwtit.titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER}.
	 *         (Note that Titanium's Android implementation does not support the
	 *         countdown timer or date+time varieties.)
	 */
	public final native int getType()
	/*-{
		return this.type;
	}-*/;

	public final native void setType(int value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * @default False
	 * @return An indicator that you wish to use a non-native Android control
	 *         that looks and behaves more like the iOS picker in the sense that
	 *         the user selects values by spinning a wheel. (The native Android
	 *         spinner is more like a conventional "dropdown".) Note that this
	 *         option works both plain pickers, date pickers and time pickers.
	 *         Set it preferably immediately when creating the picker, i.e.,
	 *         {@link
	 *         org.urish.gwtit.titanium.ui.createPicker( useSpinner:true});},
	 *         but definitely before `.add()`ing the picker to its parent.
	 * @platforms android
	 */
	public final native boolean getUseSpinner()
	/*-{
		return this.useSpinner;
	}-*/;

	public final native void setUseSpinner(boolean value)
	/*-{
		this.useSpinner = value;
	}-*/;

	/**
	 * @return The Date/Time value for date pickers
	 */
	public final native java.util.Date getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(java.util.Date value)
	/*-{
		this.value = value;
	}-*/;

	/**
	 * @return This is relevant only if you set `useSpinner` to `true`, and it
	 *         is relevant only for the plain picker (not date/time). By
	 *         default, the spinner-style Android picker will show 5 rows: the
	 *         one in the middle which is selected, and then 2 above and below.
	 *         You can set this to allow more (use an odd number to be sure the
	 *         selected row is in the middle.)
	 * 
	 * @platforms android
	 */
	public final native int getVisibleItems()
	/*-{
		return this.visibleItems;
	}-*/;

	public final native void setVisibleItems(int value)
	/*-{
		this.visibleItems = value;
	}-*/;

	/**
	 * Add an array of rows, a single row or a column to the picker
	 * 
	 * @param data
	 *            add an array of rows, a single row or a column to the picker
	 */
	public final native void add(Object data)
	/*-{
		return this.add(data);
	}-*/;

	/**
	 * Get the selected row object for column
	 * 
	 * @param index
	 *            for the column index, return the row object or nil if not
	 *            found
	 */
	public final native JavaScriptObject getSelectedRow(int index)
	/*-{
		return this.getSelectedRow(index);
	}-*/;

	/**
	 * Causes the picker to reload the values from the new column.
	 * 
	 * @param column
	 *            new column to load
	 */
	public final native void reloadColumn(JavaScriptObject column)
	/*-{
		return this.reloadColumn(column);
	}-*/;

	/**
	 * Set the column's row to the selected state
	 * 
	 * @param column
	 *            the column index
	 * @param row
	 *            the row index
	 * @param animated
	 *            boolean to indicate if the selection should be animated
	 *            (default) (optional)
	 */
	public final native void setSelectedRow(int column, int row, boolean animated)
	/*-{
		return this.setSelectedRow(column, row, animated);
	}-*/;

	public final native void addChangeHandler(PickerChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.ui.events.PickerChangeHandler::onPickerChange(Lorg/urish/gwtit/titanium/ui/events/PickerChangeEvent;)(e); } );
	}-*/;

}
