package com.example.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.daifei.cengkeacticity.PersonCenterActivity;
import com.daifei.cengkeacticity.PersonInfomationActivity;
import com.example.feralapp.R;
import com.ronghong.feralapp.adapter.MainListViewAdapter;
import com.ronhong.feralapp.proerty.Course;
import com.ronhong.feralapp.proerty.GradeDescription;

import android.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class CengKeHomePageActivity extends Activity {
	private TextView shouye;
	private TextView  fenlei;
	private TextView quanzi;
	private TextView wo ;
	Course course;
	List<Course> list=new ArrayList<Course>();
	MainListViewAdapter mainListViewAdapter;
	ListView listView;
    List<Map<String,GradeDescription>> gridViewList=new ArrayList<Map<String,GradeDescription>>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}
	OnClickListener clickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.main_bottom_menu_home:
				
				break;
			case R.id.main_bottom_menu_category:
<<<<<<< HEAD:src/com/example/activity/MainActivity.java
					Intent intent=new Intent(MainActivity.this,ClassifyActivity.class);
=======
					Intent intent=new Intent(CengKeHomePageActivity.this,ClassifyDetailActivity.class);
<<<<<<< HEAD
>>>>>>> 3fa69f41e186a32e8128bc9a77791cf427f98cdd:src/com/example/activity/CengKeHomePageActivity.java
=======
>>>>>>> origin/feature/daifei:src/com/example/activity/CengKeHomePageActivity.java
>>>>>>> origin/feature/wangchuan
					startActivity(intent);
					fenlei.setCompoundDrawables(null, getResources().getDrawable(R.drawable.rub_course_category_selected_bg), null, null);
				break;
			case R.id.main_bottom_menu_group:
				Intent intent1=new Intent(CengKeHomePageActivity.this,QuanZiActivity.class);
				quanzi.setCompoundDrawables(null, getResources().getDrawable(R.drawable.rub_course_group_selected_bg), null, null);
				startActivity(intent1);
			break;
			case R.id.main_bottom_menu_me:
				wo.setCompoundDrawables(null, getResources().getDrawable(R.drawable.rub_course_me_selected_bg), null, null);
				Intent intent2=new Intent(CengKeHomePageActivity.this,PersonCenterActivity.class);				
				startActivity(intent2);
			break;

			default:
				break;
			}
		}
	};
	private void initView() {
		// TODO Auto-generated method stub
		listView=(ListView) findViewById(R.id.main_listView);
		setData();
		mainListViewAdapter=new MainListViewAdapter(list, CengKeHomePageActivity.this);
		listView.setAdapter(mainListViewAdapter);
		shouye=(TextView)findViewById(R.id.main_bottom_menu_home);
		fenlei=(TextView)findViewById(R.id.main_bottom_menu_category);
		quanzi=(TextView)findViewById(R.id.main_bottom_menu_group);
		wo=(TextView)findViewById(R.id.main_bottom_menu_me);
		shouye.setOnClickListener(clickListener);
		fenlei.setOnClickListener(clickListener);
		quanzi.setOnClickListener(clickListener);
		wo.setOnClickListener(clickListener);
	}
	
	
	
	public void setData(){
		Course course=new Course();
		course.setCourse_name("音乐");
		course.setCourse_img_1(R.drawable.ic_launcher);
		course.setCourse_img_2(R.drawable.ic_launcher);
		course.setCourse_img_3(R.drawable.ic_launcher);
		course.setCourse_img_4(R.drawable.ic_launcher);

		course.setGrade_name_1("古筝");
		course.setGrade_name_2("钢琴");
		course.setGrade_name_3("小提琴");
		course.setGrade_name_4("二胡");

		course.setOff_time_1(1);
		course.setOff_time_2(5);
		course.setOff_time_3(3);
		course.setOff_time_4(2);
		course.setSigle_up_1(1);
		course.setSigle_up_2(10);
		course.setSigle_up_3(2);
		course.setSigle_up_4(5);
		list.add(course);
		
		course=new Course();

		course.setCourse_name("音乐");

		course.setCourse_img_1(R.drawable.ic_launcher);
		course.setCourse_img_2(R.drawable.ic_launcher);
		course.setCourse_img_3(R.drawable.ic_launcher);
		course.setCourse_img_4(0);

		course.setGrade_name_1("音乐");
		course.setGrade_name_2("音乐");
		course.setGrade_name_3("音乐");

		course.setGrade_name_4("");
		course.setOff_time_1(1);
		course.setOff_time_2(5);
		course.setOff_time_3(3);
		course.setOff_time_4(0);
		course.setSigle_up_1(1);
		course.setSigle_up_2(10);
		course.setSigle_up_3(2);
		course.setSigle_up_4(0);
		list.add(course);
		
	}

}
