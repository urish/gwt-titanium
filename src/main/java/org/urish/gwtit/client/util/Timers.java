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
package org.urish.gwtit.client.util;

/**
 * Wrappers around setTimeout, setInterval. Use them to create timers
 * 
 * @author Uri
 */
public class Timers {
	private static class TimeoutTimer implements Timer {
		private int id;
		private boolean isCanceled = false;

		private native void nativeClearTimeout(int id)
		/*-{
			clearTimeout(id);
		}-*/;
		
		void setId(int id) {
			this.id = id;
		}
		
		void fired() {
			isCanceled = true;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public void cancel() {
			if (!isCanceled) {
				nativeClearTimeout(id);
			}
			isCanceled = true;
		}
		
		@Override
		public boolean isCanceled() {
			return isCanceled;
		}
	}

	private static class IntervalTimer implements Timer {
		private int id;
		private boolean isCanceled = false;

		private native void nativeClearInterval(int id)
		/*-{
			clearInterval(id);
		}-*/;

		void setId(int id) {
			this.id = id;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public void cancel() {
			if (!isCanceled) {
				nativeClearInterval(id);
			}
			isCanceled = true;
		}
		
		@Override
		public boolean isCanceled() {
			return isCanceled;
		}
	}

	private static native int nativeSetTimeout(int ms, final TimerCallback callback, TimeoutTimer timer)
	/*-{
		return setTimeout(function() {
			timer.@org.urish.gwtit.client.util.Timers.TimeoutTimer::fired()();
			callback.@org.urish.gwtit.client.util.TimerCallback::onTimerShot(Lorg/urish/gwtit/client/util/Timer;)(timer);
		}, ms);
	}-*/;

	private static native int nativeSetInterval(int ms, final TimerCallback callback, Timer timer)
	/*-{
		return setTimeout(function() {
			callback.@org.urish.gwtit.client.util.TimerCallback::onTimerShot(Lorg/urish/gwtit/client/util/Timer;)(timer);
		}, ms);
	}-*/;

	/**
	 * Defines a one-shot timer.
	 * 
	 * @param milliseconds Time until the timeout callback fires
	 * @param callback Callback to fire
	 * @return The new timer object
	 */
	public static Timer setTimeout(int milliseconds, TimerCallback callback) {
		TimeoutTimer timeout = new TimeoutTimer(); 
		timeout.setId(nativeSetTimeout(milliseconds, callback, timeout));
		return timeout;
	}

	/**
	 * Defines a repeating timer with a specified interval.
	 * 
	 * @param milliseconds Interval between timer shots.
	 * @param callback Callback to fire on each timer shot.
	 * @return The new interval object
	 */
	public static Timer setInterval(int milliseconds, TimerCallback callback) {
		IntervalTimer interval = new IntervalTimer();
		interval.setId(nativeSetInterval(milliseconds, callback, interval));
		return interval;
	}
}
