package com.demo.yibu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.example.androiddemo.R;

public class MutityHandler extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_mutityhandle);
		
		Log.i("xuran", "main thread " + Thread.currentThread().getId());
		
		//创建一个新的线程
		HandlerThread mHandlerThread = new HandlerThread("handle_thread");
		mHandlerThread.start();
		
		//利用新创建的线程，将其和looper绑定在一起
		myhandler handler = new myhandler(mHandlerThread.getLooper());
		
		//message通过handler获得，所以也是在handler所在的线程中生成
		Message message = handler.obtainMessage();
		
		Bundle mBundle = new Bundle();
		mBundle.putInt("hehe", 999);
		message.setData(mBundle);
		//发送给目标Handler
		message.sendToTarget();
		
	}
	
	//重新实现一个Handler，这个handler不和其所在线程的looper绑定，而是和新实现的handlerthread
	//通过start方法的调用开启的新线程所拥有的looper绑定，以后通过Handler发送和处理消息的逻辑，都不在主线程中，
	//而是在新开启的线程中完成
	class myhandler extends Handler{

		public myhandler(){
			
		}
		
		
		public myhandler(Looper mLooper){
			
			super(mLooper);
		}
		
		
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			int num = msg.getData().getInt("hehe");
			Log.i("xuran", "data is " + num);
			Log.i("xuran", "handler thread" + Thread.currentThread().getId());
			
			super.handleMessage(msg);
		}
		
		
	}
}
