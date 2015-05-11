package com.example.dongtaiview;

import java.util.Timer;
import java.util.TimerTask;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static Boolean flag = false;
	private static long MAX_TIME = 2000;
	private long now_time = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ��һ����ʽ��ֱ������setcontentview����activity����
		// setContentView(R.layout.activity_main);

		// �ڶ�����ʽ�� ����Inflate����Ӧ�Ĳ����ļ��ҳ���
		// setContentView(getLayoutInflater().inflate(R.layout.activity_main,
		// null));

		// ��̬��ӵ�һ����ʽ:

		// RelativeLayout layout_view =
		// (RelativeLayout)getLayoutInflater().inflate(R.layout.activity_main,
		// null);
		// Button mButton = new Button(this);
		// mButton.setText("OK");
		// RelativeLayout.LayoutParams mLayoutParams = new
		// RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
		// LayoutParams.WRAP_CONTENT);
		// layout_view.addView(mButton,mLayoutParams);
		// setContentView(layout_view);

		// ��̬��ӵڶ�����ʽ��

		// RelativeLayout mLayout = new RelativeLayout(this);
		// Button mButton = new Button(this);
		// mButton.setText("OK");
		// mLayout.addView(mButton);
		// setContentView(mLayout);

		// ��̬��ӵĵ����ַ�ʽ
		Button mButton = new Button(this);
		mButton.setText("����");
		setContentView(mButton);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		if(keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
			
			if(!flag){
				
				//׼���˳�
				flag = true;
				
				Toast.makeText(MainActivity.this, "�ٰ���back���˳�", 1000).show();
				
				Timer mTimer = new Timer();
				mTimer.schedule(new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						flag = false;
					}
				}, 2000);
				
			}
			else
			{
				finish();
				System.exit(0);
			}
			return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}
	
//	@Override
//	public void onBackPressed() {
//		// TODO Auto-generated method stub
//		//super.onBackPressed();
//		
//		//��ȡĿǰΪֹ��ʱ��s
//		long system_time = System.currentTimeMillis();
//		
//		//������ν������������ʱ�䣬Ҳ�������ΰ���back����ʱ��>=2�룬��ô�ͱ������µ�ʱ��״̬
//		if(system_time - now_time >= MAX_TIME){
//			
//			//�����һ�ΰ���back����ʱ��
//			now_time = system_time;
//			Toast.makeText(MainActivity.this, "�ٰ���back���˳�", 1000).show();
//		}
//		else
//		{
//			finish();
//			System.exit(0);
//		}
//		
//		
//	}
}
