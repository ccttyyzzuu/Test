package com.daifei.cengkeacticity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

import com.example.feralapp.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
/**
 * ��������ҳ��
 * @author Administrator
 *
 */
public class PersonInfomationActivity extends Activity {

	private ImageView imageViewPerSonHead;
	private ImageView imageViewPerSonRight;//������ת
	private EditText editTextPersonName;//�û��ǳ�
	private ImageView imageViewPersonRigthName;//�û��ǳ�����
	private EditText editTextPersonSex;//�Ա�
	private ImageView imageViewPersonRightSex;//�Ա�����
	private EditText editTextModifyPassWord;//�޸�����
	private ImageView imageViewPersonRightMP;//�޸���������
	private EditText editTextRegistrationNumber;//ע�����
	private ImageView imageViewPersonRightRM;//ע���������
	private Button buttonCamera;//������ͷ��ȡͼƬ
	private Button buttonPhotoAlbum;//����ȡ��Ƭ
	private Button buttonCancel;//ȡ��ť
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person);
		initView();
	}
	
	public void initView()
	{
		imageViewPerSonHead=(ImageView)findViewById(R.id.person_infomation_head);
		imageViewPerSonHead.setOnClickListener(listener);
		
		imageViewPerSonRight=(ImageView)findViewById(R.id.person_infomation_go_to_next_right);
		imageViewPerSonRight.setOnClickListener(listener);
		
		editTextPersonName=(EditText)findViewById(R.id.person_infomation_name);
		editTextPersonName.setOnClickListener(listener);
		
		imageViewPersonRigthName=(ImageView)findViewById(R.id.person_infomation_name_go_to_next_right);
		imageViewPersonRigthName.setOnClickListener(listener);
		
		editTextPersonSex=(EditText)findViewById(R.id.person_infomation_sex);
		editTextPersonSex.setOnClickListener(listener);
		
		imageViewPersonRightSex=(ImageView)findViewById(R.id.person_infomation_sex_go_to_next_right);
		imageViewPersonRightSex.setOnClickListener(listener);
		
		editTextModifyPassWord=(EditText)findViewById(R.id.person_infomation_modify_password);
		editTextModifyPassWord.setOnClickListener(listener);
		
		imageViewPersonRightMP=(ImageView)findViewById(R.id.person_infomation_modify_password_go_to_next_right);
		imageViewPersonRightMP.setOnClickListener(listener);
		
		editTextRegistrationNumber=(EditText)findViewById(R.id.person_infomation_registration_number);
		editTextRegistrationNumber.setOnClickListener(listener);
		
		imageViewPersonRightRM=(ImageView)findViewById(R.id.person_infomation_registration_number_go_to_next_right);
		imageViewPersonRightRM.setOnClickListener(listener);
		
		buttonCamera=(Button)findViewById(R.id.person_infomation_camera);
		buttonCamera.setOnClickListener(listener);
		
		buttonPhotoAlbum=(Button)findViewById(R.id.person_infomation_photolabum);
		buttonPhotoAlbum.setOnClickListener(listener);
		
		buttonCancel=(Button)findViewById(R.id.person_infomation_cancel);
		buttonCancel.setOnClickListener(listener);
	}
	
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			switch(view.getId())
			{
			case R.id.person_infomation_head:
				break;
			case R.id.person_infomation_go_to_next_right:
				break;
			case R.id.person_infomation_name:
				break;
			case R.id.person_infomation_name_go_to_next_right:
				break;
			case R.id.person_infomation_sex:
				break;
			case R.id.person_infomation_sex_go_to_next_right:
				break;
			case R.id.person_infomation_modify_password:
				break;
			case R.id.person_infomation_modify_password_go_to_next_right:
					break;
			case R.id.person_infomation_registration_number:
					break;
			case R.id.person_infomation_registration_number_go_to_next_right:
				break;
			
				//����ͷ��������������ͷ��
			case R.id.person_infomation_camera:
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, 1);
				break;
			case R.id.person_infomation_photolabum:
				break;
			case R.id.person_infomation_cancel:
				break;
					
			}
		}
	};
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == Activity.RESULT_OK) {
			String sdStatus = Environment.getExternalStorageState();
			if (!sdStatus.equals(Environment.MEDIA_MOUNTED)) { // ���sd�Ƿ����
				Log.i("TestFile",
						"SD card is not avaiable/writeable right now.");
				return;
			}
			new DateFormat();
			String name = DateFormat.format("yyyyMMdd_hhmmss",Calendar.getInstance(Locale.CHINA)) + ".jpg";	
			Toast.makeText(this, name, Toast.LENGTH_LONG).show();
			Bundle bundle = data.getExtras();
			Bitmap bitmap = (Bitmap) bundle.get("data");// ��ȡ���ص���ݣ���ת��ΪBitmapͼƬ��ʽ
		
			FileOutputStream b = null;		   
			File file = new File("/sdcard/Image/");
			file.mkdirs();// �����ļ���
			String fileName = "/sdcard/Image/"+name;

			try {
				b = new FileOutputStream(fileName);
				bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);// �����д���ļ�
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					b.flush();
					b.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try
			{
				imageViewPerSonHead.setImageBitmap(bitmap);// ��ͼƬ��ʾ��ImageView��
			}catch(Exception e)
			{
				Log.e("error", e.getMessage());
			}
			
		}
	}
	
	public void readPictureFromDisk()//���ֻ��ж�ȡͼƬ,����ͷ��
	{
		
	}
}
