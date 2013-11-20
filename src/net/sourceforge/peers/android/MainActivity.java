package net.sourceforge.peers.android;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String CALLEE = "net.sourceforge.peers.android.CALLEE";
	
	private EventManager eventManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				eventManager = new EventManager();
			}
		}).start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void settings(View view) {
    	Log.d(AndroidLogger.TAG, "settings");
    	Intent intent = new Intent(this, ConfigActivity.class);
    	startActivity(intent);
    }
    
    public void call(View view) {
    	Intent intent = new Intent(this, CallActivity.class);
    	String callee = ((EditText)findViewById(R.id.calleeEditText))
    			.getText().toString();
    	Log.d(AndroidLogger.TAG, "call " + callee);
    	intent.putExtra(CALLEE, callee);
    	startActivity(intent);
    }
    
}
