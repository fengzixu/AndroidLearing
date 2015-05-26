package com.demo.provider;

import java.util.ArrayList;
import java.util.List;

import com.example.androiddemo.R;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SystemContentProvider extends Activity {

	private ListView mListView;
	private ArrayAdapter<String> mAdapter;
	private List<String> itemresouce;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_contentprovider);

		mListView = (ListView) findViewById(R.id.content_provider_listView1);
		// ��������Դ
		itemresouce = new ArrayList<String>();
		// װ������
		getData();

		// ����adapter

		mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, itemresouce);

		// �ؼ���adapter��
		mListView.setAdapter(mAdapter);

	}

	public void getData(){
		Cursor mCursor = null;
		//��ȡresolver
		ContentResolver mContentResolver = getContentResolver();
		
		//��ȡuri����Դ��ַ
		Uri mUri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
		
		//��ѯ����
		try{
			
		mCursor = mContentResolver.query(mUri, null, null, null, null);
		
		while(mCursor.moveToNext()){
			
			String name = mCursor.getString(mCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
			String number = mCursor.getString(mCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
			
			itemresouce.add(name + "\n" + number);
		}
			
		}catch (Exception c){
			c.printStackTrace();
		}finally{
			
			if(mCursor != null)
				mCursor.close();
		}
		
		
	}
}