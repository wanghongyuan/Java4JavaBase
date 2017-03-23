package com.ddb.javacore.helloworld;
import java.util.Scanner;
public class LoopDemo {
public static Scanner input;
	public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("请输入一个数");
int num = input.nextInt();
//for loop
for (int i = 0; i <=num ; i++){
	System.out.println("徐豪是个帅比！");
}

//while loop
int j = 0 ;
while (j <= num){
	System.out.println("徐豪太帅了！");
	j++;
	
}
	// do while
int m = 0;
do {
	System.out.println("徐豪为什么这么帅呢？");
	m++;
} while (m < num);

//foreach loop
String[] strs = {"AA","BB","CC"};
for (String string : strs) {
	System.out.println("数组的元素为：" + string);
}
	}

}
