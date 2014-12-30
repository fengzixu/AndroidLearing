package com.xuran.test;

public class TestError {

	String x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestError obj = new TestError();
		//监听有可能发生异常的代码
		try{
//			TestError obj = new TestError();
			System.out.println(obj.x.length());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("this is not error");
		}
		catch(NullPointerException e){
		
			obj.x = "hello world";
			System.out.println(obj.x.length());
		}
	}

}
