package com.example.lifecycleactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText m_ed1;
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("xuran", "start");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("xuran", "restart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("xuran", "resume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("xuran", "pause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("xuran", "stop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("xuran", "destory");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		m_ed1 = (EditText)findViewById(R.id.editText1);
		
		//restore data
		if(savedInstanceState != null){
			
			m_ed1.setText(savedInstanceState.getString("xuran"));
		}
		Log.i("xuran", "restore");
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		Log.i("xuran", "configuration changed");
		
		if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
			Log.i("xuran", "configuration changed to landspace");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		m_ed1 = (EditText)findViewById(R.id.editText1);
		outState.putString("xuran", "xuran:"+m_ed1.getText().toString());
		Log.i("xuran", "saved");
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("xuran", "create");
		Log.i("xuran", "task id of mainactivity" + getTaskId());
//		Resources temp = this.getResources();
//		String[] str = temp.getStringArray(R.array.sex);
//		System.out.println(str[0]+" "+str[1]);
//		System.out.println(temp.getString(R.string.hello_world));
		
		
		
		
		
		Button m_button = (Button) findViewById(R.id.button1);
		Button m_button2 = (Button) findViewById(R.id.button2);

		m_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(MainActivity.this,
						TestLifeActivity.class);
				startActivity(_intent);
			}
		});

		m_button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder builder = new AlertDialog.Builder(
						MainActivity.this);
				builder.setMessage("hehe").setTitle(
						"xuran");

				// 3. Get the AlertDialog from create()
				AlertDialog dialog = builder.create();
				dialog.show();
			}
		});

	}
}
