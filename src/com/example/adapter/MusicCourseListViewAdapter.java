package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.MusicCourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MusicCourseListViewAdapter extends BaseAdapter {
	List<MusicCourse> list;
	Context context;
	LayoutInflater inflater;

	public MusicCourseListViewAdapter(List<MusicCourse> list, Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.list = list;
		inflater=LayoutInflater.from(context);
	}

	public MusicCourseListViewAdapter() {
		// TODO Auto-generated constructor stub
	}
	public void setDate(List<MusicCourse> list){
		this.list=list;
		this.notifyDataSetChanged();
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
		ViewHolder holder=null;
		if(convertView==null){
			holder=new ViewHolder();
			convertView=inflater.inflate(R.layout.activity_music_course_list_item, null);
			holder.image=(TextView)convertView.findViewById(R.id.course_list_listview_image);
			holder.title=(TextView)convertView.findViewById(R.id.course_list_listview_title);
			holder.person_numb=(TextView)convertView.findViewById(R.id.course_list_listview_person_numb);
			holder.position=(TextView)convertView.findViewById(R.id.course_list_listview_position);
			holder.instrument=(TextView)convertView.findViewById(R.id.course_list_listview_instrument);
			holder.school=(TextView)convertView.findViewById(R.id.course_list_listview_primary_school);
			convertView.setTag(holder);
		}
		holder=(ViewHolder)convertView.getTag();
		holder.image.setBackgroundResource(list.get(position).getImage());
		holder.title.setText(list.get(position).getTitle());
		holder.person_numb.setText(list.get(position).getPersonNumb());
		holder.position.setText(list.get(position).getPosition());
		holder.instrument.setText(list.get(position).getInstrument());
		holder.school.setText(list.get(position).getPrimarySchool());
		
		return convertView;
	}
	class ViewHolder{
		TextView image;
		TextView title;
		TextView person_numb;
		TextView position;
		TextView instrument;
		TextView school;
		TextView day;
	}
}
