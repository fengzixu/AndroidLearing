/*
author:徐冉
date:2014/12/23
title:对象的状态和行为
*/
public class student{

	//对象的属性,成员变量
	private String name;
	private int age;
	private String gendar;

	//对象的方法、行为,成员方法
	public void playBasketBall(){
		System.out.println("打篮球");
	}

	//主方法
	public static void main(String[] args){
		
		student zhangsan = new student();
		zhangsan.name = "zhangsan";
		zhangsan.age = 18;
		zhangsan.gendar = "男";
		zhangsan.playBasketBall();

		int x = 10;
	}

}