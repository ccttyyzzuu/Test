package com.ronghong.feralapp.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.ronhong.feralapp.proerty.GradeDescription;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainGrideViewAdapter extends BaseAdapter {
	List<GradeDescription> list;
	LayoutInflater inflater;
	Context context;
	 public MainGrideViewAdapter() {
		// TODO Auto-generated constructor stub
	}
	 public MainGrideViewAdapter(List<GradeDescription> list,Context context) {
			// TODO Auto-generated constructor stub
		 this.list=list;
		 this.context=context;
		 inflater=LayoutInflater.from(context);
		}
	 
	 public void setData(List<GradeDescription> list){
		 this.list=list;
		 this.notifyDataSetChanged();
	 }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(convertView==null){
			convertView=inflater.inflate(R.layout.main_grid_view_item, null);
			holder=new ViewHolder();
			holder.course_img_1=(ImageView) convertView.findViewById(R.id.course_img_4);
			holder.grade_name_1=(TextView) convertView.findViewById(R.id.grade_name_4);
			holder.sigle_up_1=(TextView) convertView.findViewById(R.id.sigle_up_4);
			holder.off_time_1=(TextView)convertView.findViewById(R.id.off_time_4);
			convertView.setTag(holder);			
		}
		holder=(ViewHolder) convertView.getTag();
		holder.course_img_1.setImageResource(list.get(position).getCourse_img_1());
		holder.grade_name_1.setText(list.get(position).getGrade_name_1());
		holder.off_time_1.setText("剩余"+list.get(position).getOff_time_1()+"天");
		holder.sigle_up_1.setText("已报"+list.get(position).getSigle_up_1()+"人");
		return convertView;
	}
	class ViewHolder{
		ImageView course_img_1;
		
		TextView grade_name_1;
		
		TextView sigle_up_1;
		TextView off_time_1;
		
	}

}
