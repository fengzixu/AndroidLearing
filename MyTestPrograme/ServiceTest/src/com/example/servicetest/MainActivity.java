package com.example.servicetest;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.servicetest.MyBinderSerice.MyBinder;

public class MainActivity extends Activity {

	private Button mButton; 
	private Button mButton2;
	private Button mButton3;
	private Button mButton4;
	private Intent mIntent;
	private MyBinderSerice.MyBinder downloadbinder;
	
	private ServiceConnection conneciton = new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.i("xuran", "·þÎñ¶Ï¿ª");
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			
			downloadbinder = (MyBinderSerice.MyBinder)service;
			downloadbinder.startdownload();
			downloadbinder.getprocess();
		}
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        mButton = (Button)findViewById(R.id.button1);
        
        mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mIntent = new Intent(MainActivity.this, MyService.class);
				startService(mIntent);
			}
		});
        
        mButton2 = (Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopService(mIntent);
			}
		});
        
        mButton3 = (Button)findViewById(R.id.button3);
        mButton3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent mIntent = new Intent(MainActivity.this, MyBinderSerice.class);
				bindService(mIntent, conneciton, BIND_AUTO_CREATE);
			}
		});
        mButton4 = (Button)findViewById(R.id.button4);
        mButton4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				unbindService(conneciton);
			}
		});        
    }
}
