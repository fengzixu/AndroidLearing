package com.example.androiddemo;

import com.demo.Data.FileSave;
import com.demo.Data.SaveLogin;
import com.demo.Data.Settings;
import com.demo.Data.SharePreference;
import com.demo.DataBase.DataStorageExample;
import com.demo.DataBase.MySqliteHelper;
import com.demo.activity.BaseActivity;
import com.demo.broadcast.test.LoginActivity;
import com.demo.handler.HandlerActivity;
import com.demo.provider.SystemContentProvider;
import com.demo.reciver.Verson1;
import com.demo.service.MainServiceActivity;
import com.demo.service.ServiceActivitySecond;
import com.demo.yibu.NewHandlerActivity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	private MySqliteHelper mySqliteHelper;
	private SQLiteDatabase mDatabase;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 创建数据库

		// 获取helpter对象
		mySqliteHelper = new MySqliteHelper(this, "xuran.db", null, 2);

	}

	public void HandlerDemo(View view) {

		Intent mIntent = new Intent();
		mIntent.setClass(this, HandlerActivity.class);
		startActivity(mIntent);
	}

	public void Activitytest(View view) {
		Intent mIntent = new Intent();
		mIntent.setClass(this, BaseActivity.class);
		startActivity(mIntent);
	}

	public void ServiceDemo(View view) {

		Intent mIntent = new Intent();
		mIntent.setClass(this, MainServiceActivity.class);
		startActivity(mIntent);
	}

	public void BroadCastRecevierDemo(View view) {

		Intent mIntent = new Intent();
		mIntent.setAction("com.demo.myboardcast");
		mIntent.putExtra("name", "i am xuran");

		// sendBroadcast(mIntent);
		sendOrderedBroadcast(mIntent, null);

	}

	public void sharepreference(View view) {

		Intent mIntent = new Intent();
		mIntent.setClass(this, SharePreference.class);
		startActivity(mIntent);
	}

	public void settings(View view) {
		Intent mIntent = new Intent();
		mIntent.setClass(this, Settings.class);
		startActivity(mIntent);
	}

	public void savepasswd(View view) {
		Intent mIntent = new Intent();
		mIntent.setClass(this, SaveLogin.class);
		startActivity(mIntent);
	}

	public void savefile(View view) {
		Intent mIntent = new Intent();
		mIntent.setClass(this, FileSave.class);
		startActivity(mIntent);
	}
	
	public void Demoreciver(View view){
		Intent mintent = new Intent();
		mintent.setClass(this, Verson1.class);
		startActivity(mintent);
	}
	
	public void Demoreciver2(View view){
		
		Intent mintent = new Intent();
		mintent.setClass(this, LoginActivity.class);
		startActivity(mintent);
	}
	public void DemoProvider(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this, SystemContentProvider.class);
		startActivity(mIntent);
	}
	public void createdatabase(View view) {

		mySqliteHelper.getWritableDatabase();
	}
	public void DemoNewHandler(View view){
		Intent mIntent = new Intent();
		mIntent.setClass(this, NewHandlerActivity.class);
		startActivity(mIntent);
	}
	public void AddData(View view) {

		// 得到管理数据库的实例对象
		mDatabase = mySqliteHelper.getWritableDatabase();

		// 创建数据结构准备

		ContentValues mContentValues = new ContentValues();

		mContentValues.put("name", "hahaha");
		mContentValues.put("author", "xuran");
		mContentValues.put("pages", 454);
		mContentValues.put("price", 16.96);

		mDatabase.insert("book", null, mContentValues);
		mContentValues.clear();

		mContentValues.put("name", "lalala");
		mContentValues.put("author", "enwei");
		mContentValues.put("pages", 333);
		mContentValues.put("price", 18.96);

		mDatabase.insert("book", null, mContentValues);
	}

	public void UpdateData(View view) {

		mDatabase = mySqliteHelper.getWritableDatabase();
		ContentValues mContentValues = new ContentValues();

		mContentValues.put("name", "cao ni da ye");
		mDatabase.update("book", mContentValues, "name = ?",
				new String[] { "hahaha" });

	}

	public void DeleteData(View view) {

		mDatabase = mySqliteHelper.getWritableDatabase();
		mDatabase.delete("book", "name = ?", new String[] { "lalala" });
	}

	public void QueryData(View view) {

		mDatabase = mySqliteHelper.getWritableDatabase();

		// 利用封装的api
		// Cursor mCursor = mDatabase.query("book",new
		// String[]{"name","pages"},"author = ? and pages = ?", new
		// String[]{"xuran","454"}, null, null, null);

		// 直接用sql语句来写
		Cursor mCursor = mDatabase.rawQuery("select author,name "
				+ "from book " + "where author = ?", new String[] { "xuran" });
		if (mCursor.moveToFirst()) {

			do {

				Toast.makeText(this, "not null", 2000).show();
				String name = mCursor.getString(mCursor.getColumnIndex("name"));
				String author = mCursor.getString(mCursor
						.getColumnIndex("author"));

				Log.i("xuran", name);
				Log.i("xuran", "" + author);

			} while (mCursor.moveToNext());
		}

		mCursor.close();

	}

	public void ReplaceData(View view) {

		mDatabase = mySqliteHelper.getWritableDatabase();

		mDatabase.beginTransaction(); // 开启事务机制
		try {
			mDatabase.delete("book", null, null);
//
//			if (true) {
//
//				throw new NullPointerException();
//			}

			ContentValues mContentValues = new ContentValues();
			mContentValues.put("name", "nidaye");
			mContentValues.put("author", "dashi");
			mContentValues.put("pages", 222);
			mContentValues.put("price", 444);
			
			mDatabase.insert("book", null, mContentValues);
			mDatabase.setTransactionSuccessful();
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally{
			
			mDatabase.endTransaction();
		}
	}
	
	public void DeleteDataBase(View view){
		

	}
	
	public void DemoDataBase(View view){
		
		Intent mIntent = new Intent();
		mIntent.setClass(this, DataStorageExample.class);
		startActivity(mIntent);
	}
}
