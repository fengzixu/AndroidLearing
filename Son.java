package com.xuran.test;

public class Son extends Father{
	
	//方法的重写
//	public void print(){
//		
//		System.out.println("this is Son");
//	}
	
	//方法的重载
	public int print(int y){
		
		System.out.println(y);
		return y;
	}
	
	public static void main(String[] args){
		
		Son obj = new Son();
		obj.print();
		obj.print(9);
	}

}
