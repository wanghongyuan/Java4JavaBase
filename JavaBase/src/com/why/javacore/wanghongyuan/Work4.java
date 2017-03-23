package com.why.javacore.wanghongyuan;

import java.util.Scanner;
public class Work4 {

	public static void main(String[] args) {
		/*//打印100遍好好学习，天天向上！
		int i = 1;
		while (i <=100) {
			System.out.println("好好学习，天天向上！");
			i ++ ;
		}*/
		
		/*//1、求1——100的数之和
		int sum = 0;
		int i =1;
		for (i =1; i<= 100;i++){
			sum += i;
			}
		System.out.println("输出1-100的数之和:" + sum );
		*/
		
		
		/*//2、控制台打印出1、7 、13~~~~~100
		int i = 1;
		for (i = 1; i < 100;i += 6)
		{
		System.out.print(i + " ");
	}*/
		
		
		//3、打印一个实心等腰三角形，三角形的大小可以随着输入参数的改变而改变
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数num：");
		int num =sc.nextInt();
		int i=0;
		int j=0;
		for (i=0;i<num;i++)
		{
		for (j=0;j<num-i;j++){
			System.out.print(" ");
		}	
			for (j=0;j<2*(i-1)+1;j++){
				System.out.print("*");
			}
		System.out.println("");
		
		}
	}			
		
	}
