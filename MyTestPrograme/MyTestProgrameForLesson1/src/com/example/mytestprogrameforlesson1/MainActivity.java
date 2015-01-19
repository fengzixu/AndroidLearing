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

		// ��ʼ��imageview�ؼ�����
		// �ҵ�imageview����ؼ�,������Ϊ�ر�
		imageview = (ImageView) findViewById(R.id.picture);
		imageview.setBackgroundResource(R.drawable.guan);
		light_flag = false;

		clickbutton = (Button) findViewById(R.id.switchbutton);
		
		//��������ʽ��������ʵ��onclick��������������仰�������¼�������
		//clickbutton.setOnClickListener(this);
//		clickbutton.setOnClickListener(new MyClickButtonListener());
		//
		// //��һ�����������ڲ���ʵ�ֵ����¼��ļ�����
		// clickbutton.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// if(light_flag== false){
		//
		// light_flag = true;
		// imageview.setBackgroundResource(R.drawable.kai);
		// clickbutton.setText("���Ѿ�����");
		// }
		// else{
		// light_flag = false;
		// imageview.setBackgroundResource(R.drawable.guan);
		// clickbutton.setText("���Ѿ��ر�");
		// }
		// }
		// });
		
		
	

	}
	
	//�����֣��ڲ����ļ��У�Ϊbutton��onclick��������һ�����֣���java�ļ��У�ʵ��һ��ͬ���ĺ�����������ť֮�󣬻��Զ������������
	//�����Ĳ�������Ϊview����
	public void clicklistener(View view){
		if (light_flag == false) {

			light_flag = true;
			imageview.setBackgroundResource(R.drawable.kai);
			clickbutton.setText("���Ѿ�����");
		} else {
			light_flag = false;
			imageview.setBackgroundResource(R.drawable.guan);
			clickbutton.setText("���Ѿ��ر�");
		}
	}
	
	
	
	//�����֣����½��κ��࣬�ñ���activity����̳���onclicklistener�ӿڣ�������ʵ�ֺ������ҵ���
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if (light_flag == false) {

			light_flag = true;
			imageview.setBackgroundResource(R.drawable.kai);
			clickbutton.setText("���Ѿ�����");
		} else {
			light_flag = false;
			imageview.setBackgroundResource(R.drawable.guan);
			clickbutton.setText("���Ѿ��ر�");
		}
	}

	// �ڶ��֣���ԭ���������ڲ����ȡ�������Լ�����һ�������ֵ�����ʵ�֣�ԭ����һ����
	// ��һ�ַ���Ҳ�����ǰ������ڲ���ʵ����һ��
//	class MyClickButtonListener implements OnClickListener {
//
//		@Override
//		public void onClick(View arg0) {
//			// TODO Auto-generated method stub
//			if (light_flag == false) {
//
//				light_flag = true;
//				imageview.setBackgroundResource(R.drawable.kai);
//				clickbutton.setText("���Ѿ�����");
//			} else {
//				light_flag = false;
//				imageview.setBackgroundResource(R.drawable.guan);
//				clickbutton.setText("���Ѿ��ر�");
//			}
//		}
//
//	}
}
