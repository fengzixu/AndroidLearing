/*
author：徐冉
title:方法的重载
date:2014/12/24
*/
public class ChongZai2{

	public String study(){
		System.out.println("学习");
		return "学习1";
	}

	public String study(String object){
		System.out.println("学习" + object);
		return "学习2";
	}

	public static void main(String[] args){

		ChongZai2 obj1 = new ChongZai2();
		/*
		编译器会根据我们调用函数传递的信息不同为我们查找版本对应的方法调用
		*/
		obj1.study();
		obj1.study("数学");
	}
}