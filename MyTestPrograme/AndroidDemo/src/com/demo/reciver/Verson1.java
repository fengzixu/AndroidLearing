package com.demo.reciver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.androiddemo.R;

public class Verson1 extends Activity{
	
	private networkReciver mReciver;
	private IntentFilter mFilter;
	private BootCompleteReceiver mBootCompleteReceiver;
	private Button mButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_reciver);
//		mFilter = new IntentFilter();
//		
//		mReciver = new networkReciver();
//		
//		mFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//		
//		registerReceiver(mReciver, mFilter);
		
		mButton = (Button)findViewById(R.id.receiver_sendbroast_button1);
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
//				sendBroadcast(new Intent("android.demo.userreceiver"));
				sendBroadcast(new Intent("com.demo.local"));
			}
		});
		

		
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
//		unregisterReceiver(mReciver);
	}
	
	class networkReciver extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			Toast.makeText(Verson1.this,"network is changed",2000).show();
			ConnectivityManager manager = (ConnectivityManager)getSystemService(context.CONNECTIVITY_SERVICE);
			
			NetworkInfo mInfo = manager.getActiveNetworkInfo();
			
			if(mInfo != null && mInfo.isAvailable()){
				
				Toast.makeText(Verson1.this, "有网络可用", 2000).show();
			}
			else{
				Toast.makeText(Verson1.this, "无网络", 2000).show();
			}
			
			
			
		}
		
		
	}

}
