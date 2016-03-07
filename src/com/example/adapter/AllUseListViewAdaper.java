package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.AllCourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class AllUseListViewAdaper extends BaseAdapter {
	List<AllCourse> list;
	Context context;
	LayoutInflater inflater;

	public AllUseListViewAdaper() {
		// TODO Auto-generated constructor stub
	}

	public AllUseListViewAdaper(List<AllCourse> list, Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.list = list;
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
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.alluse_listview_item, null);
			holder.image = (TextView) convertView.findViewById(R.id.alluse_listview_image);
			holder.title = (TextView) convertView.findViewById(R.id.alluse_listview_title);
			holder.positon = (TextView) convertView.findViewById(R.id.alluse_listview_company);
			holder.time = (TextView) convertView.findViewById(R.id.alluse_listview_time);
			holder.day=(TextView)convertView.findViewById(R.id.alluse_listview_remaid_day);
			holder.isCheck = (TextView) convertView.findViewById(R.id.alluse_listview_check);
			convertView.setTag(holder);
		}
		holder = (ViewHolder) convertView.getTag();
		holder.image.setBackgroundResource(list.get(position).getImage());
		holder.title.setText(list.get(position).getTitle());
		holder.positon.setText(list.get(position).getPosition());
		holder.time.setText(list.get(position).getTime());
		holder.day.setText(list.get(position).getDay());
		holder.isCheck.setText(list.get(position).getIsCheck());
		return convertView;
	}

	class ViewHolder {
		TextView image;
		TextView title;
		TextView positon;
		TextView time;
		TextView isCheck;
		TextView day;

	}
}
