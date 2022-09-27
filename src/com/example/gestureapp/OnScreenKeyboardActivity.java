package com.example.gestureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OnScreenKeyboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_on_screen_keyboard);
	}
	
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  menu.addSubMenu("Single Touch");
		  menu.addSubMenu("Multi Touch");
	      return true;
	  }

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
		Intent i;
	    switch (item.getTitle().toString()) {
	        case "Single Touch":	        	
	        	i = new Intent(this, SingleTouchActivity.class);
				startActivity(i);
				finish();
	            return true;
	        case "Multi Touch":
	        	i = new Intent(this, MultiTouchActivity.class);
				startActivity(i);
				finish();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
}
