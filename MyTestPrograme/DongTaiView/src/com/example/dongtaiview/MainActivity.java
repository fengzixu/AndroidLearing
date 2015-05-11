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

		// 第一种形式：直接利用setcontentview设置activity界面
		// setContentView(R.layout.activity_main);

		// 第二种形式； 利用Inflate把相应的布局文件找出来
		// setContentView(getLayoutInflater().inflate(R.layout.activity_main,
		// null));

		// 动态添加第一种形式:

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

		// 动态添加第二种形式：

		// RelativeLayout mLayout = new RelativeLayout(this);
		// Button mButton = new Button(this);
		// mButton.setText("OK");
		// mLayout.addView(mButton);
		// setContentView(mLayout);

		// 动态添加的第三种方式
		Button mButton = new Button(this);
		mButton.setText("哈哈");
		setContentView(mButton);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		if(keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
			
			if(!flag){
				
				//准备退出
				flag = true;
				
				Toast.makeText(MainActivity.this, "再按下back键退出", 1000).show();
				
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
//		//获取目前为止的时间s
//		long system_time = System.currentTimeMillis();
//		
//		//如果两次进入这个函数的时间，也就是两次按下back键的时间>=2秒，那么就保存最新的时间状态
//		if(system_time - now_time >= MAX_TIME){
//			
//			//保存第一次按下back键的时间
//			now_time = system_time;
//			Toast.makeText(MainActivity.this, "再按下back键退出", 1000).show();
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
