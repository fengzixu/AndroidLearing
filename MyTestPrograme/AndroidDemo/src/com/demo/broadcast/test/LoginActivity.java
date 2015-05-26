package com.demo.broadcast.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.demo.activity.BaseActivity;
import com.example.androiddemo.R;

public class LoginActivity extends BaseActivity {

	private EditText name;
	private EditText passwd;
	private Button login;
	private Button cancel;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_save_login);
		
		name = (EditText)findViewById(R.id.savelogin_name_editText1);
		passwd = (EditText)findViewById(R.id.savelogin_passwd_editText2);
		login = (Button)findViewById(R.id.savelogin_passwd_button1);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(name.getText().toString().equals("xuran") && passwd.getText().toString().equals("1234")){
					
					Intent mIntent = new Intent();
					mIntent.setClass(LoginActivity.this, nextActivity.class);
					startActivity(mIntent);
					finish();
				}
				else{
					Toast.makeText(LoginActivity.this, "name or passwd is wrong", 2000).show();
				}
				
			}
		});
		
		
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}