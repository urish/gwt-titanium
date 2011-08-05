package org.urish.gwtit.client.util;

/**
 * Wrappers around setTimeout, setInterval
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
		var closure = callback;
		return setTimeout(function() {
			timer.@org.urish.gwtit.client.util.Timers.TimeoutTimer.fired()();
			callback.@org.urish.gwtit.client.util.TimerCallback::onTimerShot(org.urish.gwtit.client.util.Timer)(timer);
		}, ms);
	}-*/;

	private static native int nativeSetInterval(int ms, final TimerCallback callback, Timer timer)
	/*-{
		var closure = callback;
		return setTimeout(function() {
			closure.@org.urish.gwtit.client.util.TimerCallback::onTimerShot(org.urish.gwtit.client.util.Timer)(timer);
		}, ms);
	}-*/;

	/**
	 * Defines a one-shot timer.
	 * 
	 * @param milliseconds Time until the timeout callback fires
	 * @param callback Callback to fire
	 * @return
	 */
	public static Timer setTimeout(int milliseconds, TimerCallback callback) {
		TimeoutTimer timeout = new TimeoutTimer(); 
		timeout.setId(nativeSetTimeout(milliseconds, callback, timeout));
		return timeout;
	}

	/**
	 * Defines a repeating time.
	 * 
	 * @param milliseconds Interval between timer shots.
	 * @param callback Callback to fire on each timer shot.
	 * @return
	 */
	public static Timer setInterval(int milliseconds, TimerCallback callback) {
		IntervalTimer interval = new IntervalTimer();
		interval.setId(nativeSetInterval(milliseconds, callback, interval));
		return interval;
	}
}
