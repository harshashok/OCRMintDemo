package com.example.ocrmintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LoggedTransaction extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_loggedtransaction);
		
		Intent i = new Intent(LoggedTransaction.this, LoggedTranslucent.class);
		startActivity(i);
	}

}
