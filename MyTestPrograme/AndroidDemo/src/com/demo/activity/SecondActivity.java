package com.demo.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.androiddemo.R;

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//HandleActivity.AddActivity(this);
		
		
		Button mButton = new Button(this);
		mButton.setText("É¾³ý");
		LinearLayout mLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout_secondactivity, null);
		mLayout.addView(mButton);
		setContentView(mLayout);
		
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				HandleActivity.Delete();
			}
		});
	}
}
