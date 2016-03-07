package com.example.activity;

import android.os.Bundle;

import com.example.feralapp.R;

import android.app.Activity;
import android.widget.TextView;
/**
 * 
 * @author Administrator
 *
 */
//注释
public class AboutUsActivity extends Activity {
	private TextView back;
	private TextView appName;
	private TextView appVersion;
	private TextView content;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aboutus);
		back=(TextView)findViewById(R.id.about_us_back);
		appName=(TextView)findViewById(R.id.about_us_app_title);
		appVersion=(TextView)findViewById(R.id.about_us_app_banben);
		content=(TextView)findViewById(R.id.about_us_content);
	}
}
