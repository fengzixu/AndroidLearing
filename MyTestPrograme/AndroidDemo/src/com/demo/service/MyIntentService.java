package com.demo.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

	public MyIntentService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	//ʹ��ʹ��intentservice����Ҫ�ṩһ��Ĭ�ϵĹ��캯��
	public MyIntentService(){
		super("my service");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 40; i++){
			
			Log.i("xuran", "������������ " + i);
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
		Log.i("xuran", "�����Ѿ��ر�");
	}

}
