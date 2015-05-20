package com.demo.broadcast.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.demo.activity.BaseActivity;
import com.example.androiddemo.R;

public class nextActivity extends BaseActivity {

	private Button mbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_nextactivity);
		mbutton = (Button)findViewById(R.id.nextactivity_button1);
		
		mbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//发送强制下线广播消息。
				Intent mIntent = new Intent("com.demo.broastreceiver.offline");
				sendBroadcast(mIntent);
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
