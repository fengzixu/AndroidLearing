package com.example.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

public class DrawAbleView extends View {

	BitmapDrawable mbitmap;
	
	public DrawAbleView(Context context) {
		super(context);
		mbitmap = (BitmapDrawable)getResources().getDrawable(R.drawable.test);
		mbitmap.setBounds(10, 10 , 135, 160);
		
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		//第一种方式
//		mbitmap.draw(canvas);
		Paint mpaint = new Paint();

		//第二种形式
		Bitmap bitmap = ((BitmapDrawable)getResources().getDrawable(R.drawable.test)).getBitmap();
		
		canvas.drawBitmap(bitmap, 20, 50, mpaint);
	}

}
