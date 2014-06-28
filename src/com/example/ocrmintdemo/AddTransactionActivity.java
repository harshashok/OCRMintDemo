package com.example.ocrmintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddTransactionActivity extends Activity implements OnClickListener{

	ImageButton cashButton;
	ImageButton camButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Include some Mint like background design for number transactions.
		setContentView(R.layout.layout_addtransaction);
		super.onCreate(savedInstanceState);
		
		init();
	}
		
	private void init(){
		
		cashButton = (ImageButton) findViewById(R.id.imageCashTransaction);
		camButton = (ImageButton) findViewById(R.id.imageCaptureTransaction);
		
		cashButton.setOnClickListener(this);
		camButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Implement clickables for imageButtons.
		
		switch(v.getId()){
		
		case R.id.imageCashTransaction:
			Toast.makeText(getBaseContext(), "CASH!", Toast.LENGTH_LONG).show();
			break;
			
		case R.id.imageCaptureTransaction:
			Toast.makeText(getBaseContext(), "CAPTURE!!", Toast.LENGTH_LONG).show();
			
			/* EXPERIMENTAL GOGGLES CODE */
			Intent intent = new Intent("com.google.zxing.client.android.SCAN");
	       //intent.setPackage("com.google.zxing.client.android");
	        intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
	        Log.d("TAG", "start goggles!");
	        startActivityForResult(intent, 0);	        	        
			break;
		}	
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		
		super.onActivityResult(requestCode, resultCode, intent);
	    if (requestCode == 0) {
	        if (resultCode == RESULT_OK) {
	            String contents = intent.getStringExtra("SCAN_RESULT");
	            String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
	            Log.d("TAG", "result back!"+contents);
	            Toast.makeText(getBaseContext(), contents, Toast.LENGTH_LONG).show();
	            
	        } else if (resultCode == RESULT_CANCELED) {
	        	Toast.makeText(getBaseContext(), "CANCELLED", Toast.LENGTH_LONG).show();
	            // TODO: Handle cancel
	        }
	    }
	}
}
