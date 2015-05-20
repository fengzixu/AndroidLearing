package com.demo.broadcast.test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityControl {

	//´´½¨activityÈÝÆ÷
	public static List<Activity> activity_list = new ArrayList<Activity>();
	
	
	public static void AddActivity(Activity activity){
		
		activity_list.add(activity);
	}
	
	public static void RemoveActivity(Activity activity){
		
		activity_list.remove(activity);
	}
	
	public static void CloseAll(){
		
		
		for(Activity activity : activity_list){
			
			if(activity.isFinishing())
				
				activity.finish();
		}
	}
	
}
