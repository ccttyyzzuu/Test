package com.example.adapter;



import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassifyAdapter extends BaseAdapter {
	String[] cateGory;
	Context context;
	LayoutInflater inflater;
	
	public ClassifyAdapter(String[] cateGory,Context context){
		this.cateGory = cateGory;
		this.context = context;
		inflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return cateGory.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return cateGory[position];
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
			convertView = inflater.inflate(R.layout.classify_list, null);
			viewHolder = new ViewHolder();
			viewHolder.biaoTou = (TextView)convertView.findViewById(R.id.biaotou);
			viewHolder.tu1 = (ImageView)convertView.findViewById(R.id.tu_one);
			viewHolder.tu2 = (ImageView)convertView.findViewById(R.id.tu_two);
			viewHolder.tu3 = (ImageView)convertView.findViewById(R.id.tu_three);
			viewHolder.tu4 = (ImageView)convertView.findViewById(R.id.tu_four);
			convertView.setTag(viewHolder);
		}
		
		viewHolder = (ViewHolder)convertView.getTag();
		viewHolder.biaoTou.setText(cateGory[position]);
		viewHolder.tu1.setImageResource(R.drawable.tu1);
		viewHolder.tu2.setImageResource(R.drawable.tu2);
		viewHolder.tu3.setImageResource(R.drawable.tu3);
		viewHolder.tu4.setImageResource(R.drawable.tu4);
		return convertView;
	}
	
	
	class ViewHolder{
		TextView biaoTou;
		ImageView tu1;
		ImageView tu2;
		ImageView tu3;
		ImageView tu4;
	}
}
