package com.demo.activity;

import com.example.androiddemo.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

	public static void actionStart(Context context,int param1, int param2){
		
		Intent mIntent = new Intent(context,FirstActivity.class);
		mIntent.putExtra("param1", param1);
		mIntent.putExtra("param2", param2);
		context.startActivity(mIntent);
		
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//HandleActivity.AddActivity(this);
		setContentView(R.layout.layout_firstactivity);
		Intent intent = getIntent();
		Toast.makeText(this, intent.getExtras().get("param1").toString(), 2000).show();
	}
}
