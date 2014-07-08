package com.example.ocrmintdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class RecentPlaces extends Activity implements OnClickListener {

	ImageView image;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_recentplaces);
		
		//image = (ImageView) findViewById(R.id.ivSplash);
		//image.setOnClickListener(this);
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent(RecentPlaces.this, Splash.class);
		startActivity(intent);
		overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
		return super.onTouchEvent(event);
		
	}


	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(RecentPlaces.this, Splash.class);
		startActivity(intent);
		overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);				
		
	}

}
