package com.example.standardview;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FormWidgetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hehe);
        showtext();
 
    }
    
    
    public void showtext(){
    	
    	TextView textview = (TextView)findViewById(R.id.textView1);
    	
    	
    	SpannableStringBuilder spannable = new SpannableStringBuilder("大家好，天气不错");
    	
    	ImageSpan imagespan = new ImageSpan(FormWidgetActivity.this, R.drawable.lol);
    	ClickableSpan click = new ClickableSpan() {
			
			@Override
			public void onClick(View widget) {
				// TODO Auto-generated method stub
				
				Toast.makeText(FormWidgetActivity.this, "点击", 3000).show();
			}
		};
    	
    	
    	spannable.setSpan(imagespan, 4, 5, spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    	spannable.setSpan(click, 0, 2, spannable.SPAN_INCLUSIVE_EXCLUSIVE);
    	textview.setText(spannable);
    	
    	
    	
    	
    	
    	
//    	Html.ImageGetter imagegetter = new Html.ImageGetter() {
//			
//			@Override
//			public Drawable getDrawable(String source) {
//				// TODO Auto-generated method stub
//				
//				if(source != null){
//					
//					BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(R.drawable.lol);
//					
//					bitmapdrawable.setBounds(0, 0, bitmapdrawable.getIntrinsicWidth(), bitmapdrawable.getIntrinsicHeight());
//					
//					return bitmapdrawable;
//				}
//				else
//					return null;
//			}
//		};
//    	
//    	
//    	textview.setText(Html.fromHtml("<b>中国你好</b><h1>日本你好</h1><font color = '#dfe443'>微博达人</font><img src = 'https://codechef_shared.s3.amazonaws.com/sites/all/themes/abessive/logo.png'><xuran>我是徐冉</xuran>",imagegetter,null));
    	
    }
}
