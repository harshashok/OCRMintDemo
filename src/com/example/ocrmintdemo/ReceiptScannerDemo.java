package com.example.ocrmintdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ReceiptScannerDemo extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_receipt_scanner_demo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.receipt_scanner_demo, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Menu item implementations to intent(?) a new Activity.
		
		switch(item.getItemId()){
		
		case R.id.action_addtransactions:
			Toast.makeText(getBaseContext(), R.string.action_addtransaction, 
                    Toast.LENGTH_LONG).show();
			Intent intent = new Intent(ReceiptScannerDemo.this, AddTransactionActivity.class);			
			ReceiptScannerDemo.this.startActivity(intent);
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}

}
