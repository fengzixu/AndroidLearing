package com.demo.broadcast.test;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.WindowManager;

public class OffLineReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		AlertDialog mAlertDialog = new AlertDialog.Builder(context)
								  .setTitle("警告")
								  .setMessage("您的设备已经在其他地方登录，已经强制下线")
								  .setCancelable(false)
								  .setPositiveButton("ok", new OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub
										ActivityControl.CloseAll();
										
										Intent mIntent = new Intent(context, LoginActivity.class);
										mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
										context.startActivity(mIntent);
										
									}
								}).create();
		
		mAlertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		mAlertDialog.show();
	}

}
