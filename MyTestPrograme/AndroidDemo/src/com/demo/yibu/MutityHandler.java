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
		
		//����һ���µ��߳�
		HandlerThread mHandlerThread = new HandlerThread("handle_thread");
		mHandlerThread.start();
		
		//�����´������̣߳������looper����һ��
		myhandler handler = new myhandler(mHandlerThread.getLooper());
		
		//messageͨ��handler��ã�����Ҳ����handler���ڵ��߳�������
		Message message = handler.obtainMessage();
		
		Bundle mBundle = new Bundle();
		mBundle.putInt("hehe", 999);
		message.setData(mBundle);
		//���͸�Ŀ��Handler
		message.sendToTarget();
		
	}
	
	//����ʵ��һ��Handler�����handler�����������̵߳�looper�󶨣����Ǻ���ʵ�ֵ�handlerthread
	//ͨ��start�����ĵ��ÿ��������߳���ӵ�е�looper�󶨣��Ժ�ͨ��Handler���ͺʹ�����Ϣ���߼������������߳��У�
	//�������¿������߳������
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
