package com.demo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBoardCast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		if(intent.getAction() == "com.demo.myboardcast"){
			
			Log.i("xuran", "this is reciver 1");
			abortBroadcast();
		}
		
		Log.i("xuran", "this is reciver sms : ");
	}

}
