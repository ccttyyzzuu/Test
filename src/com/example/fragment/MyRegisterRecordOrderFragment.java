package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.AllUseListViewAdaper;
import com.example.feralapp.R;
import com.example.model.AllCourse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MyRegisterRecordOrderFragment extends Fragment {
	private ListView listView;
	private AllUseListViewAdaper adapter;
	private List<AllCourse> list;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout layout=new LinearLayout(getActivity());
		layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		View view=inflater.inflate(R.layout.fragment_my_register_record_order, layout, true);
		listView=(ListView)view.findViewById(R.id.order_listview);
		adapter=new AllUseListViewAdaper(getData(), getActivity());
		listView.setAdapter(adapter);
		return view;
	}
	/**
	 * 
	 * @return 
	 */
	public List<AllCourse> getData(){
		list=new ArrayList<AllCourse>();
		for(int i=0;i<10;i++){
			AllCourse allCourse=new AllCourse();
			allCourse.setImage(R.drawable.ic_launcher);
			allCourse.setTitle("二胡");
			allCourse.setPosition("渝中汉昌");
			allCourse.setTime("02-02 上午 9:00");
			allCourse.setDay("5");
			allCourse.setIsCheck("未受理");
			list.add(allCourse);
		}
		return list;
	}
}
