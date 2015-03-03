package com.example.xurantest;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//绑定布局文件
		setContentView(R.layout.activity1);
		
		
		
		
		//利用addview来直接添加界面
		Button button = (Button)this.findViewById(R.id.button1);
		button.setText("hahaah");
		
		
		//利用inflater
		//activity使用window来呈现视图的
//		this.getWindow().setContentView(this.getLayoutInflater().inflate(R.layout.activity1, null));
		
		
		//利用代码添加一个新的button控件
		
		Button newbutton = new Button(this);
		newbutton.setText("lalalal");
		LinearLayout ll = (LinearLayout)findViewById(R.id.layout1);
		ll.addView(newbutton, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		
		
		//为按钮添加事件监听器
		newbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("xuran", "hahahhaahah");
				Toast.makeText(Activity1.this, "button click", 3000).show();
			}
		});
	}
}
