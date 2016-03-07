package com.example.activity;

import java.util.ArrayList;

import com.example.adapter.QuanZiDetailAdapter;
import com.example.feralapp.R;
import com.example.model.QuanZiDetailData;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class QuanZiDetailActivity extends Activity{
	ArrayList<QuanZiDetailData> list;
	ListView listView;
	QuanZiDetailData data;
	QuanZiDetailAdapter adapter;
	TextView topTitle;
	ImageView fanhui;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quanzi_detail_view);
		getData();
		initView();
	}
	
	public void initView(){
		listView = (ListView)findViewById(R.id.quanzi_list);
		adapter = new QuanZiDetailAdapter(list, QuanZiDetailActivity.this);
		listView.setAdapter(adapter);
		topTitle = (TextView)findViewById(R.id.title);
		topTitle.setText("同城文学圈");
		fanhui = (ImageView)findViewById(R.id.fanhui);
		fanhui.setOnClickListener(clickListener);
	}
	
	
	OnClickListener clickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.fanhui:
				Intent intent = new Intent(QuanZiDetailActivity.this, QuanZiActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}
		}
	};
	public void getData(){
		list = new ArrayList<QuanZiDetailData>();
		for(int i=0;i<10;i++){
			data = new QuanZiDetailData();
			data.setFatie_time("40分中前");
			data.setFatieren("豆芽");
			data.setPinglun_number("230");
			data.setTiezi_content("热爱文学，四书五经，中国文学宝典");
			data.setTiezi_title("中国文学大典");
			list.add(data);
		}
	}
	
}
