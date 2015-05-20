package com.demo.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

//自己实现helper类的功能
public class DataStorageHelper {

	private Context mContext;
	private SQLiteDatabase mDatabase;
	private final String TABLE_NAME = "userinfo";

	public DataStorageHelper(Context mcontext) {

		mContext = mcontext;
	}
	public void CloseDataBase(){
		mDatabase.close();
	}
	public void CreateDataBase() {

		// 创建或者打开一个数据库
		mDatabase = mContext.openOrCreateDatabase("user",mContext.MODE_PRIVATE, null);
		CreateTable();
		
	}

	public void CreateTable() {
		
		String firsttablename = mDatabase.findEditTable(TABLE_NAME);
//		int flag = mDatabase.execSQL("select count(*) from userinfo where type = ? and name = ?",new String[]{"table","userinfo"});
//		if(flag > 0){
		mDatabase.execSQL("create table "
				+ " if not exists userinfo (_id integer PRIMARY KEY autoincrement," + "name text,"
				+ "address text," + "age integer)");
//		}

	}

	public void InsertData(UserInfo user) {

		mDatabase.execSQL(
				"insert into userinfo (name,address,age) values(?,?,?)",
				new String[] { user.getName(), user.getAddress(),
						user.getAge() + "" });

	}

	public void DeleteData(int id) {


		Log.i("xuran", "delete id is " + id);
//		mDatabase.execSQL("delete from userinfo where _id = ?", new String[]{String.valueOf(id)});
		mDatabase.delete(TABLE_NAME, "_id = ?", new String[]{String.valueOf(id)});
	}

	public void UpdateData(Bundle mBundle,Bundle mBundle2){
		String name = mBundle.getString("name");
		String address = mBundle.getString("address");
		ContentValues mContentValues = new ContentValues();
		mContentValues.put("name", mBundle2.get("newname").toString());
		mContentValues.put("address", mBundle2.get("newaddress").toString());
		mDatabase.update(TABLE_NAME, mContentValues, "name = ? and address = ?", new String[]{name, address});
//		mDatabase.execSQL("update userinfo set name = ? address = ? where name = ? and address = ?", new String[]{mBundle2.get("newname").toString(), name, address});
	}
	public Cursor SelectAllData() {

		Cursor temp = mDatabase.query(TABLE_NAME, new String[]{"_id","name","address","age"}, null, null, null, null,
				null);
		if (temp != null)
			return temp;
		else
			return null;

	}
	
	public Cursor SelectUser(String selection, String[] selectionArgs, String groupBy, String having, String orderBy){
		Cursor temp = mDatabase.query(TABLE_NAME, null, selection, selectionArgs, groupBy, having,
				orderBy);
		if (temp != null)
			return temp;
		else
			return null;

	}

}
