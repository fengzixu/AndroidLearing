package com.example.processbar;

import android.R.color;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	private Button mbutton;
	private ProgressBar mprogress;
	private SeekBar seekbar;
	private RatingBar ratingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showprogress();
        showseekbar();
        showratingbar();
    }
    
    
    
    private void showratingbar(){
    	
    	ratingbar = (RatingBar)findViewById(R.id.ratingBar1);
    	ratingbar.setBackgroundColor(color.black);
    	ratingbar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "rating : " + rating, 2000).show();
			}
		});
    }
    
    
    private void showseekbar(){
    	
    	seekbar = (SeekBar)findViewById(R.id.seekBar1);
    	
    	seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
				Log.i("xuran", "stop:"+seekBar.getProgress());
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Log.i("xuran", "start");
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				Log.i("xuran", "changed" + " :" + progress);
				
			}
		});
    }
    
    
    private void showprogress(){
    	
    	mbutton = (Button)findViewById(R.id.button1);
    	mprogress = (ProgressBar)findViewById(R.id.progressBar1);
    	
    	mbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Log.i("xuran", "clicked");
				
				mprogress.setProgress(mprogress.getProgress()+3);
				
				if(mprogress.getProgress() == mprogress.getMax())
					mprogress.setProgress(0);
				
			}
		});
    }
}
