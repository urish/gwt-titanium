package org.urish.gwtit.client.util;

/**
 * Wrappers around setTimeout, setInterval
 * 
 * @author Uri
 */
public class Timers {
	private static class TimeoutTimer implements Timer {
		final private int id;
		private boolean isCanceled = false;

		public TimeoutTimer(int id) {
			this.id = id;
		}

		private native void nativeClearTimeout(int id)
		/*-{
			clearTimeout(id);
		}-*/;

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
	}

	private static class IntervalTimer implements Timer {
		final private int id;
		private boolean isCanceled = false;

		public IntervalTimer(int id) {
			this.id = id;
		}

		private native void nativeClearInterval(int id)
		/*-{
			clearInterval(id);
		}-*/;

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
	}

	private static native int nativeSetTimeout(int ms, final TimerCallback callback)
	/*-{
		var closure = callback;
		return setTimeout(function() {
			callback.@org.urish.gwtit.client.util.TimerCallback::onTimerShot()();
		}, ms);
	}-*/;

	private static native int nativeSetInterval(int ms, final TimerCallback callback)
	/*-{
		var closure = callback;
		return setTimeout(function() {
			closure.@org.urish.gwtit.client.util.TimerCallback::onTimerShot()();
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
		return new TimeoutTimer(nativeSetTimeout(milliseconds, callback));
	}

	/**
	 * Defines a repeating time.
	 * 
	 * @param milliseconds Interval between timer shots.
	 * @param callback Callback to fire on each timer shot.
	 * @return
	 */
	public static Timer setInterval(int milliseconds, TimerCallback callback) {
		return new IntervalTimer(nativeSetInterval(milliseconds, callback));
	}
}
