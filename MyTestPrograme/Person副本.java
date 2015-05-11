package com.xuran.pkg2;

public interface Person {
	
	//成员方法不能实现，默认是抽象方法，接口中不能存在常规方法
	public void eat();
	
	//成员变量必须以以下关键字来修饰，并且要初始化
	public static final int age = 6;
}
