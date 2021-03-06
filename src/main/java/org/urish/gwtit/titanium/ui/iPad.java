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
 * The iPad specific UI capabilities. All properties, methods and events in this
 * namespace will only work on the Apple iPad related devices. To develop for
 * iPad, you will need the Apple iPhone SDK 3.2 or later and Titanium Mobile SDK
 * 1.2 or later. For iPad UI programming guidelines, please review the [iPad
 * Human Interface
 * Guidelines](http://developer.apple.com/iphone/library/documentation
 * /General/Conceptual/iPadHIG/Introduction/Introduction.html).
 * <p>
 * Notes: ### Custom Fonts
 * 
 * The iPad supports the ability to embed your own fonts in your iPad
 * application. To add your own fonts, you should add the
 * 
 * @platforms ipad
 * @since 1.2
 */
public class iPad extends org.urish.gwtit.titanium.Module {
	protected iPad() {
	}

	private static native final int value_POPOVER_ARROW_DIRECTION_ANY()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_ANY;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_ANY = value_POPOVER_ARROW_DIRECTION_ANY();

	private static native final int value_POPOVER_ARROW_DIRECTION_DOWN()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_DOWN;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_DOWN = value_POPOVER_ARROW_DIRECTION_DOWN();

	private static native final int value_POPOVER_ARROW_DIRECTION_LEFT()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_LEFT;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_LEFT = value_POPOVER_ARROW_DIRECTION_LEFT();

	private static native final int value_POPOVER_ARROW_DIRECTION_RIGHT()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_RIGHT;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_RIGHT = value_POPOVER_ARROW_DIRECTION_RIGHT();

	private static native final int value_POPOVER_ARROW_DIRECTION_UNKNOWN()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UNKNOWN;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_UNKNOWN = value_POPOVER_ARROW_DIRECTION_UNKNOWN();

	private static native final int value_POPOVER_ARROW_DIRECTION_UP()
	/*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UP;
	}-*/;

	public static final int POPOVER_ARROW_DIRECTION_UP = value_POPOVER_ARROW_DIRECTION_UP();

	public static native org.urish.gwtit.titanium.ui.ipad.DocumentViewer createDocumentViewer()
	/*-{
		return Titanium.UI.iPad.createDocumentViewer();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ipad.Popover createPopover()
	/*-{
		return Titanium.UI.iPad.createPopover();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ipad.SplitWindow createSplitWindow()
	/*-{
		return Titanium.UI.iPad.createSplitWindow();
	}-*/;

}
