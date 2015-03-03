package com.example.gridview;

import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private int[] imagesource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showGridView();
    }
    
    private void showGridView(){
    	
    	GridView mGridView = (GridView)findViewById(R.id.gridView1);
    	
    	//建立数据源
    	
    	imagesource = new int[]{
    			
    			R.drawable.sample_0,
    			R.drawable.sample_1,
    			R.drawable.sample_2,
    			R.drawable.sample_3,
    			R.drawable.sample_4,
    			R.drawable.sample_5,
    			
    			R.drawable.sample_6,
    			R.drawable.sample_7,
    	};
    	
    	//建立adapter并且与数据源绑定
    	ImageAdapter mImageAdapter = new ImageAdapter();
    	
    	//绑定
    	
    	mGridView.setAdapter(mImageAdapter);
    	
    }
    class ImageAdapter extends BaseAdapter{

    	@Override
    	public int getCount() {
    		// TODO Auto-generated method stub
    		return imagesource.length;
    	}

    	@Override
    	public Object getItem(int position) {
    		// TODO Auto-generated method stub
    		return imagesource[position];
    	}

    	@Override
    	public long getItemId(int position) {
    		// TODO Auto-generated method stub
    		return position;
    	}

    	@Override
    	public View getView(int position, View convertView, ViewGroup parent) {  
            //定义一个ImageView,显示在GridView里  
            ImageView imageView;  
            if(convertView==null){  
                imageView=new ImageView(MainActivity.this);  
                imageView.setLayoutParams(new GridView.LayoutParams(230, 230));  
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);  
                imageView.setPadding(8, 8, 8, 8);  
//                Toast.makeText(MainActivity.this, "null", 2000).show();
            }else{  
                imageView = (ImageView) convertView;  
            }  
            imageView.setImageResource(imagesource[position]);  
            return imageView;  
        }  
    	
    }
}

