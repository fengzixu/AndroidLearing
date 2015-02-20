package com.example.spinner;

public class User {
	
	private String mname;
	
	private String maddress;
	
	public User(String name, String address) {
		// TODO Auto-generated constructor stub
		this.mname = name;

		this.maddress = address;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	
	

}
