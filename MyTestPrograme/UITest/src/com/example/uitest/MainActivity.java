package com.example.uitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
//        //为这个类创建一个线性布局
//        LinearLayout m_linerlayout = new LinearLayout(this);
//        
//        //为这个布局创建参数
//        m_linerlayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//        
//        //创建一个button
//        Button m_button = new Button(this);
//        
//        //设置button的属性
//        m_button.setText("xuran");
//        m_button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
//        
//        //将button添加到布局中来
//        m_linerlayout.addView(m_button);
//        
//        //加载这个布局
//        setContentView(m_linerlayout);
        
        //加载自定义的控件
//        setContentView(new CustromView(this));
        
        //添加自定义控件，并且设置事件监听器
        
        CustromView m_view = new CustromView(this);
        
        m_view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "click this view", 3000).show();
			}
		});
        setContentView(m_view);
    }
}
