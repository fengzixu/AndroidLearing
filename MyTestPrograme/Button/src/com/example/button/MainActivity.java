package com.example.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	private ToggleButton m_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowButton();
        ShowToggleButton();
        CheckBox();
        RadioButton();
        Spinner();
    }
    
    
    
    private void Spinner(){
    	
    	Spinner spinner = (Spinner)findViewById(R.id.spinner1);
    	
    	
    	//通过加载xml文件中的数组来建立数据源
    	String[] myitems = getResources().getStringArray(R.array.spinner);
    	
    	//建立adapter,并且与数据源建立联系
    	
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,myitems);
    	
    	//绑定到组件
    	spinner.setAdapter(adapter);
    	
    	
    	//设定选定事件监听器
    	spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, ((TextView)view).getText().toString(), 3000).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    }
    
    private void RadioButton(){
    	
    	RadioGroup radio = (RadioGroup)findViewById(R.id.radioGroup1);
    	radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				switch (checkedId) {
				case R.id.radio0:
					Toast.makeText(MainActivity.this, "radio0", 2000).show();
					break;
				case R.id.radio1:
					Toast.makeText(MainActivity.this, "radio1", 2000).show();
					break;
				case R.id.radio2:
					Toast.makeText(MainActivity.this, "radio2", 2000).show();
					break;
				default:
					break;
				}
			}
		});
    }
    
    
    private void CheckBox(){
    	
    	CheckBox checkbox = (CheckBox)findViewById(R.id.checkBox1);
    	
    	checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "check box", 2000).show();
			}
		});
    }
    
    
    
    //测试button事件
    private void ShowButton(){
    	
    	Button button = (Button)findViewById(R.id.button1);
    	button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Toast.makeText(MainActivity.this, "点击", 3000).show();
			}
		});
    	
    	button.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "长按", 3000).show();
				
				
				//如果这里返回false,点击的事件会一直向下传递被处理，如果返回true，就证明这个事件已经被处理，不用向下传递
				return true;
			}
		});
    	
    }
    
    private void ShowToggleButton(){
    	
        m_button = (ToggleButton)findViewById(R.id.toggleButton1);
    	
    	m_button.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				if(isChecked)
					buttonView.setBackgroundResource(R.drawable.bluetooth);
				else
					buttonView.setBackgroundResource(R.drawable.wifi);
				
			}
		});
    }
}


