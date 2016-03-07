package com.example.activity;

import java.util.ArrayList;

import com.daifei.cengkeacticity.PersonCenterActivity;
import com.example.adapter.CircleAdapter;
import com.example.feralapp.R;
import com.example.model.CircleData;

import android.app.Activity;
import android.content.Intent;
<<<<<<< HEAD
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
=======
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuanZiActivity extends Activity{
	private RadioButton shouye;
	private RadioButton quanzi;
	private RadioButton fenlei;
	private RadioButton meButton;
	
	ListView listView;
	ArrayList<CircleData> list;
	CircleAdapter adapter;
	TextView topTitle;
	ImageView fanhui;
	RadioButton shouye;//首页按钮
	RadioButton classify;//分类按钮
	RadioButton quanzi;//圈子按钮
	RadioButton me;//我 按钮
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle);
		addData();
		initView();
	}
	
	public void initView(){
		adapter = new CircleAdapter(list, QuanZiActivity.this);
		listView = (ListView)findViewById(R.id.circle_list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(clickListener);
		topTitle = (TextView)findViewById(R.id.title);
		topTitle.setText("圈子");
<<<<<<< HEAD
		fanhui = (ImageView)findViewById(R.id.fanhui);
		fanhui .setVisibility(View.INVISIBLE);
		
		shouye = (RadioButton)findViewById(R.id.shouye);
		shouye.setOnClickListener(listener);
		
		classify = (RadioButton)findViewById(R.id.fenlei);
		
		classify.setOnClickListener(listener);
		
		quanzi = (RadioButton)findViewById(R.id.category);
		quanzi.setTextColor(getResources().getColor(R.color.mainJu));
		Drawable drawable = getResources().getDrawable(R.drawable.rub_course_group_selected_bg);
		drawable.setBounds(0, 0, 36, 36);
		quanzi.setCompoundDrawables(null, drawable, null, null);
		quanzi.setOnClickListener(listener);
		
		me = (RadioButton)findViewById(R.id.me);
		me.setOnClickListener(listener);
=======
		shouye = (RadioButton) findViewById(R.id.shouye);
		quanzi = (RadioButton) findViewById(R.id.category);
		fenlei = (RadioButton) findViewById(R.id.fenlei);
		meButton = (RadioButton) findViewById(R.id.me);
		shouye.setOnClickListener(clickListener);
		quanzi.setOnClickListener(clickListener);
		fenlei.setOnClickListener(clickListener);
		meButton.setOnClickListener(clickListener);
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			//跳转到首页
			case R.id.shouye:
				intent = new Intent(QuanZiActivity.this, MainActivity.class);
				startActivity(intent);
				break;
			//跳转到圈子页	
			case R.id.fenlei:
				intent = new Intent(QuanZiActivity.this, ClassifyActivity.class);
				startActivity(intent);
				break;
			//跳转到个人中心
			case R.id.me:
				intent = new Intent(QuanZiActivity.this, MainActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
	
	
	OnItemClickListener clickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			// TODO Auto-generated method stub
			switch (arg2) {
			case 0:
				intent = new Intent(QuanZiActivity.this, QuanZiDetailActivity.class);
				startActivity(intent);
				break;
			case 1:
				intent = new Intent(QuanZiActivity.this, QuanZiDetailActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
	public void addData(){
		list = new ArrayList<CircleData>();
		CircleData data = new CircleData();
		data.setCircle(R.drawable.huangcircle);
		data.setCircle_name("同城英语圈");
		data.setPeople_number("1050");
		data.setSignature("热爱英语，疯狂英语");
		list.add(data);
		
		data = new CircleData();
		data.setCircle(R.drawable.jucircle);
		data.setCircle_name("同城文学圈");
		data.setPeople_number("800");
		data.setSignature("热爱文学，四书五经");
		list.add(data);
	}
	OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.shouye:
				Intent intent = new Intent(QuanZiActivity.this,
						CengKeHomePageActivity.class);
				startActivity(intent);
				break;
			case R.id.fenlei:
				Intent intent2 = new Intent(QuanZiActivity.this,
						ClassifyDetailActivity.class);
				startActivity(intent2);
				break;
			case R.id.me:
				Intent intent3=new Intent(QuanZiActivity.this,PersonCenterActivity.class);
				startActivity(intent3);
				break;
			default:
				break;
			}
		}
	};
}
