package com.daifei.cengkelistview;


import com.example.feralapp.R;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyListView extends ListView implements OnGestureListener,
		OnTouchListener {

	private GestureDetector gestureDetector;

	private OnDeleteListener listener;
	private View deleteButton;// ɾ��ť
	private ViewGroup itemLayout;// ÿ��listview����Ĳ�������
	private int selectedItem;// ��ѡ�е���
	private boolean isDeleteShow;// ���ڱ���Ƿ�ɾ��

	public MyListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		gestureDetector = new GestureDetector(getContext(), this);
		deleteButton = LayoutInflater.from(getContext()).inflate(
				R.layout.delete_button, null);
		Button but = (Button) deleteButton.findViewById(R.id.delete);

		but.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {

				// TODO Auto-generated method stub
				itemLayout.removeView(deleteButton);// �Ƴ�ɾ��ť
				deleteButton = null;
				isDeleteShow = false;// ����ɾ��ɾ���־����Ϊfalse
				listener.OnDelete(selectedItem);// ɾ�����
			}
		});
		setOnTouchListener(this);
	}

	public void setOnDeleteListener(OnDeleteListener onDeleteListener) {
		listener = onDeleteListener;
	}

	@Override
	public boolean onDown(MotionEvent event) {
		// TODO Auto-generated method stub
		if (!isDeleteShow)// ���ɾ��ťû����ʾ
		{
			selectedItem = pointToPosition((int) event.getX(),
					(int) event.getY());// ��ȡ��ָ����������
		}
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		Log.i("nihao", "onFling" + selectedItem);
		// TODO Auto-generated method stub
		 if (!isDeleteShow && Math.abs(velocityX) > Math.abs(velocityY)) {  
	            deleteButton = LayoutInflater.from(getContext()).inflate(  
	                    R.layout.delete_button, null);  //���ذ�ťҳ��
	            Button btn=(Button)deleteButton.findViewById(R.id.delete);//��ȡɾ��ť��Դ
	            btn.setOnClickListener(new OnClickListener() {  
	                @Override  
	                public void onClick(View v) {  
	                    itemLayout.removeView(deleteButton);  
	                    deleteButton = null;  
	                    isDeleteShow = false;  
	                    listener.OnDelete(selectedItem);  
	                }  
	            });  
	            itemLayout = (ViewGroup) getChildAt(selectedItem  
	                    - getFirstVisiblePosition());  
	            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(  
	                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);  //������Բ��ֲ���
	            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);  
	            params.addRule(RelativeLayout.CENTER_VERTICAL);  
	            itemLayout.addView(deleteButton, params);  //����ť����itemLayout��������ʾ
	            isDeleteShow = true;  
		 }
		return false;
	}

	@Override
	public void onLongPress(MotionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onSingleTapUp(MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onTouch(View view, MotionEvent event) {
		// TODO Auto-generated method stub
		if (isDeleteShow)// ���ɾ��ť����
		{
			itemLayout.removeView(deleteButton);//�Ƴ�ť
			deleteButton = null;//�Ƴ�֮������Ϊ��
			isDeleteShow = false;//���ð�ť��ǲ���ʾ
			return false;
		} else {
			return gestureDetector.onTouchEvent(event)||true;
		}
	}

	//�ص�����ӿ�,���ڴ���item��λ��
	public interface OnDeleteListener {
		void OnDelete(int index);
	}

}
