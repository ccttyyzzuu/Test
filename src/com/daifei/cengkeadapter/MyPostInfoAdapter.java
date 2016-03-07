package com.daifei.cengkeadapter;

import java.util.List;

import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyPostInfoAdapter extends BaseAdapter {

	private List<PostInfo> list;
	private Context context;
	private LayoutInflater inflater;
	
	public MyPostInfoAdapter()
	{}
	
	public MyPostInfoAdapter(Context context,List<PostInfo> list)
	{
		this.context=context;
		this.list=list;
		inflater=LayoutInflater.from(context);
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
	public View getView(int postion, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(convertView==null)
		{
			holder=new ViewHolder();
			convertView=inflater.inflate(R.layout.post_infomation_item, null);
			holder.textViewName=(TextView)convertView.findViewById(R.id.post_infomation_friends);
			holder.textViewContent=(TextView)convertView.findViewById(R.id.post_infomation_comment_content);
			holder.textViewTime=(TextView)convertView.findViewById(R.id.post_infomation_comment_time);
			convertView.setTag(holder);
		}
		holder=(ViewHolder)convertView.getTag();
		holder.textViewName.setText(list.get(postion).getFriends());
		holder.textViewContent.setText(list.get(postion).getCommentContent());
		holder.textViewTime.setText(list.get(postion).getCommentTime());
		return convertView;
	}

	class ViewHolder
	{
		TextView textViewName;
		TextView textViewContent;
		TextView textViewTime;
	}
}
