package com.xuran.pkg1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList();
		Vector obj1 = new Vector();
		LinkedList obj2 = new LinkedList();
		
//		linkedlist¡∑œ∞
		for(int j = 0; j < 10; j++)
			obj2.add(j+1);
		
		for(int i = 0; i < obj2.size(); i++)
			System.out.println(obj2.get(i));
		
		System.out.println(obj2.pop());
		
		obj2.push(99);
		
		for(int i = 0; i < obj2.size(); i++)
			System.out.print(obj2.get(i)+" ");
		System.out.println("");
		obj2.set(0, "hahah");
		
		for(int i = 0; i < obj2.size(); i++)
			System.out.print(obj2.get(i)+" ");
		
//		arraylist¡∑œ∞		
//		obj1.add(5);
//		obj1.add("hahaha");
//		obj1.add(1, 1);
//		System.out.println(obj1);
//		
//		int len = obj1.size();
//		for(int i = 0; i < len; i++)
//			System.out.println(obj1.get(i));
		
		
	}

}
