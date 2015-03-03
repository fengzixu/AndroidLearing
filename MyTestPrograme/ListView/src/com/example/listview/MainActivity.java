package com.example.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private	 EditText mEditText; 
	private ListView listview;
	private ArrayAdapter<String>adapter;
	private String[] content;
	private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showlistview();
        addEdittext();
    }
    
    private void showlistview(){
    	
//    	listview = (ListView)findViewById(R.id.listView1);
    	
    	
    	//1~3
    	list = new ArrayList<String>();
    	adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
    	listview.setAdapter(adapter);
    	//1~3
    	
    	
    	
    	//1 建立数据源
    	
//    	String[] content ={
//    			"1、山东：济南",
//    			"2、河北：石家庄",
//    			"3、吉林：长春",
//    			"4、黑龙江：哈尔滨",
//    			"5、辽宁：沈阳",
//    			"6、内蒙古：呼和浩特",
//    			"7、新疆：乌鲁木齐",
//    			"8、甘肃：兰州",
//    			"9、宁夏：银川",
//    			"10、山西：太原",
//    			"11、陕西：西安",
//    			"12、河南：郑州",
//    			"13、安徽：合肥",
//    			"14、江苏：南京",
//    			"15、浙江：杭州",
//    			"16、福建：福州",
//    			"17、广东：广州",
//    			"18、江西：南昌",
//    			"19、海南：海口",
//    			"20、广西：南宁",
//    			"21、贵州：贵阳",
//    			"22、湖南：长沙",
//    			"23、湖北：武汉",
//    			"24、四川：成都",
//    			"25、云南：昆明",
//    			"26、西藏：拉萨",
//    			"27、青海：西宁",
//    			"28、天津：天津",
//    			"29、上海：上海",
//    			"30、重庆：重庆",
//    			"31、北京：北京",
//    			"32、台湾：台北",
//    			"33、香港",
//    			"34、澳门"};
    	
//    	content = null;
//    	
//    	//2建立adapter,绑定数据源
//    	
//    	
//    	adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, content);
//    	
//    	
//    	//将adapter绑定到ui控件上
//    	
//    	listview.setAdapter(adapter);
    }
    
    
    private void addEdittext(){
    	
    	mEditText = (EditText)findViewById(R.id.editText1);
    		
    	mEditText.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				
				if(keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_UP){
					
					list.add(mEditText.getText().toString());
					listview.setAdapter(adapter);
					mEditText.setText(null);
					
				}
				
				
				return false;
			}
		});
    }
}
