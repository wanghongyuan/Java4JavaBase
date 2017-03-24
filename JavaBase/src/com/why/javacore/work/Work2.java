package com.why.javacore.work;
import java.util.Scanner;
public class Work2 {
public static Scanner input;
	public static void main(String[] args) {
//会员购物时，根据积分的不同享受不同的折扣
		//计算会员购物时获得的折扣
		input = new Scanner(System.in);
		
		System.out.println("请输入一个数：");
		
		int x = input.nextInt();
		if (x < 2000){
			System.out.println("会员购物时，能够享受到9折");
			int y = (int)(x * 0.9);
			System.out.println("享受到折扣后的价格是：" + y);			
		} else if ((x >= 2000) && (x < 4000)){
			System.out.println("会员购物时，能够享受到8折");
			int y = (int)(x * 0.8);
			System.out.println("享受到折扣后的价格是：" + y);
		} else if ((x >= 4000) && (x < 8000)){
			System.out.println("会员购物时，能够享受到7折");
			int y = (int)(x * 0.7);
			System.out.println("享受到折扣后的价格是：" + y);
		} else if ((x >= 8000) && (x < 10000)){
			System.out.println("会员购物时，能够享受到6折");
			int y = (int)(x * 0.6);
			System.out.println("享受到折扣后的价格是：" + y);
		} else if (x >= 10000){
			System.out.println("会员购物时，能够享受到5折");
			int y = (int)(x * 0.5);
			System.out.println("享受到折扣后的价格是：" + y);
		}
	}

}
