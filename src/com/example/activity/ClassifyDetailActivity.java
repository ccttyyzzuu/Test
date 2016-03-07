package com.example.activity;

import java.util.ArrayList;

import com.daifei.cengkeacticity.PersonCenterActivity;
import com.example.adapter.ClassifyDetailAdapter;
import com.example.feralapp.R;
import com.example.model.ClassifDetailData;

import android.app.Activity;
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
<<<<<<< HEAD
import android.widget.ImageView;
=======
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class ClassifyDetailActivity extends Activity {
	private RadioButton shouye;
	private RadioButton quanzi;
	private RadioButton fenlei;
	private RadioButton meButton;

	ArrayList<ClassifDetailData> list;
	LinearLayout classify_titles;
	ListView listView;
	ClassifDetailData data;
	ClassifyDetailAdapter adapter;
<<<<<<< HEAD
	TextView topTitle;
	ImageView fanhui;
	MyApplication application;
	String[] cateGory = new String[] {"音乐类", "语言/国学", "运动类", "艺术类","同步课程", "备考类", "设计/技能", "早教", "家长汇"};
=======
	String[] cateGory = new String[] { "音乐类", "语言/国学", "运动类", "艺术类", "同步课程",
			"备考类", "设计/技能", "早教", "家长汇" };

<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classify_detail);
		setData();
		
		initView();
		getSkipData();
	}

	public void initView() {
		adapter = new ClassifyDetailAdapter(list, ClassifyDetailActivity.this);
		classify_titles = (LinearLayout) findViewById(R.id.classify_titles);
		listView = (ListView) findViewById(R.id.classify_detail_list);
		listView.setAdapter(adapter);
<<<<<<< HEAD
		fanhui = (ImageView)findViewById(R.id.fanhui);
		fanhui.setOnClickListener(clickListener);
		topTitle = (TextView)findViewById(R.id.title);
	}
	
	public void getSkipData(){
		application = (MyApplication)getApplication();
		Intent intent = getIntent();
		int min = 0;
		int max = application.musicCategory.length;
		int n = intent.getIntExtra("id", 6666);
		if(n > min && n <= max){
			topTitle.setText(application.cateGory[0]);
			addTitle(application.musicCategory,n);
		}
	}
	
	OnClickListener clickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.fanhui:
				Intent intent = new Intent(ClassifyDetailActivity.this, ClassifyActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
	//获取列表数据
	public void setData(){
=======
		shouye = (RadioButton) findViewById(R.id.shouye);
		quanzi = (RadioButton) findViewById(R.id.category);
		fenlei = (RadioButton) findViewById(R.id.fenlei);
		meButton = (RadioButton) findViewById(R.id.me);
		shouye.setOnClickListener(clickListener);
		quanzi.setOnClickListener(clickListener);
		fenlei.setOnClickListener(clickListener);
		meButton.setOnClickListener(clickListener);
	}

	public void setData() {
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
		list = new ArrayList<ClassifDetailData>();
		for (int i = 0; i < 20; i++) {
			data = new ClassifDetailData();
			data.setTu1(R.drawable.image_one);
			data.setTu2(R.drawable.image_two);
			data.setClass_name1("二胡十段兴趣班");
			data.setClass_name2("钢琴初级班");
			data.setApply_number1("2");
			data.setApply_number2("3");
			data.setInstitution1("渝中汉昌");
			data.setInstitution2("渝中微跑");
			data.setType1("乐器");
			data.setType2("乐器");
			data.setDay_number1("3");
			data.setDay_number2("4");
			data.setDiploma1("小学");
			data.setDiploma2("初中");
			list.add(data);
		}

	}
<<<<<<< HEAD
	
	public void addTitle(String[] str,int n){
		for(int i=0;i<str.length;i++){
=======

	public void addTitle() {
		for (int i = 0; i < cateGory.length; i++) {
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd
=======
>>>>>>> origin/feature/daifei
>>>>>>> origin/feature/wangchuan
			TextView titles = new TextView(ClassifyDetailActivity.this);
			LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT);
			params.setMargins(40, 0, 0, 0);
			titles.setLayoutParams(params);
			titles.setText(str[i]);
			if((i + 1) == n){
				titles.setTextColor(getResources().getColor(R.color.mainJu));
			}else{
				titles.setTextColor(getResources().getColor(R.color.zhengwen2));
			}
			titles.setTextSize(12);
			classify_titles.addView(titles);
		}
	}

	OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.shouye:
				Intent intent = new Intent(ClassifyDetailActivity.this,
						CengKeHomePageActivity.class);
				startActivity(intent);
				break;
			case R.id.category:
				Intent intent2 = new Intent(ClassifyDetailActivity.this,
						QuanZiActivity.class);
				startActivity(intent2);
				break;
			case R.id.me:
				Intent intent3=new Intent(ClassifyDetailActivity.this,PersonCenterActivity.class);
				startActivity(intent3);
				break;
			default:
				break;
			}
		}
	};
}
