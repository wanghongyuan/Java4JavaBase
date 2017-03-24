package com.why.javacore.work;

public class Work3 {

	public static void main(String[] args) {
	/*	1、//计算100以内的偶数之和
		int sum = 0 , i = 1;
		for (i=1; i<=50;i++){
			sum=sum+i*2;	
			}
		System.out.println("100以内的偶数之和是：" + sum);
	}*/
		/*   2、//计算100以内的奇数之和
	int sum = 0 , i = 0;
	for (i=0; i<50;i++){
		sum=sum+(i*2+1);	
		}
	System.out.println("100以内的奇数之和是：" + sum);*/
		
	
		
		
		//3、构建一个实心的等腰三角形并打印出来
		//边长
		int lenght=4;
		//等腰三角形原则，构建对应的xy轴
		for(int y=1;y<=lenght;y++){
			//等腰三角形空间
			for(int x=1;x<=2*lenght-1;x++){
				//判断是否需要*，不需要输出" ",条件分别为两边斜线的解析式，在
				if ((y>=lenght+1-x)&&(y>=x-lenght+1))
				System.out.print('*');
				else System.out.print(' ');		
			}
		System.out.println("");
		}
		
		
		
}
}
