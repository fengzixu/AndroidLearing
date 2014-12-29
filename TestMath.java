package com.xuran.pkg1;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int input_num1 = s.nextInt();
		int input_num2 = s.nextInt();
		
		System.out.println(input_num1 + " " + input_num2);
		System.out.println(Math.pow(input_num1, input_num2));
	}

}
