package com.example.activity;

import com.example.feralapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SetActivity extends Activity{
	TextView topTitle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_view);
		initView();
	}
	//初始化View
	public void initView(){
		topTitle = (TextView)findViewById(R.id.title);
		topTitle.setText("设置");//设置标题为“设置”
	}
}
