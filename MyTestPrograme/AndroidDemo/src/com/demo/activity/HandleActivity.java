package com.demo.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class HandleActivity {

	//存储要处理的activity
	public static  List<Activity>activitys = new ArrayList<Activity>();
	
	//添加activity
	
	public static void AddActivity(Activity mActivity){
		
		activitys.add(mActivity);
	}
	
	public static void RemoveActivity(Activity mActivity){
		activitys.remove(mActivity);
	}
	
	public static void Delete(){
		
		if(activitys != null){
			
			for(Activity activity : activitys){
				
				//防止结束两遍
				if(!activity.isFinishing()){
					
					activity.finish();
				}
			}
		}
	}
}
