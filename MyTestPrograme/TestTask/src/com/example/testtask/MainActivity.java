package com.example.testtask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {


	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Log.i("task", "A onnewintent " + m_index+"  "+getTaskId());
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		m_index--;
		Log.i("task", "A Destory task id is " + m_index+"  "+getTaskId());

	}
	private static int m_index = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("task", "A task id is " + m_index+"  "+getTaskId());
        m_index++;
        Button m_button = (Button)findViewById(R.id.button1);
        Button v_button = (Button)findViewById(R.id.button2);
        m_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,MainActivity.class);
				startActivity(i);
			}
		});
        
        v_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,SecondActivity.class);
				startActivity(i);
			}
		});
    }
}
