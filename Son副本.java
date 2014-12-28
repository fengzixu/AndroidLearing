package com.xuran.test;
import com.xuran.pkg1.*;
public class Son extends Father{
	
//	//方法的重写
//	public void print(){
//		
//		System.out.println("this is Son");
//	}
	
	//方法的重载
	public int print(int y){
		
		System.out.println(y);
		return y;
	}
	
	public void a(Father obj1){
		
		System.out.println("SON:a()");
		obj1.print();
	}
	
	public static void main(String[] args){
		
		//父类 对象 = new 子类
		//多态
//		Father objf = new Son();
//		objf.print();
//		System.out.println(objf.name);
//		Son objs = new Son();
//		objs.print();
//		objs.print(5);
		Base obj = new Base(5);
	}

}
