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
    	
    	//1 建立数据源
    	ArrayList<User>users = new ArrayList<User>();
    	users.add(new User("徐冉", "内蒙"));
    	users.add(new User("大使", "天津"));
    	users.add(new User("杰杰", "上海"));
    	users.add(new User("二轩", "咸阳"));
    	
    	//2.建立adapter并与数据源建立连接
    	
    	UserAdapter useradapter = new UserAdapter(this, users);
    	
    	
    	//3. 将adapter绑定到控件上面
    	
    	Spinner spinner = (Spinner)findViewById(R.id.spinner1);
    	spinner.setAdapter(useradapter);
    	
    }
    
    
    
    private void ShowSpinner(){
    	
    	//创建数据源,从xml文件加载进来
    	
    	String[] mailitem = getResources().getStringArray(R.array.spinner);
    	
    	//建立adapter
    	
    	ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, mailitem);
    	
    	//获取spinner控件
    	Spinner spinner = (Spinner)findViewById(R.id.spinner1);
    	
    	//绑定adapter
    	
    	spinner.setAdapter(arrayadapter);
    }
    

}
