package com.demo.Data;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androiddemo.R;

public class SharePreference extends Activity {

	private CheckBox mcheckbox;
	private EditText mEditText;
	private Button mButton;
	private SharedPreferences mPreference;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_share);
		
		//�õ�sharepreferenceʵ��
		mPreference = getSharedPreferences("xuran_share", MODE_PRIVATE);
//		mPreference = getPreferences(MODE_PRIVATE);
		//mPreference = PreferenceManager.getDefaultSharedPreferences(this);
		
		mButton = (Button)findViewById(R.id.save_button1);				
		mcheckbox = (CheckBox)findViewById(R.id.wifi_checkBox);
		mEditText = (EditText)findViewById(R.id.input_info_editText1);
		//����������activity�������ݻָ�֮ǰҪ��preference�Ƿ�Ϊ�ս����ж�
		if(mPreference!=null){
			
			mcheckbox.setChecked(mPreference.getBoolean("checkbox_wifi", false));
			mEditText.setText(mPreference.getString("edit_input", "Ĭ��"));
			Toast.makeText(this, "�ָ��ɹ�", 2000).show();
		}
		else
		{
			Toast.makeText(this, "no preference", 2000).show();
		}
		
		
		
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//������Ҫд������Ҫ���������
				//��ȡ���༭�洢Ȩ��
				SharedPreferences.Editor mEditor = mPreference.edit();
				

				
				mEditor.putBoolean("checkbox_wifi", mcheckbox.isChecked());
				mEditor.putString("edit_input", mEditText.getText().toString());
				mEditor.commit();
				Toast.makeText(SharePreference.this, "�Ѿ��ɹ�����", 2000).show();
				
			}
		});
	}
}