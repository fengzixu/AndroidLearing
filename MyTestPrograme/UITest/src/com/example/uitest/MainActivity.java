package com.example.uitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
//        //Ϊ����ഴ��һ�����Բ���
//        LinearLayout m_linerlayout = new LinearLayout(this);
//        
//        //Ϊ������ִ�������
//        m_linerlayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//        
//        //����һ��button
//        Button m_button = new Button(this);
//        
//        //����button������
//        m_button.setText("xuran");
//        m_button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
//        
//        //��button��ӵ���������
//        m_linerlayout.addView(m_button);
//        
//        //�����������
//        setContentView(m_linerlayout);
        
        //�����Զ���Ŀؼ�
//        setContentView(new CustromView(this));
        
        //����Զ���ؼ������������¼�������
        
        CustromView m_view = new CustromView(this);
        
        m_view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "click this view", 3000).show();
			}
		});
        setContentView(m_view);
    }
}
