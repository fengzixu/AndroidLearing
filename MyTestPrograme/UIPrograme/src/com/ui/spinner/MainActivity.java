package com.ui.spinner;

import com.example.uiprograme.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;

	private String[] Province_name;
	private String[][] City_name;
	private String[][][] quyu_name;

	private ArrayAdapter<String> adapter1;
	private ArrayAdapter<String> adapter2;
	private ArrayAdapter<String> adapter3;

	private int position_province;
	private int position_city;
	private int position_quyu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_spinner);
		ShowSpinner();

	}

	private void ShowSpinner() {

		// �������Դ
		Province_name = getResources().getStringArray(R.array.province_item);

		City_name = new String[2][3];
		City_name[0] = getResources().getStringArray(R.array.city_item1);
		City_name[1] = getResources().getStringArray(R.array.city_item2);

		quyu_name = new String[2][3][3];
		quyu_name[0][0] = getResources().getStringArray(R.array.quyu_item11);
		quyu_name[0][1] = getResources().getStringArray(R.array.quyu_item12);
		quyu_name[0][2] = getResources().getStringArray(R.array.quyu_item13);
		quyu_name[1][0] = getResources().getStringArray(R.array.quyu_item21);
		quyu_name[1][1] = getResources().getStringArray(R.array.quyu_item22);
		quyu_name[1][2] = getResources().getStringArray(R.array.quyu_item23);


		//

		// ����adapter���Ұ����Դ

		// adapter1 = new ArrayAdapter<String>(this,
		// android.R.layout.simple_spinner_dropdown_item, R.array.city_item1);
		adapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Province_name);
		adapter2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, City_name[0]);
		adapter3 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, quyu_name[0][0]);

		// �󶨵�UI�ؼ�

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner3 = (Spinner) findViewById(R.id.spinner3);

		spinner1.setAdapter(adapter1);
		spinner2.setAdapter(adapter2);
		spinner3.setAdapter(adapter3);

		// ����¼���������ʵ��������

		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				position_province = position;
				adapter2 = new ArrayAdapter<String>(MainActivity.this,
						android.R.layout.simple_list_item_1, City_name[position]);
				spinner2.setAdapter(adapter2);

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, quyu_name[position_province][position]);
				spinner3.setAdapter(adapter3);

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

	}
}
