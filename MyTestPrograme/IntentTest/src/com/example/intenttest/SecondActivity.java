package com.example.intenttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity {
	
	private Intent _intent;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondview);
		
		_intent = this.getIntent();
		String str;
		if(_intent != null){
			
			str = _intent.getExtras().getString("xuran");
			Toast.makeText(this, _intent.getDataString(), Toast.LENGTH_LONG).show();
		}
		
		Button m_button = (Button)findViewById(R.id.button2);
		m_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				_intent.putExtra("xuran", "hehehe");
				setResult(4, _intent);
				
			}
		});
	}
}
