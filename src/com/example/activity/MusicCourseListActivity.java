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

public class MusicCourseListActivity extends Activity{
	private TextView back;
	private TextView time;
	private ListView listView;
	private MusicCourseListViewAdapter adapter;
	private List<MusicCourse> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_course_list);
		back=(TextView)findViewById(R.id.course_list_back);
		time=(TextView)findViewById(R.id.course_list_time);
		listView=(ListView)findViewById(R.id.course_list_listview);
		adapter=new MusicCourseListViewAdapter(getData(), MusicCourseListActivity.this);
		listView.setAdapter(adapter);
	}
	/**
	 * 
	 * @return
	 */
	public List<MusicCourse> getData(){
		list=new ArrayList<MusicCourse>();
		for(int i=0;i<10;i++){
			MusicCourse course=new MusicCourse();
			course.setImage(R.drawable.ic_launcher);
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
