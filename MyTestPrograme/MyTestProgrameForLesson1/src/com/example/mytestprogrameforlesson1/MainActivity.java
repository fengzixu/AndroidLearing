package com.example.mytestprogrameforlesson1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener{

	private Button clickbutton;
	private String textbutton;
	private ImageView imageview;
	private boolean light_flag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 初始化imageview控件内容
		// 找到imageview这个控件,先设置为关闭
		imageview = (ImageView) findViewById(R.id.picture);
		imageview.setBackgroundResource(R.drawable.guan);
		light_flag = false;

		clickbutton = (Button) findViewById(R.id.switchbutton);
		
		//第三种形式，在类中实现onclick函数，以下面这句话来启动事件监听器
		//clickbutton.setOnClickListener(this);
//		clickbutton.setOnClickListener(new MyClickButtonListener());
		//
		// //第一种利用匿名内部类实现单击事件的监听器
		// clickbutton.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// if(light_flag== false){
		//
		// light_flag = true;
		// imageview.setBackgroundResource(R.drawable.kai);
		// clickbutton.setText("灯已经开启");
		// }
		// else{
		// light_flag = false;
		// imageview.setBackgroundResource(R.drawable.guan);
		// clickbutton.setText("灯已经关闭");
		// }
		// }
		// });
		
		
	

	}
	
	//第四种，在布局文件中，为button的onclick属性设置一个名字，在java文件中，实现一个同名的函数，单击按钮之后，会自动调用这个函数
	//函数的参数必须为view对象
	public void clicklistener(View view){
		if (light_flag == false) {

			light_flag = true;
			imageview.setBackgroundResource(R.drawable.kai);
			clickbutton.setText("灯已经开启");
		} else {
			light_flag = false;
			imageview.setBackgroundResource(R.drawable.guan);
			clickbutton.setText("灯已经关闭");
		}
	}
	
	
	
	//第三种，不新建任何类，让本身activity的类继承自onclicklistener接口，在类中实现函数并且调用
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if (light_flag == false) {

			light_flag = true;
			imageview.setBackgroundResource(R.drawable.kai);
			clickbutton.setText("灯已经开启");
		} else {
			light_flag = false;
			imageview.setBackgroundResource(R.drawable.guan);
			clickbutton.setText("灯已经关闭");
		}
	}

	// 第二种，把原来的匿名内部类抽取出来，自己定义一个有名字的类来实现，原理是一样的
	// 第一种方法也不过是把匿名内部类实例化一下
//	class MyClickButtonListener implements OnClickListener {
//
//		@Override
//		public void onClick(View arg0) {
//			// TODO Auto-generated method stub
//			if (light_flag == false) {
//
//				light_flag = true;
//				imageview.setBackgroundResource(R.drawable.kai);
//				clickbutton.setText("灯已经开启");
//			} else {
//				light_flag = false;
//				imageview.setBackgroundResource(R.drawable.guan);
//				clickbutton.setText("灯已经关闭");
//			}
//		}
//
//	}
}
