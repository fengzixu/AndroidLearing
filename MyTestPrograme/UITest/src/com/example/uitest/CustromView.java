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
	
	//重载draw方法，利用这个方法来自己画控件
	//传递进来的canvas是一个画布，还需要一个paint的画笔。
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		//设置画笔
		Paint m_paint = new Paint();
		m_paint.setColor(Color.GREEN);
		//利用画布画控件
		
//		canvas.drawRect(10, 10, 90, 90, m_paint);
		RectF rect = new RectF(125, 25, 290, 490);
		canvas.drawRoundRect(rect, 10, 10, m_paint);
		//改变颜色，给控件上添加文字
		m_paint.setColor(Color.RED);
		canvas.drawText("hello view", 20, 20, m_paint);
		
	}

}
