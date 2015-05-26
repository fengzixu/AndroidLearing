package com.example.providertest;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button insert_data;
	private Button delete_data;
	private Button update_data;
	private Button query_data;
	private ContentResolver mContentResolver;
	private String newid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        insert_data = (Button)findViewById(R.id.button1);
        delete_data = (Button)findViewById(R.id.button2);
        update_data = (Button)findViewById(R.id.button3);
        query_data = (Button)findViewById(R.id.button4);
        mContentResolver = getContentResolver();
        
        
        insert_data.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Uri mUri = Uri.parse("content://com.example.androiddemo.provider/book");
				ContentValues mContentValues = new ContentValues();
				mContentValues.put("author", "erxuan");
				mContentValues.put("pages", 20);
				mContentValues.put("name", "jinpingmei");
				mContentValues.put("price", 20.9);
				Uri newUri = mContentResolver.insert(mUri, mContentValues);
				newid = newUri.getPathSegments().get(1);
				Toast.makeText(MainActivity.this, "����ɹ�", 2000).show();
			}
		});
        
        
        delete_data.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("xuran", "id is " + newid);
				Uri mUri = Uri.parse("content://com.example.androiddemo.provider/book/" + newid);
				mContentResolver.delete(mUri, null, null);
			}
		});
        
        
        update_data.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
				Uri mUri = Uri.parse("content://com.example.androiddemo.provider/book/" + newid);
				ContentValues mContentValues = new ContentValues();
				mContentValues.put("name", "zhaolong");
				mContentValues.put("author", "xuge");
				mContentValues.put("pages", 89);
				mContentValues.put("price", 87.9);
				mContentResolver.update(mUri, mContentValues, null, null);
				
			}
		});
        
        
        query_data.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Uri mUri = Uri.parse("content://com.example.androiddemo.provider/book");
				Cursor mCursor = mContentResolver.query(mUri, null, null, null, null);
				while(mCursor.moveToNext()){
					
					Log.i("xuran", "name is " + mCursor.getString(mCursor.getColumnIndex("name")));
					Log.i("xuran", "author is " + mCursor.getString(mCursor.getColumnIndex("author")));
					Log.i("xuran", "pages is " + mCursor.getString(mCursor.getColumnIndex("pages")));
					Log.i("xuran", "price is " + mCursor.getString(mCursor.getColumnIndex("price")));
				}
			}
		});
        
    }
}
