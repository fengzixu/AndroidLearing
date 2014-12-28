/*
author:xuran
title:告诉对象怎么做
date:2014/12/25
*/
public class APP2{

	public void ShowWord(String[] temp)
	{
		for(int i = 0; i < temp.length; i++)
			temp[i] = "a";
	}

	public void print(int x){
		x = 10;
		System.out.println(x);
	}

	public static void main(String[] args){

		int y = 6;
		APP2 obj = new APP2();

		//传递数组，改动了原来的数据
		String[] str = new String[]{"bb","bb","bb"};
		for(int i = 0; i < str.length; i++)
			System.out.println(str[i]);
		obj.ShowWord(str);
		for(int i = 0; i < str.length; i++)
			System.out.println(str[i]);

		//传递常规变量，没有改变原来的数据
		obj.print(y);
		System.out.println(y);
	}
}