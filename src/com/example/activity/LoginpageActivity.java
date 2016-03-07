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

public class LoginpageActivity extends Activity {
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

		 title.setText("登录");
		 orRegister=(TextView) findViewById(R.id.ORregister);
		 username=(EditText) findViewById(R.id.input_info);
		 username.setHint("手机号或邮箱");
		 password=(EditText) findViewById(R.id.new_password);
		 password.setHint("密码");
		 count=(TextView) findViewById(R.id.get_security_code);
		 count.setVisibility(View.GONE);
		 getCode=(TextView) findViewById(R.id.getCode);
		 getCode.setVisibility(View.GONE);
		 ok=(Button) findViewById(R.id.ok);

		 ok.setText("立即登录");
		 agreement=(TextView) findViewById(R.id.agreement);
		 agreement.setVisibility(View.GONE);
		 terms_of_service=(TextView) findViewById(R.id.terms_of_service);
		 terms_of_service.setVisibility(View.GONE);
		 forget=(TextView) findViewById(R.id.forgetPassword);
		 orRegister.setOnClickListener(listener);
		ok.setOnClickListener(listener);
		forget.setOnClickListener(listener);
	}
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.ORregister:

				Intent intent=new Intent(LoginpageActivity.this,SetNewWordActivity.class);
				startActivity(intent);
				break;
			case R.id.ok:

				Intent intentM=new Intent(LoginpageActivity.this,MainActivity.class);
				startActivity(intentM);
				break;
			case R.id.forgetPassword:

				Intent intentNewP=new Intent(LoginpageActivity.this,SetNewPassword.class);
				startActivity(intentNewP);
				break;

			default:
				break;
			}
		}
	};

}
