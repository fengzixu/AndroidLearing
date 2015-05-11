package com.demo.handler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.androiddemo.R;

public class HandlerActivity extends Activity {

	public static final int UPDATE_TEXT = 1;
	private Button mButton;
	private TextView mTextView;
	private Handler handler = new Handler(){
		
		//处理消息在主线程中
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			
			switch (msg.what) {
			case UPDATE_TEXT:
				for(int i = 0; i < 100; i++)
				{
					Log.i("xuran", "this is " + i);
				}
				mTextView.setText("it is changed");
				break;

			default:
				break;
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_handler);
		
		mButton = (Button)findViewById(R.id.change_text);
		mTextView = (TextView)findViewById(R.id.handle_textView);
		
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 new Thread(new Runnable() {
				
				 //子线程运行下面的代码
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Message message = new Message();
					message.what = UPDATE_TEXT;
					handler.sendMessage(message);
					
					//子线程运行耗时操作，修改UI的操作放在handler的主线程中处理
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			}
		});
	}
}
