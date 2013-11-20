package net.sourceforge.peers.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ConfigActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config);
	}
	
	public void validate(View view) {
		//TODO update sip stack
		String user = ((EditText)findViewById(R.id.calleeEditText))
				.getText().toString();
		String domain = ((EditText)findViewById(R.id.domainEditText))
				.getText().toString();
		String outboundProxy = ((EditText)findViewById(R.id.outboundProxyEditText))
				.getText().toString();
		String password = ((EditText)findViewById(R.id.passwordEditText))
				.getText().toString();
		Log.d(AndroidLogger.TAG, "user: " + user + ", domain: " + domain
				+ ", outboundProxy: " + outboundProxy);
		finish();
	}
}
