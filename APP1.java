/*
author:xuran
title:设计一个真正的应用程序
date：201412/24
*/
import java.util.Scanner;
public class APP1{

	public static void main(String[] args){

		double score;
		Scanner s = new Scanner(System.in);
		score = s.nextInt();

		//检查是否超出范围
		if(score > 100 || score < 0)
		{
			System.out.println("输入有误");
		}
		else if(score >= 90 && score <= 100){
			System.out.println("等级为A");
		}
		else if(score >= 80 && score <= 89){
			System.out.println("等级为B");
		}
		else if(score >= 70 && score <= 79){
			System.out.println("等级为C");
		}
		else if(score >= 60 && score <= 69){
			System.out.println("等级为E");
		}
		else
			System.out.println("等级为F");

	}
}