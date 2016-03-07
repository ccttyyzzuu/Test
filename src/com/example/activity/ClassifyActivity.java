package com.example.activity;



import com.example.adapter.ClassifyAdapter;
import com.example.feralapp.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class ClassifyActivity extends Activity {
	int classifyNumber = 9;
	int n = 0;
	
	String[] cateGory = new String[] { "音乐类", "语言/国学", "运动类", "艺术类","同步课程", "备考类", "设计/技能", "早教", "家长汇" };
	String[] musicCategory = new String[] { "钢琴", "打击乐器", "弦乐器", "管乐器", "声乐", "古典乐器", "其他" };
	String[] languageCategory = new String[] { "英语", "日语", "书法", "国学", "其他" };
	String[] exerciseCategory = new String[] { "足球", "篮球", "网球", "高尔夫球", "马术", "壁球", "其他" };
	String[] artCategory = new String[] { "美术", "表演", "主持", "舞蹈", "摄影", "其他" };
	String[] classroomCategory = new String[] { "小学", "初中", "高中", "其他" };
	String[] testCategory = new String[] { "出国备考", "艺术备考", "其他" };
	String[] designCategory = new String[] { "平面设计", "程序设计", "其他" };
	String[] earlyCategory = new String[] { "平面设计", "程序设计", "其他" };
	String[] parentCategory = new String[] { "健身房", "美颜保养", "瘦身", "其他" };
	int Line;
	LinearLayout layout_neibu;
	LinearLayout layout_waibu;
	LayoutParams layoutParams_waibu;
	TextView category;
	LinearLayout centerContent;
	TextView course;
	TextView organization;
	ScrollView gunDongTiao;
	ListView listView;
	LinearLayout replaceable;
	ClassifyAdapter adapter;
	RadioButton shouye;//首页按钮
	RadioButton classify;//分类按钮
	RadioButton quanzi;//圈子按钮
	RadioButton me;//我 按钮
	Intent intent;
	ImageView fanhui;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classify);
		initView();
		centerContent();
		visibleList();
	}

	public void initView() {
		centerContent = (LinearLayout) findViewById(R.id.center_content);
		course = (TextView) findViewById(R.id.course);
		course.setOnClickListener(listener);
		organization = (TextView) findViewById(R.id.organization);
		organization.setOnClickListener(listener);
		gunDongTiao = (ScrollView) findViewById(R.id.gundongtiao);
		replaceable = (LinearLayout) findViewById(R.id.replaceable);
		
		shouye = (RadioButton)findViewById(R.id.shouye);
		shouye.setOnClickListener(listener);
		
		classify = (RadioButton)findViewById(R.id.fenlei);
		classify.setTextColor(getResources().getColor(R.color.mainJu));
		Drawable drawable = getResources().getDrawable(R.drawable.rub_course_category_selected_bg);
		drawable.setBounds(0, 0, 36, 36);
		classify.setCompoundDrawables(null, drawable, null, null);
		classify.setOnClickListener(listener);
		
		quanzi = (RadioButton)findViewById(R.id.category);
		quanzi.setOnClickListener(listener);
		
		me = (RadioButton)findViewById(R.id.me);
		me.setOnClickListener(listener);
		
		fanhui = (ImageView)findViewById(R.id.fanhui);
		fanhui.setVisibility(View.INVISIBLE);
	}

	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			//点击课程按钮，显示课程内容，隐藏机构内容
			case R.id.course:
				gunDongTiao.setVisibility(View.VISIBLE);
				listView.setVisibility(View.GONE);
				course.setTextColor(getResources().getColor(R.color.mainJu));
				organization.setTextColor(getResources().getColor(R.color.zhengwen2));
				break;
			//点击机构按钮，显示机构内容，隐藏课程内容
			case R.id.organization:
				gunDongTiao.setVisibility(View.GONE);
				listView.setVisibility(View.VISIBLE);
				course.setTextColor(getResources().getColor(R.color.zhengwen2));
				organization.setTextColor(getResources().getColor(R.color.minorJu));
				break;
			//跳转到首页
			case R.id.shouye:
				intent = new Intent(ClassifyActivity.this, MainActivity.class);
				startActivity(intent);
				break;
			//跳转到圈子页	
			case R.id.category:
				intent = new Intent(ClassifyActivity.this, QuanZiActivity.class);
				startActivity(intent);
				break;
			//跳转到个人中心
			case R.id.me:
				intent = new Intent(ClassifyActivity.this, MainActivity.class);
				startActivity(intent);
				break;
			
			
			default:
				break;
			}
			if(v.getId() > 0 && v.getId() < 1000){
				intent = new Intent(ClassifyActivity.this, ClassifyDetailActivity.class);
				intent.putExtra("id", v.getId());
				startActivity(intent);
			}
		}
	};

	public void visibleList() {
		listView = new ListView(ClassifyActivity.this);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		listView.setLayoutParams(params);
		listView.setId(88);
		listView.setVisibility(View.GONE);
		adapter = new ClassifyAdapter(cateGory, ClassifyActivity.this);
		listView.setAdapter(adapter);
		replaceable.addView(listView);
	}

	@SuppressLint("ResourceAsColor")
	public void centerContent() {
		for (int i = 0; i < classifyNumber; i++) {
			layout_waibu = new LinearLayout(ClassifyActivity.this);
			layoutParams_waibu = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			layout_waibu.setLayoutParams(layoutParams_waibu);
			layout_waibu.setOrientation(LinearLayout.VERTICAL);
			centerContent.addView(layout_waibu);

			category = new TextView(ClassifyActivity.this);
			layoutParams_waibu = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1.0f);
			layoutParams_waibu.setMargins(8, 12, 0, 0);
			category.setLayoutParams(layoutParams_waibu);
			category.setText(cateGory[i]);
			category.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			category.setTextColor(getResources().getColor(R.color.zhengwen2));
			category.setOnClickListener(listener);
			category.setId(i*1);
			layout_waibu.addView(category);

			if (cateGory[i].equals("音乐类")) {
				addYuanSu(musicCategory);
			} else if (cateGory[i].equals("语言/国学")) {
				addYuanSu(languageCategory);
			} else if (cateGory[i].equals("运动类")) {
				addYuanSu(exerciseCategory);
			} else if (cateGory[i].equals("艺术类")) {
				addYuanSu(artCategory);
			} else if (cateGory[i].equals("同步课程")) {
				addYuanSu(classroomCategory);
			} else if (cateGory[i].equals("备考类")) {
				addYuanSu(testCategory);
			} else if (cateGory[i].equals("设计/技能")) {
				addYuanSu(designCategory);
			} else if (cateGory[i].equals("早教")) {
				addYuanSu(earlyCategory);
			} else if (cateGory[i].equals("家长汇")) {
				addYuanSu(parentCategory);
			}
		}
	}

	public void addYuanSu(String[] str) {
		if ((str.length % 3) > 0) {
			Line = (str.length / 3) + 1;
		} else if ((str.length % 3) == 0) {
			Line = (str.length / 3);
		}

		for (int j = 0; j < Line; j++) {
			
			layoutParams_waibu = new LayoutParams(LayoutParams.MATCH_PARENT, 0, 1.0f);
			layoutParams_waibu.setMargins(25, 15, 25, 0);
			layout_neibu = new LinearLayout(ClassifyActivity.this);
			layout_neibu.setLayoutParams(layoutParams_waibu);
			layout_neibu.setOrientation(LinearLayout.HORIZONTAL);
			layout_waibu.addView(layout_neibu);//
			TextView yuansu1 = new TextView(ClassifyActivity.this);
			layoutParams_waibu = new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f);
			layoutParams_waibu.setMargins(0, 0, 10, 0);
			yuansu1.setLayoutParams(layoutParams_waibu);
			yuansu1.setGravity(Gravity.CENTER);
			yuansu1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			yuansu1.setBackgroundResource(R.drawable.kecheng_beijing);
			yuansu1.setText(str[j * 3]);
			++n;
			yuansu1.setId(n);
			yuansu1.setOnClickListener(listener);

			TextView yuansu2 = new TextView(ClassifyActivity.this);
			layoutParams_waibu.setMargins(10, 0, 10, 0);
			yuansu2.setLayoutParams(layoutParams_waibu);
			yuansu2.setGravity(Gravity.CENTER);
			yuansu2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			++n;
			yuansu2.setId(n);
			yuansu2.setOnClickListener(listener);

			if (((j * 3) + 1) >= str.length) {
				yuansu2.setText("");

			} else {
				yuansu2.setText(str[(j * 3) + 1]);
				yuansu2.setBackgroundResource(R.drawable.kecheng_beijing);
			}

			TextView yuansu3 = new TextView(ClassifyActivity.this);
			layoutParams_waibu.setMargins(10, 0, 0, 0);
			yuansu3.setLayoutParams(layoutParams_waibu);
			yuansu3.setGravity(Gravity.CENTER);
			yuansu3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			++n;
			yuansu3.setId(n);
			yuansu3.setOnClickListener(listener);

			if (((j * 3) + 2) >= str.length) {
				yuansu3.setText("");

			} else {
				yuansu3.setBackgroundResource(R.drawable.kecheng_beijing);
				yuansu3.setText(str[(j * 3) + 2]);
			}

			layout_neibu.addView(yuansu1);
			layout_neibu.addView(yuansu2);
			layout_neibu.addView(yuansu3);
		}
	}
}
