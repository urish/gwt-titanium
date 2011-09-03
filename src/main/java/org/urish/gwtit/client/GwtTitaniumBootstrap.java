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
package org.urish.gwtit.client;

import java.io.PrintStream;

import org.urish.gwtit.client.io.StringPrintStream;
import org.urish.gwtit.client.io.TitaniumStandardErrorPrintStream;
import org.urish.gwtit.client.io.TitaniumStandardOutputPrintStream;
import org.urish.gwtit.client.util.GwtUtil;
import org.urish.gwtit.client.util.Javascript;
import org.urish.gwtit.client.util.Timer;
import org.urish.gwtit.client.util.TimerCallback;
import org.urish.gwtit.client.util.Timers;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Base class for bootstrapping into a Titanium application. It is recommended
 * that this class is extended and {@link #main()} implemented to begin a
 * Titanium application.
 * 
 * @author Uri Shaked
 */
public abstract class GwtTitaniumBootstrap implements EntryPoint {

	@Override
	public final void onModuleLoad() {
		Runner runner = GWT.create(Runner.class);
		if (GwtUtil.isDevelopmentMode()) {
			// In development mode we don't need to override the streams and
			// catch exception since we run from within a JVM.
			runner.run(this);
			return;
		}
		System.setOut(new TitaniumStandardOutputPrintStream());
		System.setErr(new TitaniumStandardErrorPrintStream());
		try {
			runner.run(this);
		} catch (Throwable e) {
			e.printStackTrace();

			/* Unfortunately, Titanium can only handle string exceptions... */
			PrintStream ps = new StringPrintStream();
			e.printStackTrace(ps);
			Javascript.throwString(ps.toString());
		}
	}

	public Timer setTimeout(int milliseconds, TimerCallback callback) {
		return Timers.setTimeout(milliseconds, callback);
	}

	public Timer setInterval(int milliseconds, TimerCallback callback) {
		return Timers.setInterval(milliseconds, callback);
	}

	public abstract void main();
}
