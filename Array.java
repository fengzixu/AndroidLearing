/*
author：xuran
title：数组
date：2014/12/24
*/

public class Array{

	public static void main(String[] args){

		//三种定义数组的方式,前面两种是先定义，后赋值，最后一种是定义的时候同时赋值。
		int[] z;
		z = new int[5];
		int[] x = new int[5];
		int[] y = new int[]{1,2,3,4,5};	//给y数组进行初始化,并根据初始化的元素，推断出数组的长度

		//经过测试，定义数组之后如果不设定初始值，则默认为0，这一点和C中不一样,数组也是一个对象，这个对象有一个属性length,在创建的时候
		//在执行其构造函数的时候，自动就会把这个变量赋值为这个数组的长度
		for(int i = 0; i < x.length; i++)
				System.out.println(x[i]);

		//输出y
		for(int i = 0; i < y.length; i++)
				System.out.println(y[i]);

		//给x数组赋值
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;

		//输出x
		for(int i = 0; i < x.length; i++)
				System.out.println(x[i]);

		//给数组重新赋值
		for(int i = 0; i < y.length; i++)
				y[i] = i;

		for(int i = 0; i < y.length; i++)
				System.out.println(y[i]);

	}
}