package com.example.lessonprograme1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener{

	private Button button;
	private ImageView imageview;
	Boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        button = (Button)findViewById(R.id.button1);
        imageview = (ImageView)findViewById(R.id.imageview1);
        imageview.setBackgroundResource(R.drawable.guan);
		button.setText("关闭");
		
		
//		button.setOnClickListener(this);
//		if(flag == false){
//			
//			imageview.setBackgroundResource(R.drawable.kai);
//			button.setText("打开");
//			flag = true;
//			
//		}
//		else{
//			imageview.setBackgroundResource(R.drawable.guan);
//			button.setText("关闭");
//			flag = false;
//		}
		
//        button.setOnClickListener(new mybutton());
//    }
//    class mybutton implements OnClickListener{
//
//		@Override
//		public void onClick(View arg0) {
//			// TODO Auto-generated method stub
//			if(flag == false){
//				
//				imageview.setBackgroundResource(R.drawable.kai);
//				button.setText("打开");
//				flag = true;
//				
//			}
//			else{
//				imageview.setBackgroundResource(R.drawable.guan);
//				button.setText("关闭");
//				flag = false;
//			}
//		}
		
    }
    
    public void buttononclick(View view){
    	if(flag == false){
			
			imageview.setBackgroundResource(R.drawable.kai);
			button.setText("打开");
			flag = true;
			
		}
		else{
			imageview.setBackgroundResource(R.drawable.guan);
			button.setText("关闭");
			flag = false;
		}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag == false){
			
			imageview.setBackgroundResource(R.drawable.kai);
			button.setText("打开");
			flag = true;
			
		}
		else{
			imageview.setBackgroundResource(R.drawable.guan);
			button.setText("关闭");
			flag = false;
		}
	}
}
