package com.example.textfield;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        
        String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain","Big","xuran","xuhhhhh","xxxxiii"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        
        auto.setAdapter(adapter);
        
        
        
        
        
        
        
        
        EditText edittext = (EditText)findViewById(R.id.editText1);
        
        edittext.setOnEditorActionListener(new OnEditorActionListener() {
			
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				// TODO Auto-generated method stub
				
				Log.i("xuran","action id : " + actionId);
				
				if(actionId == 0){
					InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);  
					imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);  
				}
				
				return false;
			}
		});
        
        
    }
}
