package com.example.homework51;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showDialog(1001);
	}
	
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		
		if(id == 1001){
			
			AlertDialog.Builder builder = new AlertDialog.Builder(this)
									  .setView(getLayoutInflater().inflate(R.layout.activity_main, null))
									  .setPositiveButton("Yes", new OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											
										}
									}).setNegativeButton("cancel", new OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											
										}
									});
			return builder.create();
		}
		return super.onCreateDialog(id);
	}
}
