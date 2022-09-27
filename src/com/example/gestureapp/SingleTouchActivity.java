package com.example.gestureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SingleTouchActivity extends ActionBarActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SingleTouchEventView(this, null));		

	}
	
	
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  menu.addSubMenu("Multi Touch");
		  menu.addSubMenu("On Screen Keyboard");
	      return true;
	  }

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
		Intent i;
	    switch (item.getTitle().toString()) {
	        case "Multi Touch":	        	
	        	//Toast.makeText(this, "Multi touch", Toast.LENGTH_SHORT).show();
	        	i = new Intent(this, MultiTouchActivity.class);
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
