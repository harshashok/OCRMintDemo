package com.example.ocrmintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class LoggedTransaction extends Activity implements OnClickListener {

	
	ImageView image;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_loggedtransaction);
		
		image = (ImageView) findViewById(R.id.ivLogTrans);
		image.setOnClickListener(this);
		
		Intent i = new Intent(LoggedTransaction.this, LoggedTranslucent.class);
		startActivity(i);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(LoggedTransaction.this, RecentPlaces.class);
		startActivity(intent);
		overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);		
	}

}
