package com.example.homework50;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	//1.创建数据源
	
	private String[] items = {"edit","hash","os","呵呵呵"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		//2 建立adapter并且与数据源进行绑定
		
		ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
		
		
		//3将adapter与控件绑定
		
		
		getListView().setAdapter(adapter);
		
		
		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				showDialog(1001);
				
				
				
				//创建不依赖于activity的dialog
//				AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).setTitle("Notification")
//						  .setIcon(R.drawable.terminal)
//						  .setSingleChoiceItems(items, -1, new OnClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int which) {
//								// TODO Auto-generated method stub
//								
//							}
//						})
//						.setNegativeButton("cancel", new OnClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int which) {
//								// TODO Auto-generated method stub
//								
//								dialog.cancel();
//							}
//						}).setPositiveButton("yes", new OnClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int which) {
//								// TODO Auto-generated method stub
//								
//								MainActivity.this.finish();
//							}
//						})
//						.setCancelable(true)
//						.show();
			}
		});

	}
	
	
	
	//利用系统规定的回调函数来进行创建，和showdialog是配合起来使用的
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		
		if(id == 1001){
			
			AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).setTitle("Notification")
					  .setIcon(R.drawable.terminal)
					  .setSingleChoiceItems(items, -1, new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					})
					.setNegativeButton("cancel", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
							dialog.cancel();
						}
					}).setPositiveButton("yes", new OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
							MainActivity.this.finish();
						}
					})
					.setCancelable(true)
					.show();
		}
		
		
		return super.onCreateDialog(id);
	}
}
