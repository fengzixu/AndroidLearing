package com.demo.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class HandleActivity {

	//�洢Ҫ�����activity
	public static  List<Activity>activitys = new ArrayList<Activity>();
	
	//���activity
	
	public static void AddActivity(Activity mActivity){
		
		activitys.add(mActivity);
	}
	
	public static void RemoveActivity(Activity mActivity){
		activitys.remove(mActivity);
	}
	
	public static void Delete(){
		
		if(activitys != null){
			
			for(Activity activity : activitys){
				
				//��ֹ��������
				if(!activity.isFinishing()){
					
					activity.finish();
				}
			}
		}
	}
}
