package com.demo.service;

import android.app.Activity;
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

public class ServiceActivitySecond extends Activity {

	private Button start_bind;
	private Button stop_bind;
	
	private ServiceConnection connection = new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			Log.i("xuran", "service disconnected");
			MyBindService.Mybinder mybinder = (MyBindService.Mybinder)service;
			mybinder.startdownload();
			mybinder.getservice().helloworld();
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_second_service);
		start_bind = (Button)findViewById(R.id.second_service_button1);
		stop_bind = (Button)findViewById(R.id.second_service_button2);
		
		
		start_bind.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent start_bind_service = new Intent(ServiceActivitySecond.this, MyBindService.class);
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
	}
	
	
}
