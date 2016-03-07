package com.example.activity;

import com.example.feralapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class CourseDetailActivity extends Activity{
	private TextView back;
	private TextView largeTile;
	private TextView share;
	private TextView company;
	private TextView personNumb;
	private RatingBar rating;
	private TextView title;
	private TextView positon;
	private TextView time;
	private ImageView image;
	private TextView detailContent;
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_detail);
		back=(TextView)findViewById(R.id.course_detail_back);
		largeTile=(TextView)findViewById(R.id.course_detail_title_large);
		share=(TextView)findViewById(R.id.course_detail_share);
		company=(TextView)findViewById(R.id.about_us_gongshi);
		personNumb=(TextView)findViewById(R.id.course_detail_person_numb);
		rating=(RatingBar)findViewById(R.id.course_detail_ratingbar);
		title=(TextView)findViewById(R.id.course_detail_title);
		positon=(TextView)findViewById(R.id.course_detail_positon);
		time=(TextView)findViewById(R.id.course_detail_time);
		image=(ImageView)findViewById(R.id.course_detail_image);
		detailContent=(TextView)findViewById(R.id.course_detail_detail_content);
		button=(Button)findViewById(R.id.course_detail_btn_cengke);
		
	}
}
