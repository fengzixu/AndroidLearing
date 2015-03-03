package com.example.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.R.menu;
import android.app.Activity;
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ExpandableListActivity {

	private SimpleExpandableListAdapter adapter;
	
	private List<Map<String, String>> groupdata;
	
	private List<List<Map<String, String>>> childdata;
	

	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        showExpandableListView();
    }
    
    
    private void showExpandableListView(){
    	
    	//创建数据源
    	
    	groupdata = new ArrayList<Map<String,String>>();
    	
    	//数据缓存
    	Map<String, String>temp_map1 = new HashMap<String,String>();
    	temp_map1.put("name", "xuran");
    	
    	Map<String, String>temp_map2 = new HashMap<String, String>();
    	temp_map2.put("name", "enwei");
    	
    	groupdata.add(temp_map1);
    	groupdata.add(temp_map2);
    	
    	
    	
    	
    	
    	
    	
    	childdata = new ArrayList<List<Map<String,String>>>();
    	
    	List<Map<String, String>>temp_child1 = new ArrayList<Map<String,String>>();
    	
    	Map<String, String>child_map1 = new HashMap<String, String>();
    	child_map1.put("address", "赤峰");
    	temp_child1.add(child_map1);
    	
    	
    	Map<String, String>child_map2 = new HashMap<String, String>();
    	child_map2.put("address","平庄");
    	temp_child1.add(child_map2);
    	
    	
    	List<Map<String, String>>temp_child2 = new ArrayList<Map<String,String>>();
    	
    	Map<String, String>child_map3 = new HashMap<String, String>();
    	child_map3.put("address", "延吉");
    	temp_child2.add(child_map3);
    	
    	
    	Map<String, String>child_map4 = new HashMap<String, String>();
    	child_map4.put("address","首尔");
    	temp_child2.add(child_map4);


    	childdata.add(temp_child1);
    	childdata.add(temp_child2);
    	
    	
    	
    	
    	
    	//创建adapter,与数据源绑定
    	
    	adapter = new SimpleExpandableListAdapter(this, groupdata, android.R.layout.simple_expandable_list_item_1, new String[]{"name"}, new int[]{android.R.id.text1}, childdata, android.R.layout.simple_expandable_list_item_1, new String[]{"address"}, new int[]{android.R.id.text1});
    	
    	
    	
    	//绑定UI控件
    	setListAdapter(adapter);
    	
    	
    	
    }


	@Override
	public boolean onChildClick(ExpandableListView parent, View v,
			int groupPosition, int childPosition, long id) {
		// TODO Auto-generated method stub
		
		String temp = ((TextView)v).getText().toString();
		Toast.makeText(this, temp, 2000).show();
		
		return super.onChildClick(parent, v, groupPosition, childPosition, id);
	}


	@Override
	public void onGroupCollapse(int groupPosition) {
		// TODO Auto-generated method stub
		super.onGroupCollapse(groupPosition);
		Toast.makeText(this, "收缩 "+groupPosition, 2000).show();
	}


	@Override
	public void onGroupExpand(int groupPosition) {
		// TODO Auto-generated method stub
		super.onGroupExpand(groupPosition);
		Toast.makeText(this, "展开 "+groupPosition, 2000).show();
	}
}
