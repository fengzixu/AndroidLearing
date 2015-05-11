package com.demo.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.example.androiddemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

public class FileSave extends Activity {

	private FileOutputStream mFileOutputStream;
	private FileInputStream mFileInputStream;
	private InputStreamReader mInputStreamReader;
	private OutputStreamWriter mOutputStreamWriter;
	private BufferedReader mBufferedReader;
	private BufferedWriter mWriter;
	private StringBuilder mBuilder;
	private EditText mname;
	private EditText mpasswd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_save_login);
		// 获取控件

		mname = (EditText) findViewById(R.id.savelogin_name_editText1);
		mpasswd = (EditText) findViewById(R.id.savelogin_passwd_editText2);
		
		String temp = load();
		
		if(!TextUtils.isEmpty(temp)){
			
			mname.setText(temp);
			mname.setSelection(temp.length());
			Toast.makeText(this, "reload successed", 2000).show();
		}
		else
			Toast.makeText(this,"no data saved", 2000).show();
		
	}

	public String load(){
		
		try {
			
			String text;
			mBuilder = new StringBuilder();
			mFileInputStream = openFileInput("data");
			mInputStreamReader = new InputStreamReader(mFileInputStream);
			mBufferedReader = new BufferedReader(mInputStreamReader);

				while((text = mBufferedReader.readLine()) != null){
					
					mBuilder.append(text);
				}
				
				
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			if(mBufferedReader!=null){
				
				try {
					mBufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return mBuilder.toString();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		String name = mname.getText().toString();
		String passwd = mpasswd.getText().toString();
		try {

			// 打开文件获取流对象
			mFileOutputStream = openFileOutput("data", MODE_APPEND);

			// 利用转换流，将字节流转换为字符流
			mOutputStreamWriter = new OutputStreamWriter(mFileOutputStream);

			// 再次包装成bufferwriter

			mWriter = new BufferedWriter(mOutputStreamWriter);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (mWriter != null) {

				try {
					mWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		try {
			mWriter.write(name);
			mWriter.write(passwd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
