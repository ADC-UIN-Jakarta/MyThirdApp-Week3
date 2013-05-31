package com.example.app3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Halaman1 extends Activity {
	Button button;
	EditText edittext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman1);
        button = (Button)findViewById(R.id.button1);
        edittext = (EditText)findViewById(R.id.editText1);
        
        button.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				String data;
				data = edittext.getText().toString();
				Intent i = new Intent();
				i.setClass(Halaman1.this, Halaman2.class);
				i.putExtra("data", data);
				startActivity(i);
			}
		});
    }
    
    
}
