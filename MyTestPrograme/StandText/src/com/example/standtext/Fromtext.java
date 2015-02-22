package com.example.standtext;



import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Fromtext extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showhtml();
    }
    
    
    public void showhtml(){
    	
    	TextView text = (TextView)findViewById(R.id.text1);
    	
    	SpannableStringBuilder spannable = new SpannableStringBuilder("大家好，亚洲邀请赛");
    	
    	ClickableSpan click = new ClickableSpan() {
			
			@Override
			public void onClick(View widget) {
				// TODO Auto-generated method stub
				
				Toast.makeText(Fromtext.this, "hahahah", 3000).show();
			}
		};
    	
    	
//    	spannable.setSpan(imagespan, 4, 5, spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    	spannable.setSpan(click, 0, 2, spannable.SPAN_INCLUSIVE_EXCLUSIVE);
    	text.setMovementMethod(LinkMovementMethod.getInstance());
    	text.setText(spannable);
    }
}
