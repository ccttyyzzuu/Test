package com.daifei.cengkeacticity;

import com.example.feralapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ��������
 * @author Administrator
 *   dhasdfa   
 */
public class PersonCenterActivity extends Activity {
	
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
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person_center);
	}

	public void initView()
	{
		imageViewLeft=(ImageView)findViewById(R.id.person_center_pre_left);
		imageViewLeft.setOnClickListener(listener);
		
		textViewLogRegister=(TextView)findViewById(R.id.person_center_register_login);
		textViewLogRegister.setOnClickListener(listener);
		
		textViewPerCenterSub=(TextView)findViewById(R.id.person_center_subscribe);
		textViewPerCenterSub.setOnClickListener(listener);
		
		textViewPerCenterAccSuf=(TextView)findViewById(R.id.person_center_accept_sucessful);
		textViewPerCenterAccSuf.setOnClickListener(listener);
		
		textViewPerCenterPost=(TextView)findViewById(R.id.person_center_post);
		textViewPerCenterPost.setOnClickListener(listener);
		
		textViewPerCenterApplyRec=(TextView)findViewById(R.id.person_center_my_apply_record);
		textViewPerCenterApplyRec.setOnClickListener(listener);
		
		textViewPerCenterMyPost=(TextView)findViewById(R.id.person_center_my_post);
		textViewPerCenterMyPost.setOnClickListener(listener);
		
		textViewPerCenterMyCollect=(TextView)findViewById(R.id.person_center_my_collect);
		textViewPerCenterMyCollect.setOnClickListener(listener);
		
		textViewPerCenterMyMessage=(TextView)findViewById(R.id.person_center_my_message);
		textViewPerCenterMyMessage.setOnClickListener(listener);
		
		textViewPerCenterMySetting=(TextView)findViewById(R.id.person_center_my_setting);
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
}
