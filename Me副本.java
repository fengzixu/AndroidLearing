package com.xuran.pkg2;

public class Me implements Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("this is my eating");
	}
	
	public static void main(String[] args){
		
		Me obj = new Me();
		obj.eat();
	}

}
