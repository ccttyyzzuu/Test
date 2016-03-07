package com.example.activity;

import android.app.Application;

public class MyApplication extends Application {
	String[] cateGory = new String[] { "音乐类", "语言/国学", "运动类", "艺术类","同步课程", "备考类", "设计/技能", "早教", "家长汇" };
	String[] musicCategory = new String[] { "钢琴", "打击乐器", "弦乐器", "管乐器", "声乐", "古典乐器", "其他" };
	String[] languageCategory = new String[] { "英语", "日语", "书法", "国学", "其他" };
	String[] exerciseCategory = new String[] { "足球", "篮球", "网球", "高尔夫球", "马术", "壁球", "其他" };
	String[] artCategory = new String[] { "美术", "表演", "主持", "舞蹈", "摄影", "其他" };
	String[] classroomCategory = new String[] { "小学", "初中", "高中", "其他" };
	String[] testCategory = new String[] { "出国备考", "艺术备考", "其他" };
	String[] designCategory = new String[] { "平面设计", "程序设计", "其他" };
	String[] earlyCategory = new String[] { "平面设计", "程序设计", "其他" };
	String[] parentCategory = new String[] { "健身房", "美颜保养", "瘦身", "其他" };
}
