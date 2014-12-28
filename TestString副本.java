package com.xuran.pkg1;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试String类的各种方法
		/*
		 *在String中的方法，一般来说都是把原来对象的数据复制一份然后再进行操作，不会对原来对象
		 *中的数据有影响
		 */
		String temp1 = "haha";
		
		//是否为空
		System.out.println(temp1.isEmpty());
		
		//代替,应该只是替换一个副本，并不改变原来的字符串，只是对一个副本进行修改
		//temp1.replace('a', 'x');
		System.out.println(temp1.replace('a','x'));
		
		temp1 = "   lalal   ";
		System.out.println(temp1);
		System.out.println(temp1.trim());
		System.out.println(temp1);
		
		temp1 = "jqjqjqjq";
		;
		System.out.println(temp1.toUpperCase());
	}

}
