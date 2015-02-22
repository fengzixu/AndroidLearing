package com.example.keyeventdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class CustormView extends View {

	public CustormView(Context context) {
		super(context);
		
		//为这个控件设置焦点，因为我们点击的是焦点,再用键盘的时候能否获得焦点
		setFocusable(true);
		//设置这个控件能够被聚焦，在触摸模式下是否能够活的焦点
		setFocusableInTouchMode(true);
		// TODO Auto-generated constructor stub
	} 

	
	//在内部实现点击键盘事件函数,重载这种函数和焦点有关
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
		{
			Log.i("xuran log", "center click");
			
		}
		
		return super.onKeyUp(keyCode, event);
	}
	 
	//实现屏幕点击事件的回调函数，这种触摸事件的回调函数和焦点无关
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			Log.i("xuran log", "touch click");
		}
		
		
		
		return super.onTouchEvent(event);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Paint pen = new Paint();
		pen.setColor(Color.YELLOW);
		
		
		canvas.drawRoundRect(new RectF(20, 25, 190, 190), 20, 20, pen);
	}
}
