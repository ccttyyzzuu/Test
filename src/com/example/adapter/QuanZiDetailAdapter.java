package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.QuanZiDetailData;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class QuanZiDetailAdapter extends BaseAdapter {
	ArrayList<QuanZiDetailData> list;
	Context context;
	LayoutInflater inflater;
	
	public QuanZiDetailAdapter(ArrayList<QuanZiDetailData> list,Context context){
		this.list = list;
		this.context = context;
		inflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		if(convertView == null){
			convertView = inflater.inflate(R.layout.quanzi_list_view, null);
			viewHolder = new ViewHolder();
			viewHolder.tiezi_title = (TextView)convertView.findViewById(R.id.tiezi_title);
			viewHolder.tiezi_content = (TextView)convertView.findViewById(R.id.tiezi_content);
			viewHolder.fatieren = (TextView)convertView.findViewById(R.id.fatieren);
			viewHolder.pinglun_number = (TextView)convertView.findViewById(R.id.pinglun_number);
			viewHolder.fatie_time = (TextView)convertView.findViewById(R.id.fatie_time);
			convertView.setTag(viewHolder);
		}
		
		viewHolder = (ViewHolder)convertView.getTag();
		viewHolder.fatie_time.setText(list.get(position).getFatie_time());
		viewHolder.tiezi_content.setText(list.get(position).getTiezi_content());
		viewHolder.fatieren.setText(list.get(position).getFatieren());
		viewHolder.pinglun_number.setText(list.get(position).getPinglun_number());
		viewHolder.tiezi_title.setText(list.get(position).getTiezi_title());
		return convertView;
	}

	class ViewHolder{
		TextView tiezi_title;
		TextView tiezi_content;
		TextView fatieren;
		TextView pinglun_number;
		TextView fatie_time;
	}
}
