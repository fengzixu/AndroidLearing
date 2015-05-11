package com.demo.service;

import com.demo.handler.HandlerActivity;
import com.example.androiddemo.R;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyServiceActivity extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Notification mNotification = new Notification(R.drawable.ic_launcher, "this is service ticker", System.currentTimeMillis());
		Intent mIntent = new Intent(this,HandlerActivity.class);
		PendingIntent mPendingIntent = PendingIntent.getActivity(this, 0, mIntent, 0);
		mNotification.setLatestEventInfo(this, "this is title", "this is content", mPendingIntent);
		startForeground(1, mNotification);
		
		
		Log.i("xuran", "common service create");
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("xuran", "common service startcommand");
		Log.i("xuran", "start service in " + Thread.currentThread());
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Log.i("xuran", "child " + Thread.currentThread());
				// TODO Auto-generated method stub
				for(int i = 0; i < 10; i++)
				{
					Log.i("xuran", "service in childthread " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("xuran", "common service destory");
		super.onDestroy();
	}
}
