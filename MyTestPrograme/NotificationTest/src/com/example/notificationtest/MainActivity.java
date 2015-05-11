package com.example.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private NotificationManager manager;
	private Button mButton;
	private Notification notification;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mButton = (Button)findViewById(R.id.button1);
        
        mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 //得到notification管理者
		        manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		        
		        //得到notification实例
		        notification = new Notification(R.drawable.terminal, "terminal is running",System.currentTimeMillis()+3000);
		    	
		        notification.defaults = Notification.DEFAULT_ALL;
		        notification.ledARGB = Color.RED;	//设置LED颜色
		        notification.ledOffMS = 0;	//设置LED闪烁的频率
		        notification.ledOnMS = 1;	
		        notification.flags = notification.flags | Notification.FLAG_SHOW_LIGHTS;	// 要使用LED必须添加flags属性

		        PendingIntent intent =PendingIntent.getActivity(MainActivity.this, 0, new Intent(MainActivity.this, SwapActivity.class),0);
		        
		        //设置事件
		        notification.setLatestEventInfo(MainActivity.this, "Terminal info", "the terminal is running", intent);
		        
		        manager.notify(1001, notification); 
		        
		        
			}
		});
        
        
       
        
        
    }
	

}
