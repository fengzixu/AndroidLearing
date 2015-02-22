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
		
		//Ϊ����ؼ����ý��㣬��Ϊ���ǵ�����ǽ���,���ü��̵�ʱ���ܷ��ý���
		setFocusable(true);
		//��������ؼ��ܹ����۽����ڴ���ģʽ���Ƿ��ܹ���Ľ���
		setFocusableInTouchMode(true);
		// TODO Auto-generated constructor stub
	} 

	
	//���ڲ�ʵ�ֵ�������¼�����,�������ֺ����ͽ����й�
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
		{
			Log.i("xuran log", "center click");
			
		}
		
		return super.onKeyUp(keyCode, event);
	}
	 
	//ʵ����Ļ����¼��Ļص����������ִ����¼��Ļص������ͽ����޹�
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
