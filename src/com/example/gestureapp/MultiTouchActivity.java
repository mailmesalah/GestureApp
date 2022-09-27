package com.example.gestureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MultiTouchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MultiTouchEventView(this, null));		

	}
	
	
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  menu.addSubMenu("Single Touch");
		  menu.addSubMenu("On Screen Keyboard");
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
	        case "On Screen Keyboard":
	        	i = new Intent(this, OnScreenKeyboardActivity.class);
				startActivity(i);
				finish();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
