package com.example.uiprograme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void ShowSpinner(View view ){
		
		Intent mintent = new Intent();
		mintent.setClass(this, com.ui.spinner.MainActivity.class);
		startActivity(mintent);
	}
	
	public void ShowSeekBar(View view){
		
		Intent mintent = new Intent();
		mintent.setClass(this, com.ui.seekbar.MainActivity.class);
		startActivity(mintent);
	}
}
