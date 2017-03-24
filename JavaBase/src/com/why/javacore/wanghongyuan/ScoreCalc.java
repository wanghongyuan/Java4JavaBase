package com.why.javacore.wanghongyuan;

public class ScoreCalc {
	//编写一个ScoreCalc类的方法，编写方法实现各功能
	int Java;
	int C;
	int DB;
	int sum=Java+C+DB;
	double avg=sum/3;	
	public void show(){
		
		System.out.println("请输入Java成绩："+Java+"\n请输入C成绩："+C+
				"\n请输入DB成绩："+DB+"总成绩是："+sum+
				"\n平均成绩是："+avg);

	}
	
	
	
	

}
