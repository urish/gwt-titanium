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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * The iphone/ipad specific ui capabilities. all properties, methods and events
 * in this namespace will only work on the apple iphone or ipad related devices.
 * 
 * @platforms iphone, ipad
 * @since 0.5
 */
public class iPhone extends org.urish.gwtit.titanium.Module {
	protected iPhone() {
	}

	public static final Const MODAL_PRESENTATION_CURRENT_CONTEXT = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_PRESENTATION_CURRENT_CONTEXT");

	public static final Const MODAL_PRESENTATION_FORMSHEET = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_PRESENTATION_FORMSHEET");

	public static final Const MODAL_PRESENTATION_FULLSCREEN = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN");

	public static final Const MODAL_PRESENTATION_PAGESHEET = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_PRESENTATION_PAGESHEET");

	public static final Const MODAL_TRANSITION_STYLE_COVER_VERTICAL = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_COVER_VERTICAL");

	public static final Const MODAL_TRANSITION_STYLE_CROSS_DISSOLVE = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_CROSS_DISSOLVE");

	public static final Const MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL");

	public static final Const MODAL_TRANSITION_STYLE_PARTIAL_CURL = new ConstImpl(
			"Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_PARTIAL_CURL");

	/**
	 * @return Set the application badge for the application's icon in the
	 *         springboard
	 */
	public static native String getAppBadge()
	/*-{
		return Titanium.UI.iPhone.appBadge;
	}-*/;

	public static native void setAppBadge(String value)
	/*-{
		Titanium.UI.iPhone.appBadge = value;
	}-*/;

	/**
	 * @return Control whether the shake to edit system wide capability is
	 *         enabled
	 */
	public static native boolean getAppSupportsShakeToEdit()
	/*-{
		return Titanium.UI.iPhone.appSupportsShakeToEdit;
	}-*/;

	public static native void setAppSupportsShakeToEdit(boolean value)
	/*-{
		Titanium.UI.iPhone.appSupportsShakeToEdit = value;
	}-*/;

	/**
	 * @return Control the status bar visibility
	 */
	public static native boolean getStatusBarHidden()
	/*-{
		return Titanium.UI.iPhone.statusBarHidden;
	}-*/;

	public static native void setStatusBarHidden(boolean value)
	/*-{
		Titanium.UI.iPhone.statusBarHidden = value;
	}-*/;

	/**
	 * @return Constant that controls the status bar color style
	 */
	public static native float getStatusBarStyle()
	/*-{
		return Titanium.UI.iPhone.statusBarStyle;
	}-*/;

	public static native void setStatusBarStyle(float value)
	/*-{
		Titanium.UI.iPhone.statusBarStyle = value;
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.ActivityIndicatorStyle createActivityIndicatorStyle()
	/*-{
		return Titanium.UI.iPhone.createActivityIndicatorStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.AnimationStyle createAnimationStyle()
	/*-{
		return Titanium.UI.iPhone.createAnimationStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.NavigationGroup createNavigationGroup()
	/*-{
		return Titanium.UI.iPhone.createNavigationGroup();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.ProgressBarStyle createProgressBarStyle()
	/*-{
		return Titanium.UI.iPhone.createProgressBarStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.RowAnimationStyle createRowAnimationStyle()
	/*-{
		return Titanium.UI.iPhone.createRowAnimationStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.ScrollIndicatorStyle createScrollIndicatorStyle()
	/*-{
		return Titanium.UI.iPhone.createScrollIndicatorStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.StatusBar createStatusBar()
	/*-{
		return Titanium.UI.iPhone.createStatusBar();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.SystemButton createSystemButton()
	/*-{
		return Titanium.UI.iPhone.createSystemButton();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.SystemButtonStyle createSystemButtonStyle()
	/*-{
		return Titanium.UI.iPhone.createSystemButtonStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.SystemIcon createSystemIcon()
	/*-{
		return Titanium.UI.iPhone.createSystemIcon();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.TableViewCellSelectionStyle createTableViewCellSelectionStyle()
	/*-{
		return Titanium.UI.iPhone.createTableViewCellSelectionStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.TableViewScrollPosition createTableViewScrollPosition()
	/*-{
		return Titanium.UI.iPhone.createTableViewScrollPosition();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.TableViewSeparatorStyle createTableViewSeparatorStyle()
	/*-{
		return Titanium.UI.iPhone.createTableViewSeparatorStyle();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.iphone.TableViewStyle createTableViewStyle()
	/*-{
		return Titanium.UI.iPhone.createTableViewStyle();
	}-*/;

	/**
	 * Convenience method to hide the status bar
	 * 
	 * @param animated
	 *            boolean to indicate if the action should be animated
	 * @param animationStyle
	 *            the animation style
	 */
	public static native void hideStatusBar(boolean animated, float animationStyle)
	/*-{
		return Titanium.UI.iPhone.hideStatusBar(animated, animationStyle);
	}-*/;

	/**
	 * Convenience method to show the status bar
	 * 
	 * @param animated
	 *            boolean to indicate if the action should be animated
	 * @param animationStyle
	 *            the animation style
	 */
	public static native void showStatusBar(boolean animated, float animationStyle)
	/*-{
		return Titanium.UI.iPhone.showStatusBar(animated, animationStyle);
	}-*/;

}
