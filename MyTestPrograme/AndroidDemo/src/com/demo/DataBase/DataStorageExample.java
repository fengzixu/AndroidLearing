package com.demo.DataBase;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androiddemo.R;

public class DataStorageExample extends ListActivity {

	private DataStorageHelper mDataStorageHelper;
	private SimpleCursorAdapter mAdapter = null;
	private Cursor mCursor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mDataStorageHelper = new DataStorageHelper(this);

		// �������ݿ�
		mDataStorageHelper.CreateDataBase();
		display_data();
	}

	public void display_data() {

		// ��������Դ
		mCursor = mDataStorageHelper.SelectAllData();
		if (mCursor != null && mAdapter
				 == null) {
			Toast.makeText(this, "madapter is null", 2000).show();
			mAdapter = new SimpleCursorAdapter(this,
					R.layout.layout_listdata_item, mCursor, new String[] {
							"name", "address", "age" }, new int[] {
							R.id.listdata_name_textView1,
							R.id.listdata_address_textView2,
							R.id.listdata_age_textView3 });
			setListAdapter(mAdapter);
			
		}else if(mAdapter != null){
			
			mAdapter.changeCursor(mCursor);
			Toast.makeText(this, "madapter is not null", 2000).show();
			mAdapter.notifyDataSetChanged();
		}
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Bundle mBundle = new Bundle();
		mBundle.putInt("id", position);
//		TextView mEditText1 = (TextView)v.findViewById(R.id.listdata_name_textView1);
//		TextView mEditText2 = (TextView)v.findViewById(R.id.listdata_address_textView2);
//		mBundle.putString("name", mEditText1.getText().toString());
//		mBundle.putString("address", mEditText2.getText().toString());
		onCreateDialog(1002, mBundle);
	}


	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id, final Bundle args) {
		// TODO Auto-generated method stub
		
		if(id == 1002){
			
			AlertDialog mAlertDialog = new AlertDialog.Builder(this).setTitle("ע��")
									  .setMessage("��ѡ��ɾ�������޸�")
									  .setPositiveButton("ɾ��", new OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											Log.i("xuran", "cursor position " + args.getInt("id"));
											mCursor.moveToPosition(args.getInt("id"));
//											Log.i("xuran", ""+mCursor.getInt(mCursor.getColumnIndex("_id")));
											mDataStorageHelper.DeleteData(mCursor.getInt(0));
											
											mCursor = mDataStorageHelper.SelectAllData();
//											//����Ҫ�ı�󶨵�cursor����ʹ��ͬһ���������������������ݲ�һ��.
											mAdapter.changeCursor(mCursor);
											
											mAdapter.notifyDataSetChanged();
										}
									})
									.setNegativeButton("�޸�", new OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											
											
											onCreateDialog(1003, args);
										}
									}).show();
		}
		if(id == 1003){
			
			AlertDialog mAlertDialog = new AlertDialog.Builder(this).setTitle("�޸�")
					  .setMessage("�������Ϣ")
					  .setView(getLayoutInflater().from(this).inflate(R.layout.layout_dialog_insert, null))
					  .setPositiveButton("ȷ��", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
							AlertDialog temp_dialog = (AlertDialog)dialog;
							Bundle newbundle = new Bundle();
							EditText mEditText1 = (EditText)temp_dialog
									.findViewById(R.id.insertdialog_editText1);
							EditText mEditText2 = (EditText) temp_dialog
									.findViewById(R.id.insertdialog_editText2);
							newbundle.putString("newname", mEditText1.getText().toString());
							newbundle.putString("newaddress", mEditText2.getText().toString());
							mDataStorageHelper.UpdateData(args, newbundle);
							display_data();
						}
					}).
					setNegativeButton("ȡ��", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}).show();
					  
		}
		
		return super.onCreateDialog(id, args);
	}
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		if (id == 1001) {
			AlertDialog alertDialog = new AlertDialog.Builder(this)
					.setTitle("��������")
					.setMessage("�������Ҫ��Ϣ")
					.setView(
							getLayoutInflater().from(this).inflate(
									R.layout.layout_dialog_insert, null))
					.setPositiveButton("����", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							AlertDialog mAlertDialog = (AlertDialog) dialog;
							UserInfo mInfo = new UserInfo();
							EditText mEditText1 = (EditText) mAlertDialog
									.findViewById(R.id.insertdialog_editText1);
							EditText mEditText2 = (EditText) mAlertDialog
									.findViewById(R.id.insertdialog_editText2);
							mInfo.setName(mEditText1.getText().toString());
							mInfo.setAddress(mEditText2.getText().toString());
							mInfo.setAge(99);
							mDataStorageHelper.InsertData(mInfo);
							display_data();
							
						}
					}).setNegativeButton("ȡ��", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							dialog.dismiss();

						}
					}).show();

		}
	
		return super.onCreateDialog(id);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub

		menu.add(1, 1, 1, "��������").setOnMenuItemClickListener(
				new OnMenuItemClickListener() {

					@Override
					public boolean onMenuItemClick(MenuItem item) {
						// TODO Auto-generated method stub
						onCreateDialog(1001);
						return false;
					}
				});
		menu.add(2, 2, 2, "��ѯ��������");
		menu.add(3, 3, 3, "����������ѯ����");

		return super.onCreateOptionsMenu(menu);
	}
	
	
	


}