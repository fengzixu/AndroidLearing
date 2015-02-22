package com.example.button;

public class User {

	private String mName;
	private int age;
	
	public User(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.mName = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public String getmName() {
		return mName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
}
