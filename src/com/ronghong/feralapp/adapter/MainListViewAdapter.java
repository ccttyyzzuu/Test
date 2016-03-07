package com.ronghong.feralapp.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.ronghong.feralapp.customview.CustomGridView;
import com.ronhong.feralapp.proerty.Course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainListViewAdapter extends BaseAdapter {
	List<Course> list;
	LayoutInflater inflater;
	Context context;
	
	
	public MainListViewAdapter() {
		// TODO Auto-generated constructor stub
	}
	public MainListViewAdapter(List<Course> list,Context context) {
		// TODO Auto-generated constructor stub
		this.list=list;
		this.context=context;
		inflater=LayoutInflater.from(context);
	}
	
	public void setData(List<Course> list){
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
			holder=new ViewHolder();
			convertView=inflater.inflate(R.layout.main_list_view_item, null);
			holder.course_img_1=(ImageView) convertView.findViewById(R.id.course_img_1);
			holder.course_img_2=(ImageView) convertView.findViewById(R.id.course_img_2);
			holder.course_img_3=(ImageView) convertView.findViewById(R.id.course_img_3);
			holder.course_img_4=(ImageView) convertView.findViewById(R.id.course_img_4);
			holder.grade_name_1=(TextView) convertView.findViewById(R.id.grade_name_1);
			holder.grade_name_2=(TextView) convertView.findViewById(R.id.grade_name_2);
			holder.grade_name_3=(TextView) convertView.findViewById(R.id.grade_name_3);
			holder.grade_name_4=(TextView) convertView.findViewById(R.id.grade_name_4);
			holder.course_name=(TextView) convertView.findViewById(R.id.course_name);
			holder.off_time_1=(TextView) convertView.findViewById(R.id.off_time_1);
			holder.off_time_2=(TextView) convertView.findViewById(R.id.off_time_2);
			holder.off_time_3=(TextView) convertView.findViewById(R.id.off_time_3);
			holder.off_time_4=(TextView) convertView.findViewById(R.id.off_time_4);
			holder.sigle_up_1=(TextView) convertView.findViewById(R.id.sigle_up_1);
			holder.sigle_up_2=(TextView) convertView.findViewById(R.id.sigle_up_2);
			holder.sigle_up_3=(TextView) convertView.findViewById(R.id.sigle_up_3);
			holder.sigle_up_4=(TextView) convertView.findViewById(R.id.sigle_up_4);
			//holder.main_listview_item_gridview=(CustomGridView) convertView.findViewById
					//(R.id.main_listview_item_gridview);
			convertView.setTag(holder);						
		}
		holder=(ViewHolder) convertView.getTag();
		holder.course_name.setText(list.get(position).getCourse_name());
		//MainGrideViewAdapter grideViewAdapter = null;
		//holder.main_listview_item_gridview.setAdapter(grideViewAdapter);
		holder.course_img_1.setImageResource(list.get(position).getCourse_img_1());
		holder.course_img_2.setImageResource(list.get(position).getCourse_img_2());
		holder.course_img_3.setImageResource(list.get(position).getCourse_img_3());
		holder.course_img_4.setImageResource(list.get(position).getCourse_img_4());
		holder.grade_name_1.setText(list.get(position).getGrade_name_1());
		holder.grade_name_2.setText(list.get(position).getGrade_name_2());
		holder.grade_name_3.setText(list.get(position).getGrade_name_3());
		holder.grade_name_4.setText(list.get(position).getGrade_name_4());
		holder.off_time_1.setText("剩余"+list.get(position).getOff_time_1()+"天");
		holder.off_time_2.setText("剩余"+list.get(position).getOff_time_2()+"天");
		holder.off_time_3.setText("剩余"+list.get(position).getOff_time_3()+"天");
		holder.off_time_4.setText("剩余"+list.get(position).getOff_time_4()+"天");
		holder.sigle_up_1.setText("已报"+list.get(position).getSigle_up_1()+"人");
		holder.sigle_up_2.setText("已报"+list.get(position).getSigle_up_2()+"人");
		holder.sigle_up_3.setText("已报"+list.get(position).getSigle_up_3()+"人");
		holder.sigle_up_4.setText("已报"+list.get(position).getSigle_up_4()+"人");
		
		return convertView;
	}
	
	class ViewHolder{
		TextView course_name;
		ImageView course_img_4;
		ImageView course_img_3;
		ImageView course_img_2;
		ImageView course_img_1;
		TextView grade_name_1;
		TextView grade_name_2;
		TextView grade_name_3;
		TextView grade_name_4;
		TextView sigle_up_1;
		TextView sigle_up_2;
		TextView sigle_up_3;
		TextView sigle_up_4;
		TextView off_time_1;
		TextView off_time_2;
		TextView off_time_3;
		TextView off_time_4;
		CustomGridView main_listview_item_gridview;
	}

}
