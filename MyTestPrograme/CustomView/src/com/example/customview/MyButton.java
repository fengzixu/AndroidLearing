package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {

	public interface onkeylistener{
		
		void onkeydown(String temp);
	}
	
	onkeylistener monkeylistener;
	
	public MyButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public void setOnKeyListener(onkeylistener name){
		
		this.monkeylistener = name;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint mPaint = new Paint();
		mPaint.setColor(Color.RED);
		canvas.drawRect(5, 5, 25, 25, mPaint);
		
		super.onDraw(canvas);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		monkeylistener.onkeydown("hello xuran");
		
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			monkeylistener.onkeydown("hello xuran");
		}

		return super.onTouchEvent(event);
	}
	

}
