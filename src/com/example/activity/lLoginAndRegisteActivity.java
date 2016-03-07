package com.example.activity;


import com.example.feralapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class lLoginAndRegisteActivity extends Activity {
	Button register;
	Button login;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_and_register);
		init();
	}
	/**
	 * 控件初始化
	 */
	private void init() {
		// TODO Auto-generated method stub
		register=(Button) findViewById(R.id.main_register);
		login=(Button) findViewById(R.id.main_login);
		register.setOnClickListener(listener);
	}
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			switch (v.getId()) {
			case R.id.main_register:
				
				break;
		    case R.id.main_login:
		    	
		    	break;

			default:
				break;
			}
			
		}
	};

}
