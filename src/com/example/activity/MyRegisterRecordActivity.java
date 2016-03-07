package com.example.activity;

import java.util.ArrayList;

import com.example.adapter.MyRegisterRecordViewPagerAdapter;
import com.example.feralapp.R;
import com.example.fragment.MyRegisterRecordAllFragment;
import com.example.fragment.MyRegisterRecordChenckFrangment;
import com.example.fragment.MyRegisterRecordOrderFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.TextView;

public class MyRegisterRecordActivity extends FragmentActivity {
	private TextView back;
	private TextView title;
	private TextView all;
	private TextView order;
	private TextView isCheck;
	private ViewPager pager;
	private ArrayList<Fragment> list;
	private MyRegisterRecordViewPagerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_register_record);
		initView();
		/**
		 * ViewPager
		 */
		pager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int i) {
				// TODO Auto-generated method stub
				switch (i) {
				case 0:
					all.setTextColor(getResources().getColor(R.color.orange));
					order.setTextColor(getResources().getColor(R.color.body_24));
					isCheck.setTextColor(getResources().getColor(R.color.body_24));
					break;
				case 1:
					all.setTextColor(getResources().getColor(R.color.body_24));
					order.setTextColor(getResources().getColor(R.color.orange));
					isCheck.setTextColor(getResources().getColor(R.color.body_24));
					break;
				case 2:
					all.setTextColor(getResources().getColor(R.color.body_24));
					order.setTextColor(getResources().getColor(R.color.body_24));
					isCheck.setTextColor(getResources().getColor(R.color.orange));
					break;

				default:
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
	}
	/**
	 *
	 */
	void initView() {
		FragmentManager manager = getSupportFragmentManager();
		MyRegisterRecordAllFragment allFragment = new MyRegisterRecordAllFragment();
		MyRegisterRecordChenckFrangment chenckFrangment = new MyRegisterRecordChenckFrangment();
		MyRegisterRecordOrderFragment orderFragment=new MyRegisterRecordOrderFragment();

		list = new ArrayList<Fragment>();
		list.add(chenckFrangment);
		list.add(allFragment);
		list.add(orderFragment);

		back = (TextView) findViewById(R.id.my_registerz_record_back);
		title = (TextView) findViewById(R.id.my_registerz_record_title);
		all = (TextView) findViewById(R.id.my_registerz_record_all);
		order = (TextView) findViewById(R.id.my_registerz_record_order);
		isCheck = (TextView) findViewById(R.id.my_registerz_record_check);
		pager = (ViewPager) findViewById(R.id.my_registerz_record_viewpager);
		adapter = new MyRegisterRecordViewPagerAdapter(manager, list);
		pager.setAdapter(adapter);
	}
}
