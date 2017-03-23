package com.why.javacore.wanghongyuan;
import java.util.Scanner;
public class Work {
public static Scanner input;
	public static void main(String[] args) {
		//判断月份是属于哪个季节
		//春季：1、2、3；夏季：4、5、6；秋季：7、8、9；冬季：10、11、12
		input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int month = input.nextInt();
		if ((month >=1) && (month <= 3)){
			System.out.println("这是春季");
		}else if ((month >=4) && (month <= 6)){
			System.out.println("这是夏季");
		}else if ((month >=7)&& (month <= 9)){
			System.out.println("这是秋季");
		}else if ((month >=10) && (month <= 12)){
			System.out.println("这是冬季");
		}

	}

}
