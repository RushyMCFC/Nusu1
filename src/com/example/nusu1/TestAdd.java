package com.example.nusu1;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Activity;
import android.os.Bundle;

public class TestAdd extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testaddd);
		Parse.initialize(this, "4sBrHygjOI6X0zmbhoVA0AIuTwH22039INo2NbKb", "y5lCUAXPz72Te4wUV7mtLXQcVdLge2KuKrHIXYv5");
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
	}
	
	
}
