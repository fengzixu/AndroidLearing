package com.xuran.pkg1;

public class Super extends Base{

	public Super(){
	
		//super单独存在指定的是父类的对象，作为函数名的时候是父类的构造函数
		super(5);
		super.a();
		System.out.println("super类的构造方法");
	}
	
	public static void main(String[] args) {
		
		//子类对象在创建的时候，会先执行父类的构造方法，然后再调用自己的
		//但是执行的是父类的默认的构造方法
		Super opj = new Super();
		
	}
}
