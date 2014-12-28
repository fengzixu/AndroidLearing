/*
author:徐冉
date:2014/12/24
title:构造方法的重载
*/


public class ChongZai{

	//没有任何参数的构造函数
	public ChongZai(){
		System.out.println("ChongZai的构造方法1");
	}

	//重载构造函数的要点：同名，参数不同，参数不同包括参数的类型和个数

	public ChongZai(int x){
		System.out.println("ChongZai的构造方法2");
	}

	//类型
	//attention:在调用这个方法的时候，要根据java的语言规则，在实参的后面加上f，表明传递的是浮点型数据
	public ChongZai(float x){
		System.out.println("ChongZai的构造方法3");
	}

	//类型&个数
	public ChongZai(int x, int y){
		System.out.println("ChongZai的构造方法4");
	}

	public static void main(String[] args){

		ChongZai obj = new ChongZai(1.35f);

	}
}