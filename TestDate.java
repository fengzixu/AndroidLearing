package com.xuran.pkg1;

import java.util.Calendar;

public class TestDate {

	public TestDate()
	{
//		Date date = new Date();
//		Date date2 = new Date();
//		System.out.println(date);
//		int day = date.getDay();
//		System.out.println(day);
//		System.out.println(date.getMonth());
//		System.out.println(date2.after(date));
		//获取到本机时间信息的一个calendar对象，里面封装了我们需要的信息，需要用特定的方法把它取出来。
		
		Calendar obj = Calendar.getInstance();
		
		int m_year = obj.get(Calendar.YEAR);
		int m_mouth = obj.get(Calendar.MONTH) + 1;
		int  m_day = obj.get(Calendar.DATE);
		System.out.println(m_year+":"+m_mouth + ":" + m_day);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDate obj = new TestDate();
	}

}
