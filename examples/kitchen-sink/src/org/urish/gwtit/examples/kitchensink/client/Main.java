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
package org.urish.gwtit.examples.kitchensink.client;

import java.util.Date;

import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.GwtTitaniumBootstrap;
import org.urish.gwtit.client.util.StringUtil;
import org.urish.gwtit.client.util.TimerCallback;
import org.urish.gwtit.client.util.Version;
import org.urish.gwtit.titanium.API;
import org.urish.gwtit.titanium.App;
import org.urish.gwtit.titanium.Locale;
import org.urish.gwtit.titanium.Platform;
import org.urish.gwtit.titanium.Titanium;
import org.urish.gwtit.titanium.UI;
import org.urish.gwtit.titanium.ui.ActivityIndicator;
import org.urish.gwtit.titanium.ui.Label;
import org.urish.gwtit.titanium.ui.Tab;
import org.urish.gwtit.titanium.ui.TabGroup;
import org.urish.gwtit.titanium.ui.View;
import org.urish.gwtit.titanium.ui.Window;

import com.google.gwt.core.client.JavaScriptObject;

public class Main extends GwtTitaniumBootstrap {

	@Override
	public void main() {
		UI.setBackgroundColor("#000");

		final TabGroup tabGroup = UI.createTabGroup();
		// TODO {id:'tabGroup1'}

		//
		// create base UI tab and root window
		//
		Window win1 = UI.createWindow();
		// TODO {className:'win1'}

		Tab tab1 = UI.createTab();
		tab1.setWindow(win1);
		// TODO {id:'tab1'}

		//
		// create controls tab and root window
		//
		Window win2 = UI.createWindow();
		// TODO win2.setUrl();
		win2.setTitleid("controls_win_title");
		// TODO {url:'main_windows/controls.js'}

		Tab tab2 = UI.createTab();
		tab2.setIcon("images/tabs/KS_nav_ui.png");
		tab2.setTitleid("controls_win_title");
		tab2.setWindow(win2);

		//
		// create phone tab and root window
		//

		Window win3 = UI.createWindow();
		// TODO {'main_windows/phone.js'}
		win3.setTitleid("phone_win_title");

		Tab tab3 = UI.createTab();
		tab3.setIcon("images/tabs/KS_nav_phone.png");
		tab3.setTitleid("phone_win_title");
		tab3.setWindow(win3);

		//
		// create platform tab and root window
		//
		Window win4 = UI.createWindow();
		// TODO {url:'main_windows/platform.js}
		win4.setTitleid("platform_win_title");

		Tab tab4 = UI.createTab();
		tab4.setIcon("images/tabs/KS_nav_platform.png");
		tab4.setTitleid("platform_win_title");
		tab4.setWindow(win4);

		//
		// create mashup tab and root window
		//
		Window win5 = UI.createWindow();
		// TODO {url:'main_windows/mashups.js'}
		win4.setTitleid("mashups_win_title");

		Tab tab5 = UI.createTab();
		tab5.setIcon("images/tabs/KS_nav_mashup.png");
		tab5.setTitleid("mashups_win_title");
		tab5.setWindow(win5);

		//
		// add tabs
		//
		tabGroup.addTab(tab1);
		tabGroup.addTab(tab2);
		tabGroup.addTab(tab3);
		tabGroup.addTab(tab4);
		tabGroup.addTab(tab5);

		tabGroup.addOpenHandler(new EventCallback<JavaScriptObject>() {

			@Override
			public void onEvent(JavaScriptObject event) {
				UI.setBackgroundColor("#fff");
			}
		});

		tabGroup.setActiveTab(1);
		// open tab group with a transition animation
		tabGroup.open();
		// TODO { transition:Titanium.UI.iPhone.AnimationStyle.FLIP_FROM_LEFT }

		//
		// TAB GROUP EVENTS
		//
		final Window messageWin = UI.createWindow();
		messageWin.setHeight(30);
		messageWin.setWidth(250);
		messageWin.setBottom(70);
		messageWin.setBorderRadius(10);
		messageWin.setTouchEnabled(false);
		messageWin.setOrientationModes(new float[] { UI.PORTRAIT, UI.UPSIDE_PORTRAIT, UI.LANDSCAPE_LEFT,
				UI.LANDSCAPE_RIGHT, });

		View messageView = UI.createView();
		// TODO {id:'messageview'}
		messageView.setHeight(30);
		messageView.setWidth(250);
		messageView.setBorderRadius(10);
		messageView.setBackgroundColor("#000");
		messageView.setOpacity(0.7f);
		messageView.setTouchEnabled(false);

		final Label messageLabel = UI.createLabel();
		// TODO {id:'messagelabel'}
		messageLabel.setText("");
		messageLabel.setColor("#fff");
		messageLabel.setWidth(250);
		messageLabel.setHeight("auto");
		// TODO font:{ fontFamily:'Helvetica Neue', fontSize:13 },
		messageLabel.setTextAlign(UI.TEXT_ALIGNMENT_CENTER);
		messageWin.add(messageView);
		messageWin.add(messageLabel);

		//
		// TAB EVENTS
		//

		// tab group close event
		tabGroup.addCloseHandler(new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				messageLabel.setText("tab group close event");
				messageWin.open(null);

				if (Platform.getOsname().equals("iphone")) {
					// On iOS, when we're closing the tab group, this is a
					// result of the tab group example of 'Close/Animate Tab
					// Group' and we want to reopen the tab group so the user
					// can continue with using Kitchen Sink. HOWEVER, on
					// Android, this is also triggered when the app is being
					// closed via back button, where reopening the tab group is
					// not desired. This is purely a quirk of
					// the tests.
					tabGroup.open();
				}
				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						messageWin.close(null);
						// TODO {opacity:0,duration:500}
					}
				});
			}
		});

		// tab group open event
		tabGroup.addOpenHandler(new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				messageLabel.setText("tab group open event");
				messageWin.open(null);
				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						messageWin.close(null);
						// TODO {opacity:0,duration:500}
					}
				});
			};
		});

		// focus event listener for tracking tab changes
		tabGroup.addFocusHandler(new EventCallback<JavaScriptObject>() {

			@Override
			public void onEvent(JavaScriptObject event) {
				int index = 0; // TODO event.index;
				int previousIndex = 0; // TODO event.previousIndex
				final String tabTitle = ""; // TODO event.tab.getTitle();
				final String oldTitle = ""; // TODO (e.previousTab ?
				// e.previousTab.title : null)
				messageLabel.setText("tab changed to " + index + " old index " + previousIndex);
				messageWin.open(null);

				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						API.info("tab " + tabTitle + " prevTab = " + oldTitle);
						messageLabel.setText("Active title " + tabTitle + " old title " + oldTitle);
					}
				});

				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						messageWin.close(null);
						// TODO {opacity:0,duration:500}
					}
				});
			}
		});

		// blur event listener for tracking tab changes
		tabGroup.addBlurHandler(new EventCallback<JavaScriptObject>() {

			@Override
			public void onEvent(JavaScriptObject event) {
				int index = 0; // TODO event.index;
				int previousIndex = 0; // TODO event.previousIndex
				API.info("tab blur - new index " + index + " old index " + previousIndex);
			}
		});

		//
		// CUSTOM EVENTS
		//
		App.addEventListener("event_one", new EventCallback<JavaScriptObject>() {

			@Override
			public void onEvent(JavaScriptObject event) {
				int arrayLength = 0; // TODO e.data.length
				messageLabel.setText("app.js: event one, array length = " + arrayLength);
				messageWin.open(null);
				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						messageWin.close(null);
						// TODO {opacity:0,duration:500}
					}
				});
			}
		});

		App.addEventListener("event_two", new EventCallback<JavaScriptObject>() {

			@Override
			public void onEvent(JavaScriptObject event) {
				String name = ""; // TODO e.name
				messageLabel.setText("app.js: event two, name = " + name);
				messageWin.open(null);
				setTimeout(1000, new TimerCallback() {
					@Override
					public void onTimerShot() {
						messageWin.close(null);
						// TODO {opacity:0,duration:500}
					}
				});
			}
		});

		//
		// Add global event handlers to hide/show custom indicator
		//

		App.addEventListener("show_indicator", new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				API.info("IN SHOW INDICATOR");
				showIndicator();
			}
		});

		App.addEventListener("hide_indicator", new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				API.info("IN HIDE INDICATOR");
				hideIndicator();
			}
		});

		// trap app shutdown event
		App.addEventListener("close", new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				API.info("The application is being shutdown");
			}
		});

		// test for loading in a root-level include
		// TODO Ti.include("welcome.js");

		// test out logging to developer console, formatting and localization
		API.info(StringUtil.format("%s%s", Locale.getString("welcome_message", "default_not_set"), Titanium.getVersion()));
		API.debug(StringUtil.format("%s %s", Locale.getString("user_agent_message", "default_not_set"), Titanium
				.getUserAgent()));

		API.debug(StringUtil.format("locale specific date is %s", StringUtil.formatDate(new Date()))); // default
		// is
		// short
		API.debug(StringUtil.format("locale specific date (medium) is %s", StringUtil.formatDate(new Date(), "medium")));
		API.debug(StringUtil.format("locale specific date (long) is %s", StringUtil.formatDate(new Date(), "long")));
		API.debug(StringUtil.format("locale specific time is %s", StringUtil.formatTime(new Date())));
		API.debug(StringUtil.format("locale specific currency is %s", StringUtil.formatCurrency(12.99)));
		API.debug(StringUtil.format("locale specific decimal is %s", StringUtil.formatDecimal(12.99)));

		API.info("should be en, was = " + Locale.getCurrentLanguage());
		API.info("welcome_message = " + Locale.getString("welcome_message"));
		API.info("should be def, was = " + Locale.getString("welcome_message2", "def"));
		API.info("should be 1, was = " + StringUtil.format("%d", 1));
		API.info("should be 1.0, was = " + StringUtil.format("%1.1f", 1));
		API.info("should be hello, was = " + StringUtil.format("%s", "hello"));

		API.info("instanceof check, should be true => " + (UI.createWindow() instanceof Window));
		API.info("instanceof check, should be false => " + (UI.createView() instanceof Window));

		// TODO Ti.include("examples/version.js");

		if (Version.iOS4Plus()) {
			// register a background service. this JS will run when the app is
			// backgrounded
			/*
			 * TODO BackgroundService service =
			 * iOS.registerBackgroundService(null);
			 * 
			 * API.info("registered background service = "+ service);
			 * 
			 * // listen for a local notification event
			 * iOS.addNotificationHandler(new EventCallback<JavaScriptObject>()
			 * {
			 * 
			 * @Override public void onEvent(JavaScriptObject event) {
			 * API.info("local notification received: "+JSON.stringify(e)); }
			 * });
			 */

			App.addEventListener("resume", new EventCallback<JavaScriptObject>() {
				@Override
				public void onEvent(JavaScriptObject event) {
					API.info("app is resuming from the background");
				}
			});

			App.addEventListener("resumed", new EventCallback<JavaScriptObject>() {
				@Override
				public void onEvent(JavaScriptObject event) {
					API.info("app has resumed from the background");
				}
			});

			App.addEventListener("pause", new EventCallback<JavaScriptObject>() {
				@Override
				public void onEvent(JavaScriptObject event) {
					API.info("app was paused from the foreground");
				}
			});
		}
	}

	//
	// CUSTOM LOADING INDICATOR
	//
	private Window indWin = null;
	private ActivityIndicator actInd = null;

	private void showIndicator() {
		if (!Version.android()) {
			// window container
			indWin = UI.createWindow();
			indWin.setHeight(150);
			indWin.setWidth(150);

			// black view
			View indView = UI.createView();
			indView.setHeight(150);
			indView.setWidth(150);
			indView.setBackgroundColor("#000");
			indView.setBorderRadius(10);
			indView.setOpacity(0.8f);
			indWin.add(indView);
		}

		// loading indicator
		actInd = UI.createActivityIndicator();
		// TODO actInd.setStyle(ActivityIndicatorStyle.BIG.toString());
		// TODO actInd.setHeight(30);
		// TODO actInd.setWidth(30);

		if (!Version.android()) {
			indWin.add(actInd);

			// message
			Label message = UI.createLabel();
			message.setText("Loading");
			message.setColor("#fff");
			message.setWidth("auto");
			message.setHeight("auto");
			// TODO font:{fontSize:20,fontWeight:'bold'},
			message.setBottom(20);
			indWin.add(message);
			indWin.open(null);
		} else {
			actInd.setMessage("Loading");
		}
		actInd.show();
	}

	private void hideIndicator() {
		actInd.hide();
		if (!Platform.getOsname().equals("android")) {
			indWin.close(null);
			// TODO {opacity:0,duration:500}
		}
	}
}
