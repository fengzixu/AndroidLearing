package com.demo.service;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.androiddemo.R;

public class MainServiceActivity extends Activity {

	private MyBindService.Mybinder mybinder;
	
	private Button start_service;
	private Button stop_sertvice;
	private Button start_bind;
	private Button stop_bind;
	private Button Intentservice;
	private Button StartActivity;
	private Intent start_common_service;
	private Intent start_bind_service;
	private Intent intent_service;
	private ServiceConnection connection = new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.i("xuran", "service disconnected");
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			Log.i("xuran", "service connected");
			mybinder = (MyBindService.Mybinder)service;
			mybinder.startdownload();
			mybinder.getservice().helloworld();
			
			
		}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_service);
		Log.i("xuran", "activity in " + Thread.currentThread());
		start_service = (Button)findViewById(R.id.start_service_button1);
		stop_sertvice = (Button)findViewById(R.id.stop_service_button2);
		start_bind = (Button)findViewById(R.id.start_bind_button1);
		stop_bind = (Button)findViewById(R.id.stop_bindbutton2);
		Intentservice = (Button)findViewById(R.id.intent_service_button1);
		StartActivity = (Button)findViewById(R.id.start_second_activity);
		start_service.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				start_common_service = new Intent(MainServiceActivity.this,MyServiceActivity.class);
				
				startService(start_common_service);
				
			}
		});
		
		stop_sertvice.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				stopService(start_common_service);
			}
		});
		
		start_bind.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				start_bind_service = new Intent(MainServiceActivity.this, MyBindService.class);
				bindService(start_bind_service, connection, BIND_AUTO_CREATE);
			}
		});
		
		stop_bind.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				unbindService(connection);
			}
		});
		
		Intentservice.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				intent_service = new Intent(MainServiceActivity.this,MyIntentService.class);
				startService(intent_service);
			}
		});
		
		StartActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mIntent = new Intent(MainServiceActivity.this, ServiceActivitySecond.class);
				startActivity(mIntent);
			}
		});
	}
}
