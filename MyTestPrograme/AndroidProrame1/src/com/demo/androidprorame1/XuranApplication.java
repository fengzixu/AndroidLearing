package com.demo.androidprorame1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.Log;

public class XuranApplication extends Application {

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		Log.i("����","���������Ѿ��任");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	//Ӧ�ó����������ڸո������Ļص�����
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("����","�����Ѿ�����");
		super.onCreate();
	}

	@Override
	//�ڴ治��
	public void onLowMemory() {
		// TODO Auto-generated method stub
		Log.i("����", "�����ڴ治��");
		super.onLowMemory();
	}

	@Override
	//��������̱�ϵͳ�ص���ʱ�򣬲Ż�������ص�����,ϵͳ���Զ�����
	public void onTerminate() {
		// TODO Auto-generated method stub
		Log.i("����", "�����ѱ�ϵͳ�ر�");
		super.onTerminate();
	}

	@Override
	public void onTrimMemory(int level) {
		// TODO Auto-generated method stub
		super.onTrimMemory(level);
	}

	@Override
	public void registerActivityLifecycleCallbacks(
			ActivityLifecycleCallbacks callback) {
		// TODO Auto-generated method stub
		super.registerActivityLifecycleCallbacks(callback);
	}

	@Override
	public void registerComponentCallbacks(ComponentCallbacks callback) {
		// TODO Auto-generated method stub
		super.registerComponentCallbacks(callback);
	}

	@Override
	public void registerOnProvideAssistDataListener(
			OnProvideAssistDataListener callback) {
		// TODO Auto-generated method stub
		super.registerOnProvideAssistDataListener(callback);
	}

	@Override
	public void unregisterActivityLifecycleCallbacks(
			ActivityLifecycleCallbacks callback) {
		// TODO Auto-generated method stub
		super.unregisterActivityLifecycleCallbacks(callback);
	}

	@Override
	public void unregisterComponentCallbacks(ComponentCallbacks callback) {
		// TODO Auto-generated method stub
		super.unregisterComponentCallbacks(callback);
	}

	@Override
	public void unregisterOnProvideAssistDataListener(
			OnProvideAssistDataListener callback) {
		// TODO Auto-generated method stub
		super.unregisterOnProvideAssistDataListener(callback);
	}

	
}
