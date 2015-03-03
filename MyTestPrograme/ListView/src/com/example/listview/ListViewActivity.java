package com.example.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.ContentProvider;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.Phones;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListViewActivity extends ListActivity {

	private ListView listview;
	private EditText mEditText;
	private List<String> itemlist;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		showListView();
		showCursor();
	}
	
	
	
	private void showCursor(){
	
		//�������ݼ�
		
		Cursor cursor = getContentResolver().query(android.provider.Contacts.Phones.CONTENT_URI, null, null, null, null);
		
		//����adapter�����������ݼ���
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.test, cursor, new String[]{Phones.NAME,Phones.NUMBER}, new int[]{R.id.textView1,R.id.textView2});
		
		//�󶨵�UI�ؼ�
		setListAdapter(adapter);
		
	}
	
	
	
	
	
	private void showListView(){
		
		//�õ�Ĭ�ϵ�listview
		listview = getListView();
		
		//��������Դ��Ϊ�������ʵ�ֶ�̬��ӣ�Ҫ����һ��list����
		
		itemlist = new ArrayList<String>();
		
		//����adapter����������Դ���а�
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemlist);
		
		setListAdapter(adapter);
		
		
		mEditText = (EditText)findViewById(R.id.editText1);
		
		mEditText.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				
				if(keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_UP){
					
					itemlist.add(mEditText.getText().toString());
					
					//setListAdapter(adapter);
					adapter.notifyDataSetChanged();
					
					mEditText.setText(null);
					
				}
				
				
				return false;
			}
		});
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		itemlist.remove(position);
		adapter.notifyDataSetChanged();
	}
}
