package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;


public class MyBinderSerice extends Service{

	private MyBinder mBinder = new MyBinder();
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return mBinder;
	}

	class MyBinder extends Binder{
		
		public void startdownload(){
			Log.i("xuran", "��ʼ����");
		}
		
		public void getprocess(){
			
			Log.i("xuran", "��ȡ���ؽ���");
		}
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("xuran", "��ʼ����");
		super.onCreate();
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("xuran", "��ʼ����");
		super.onDestroy();
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
}
