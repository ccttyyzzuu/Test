package com.example.activity;

import com.example.feralapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CompleteDataActivity extends Activity {
	TextView back;
	TextView title;
	TextView orRegister;
	EditText username;
	EditText password;
	TextView count;
	TextView getCode;
	Button ok;
	TextView agreement;
	TextView terms_of_service;
	TextView forget;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_public);
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		 back=(TextView) findViewById(R.id.back);
		 title=(TextView) findViewById(R.id.page_title);
		 title.setText("完善资料");
		 
		 orRegister=(TextView) findViewById(R.id.ORregister);
		 orRegister.setVisibility(View.GONE);
		 username=(EditText) findViewById(R.id.input_info);
		 
		 password=(EditText) findViewById(R.id.new_password);
		 
		 count=(TextView) findViewById(R.id.get_security_code);
		 count.setVisibility(View.GONE);
		 getCode=(TextView) findViewById(R.id.getCode);
		 getCode.setText("获取验证码");
		 getCode.setVisibility(View.GONE);
		 ok=(Button) findViewById(R.id.ok);
		 ok.setText("开启蹭课之旅");
		 agreement=(TextView) findViewById(R.id.agreement);
		 agreement.setVisibility(View.GONE);
		 terms_of_service=(TextView) findViewById(R.id.terms_of_service);
		 terms_of_service.setVisibility(View.GONE);
		 forget=(TextView) findViewById(R.id.forgetPassword);
		
		 ok.setOnClickListener(listener);
		 forget.setVisibility(View.GONE);
		 orRegister.setOnClickListener(listener);
		
	}
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.ok:
				Intent intent=new Intent(CompleteDataActivity.this,MainActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};


}
