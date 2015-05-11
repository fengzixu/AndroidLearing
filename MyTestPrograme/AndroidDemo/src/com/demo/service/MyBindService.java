package com.demo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyBindService extends Service {

	private Binder mBinder = new Mybinder();
	
	class Mybinder extends Binder{
		
		public void startdownload(){
			Log.i("xuran", "bind service start download");
		}
		
		public MyBindService getservice(){
			
			return MyBindService.this;
		}
	}
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		
		
		Log.i("xuran", "bind service is onbind");
		return mBinder;
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		Log.i("xuran", "bind create");
		Log.i("xuran", "bind service in " + Thread.currentThread());
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("xuran", "bind destory");
		super.onDestroy();
	}
	
	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("xuran", "unbind");
		return super.onUnbind(intent);
	}
	
	public void helloworld(){
		
		Log.i("xuran", "service hello world");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Log.i("xuran", "child " + Thread.currentThread());
				// TODO Auto-generated method stub
				for(int i = 0; i < 10; i++)
				{
					Log.i("xuran", " bind service in childthread " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

}
