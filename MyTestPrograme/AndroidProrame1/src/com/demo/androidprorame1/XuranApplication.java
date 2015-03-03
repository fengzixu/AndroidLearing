package com.demo.androidprorame1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.Log;

public class XuranApplication extends Application {

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		Log.i("进程","进程设置已经变换");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	//应用程序生命周期刚刚启动的回调函数
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("进程","进程已经启动");
		super.onCreate();
	}

	@Override
	//内存不足
	public void onLowMemory() {
		// TODO Auto-generated method stub
		Log.i("进程", "进程内存不足");
		super.onLowMemory();
	}

	@Override
	//当这个进程被系统关掉的时候，才会用这个回调函数,系统会自动调用
	public void onTerminate() {
		// TODO Auto-generated method stub
		Log.i("进程", "进程已被系统关闭");
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
