package com.daifei.cengkeacticity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.daifei.cengkeadapter.MyPostInfoAdapter;
import com.daifei.cengkeadapter.PostInfo;
import com.example.feralapp.R;

/**
 * ������Ϣҳ��
 * @author Administrator
 *
 */
public class PostInfomationActivity extends Activity {

	private ImageView imageViewPostInfoHead;//ͷ��
	private TextView textViewPostInfoName;//�û���
	private TextView textViewPostInfoTime;//ʱ��
	private TextView textViewPostInfoGenre;//����
	private TextView textViewPostInfoPraise;//����
	private TextView textViewPostInfocomment;//����
	private ImageView imageViewShowPicture;//չʾͼƬ
	private TextView textViewPostInfoDetails;//����ϸ��
	private ListView listViewPostInfo;//չʾ��Ϣ��listview
	private TextView textViewClickComment;//�������
	private TextView textViewClickPraise;//�������
	
	private MyPostInfoAdapter myPostInfoAdapter;
	private List<PostInfo> data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post_infomation);
		getData();
		initView();
	}
	
	public void initView()
	{
		listViewPostInfo=(ListView)findViewById(R.id.post_infomation_listview);
		myPostInfoAdapter=new MyPostInfoAdapter(PostInfomationActivity.this,data);
		listViewPostInfo.setAdapter(myPostInfoAdapter);
		
		imageViewPostInfoHead=(ImageView)findViewById(R.id.post_infomation_head);
		
		textViewPostInfoName=(TextView)findViewById(R.id.post_infomation_name);
		
		textViewPostInfoTime=(TextView)findViewById(R.id.post_infomation_time);
		
		textViewPostInfoGenre=(TextView)findViewById(R.id.post_infomation_genre);
		
		textViewPostInfoPraise=(TextView)findViewById(R.id.post_infomation_praise);
		
		textViewPostInfocomment=(TextView)findViewById(R.id.post_infomation_comment);
		
		imageViewShowPicture=(ImageView)findViewById(R.id.post_infomation_show_picture);
		
		textViewPostInfoDetails=(TextView)findViewById(R.id.post_infomation_details);
		
		textViewClickComment=(TextView)findViewById(R.id.post_infomation_click_comment);
		
		textViewClickPraise=(TextView)findViewById(R.id.post_infomation_click_praise);
		
		
		
		
		
		
	}
	
	public void getData()
	{
		data=new ArrayList<PostInfo>();
		for(int i=0;i<5;++i)
		{
			PostInfo postInfo=new PostInfo();
			postInfo.setFriends("hanlei");
			postInfo.setCommentContent("limeimei");
			postInfo.setCommentTime("2015-12-11");
			data.add(postInfo);
		}
	}
	
	
}
