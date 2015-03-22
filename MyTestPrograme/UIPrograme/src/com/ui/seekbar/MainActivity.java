package com.ui.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.example.uiprograme.R;

public class MainActivity extends Activity {

	private SeekBar seekbar;
	private TextView textview;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_seekbar);
        ShowSeekBar();
    }
    
    private void ShowSeekBar(){
    	
    	seekbar = (SeekBar)findViewById(R.id.seekBar1);
    	textview = (TextView)findViewById(R.id.textView1);
    	
    	seekbar.setMax(500);
    	
    	seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				textview.setText(""+progress);
			}
		});
    	
    }
}
