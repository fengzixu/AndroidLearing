package com.example.intenttest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void clickchange(View view) {

		Intent m_intent = new Intent();
		m_intent.setAction("xuran.watchmovie");
		m_intent.setData(Uri.parse("http://xuran is winner"));
		m_intent.putExtra("xuran", "hahah");
		// m_intent.setClass(this, SecondActivity.class);

		
		startActivityForResult(m_intent, 1);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == 4){
			String temp;
			temp = data.getExtras().getString("xuran");
			Toast.makeText(this, temp, Toast.LENGTH_LONG).show();
		}
	}
}
