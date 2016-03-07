package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.CircleData;
   
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CircleAdapter extends BaseAdapter {
	ArrayList<CircleData> list;
	Context context;
	LayoutInflater inflater;
	
	public CircleAdapter(ArrayList<CircleData> list,Context context){
		this.list = list;
		this.context = context;
		this.inflater = LayoutInflater.from(context);
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
			convertView = inflater.inflate(R.layout.circle_list, null);
			viewHolder = new ViewHolder();
			viewHolder.circle = (ImageView)convertView.findViewById(R.id.circle);
			viewHolder.circle_name = (TextView)convertView.findViewById(R.id.circle_name);
			viewHolder.signature = (TextView)convertView.findViewById(R.id.signature);
			viewHolder.people_number = (TextView)convertView.findViewById(R.id.people_number);
			convertView.setTag(viewHolder);
		}
		
		viewHolder = (ViewHolder)convertView.getTag();
		viewHolder.circle.setImageResource(list.get(position).getCircle());
		viewHolder.circle_name.setText(list.get(position).getCircle_name());
		viewHolder.signature.setText(list.get(position).getSignature());
		viewHolder.people_number.setText(list.get(position).getPeople_number());
		return convertView;
	}
	
	class ViewHolder{
		ImageView circle;
		TextView circle_name;
		TextView signature;
		TextView people_number;
	}

}
