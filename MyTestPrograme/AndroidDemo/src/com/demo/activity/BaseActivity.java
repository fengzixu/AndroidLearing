package com.demo.activity;

import com.example.androiddemo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		HandleActivity.AddActivity(this);
		setContentView(R.layout.layout_baseactivity);
		//Log.i("xuran", getBaseContext().toString());
		Log.i("xuran",this.toString());
		Log.i("xuran", this.getClass().getSimpleName());
	}
	
	public void first(View view){
//		Intent mIntent = new Intent();
//		mIntent.setClass(this, FirstActivity.class);
//		startActivity(mIntent);
		FirstActivity.actionStart(this, 1, 2);
	}
	public void second(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this, SecondActivity.class);
		startActivity(mIntent);
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		HandleActivity.RemoveActivity(this);
	}
}
