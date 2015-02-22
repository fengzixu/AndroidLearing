package com.example.keyeventdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_main);
        
        
        setContentView(new CustormView(this));
        
    }
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
    	// TODO Auto-generated method stub
    	if(keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
		{
			Log.i("xuran log", "activity center click");
			
		}
		
    	return super.onKeyUp(keyCode, event);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	
    	if(event.getAction() == MotionEvent.ACTION_DOWN){
    		
			Log.i("xuran log", "activity touch click down ");
			
		}else if(event.getAction() == MotionEvent.ACTION_UP){
			
			if(event.getEventTime()- event.getDownTime() > 3000)
			{
				Log.i("xuran log", "activity touch clicklong  up ");
			}
			Log.i("xuran log", "activity touch click up ");
		}
    	return super.onTouchEvent(event);
    }
}
