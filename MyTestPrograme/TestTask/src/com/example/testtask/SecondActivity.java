package com.example.testtask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {
	
	private static int m_index = 1;
	
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Log.i("task", "B onnewintent " + m_index+"  "+getTaskId());
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		m_index--;
		Log.i("task", "B Destory task " + m_index+"  "+getTaskId());
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		Log.i("task", "B task id is " + m_index +"  "+ getTaskId());
		m_index++;
		Button q_button = (Button)findViewById(R.id.button3);
        Button p_button = (Button)findViewById(R.id.button4);
        q_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(SecondActivity.this,SecondActivity.class);
				startActivity(i);
			}
		});
        
        p_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(SecondActivity.this,MainActivity.class);
				startActivity(i);
			}
		});
	}
}
