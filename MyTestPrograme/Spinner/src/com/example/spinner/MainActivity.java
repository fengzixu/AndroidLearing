package com.example.spinner;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ShowSpinner();
        DiySpinner();
    }
    
    
    
    private void DiySpinner(){
    	
    	//1 ��������Դ
    	ArrayList<User>users = new ArrayList<User>();
    	users.add(new User("��Ƚ", "����"));
    	users.add(new User("��ʹ", "���"));
    	users.add(new User("�ܽ�", "�Ϻ�"));
    	users.add(new User("����", "����"));
    	
    	//2.����adapter��������Դ��������
    	
    	UserAdapter useradapter = new UserAdapter(this, users);
    	
    	
    	//3. ��adapter�󶨵��ؼ�����
    	
    	Spinner spinner = (Spinner)findViewById(R.id.spinner1);
    	spinner.setAdapter(useradapter);
    	
    }
    
    
    
    private void ShowSpinner(){
    	
    	//��������Դ,��xml�ļ����ؽ���
    	
    	String[] mailitem = getResources().getStringArray(R.array.spinner);
    	
    	//����adapter
    	
    	ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, mailitem);
    	
    	//��ȡspinner�ؼ�
    	Spinner spinner = (Spinner)findViewById(R.id.spinner1);
    	
    	//��adapter
    	
    	spinner.setAdapter(arrayadapter);
    }
    

}
