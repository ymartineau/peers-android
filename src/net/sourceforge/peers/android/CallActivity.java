package net.sourceforge.peers.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CallActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.call);
		String callee = getIntent().getStringExtra(MainActivity.CALLEE);
		((TextView)findViewById(R.id.remotePartyText)).setText(callee);
	}
	
	public void hangup(View view) {
		//TODO update sip stack
		finish();
	}
}
