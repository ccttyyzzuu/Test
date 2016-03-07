package com.example.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyRegisterRecordViewPagerAdapter extends FragmentPagerAdapter {
	private ArrayList<Fragment> list;
	public MyRegisterRecordViewPagerAdapter(FragmentManager fragmentManager,ArrayList<Fragment> list) {
		// TODO Auto-generated constructor stub
		super(fragmentManager);
		this.list=list;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	public Fragment getItem(int positon) {
		// TODO Auto-generated method stub
		return list.get(positon);
	}

}
