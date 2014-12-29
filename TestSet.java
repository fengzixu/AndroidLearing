package com.xuran.pkg1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet obj = new TreeSet();
		HashSet obj1 = new HashSet();
		obj.add(10);
		obj.add(7);
		obj.add(1);
		
		Iterator iterator = obj.iterator();
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
	}

}
