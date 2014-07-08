package com.example.ocrmintdemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LoggedTranslucent extends Activity implements OnClickListener{

	View view;
	
	TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_logtranslucent);
		
		text = (TextView) findViewById(R.id.textView1);
		
		text.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		finish();
		
	}
	
	
	
	

}
