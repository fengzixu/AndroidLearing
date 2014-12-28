package com.xuran.pkg1;

public class Base {

//	public Base()
//	{
//		System.out.println("base类的默认构造方法");
//	}
	
	public Base(int y){
		
		System.out.println("base 类的重载构造方法" + y);
	}
	
	public void a(){
		
		System.out.println("Base a");
	}
	
	public void b(){
		
		this.a();
	}
	
	public static void main(String[] args){
		
		Base obj = new Base(5);
		obj.b();
	}
}
