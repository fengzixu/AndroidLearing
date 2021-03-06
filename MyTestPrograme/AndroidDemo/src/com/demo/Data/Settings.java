package com.demo.Data;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.widget.Toast;

import com.example.androiddemo.R;

public class Settings extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
		
		final Preference mPreference = findPreference("wifi_switch");
		
		mPreference.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				
				Intent mIntent = new Intent();
				mIntent.setAction(android.provider.Settings.ACTION_WIFI_SETTINGS);
				startActivity(mIntent);
				
				Toast.makeText(Settings.this, mPreference.getTitle(), 2000).show();
				return false;
			}
		});
	}
}
