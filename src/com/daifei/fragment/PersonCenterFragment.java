package com.daifei.fragment;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.feralapp.R;

public class PersonCenterFragment extends Fragment {

	private ImageView imageViewLeft;//�û������ƶ�
	private TextView textViewLogRegister;//�û���¼ע��
	private TextView textViewPerCenterSub;//����ԤԼ��Ϣ
	private TextView  textViewPerCenterAccSuf;//����ԤԼ�ɹ�
	private TextView textViewPerCenterPost;//�û�����
	private TextView textViewPerCenterApplyRec;//�����¼
	private TextView textViewPerCenterMyPost;//�ҵ�����
	private TextView textViewPerCenterMyCollect;//�ҵ��ղ�
	private TextView textViewPerCenterMyMessage;//�ҵ���Ϣ
	private TextView textViewPerCenterMySetting;//�ҵ�����
	private View view;
	 static int count;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view=inflater.inflate(R.layout.activity_person_center, null);
		Intent intent=getActivity().getIntent();
		myBrocast.onReceive(getActivity(), intent);
		initView();
		return view;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	public void initView()
	{
		imageViewLeft=(ImageView)view.findViewById(R.id.person_center_pre_left);
		imageViewLeft.setOnClickListener(listener);
		
		textViewLogRegister=(TextView)view.findViewById(R.id.person_center_register_login);
		textViewLogRegister.setOnClickListener(listener);
		
		textViewPerCenterSub=(TextView)view.findViewById(R.id.person_center_subscribe);
		textViewPerCenterSub.setOnClickListener(listener);
		
		textViewPerCenterAccSuf=(TextView)view.findViewById(R.id.person_center_accept_sucessful);
		textViewPerCenterAccSuf.setOnClickListener(listener);
		
		textViewPerCenterPost=(TextView)view.findViewById(R.id.person_center_post);
		textViewPerCenterPost.setOnClickListener(listener);
		
		textViewPerCenterApplyRec=(TextView)view.findViewById(R.id.person_center_my_apply_record);
		textViewPerCenterApplyRec.setOnClickListener(listener);
		
		textViewPerCenterMyPost=(TextView)view.findViewById(R.id.person_center_my_post);
		textViewPerCenterMyPost.setOnClickListener(listener);
		
		textViewPerCenterMyCollect=(TextView)view.findViewById(R.id.person_center_my_collect);
		textViewPerCenterMyCollect.setOnClickListener(listener);
		
		textViewPerCenterMyMessage=(TextView)view.findViewById(R.id.person_center_my_message);
		textViewPerCenterMyMessage.setOnClickListener(listener);
		
		textViewPerCenterMySetting=(TextView)view.findViewById(R.id.person_center_my_setting);
		textViewPerCenterMySetting.setOnClickListener(listener);
	}
	
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			switch(view.getId())
			{
			case R.id.person_center_pre_left:
				//��ǰ��תҳ��
				break;
			case R.id.person_center_register_login:
				//��תע���¼ҳ��
				break;
			case R.id.person_center_subscribe:
				//ԤԼ��Ϣ��ת
				break;
			case R.id.person_center_accept_sucessful:
				//ԤԼ����ɹ���ת
				break;
			case R.id.person_center_post:
				//������
				break;
			case R.id.person_center_my_apply_record:
				//���������¼
				break;
			case R.id.person_center_my_post:
				//�ҷ���������
				break;
			case R.id.person_center_my_collect:
				//�ҵ��ղ�
				break;
			case R.id.person_center_my_message:
				//�ҵ���Ϣ
				break;
			case R.id.person_center_my_setting:
				//�ҵ�����
				break;
			}
			
		}
	};
	private MyBrocast myBrocast=new MyBrocast();
	
	  static public class MyBrocast extends BroadcastReceiver
      {

            @Override
            public void onReceive(Context context, Intent intent) {
                  // TODO Auto-generated method stub
                 Log. i("onReceive", "onReceive��ʼִ��" );
                // count++;
                count=intent.getIntExtra("count" , 0);
                Log.i("MyBrocast","MyBrocast"+count);
                  //textCount.setText("����¼��"+count+"����Ϣ");
           }
           
      }

	  
	  //���¿ؼ�
	  @Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		textViewPerCenterSub.setText("ԤԼ"+count);
	}

}
