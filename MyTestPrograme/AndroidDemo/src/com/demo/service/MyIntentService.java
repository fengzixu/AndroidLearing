package com.demo.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

	public MyIntentService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	//使用使用intentservice必须要提供一个默认的构造函数
	public MyIntentService(){
		super("my service");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 40; i++){
			
			Log.i("xuran", "服务正在运行 " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("xuran", "服务已经关闭");
	}

}
