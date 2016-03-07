package com.daifei.cengkeacticity;

import java.util.ArrayList;
import java.util.List;

import com.daifei.cengkeadapter.MyPostAdapter;
import com.daifei.cengkeadapter.MyPostInfomation;
import com.example.feralapp.R;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * �ҵ�����
 * @author Administrator
 *
 */
public class MyPostActivity extends Activity {

	private ListView myPostListView;
	private MyPostAdapter myPostAdapter;
	private List<MyPostInfomation> data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mypost);
		getData();
		myPostListView=(ListView)findViewById(R.id.mypost_listiew);
		myPostAdapter=new MyPostAdapter(MyPostActivity.this, data);
		myPostListView.setAdapter(myPostAdapter);
	}
	
	public void getData()
	{
		data=new ArrayList<MyPostInfomation>();
		for(int i=0;i<10;++i)
		{
			MyPostInfomation myPostInfomation=new MyPostInfomation();
			myPostInfomation.setTextTitle("������ο��ϸ߼�UI���ʦ��");
			myPostInfomation.setTextTime("2015-12-12");
			myPostInfomation.setTextComment("102");
			myPostInfomation.setTextPraise("103");
			data.add(myPostInfomation);
		}
	}
}
