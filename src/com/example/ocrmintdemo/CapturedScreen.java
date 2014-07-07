package com.example.ocrmintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater.Filter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class CapturedScreen extends Activity implements OnClickListener {
	
		    
    ImageView image;
    View view;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_receipt);
		Log.d("TAG", "after contentview");		
		
		image = (ImageView) findViewById(R.id.ivPhotoReceipt);
		image.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// 
		Intent intent = new Intent(CapturedScreen.this, LoggedTransaction.class);
		startActivity(intent);
		overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);		
		
	}
	
	
}
