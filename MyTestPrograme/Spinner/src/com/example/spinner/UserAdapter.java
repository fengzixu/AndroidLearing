package com.example.spinner;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UserAdapter extends BaseAdapter{

	//����������Դ���н����Ľӿ�
	private Context mcontext;
	private List<User> muser;
	
	public UserAdapter(Context context, List<User>user) {
		// TODO Auto-generated constructor stub
		
		this.mcontext = context;
		this.muser = user;
		
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return muser.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return muser.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		//����layoutinflater��һ�������ļ�������һ���ؼ�,����ؼ���������ʾ����
		convertView = (LinearLayout)LayoutInflater.from(mcontext).inflate(R.layout.user_item, null);
		
		TextView textiview1 = (TextView)convertView.findViewById(R.id.textView1);
		TextView textiview2 = (TextView)convertView.findViewById(R.id.textView2);
		
		textiview1.setText(muser.get(position).getMname());
		textiview2.setText(muser.get(position).getMaddress());
		
		return convertView;
	}

}
