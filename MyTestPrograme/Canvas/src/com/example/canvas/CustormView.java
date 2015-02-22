package com.example.canvas;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class CustormView extends View {

	public CustormView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		

		
		
//		canvas.clipRect(new Rect(60, 40, 150, 240));
		
		Paint m_paint = new Paint();
		
		m_paint.setColor(Color.BLACK);
		
		canvas.drawText("Hello view", 20, 20, m_paint);
		
		m_paint.setAntiAlias(true);
		m_paint.setColor(Color.GRAY);
		
		//�Ȼ�һ������
		canvas.drawRect(30, 50, 140, 140, m_paint);
		
		//���������Ļ���״̬
		canvas.save();
		
		//��ת����
		canvas.rotate(30.0f);
	
		//����ת״̬�»�һ������
		m_paint.setColor(Color.GREEN);
		canvas.drawRect(60, 100, 250, 250, m_paint);
		
		//�ָ�����״̬
		canvas.restore();
		
		
		//�ڱ�����ǰ�Ļ���״̬�£��ٻ�ͼ�Ρ�
		canvas.drawRect(20, 20, 30, 40, m_paint);
	}

}
