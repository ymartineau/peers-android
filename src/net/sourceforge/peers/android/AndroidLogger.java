package net.sourceforge.peers.android;

import android.util.Log;
import net.sourceforge.peers.Logger;

public class AndroidLogger implements Logger {

	public final static String TAG = AndroidLogger.class.getSimpleName();

	@Override
	public void debug(String arg0) {
		Log.d(TAG, arg0);
	}

	@Override
	public void error(String arg0) {
		Log.e(TAG, arg0);
	}

	@Override
	public void error(String arg0, Exception arg1) {
		Log.e(TAG, arg0, arg1);
	}

	@Override
	public void info(String arg0) {
		Log.i(TAG, arg0);
	}

	@Override
	public void traceNetwork(String arg0, String arg1) {
		//Log.d(arg0, arg1);
	}

}
