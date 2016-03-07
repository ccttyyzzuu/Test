package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.ClassifDetailData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassifyDetailAdapter extends BaseAdapter{
	ArrayList<ClassifDetailData> list;
	Context context;
	LayoutInflater inflater;
	
	public ClassifyDetailAdapter(ArrayList<ClassifDetailData> list,Context context){
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
			convertView = inflater.inflate(R.layout.classify_detail_list, null);
			viewHolder = new ViewHolder();
			viewHolder.tu1 = (ImageView)convertView.findViewById(R.id.image_one);
			viewHolder.tu2 = (ImageView)convertView.findViewById(R.id.image_two);
			viewHolder.class_name1 = (TextView)convertView.findViewById(R.id.class_name);
			viewHolder.class_name2 = (TextView)convertView.findViewById(R.id.class_name2);
			viewHolder.apply_number1 = (TextView)convertView.findViewById(R.id.apply_number);
			viewHolder.apply_number2 = (TextView)convertView.findViewById(R.id.apply_number2);
			viewHolder.institution1 = (TextView)convertView.findViewById(R.id.institution);
			viewHolder.institution2 = (TextView)convertView.findViewById(R.id.institution2);
			viewHolder.type1 = (TextView)convertView.findViewById(R.id.type);
			viewHolder.type2 = (TextView)convertView.findViewById(R.id.type2);
			viewHolder.diploma1 = (TextView)convertView.findViewById(R.id.diploma);
			viewHolder.diploma2 = (TextView)convertView.findViewById(R.id.diploma2);
			viewHolder.day_number1 = (TextView)convertView.findViewById(R.id.day_number);
			viewHolder.day_number2 = (TextView)convertView.findViewById(R.id.day_number2);
			convertView.setTag(viewHolder);
		}
		
		viewHolder = (ViewHolder)convertView.getTag();
		viewHolder.tu1.setImageResource(list.get(position).getTu1());
		viewHolder.tu2.setImageResource(list.get(position).getTu2());
		viewHolder.class_name1.setText(list.get(position).getClass_name1());
		viewHolder.class_name2.setText(list.get(position).getClass_name2());
		viewHolder.apply_number1.setText(list.get(position).getApply_number1());
		viewHolder.apply_number2.setText(list.get(position).getApply_number2());
		viewHolder.institution1.setText(list.get(position).getInstitution1());
		viewHolder.institution2.setText(list.get(position).getInstitution2());
		viewHolder.type1.setText(list.get(position).getType1());
		viewHolder.type2.setText(list.get(position).getType2());
		viewHolder.diploma1.setText(list.get(position).getDiploma1());
		viewHolder.diploma2.setText(list.get(position).getDiploma2());
		viewHolder.day_number1.setText(list.get(position).getDay_number1());
		viewHolder.day_number1.setText(list.get(position).getDay_number1());
		return convertView;
	}

	class ViewHolder{
		ImageView tu1;
		ImageView tu2;
		TextView class_name1;
		TextView class_name2;
		TextView apply_number1;
		TextView apply_number2;
		TextView institution1;
		TextView institution2;
		TextView type1;
		TextView type2;
		TextView diploma1;
		TextView diploma2;
		TextView day_number1;
		TextView day_number2;
	}
}
