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
    	
    	
    	
    	//1 ��������Դ
    	
//    	String[] content ={
//    			"1��ɽ��������",
//    			"2���ӱ���ʯ��ׯ",
//    			"3�����֣�����",
//    			"4����������������",
//    			"5������������",
//    			"6�����ɹţ����ͺ���",
//    			"7���½�����³ľ��",
//    			"8�����ࣺ����",
//    			"9�����ģ�����",
//    			"10��ɽ����̫ԭ",
//    			"11������������",
//    			"12�����ϣ�֣��",
//    			"13�����գ��Ϸ�",
//    			"14�����գ��Ͼ�",
//    			"15���㽭������",
//    			"16������������",
//    			"17���㶫������",
//    			"18���������ϲ�",
//    			"19�����ϣ�����",
//    			"20������������",
//    			"21�����ݣ�����",
//    			"22�����ϣ���ɳ",
//    			"23���������人",
//    			"24���Ĵ����ɶ�",
//    			"25�����ϣ�����",
//    			"26�����أ�����",
//    			"27���ຣ������",
//    			"28��������",
//    			"29���Ϻ����Ϻ�",
//    			"30�����죺����",
//    			"31������������",
//    			"32��̨�壺̨��",
//    			"33�����",
//    			"34������"};
    	
//    	content = null;
//    	
//    	//2����adapter,������Դ
//    	
//    	
//    	adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, content);
//    	
//    	
//    	//��adapter�󶨵�ui�ؼ���
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
