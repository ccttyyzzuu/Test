package com.daifei.cengkelistview;

import java.util.List;

import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * �໬ɾ��ListView������
 * @author Administrator
 *
 */
public class MyListViewAdapter extends BaseAdapter {

	List<MessageInfo> list;
	Context context;
	LayoutInflater inflater;
	
	public MyListViewAdapter() {
		super();
	}

	public MyListViewAdapter(Context context,List<MessageInfo> list) {
		this.list = list;
		this.context = context;
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
			convertView=inflater.inflate(R.layout.message_listview_item, null);
			holder.textViewContent=(TextView)convertView.findViewById(R.id.message_content);
			holder.textViewTime=(TextView)convertView.findViewById(R.id.message_time);
			convertView.setTag(holder);
			
		}
		else
		{
			holder=(ViewHolder)convertView.getTag();
		}
		holder.textViewContent.setText(list.get(position).getTextContent());
		holder.textViewTime.setText(list.get(position).getTextTime());
		return convertView;
	}
	
	class ViewHolder
	{
		TextView textViewContent;
		TextView textViewTime;
	}

}
