package com.example.uitest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class CustromView extends View {

	public CustromView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	//����draw��������������������Լ����ؼ�
	//���ݽ�����canvas��һ������������Ҫһ��paint�Ļ��ʡ�
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		//���û���
		Paint m_paint = new Paint();
		m_paint.setColor(Color.GREEN);
		//���û������ؼ�
		
//		canvas.drawRect(10, 10, 90, 90, m_paint);
		RectF rect = new RectF(125, 25, 290, 490);
		canvas.drawRoundRect(rect, 10, 10, m_paint);
		//�ı���ɫ�����ؼ����������
		m_paint.setColor(Color.RED);
		canvas.drawText("hello view", 20, 20, m_paint);
		
	}

}
