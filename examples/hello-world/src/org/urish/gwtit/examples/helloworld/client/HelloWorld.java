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
package org.urish.gwtit.examples.helloworld.client;

import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.client.GwtTitaniumBootstrap;
import org.urish.gwtit.titanium.API;
import org.urish.gwtit.titanium.UI;
import org.urish.gwtit.titanium.ui.AlertDialog;
import org.urish.gwtit.titanium.ui.Label;
import org.urish.gwtit.titanium.ui.Window;

import com.google.gwt.core.client.JavaScriptObject;

public class HelloWorld extends GwtTitaniumBootstrap {

	@Override
	public void main() {
		Window win = UI.createWindow();
		win.setBackgroundColor("white");
		win.setTitle("Hello, World!");

		API.info("Hello World example started");

		Label label = UI.createLabel();
		label.setColor("blue");
		label.setTextAlign("center");
		label.setText("Hello World !");

		label.addClickHandler(new EventCallback<JavaScriptObject>() {
			@Override
			public void onEvent(JavaScriptObject event) {
				AlertDialog alertDialog = UI.createAlertDialog();
				alertDialog.setTitle("Example");
				alertDialog.setMessage("Hello, World");
				alertDialog.show();
			}
		});

		win.add(label);
		win.open(null);
	}
}
