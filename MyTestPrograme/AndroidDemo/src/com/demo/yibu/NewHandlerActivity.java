package com.demo.yibu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.androiddemo.R;

public class NewHandlerActivity extends Activity {

	private Button start;
	private Button end;
	private Button start_process;
	private ProgressBar mBar;
	private Button mutity_go;
	private Handler mHandler = new Handler(){
		
		public void handleMessage(android.os.Message msg) {
			
			mBar.setProgress(msg.arg1);
			mHandler.post(runprocess);
			
		};
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_newhandler);
		mBar = (ProgressBar)findViewById(R.id.start_process_progressBar1);
		start = (Button)findViewById(R.id.start_handler_button1);
		end = (Button)findViewById(R.id.start_handler_button2);
		start_process = (Button)findViewById(R.id.start_process_button1);
		mutity_go = (Button)findViewById(R.id.start_mutity_handler_button1);
		
		mutity_go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent mIntent = new Intent();
				mIntent.setClass(NewHandlerActivity.this, MutityHandler.class);
				startActivity(mIntent);
			}
		});
		
		start.setOnClickListener(new starthandlerListener());
		
		end.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mHandler.removeCallbacks(mRunnable);
			}
		});
		
		
		start_process.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mBar.setVisibility(View.VISIBLE);
				mHandler.post(runprocess);
				
			}
		});
		
	}
	
	class starthandlerListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		mHandler.post(mRunnable);
			
		}
		
	}
	
	Runnable mRunnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//Toast.makeText(NewHandlerActivity.this, "this is runnable running", 2000).show();
			//Log.i("xuran", "this is runnable running");
			System.out.println("this is runnable running");
			mHandler.postDelayed(mRunnable, 2000);
		}
	};
	
	Runnable runprocess = new Runnable() {
		int count = 0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			count += 10;
			Message message = Message.obtain();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			message.arg1 = count;
			
			mHandler.sendMessage(message);
			
			if(count == 100)
			{
				mHandler.removeCallbacks(runprocess);
				Log.i("xuran", "runnable is endl");
			}
		}
	};
}
