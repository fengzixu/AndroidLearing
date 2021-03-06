package com.demo.Data;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androiddemo.R;



public class SaveLogin extends Activity {

	private EditText name;
	private EditText passwd;
	private CheckBox remeber;
	private Button mButton;
	private boolean remeber_passwd;
	private SharedPreferences mPreference;
	private SharedPreferences.Editor mEditor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_save_login);
		name = (EditText)findViewById(R.id.savelogin_name_editText1);
		passwd = (EditText)findViewById(R.id.savelogin_passwd_editText2);
		remeber = (CheckBox)findViewById(R.id.savelogin_checkBox1);
		mButton = (Button)findViewById(R.id.savelogin_passwd_button1);
		
		//获取Preference实例
		mPreference = PreferenceManager.getDefaultSharedPreferences(this);
		
		//获取记住密码checkbox的选中状态
		remeber_passwd = mPreference.getBoolean("remember_passwd", false);
		
		if(remeber_passwd){
			
			String account = mPreference.getString("name", "");
			String mima = mPreference.getString("passwd", "");
			
			name.setText(account);
			passwd.setText(mima);
			remeber.setChecked(true);
		}
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String account = name.getText().toString();
				String mima = passwd.getText().toString();
				remeber_passwd = remeber.isChecked();
				
				if(account.equals("xuran") && mima.equals("1234")){
					mEditor = mPreference.edit();
					//如果选中了记住密码的功能
					if(remeber_passwd){

						mEditor.putString("name",account);
						mEditor.putString("passwd", mima);
						mEditor.putBoolean("remember_passwd", true);
					}
					else{
						
						mEditor.clear();
					}
					
					mEditor.commit();
					
					Toast.makeText(SaveLogin.this, "登录成功", 2000).show();
				}
				else{
					
					Toast.makeText(SaveLogin.this, "用户名密码错误", 2000).show();
				}
			}
		});
	}
}
