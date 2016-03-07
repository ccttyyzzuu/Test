package com.example.activity;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.MusicCourseListViewAdapter;
import com.example.feralapp.R;
import com.example.model.MusicCourse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class OrganizationDetailActivity extends Activity{
	ListView listView;
	MusicCourseListViewAdapter adapter;
	private List<MusicCourse> list;
	TextView topTitle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.organization_detail_view);
		getData();
		initView();
	}
	
	//初始化View
	public void initView(){
		listView = (ListView)findViewById(R.id.orgaization_list);
		adapter = new MusicCourseListViewAdapter(list, OrganizationDetailActivity.this);
		listView.setAdapter(adapter);
		topTitle = (TextView)findViewById(R.id.title);
		topTitle.setText("机构详情");
	}
	
	//设置列表数据
	public List<MusicCourse> getData(){
		list=new ArrayList<MusicCourse>();
		for(int i=0;i<10;i++){
			MusicCourse course=new MusicCourse();
			course.setImage(R.drawable.jigou);
			course.setTitle("二胡");
			course.setPersonNumb("5");
			course.setPosition("汉昌");
			course.setInstrument("吉他");
			course.setPrimarySchool("小学");
			list.add(course);
		}
		return list;
	}
}
