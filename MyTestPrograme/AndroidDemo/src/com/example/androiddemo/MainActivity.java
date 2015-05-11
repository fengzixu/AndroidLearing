package com.example.androiddemo;

import com.demo.Data.FileSave;
import com.demo.Data.SaveLogin;
import com.demo.Data.Settings;
import com.demo.Data.SharePreference;
import com.demo.activity.BaseActivity;
import com.demo.handler.HandlerActivity;
import com.demo.service.MainServiceActivity;
import com.demo.service.ServiceActivitySecond;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void HandlerDemo(View view) {

		Intent mIntent = new Intent();
		mIntent.setClass(this, HandlerActivity.class);
		startActivity(mIntent);
	}

	public void Activitytest(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this, BaseActivity.class);
		startActivity(mIntent);
	}
	public void ServiceDemo(View view) {

		Intent mIntent = new Intent();
		mIntent.setClass(this, MainServiceActivity.class);
		startActivity(mIntent);
	}

	public void BroadCastRecevierDemo(View view){
		
		Intent mIntent = new Intent();
		mIntent.setAction("com.demo.myboardcast");
		mIntent.putExtra("name", "i am xuran");
		
//		sendBroadcast(mIntent);
		sendOrderedBroadcast(mIntent,null);
		
	}
	
	public void sharepreference(View view){
		
		Intent mIntent = new Intent();
		mIntent.setClass(this, SharePreference.class);
		startActivity(mIntent);
	}
	
	public void settings(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this,Settings.class);
		startActivity(mIntent);		
	}
	
	public void savepasswd(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this,SaveLogin.class);
		startActivity(mIntent);	
	}
	
	public void savefile(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this,FileSave.class);
		startActivity(mIntent);
	}
}
