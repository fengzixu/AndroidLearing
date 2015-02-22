package com.example.sendmsg;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button m_button = (Button)findViewById(R.id.button1);
        
        m_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//调用自己定义的activity
//				Intent m_intent = new Intent("android.intent.action.xuran",Uri.parse("info://lll"));
//				startActivity(m_intent);

				//调用发短信的activity
//				Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:1122"));
//				startActivity(intent);
				
				//调用发短信activity分写形式
				Intent intent = new Intent();
				intent.setAction(intent.ACTION_SENDTO);
				intent.setData(Uri.parse("smsto:1122"));
				startActivity(intent);
			}
		});
    }
}
