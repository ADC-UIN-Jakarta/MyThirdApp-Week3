package com.example.app3;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Halaman2 extends Activity{
	ListView listview;
	String data;
	ArrayList<String>dataAray;
	ArrayAdapter <String> arrayadapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman2);
		listview = (ListView)findViewById(R.id.listView1);
		Intent i = getIntent();
		data = i.getStringExtra("data");
		dataAray = new ArrayList<String>();
		
		for(int j=0 ; j<10 ; j++){
			dataAray.add(data+" "+j);
		}
		
		arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, 
				dataAray);
		
		listview.setAdapter(arrayadapter);
		
		
	}

}
