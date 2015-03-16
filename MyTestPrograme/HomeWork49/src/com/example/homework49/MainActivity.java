package com.example.homework49;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity{

	//创建数据源
	private String[] items = {"xuran", "enwei", "open", "edit", "delete"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		
		//创建adapter并与数据源进行绑定
		
		ArrayAdapter<String> mkAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
		
		//将adapter与控件绑定
		
		getListView().setAdapter(mkAdapter);
		
		
		//为上下文菜单注册控件
		registerForContextMenu(getListView());
		
		
	}
	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		
		//可以利用inflate来压入xml文件中定义的menu
		
		getMenuInflater().inflate(R.menu.test_menu, menu);
		
		super.onCreateContextMenu(menu, v, menuInfo);
	}
	
	
	
	
	//用来添加options menu控件
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		//第一种，利用代码动态创建,传递进来的menu就是系统已经为我们构造好了的一个menu实例，直接把菜单项添加上去即可
		menu.add(Menu.NONE, Menu.FIRST, 1, "打开");
		menu.add(Menu.NONE,Menu.FIRST+1, 2, "编辑");
		menu.add(Menu.NONE,Menu.FIRST+2, 3, "删除");
		menu.add(Menu.NONE,Menu.FIRST+3, 4, "复制");
		menu.add(Menu.NONE,Menu.FIRST+4, 5, "粘贴");
		menu.add(Menu.NONE,Menu.FIRST+5, 6, "分享");
		
		//submenu是一种可以容纳子菜单的menu
		
		SubMenu submenu = menu.addSubMenu(1	, Menu.FIRST+6, 7, "就是6");
		submenu.add(Menu.NONE, Menu.FIRST + 7, 8, "德玛西亚");
		
	//第二种：利用xml文件和inflater结合	
		getMenuInflater().inflate(R.menu.test_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
		case Menu.FIRST:
			Toast.makeText(this, "" + item.getTitle(), 2000).show();
			break;
		case Menu.FIRST + 1:
			Toast.makeText(this, "" + item.getTitle(), 2000).show();
			break;
		case Menu.FIRST + 2:
			Toast.makeText(this, "" + item.getTitle(), 2000).show();
			break;
		case Menu.FIRST +3:
			Toast.makeText(this, "" + item.getTitle(), 2000).show();
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
}
