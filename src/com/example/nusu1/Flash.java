package com.example.nusu1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Flash extends Activity {

	@Override
	protected void onCreate(Bundle image) {
		// TODO Auto-generated method stub
		super.onCreate(image);
		setContentView(R.layout.flashfirst);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(2000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				finally {
					Intent openStart = new Intent("com.example.nusu1.STARTINGPOINT");
					startActivity(openStart);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
