package com.example.customview;

import com.example.customview.MyButton.onkeylistener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        MyButton button = new MyButton(this);
        
        
        setContentView(button);
        
        button.setOnKeyListener(new onkeylistener() {
			
			@Override
			public void onkeydown(String temp) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, temp, 2000).show();
			}
		});
        
        
    }
}
