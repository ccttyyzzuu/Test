package com.daifei.cengkelistview;

import java.util.ArrayList;
import java.util.List;

import com.daifei.cengkelistview.MyListView.OnDeleteListener;
import com.example.feralapp.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * ����LISTVIEW�Ƿ����
 * @author Administrator
 *
 */
public class CustomViewActivity extends Activity {

	private MyListView listView;
	private MyListViewAdapter myListViewAdapter;
	List<MessageInfo> data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customview);
		getData();
		listView=(MyListView)findViewById(R.id.message_listview);
		myListViewAdapter=new MyListViewAdapter(CustomViewActivity.this, data);
		listView.setAdapter(myListViewAdapter);
		listView.setOnDeleteListener(new OnDeleteListener() {
			
			@Override
			public void OnDelete(int index) {
				// TODO Auto-generated method stub
				data.remove(index);
				myListViewAdapter.notifyDataSetChanged();
			}
		});
	}
	
	public void getData()
	{
		data=new ArrayList<MessageInfo>();
		for(int i=0;i<10;++i)
		{
			MessageInfo messageInfo=new MessageInfo();
			messageInfo.setTextContent("����");
			messageInfo.setTextTime("�¼�");
			data.add(messageInfo);
		}
	}
}
