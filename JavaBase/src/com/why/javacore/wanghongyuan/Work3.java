package com.why.javacore.wanghongyuan;

public class Work3 {

	public static void main(String[] args) {
	/*	//计算100以内的偶数之和
		int sum = 0 , i = 1;
		for (i=1; i<=50;i++){
			sum=sum+i*2;	
			}
		System.out.println("100以内的偶数之和是：" + sum);
	}*/
		//计算100以内的奇数之和
	int sum = 0 , i = 0;
	for (i=0; i<50;i++){
		sum=sum+(i*2+1);	
		}
	System.out.println("100以内的奇数之和是：" + sum);
}
}
