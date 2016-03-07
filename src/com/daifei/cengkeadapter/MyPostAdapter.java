package com.daifei.cengkeadapter;

import java.util.List;

import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyPostAdapter extends BaseAdapter {

	private List<MyPostInfomation> list;
	private Context context;
	private LayoutInflater inflater;
	
	public MyPostAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyPostAdapter(Context context,List<MyPostInfomation> list)
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
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(convertView==null)
		{
			holder=new ViewHolder();
			convertView=inflater.inflate(R.layout.mypost_listview_item, null);
			holder.textViewTitle=(TextView)convertView.findViewById(R.id.mypost_item_title);
			holder.textViewTime=(TextView)convertView.findViewById(R.id.mypost_item_time);
			holder.textViewComment=(TextView)convertView.findViewById(R.id.mypost_item_comment);
			holder.textViewParise=(TextView)convertView.findViewById(R.id.mypost_item_praise);
			convertView.setTag(holder);
		}
		else
		{
			holder=(ViewHolder)convertView.getTag();
		}
		holder.textViewTitle.setText(list.get(position).getTextTitle());
		holder.textViewTime.setText(list.get(position).getTextTime());
		holder.textViewComment.setText(list.get(position).getTextComment());
		holder.textViewParise.setText(list.get(position).getTextPraise());
		return convertView;
	}
	
	class ViewHolder
	{
		TextView textViewTitle;
		TextView textViewTime;
		TextView textViewComment;
		TextView textViewParise;
	}

}
