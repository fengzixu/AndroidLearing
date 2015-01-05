package com.xuran.pkg1;

public class TestError {

	String x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestError obj = new TestError();
		//鐩戝惉鏈夊彲鑳藉彂鐢熷紓甯哥殑浠ｇ爜
		try{
//			TestError obj = new TestError();
			System.out.println(5/1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("this is not error");
		}
		catch(NullPointerException e){
		
			obj.x = "hello world";
			System.out.println(obj.x.length());
		}catch(ArithmeticException e){
			
			System.out.println("处理运算条件异常");
			
		}
		finally{
			System.out.println("必须要执行");
		}
	}

}
