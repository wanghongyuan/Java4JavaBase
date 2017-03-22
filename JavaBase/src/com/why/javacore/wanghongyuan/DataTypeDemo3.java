package com.why.javacore.wanghongyuan;
import java.util.Scanner;
public class DataTypeDemo3 {
//switch
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入奥巴马的考试成绩");
		int score = input.nextInt();
switch (score){
case 100:
	System.out.println("奥巴马的父亲给她买辆车");
	break;
case 90:
	System.out.println("奥巴马的母亲给她买台笔记本电脑");
case 60:
	System.out.println("奥巴马的母亲给她买部手机");
case 30:
	System.out.println("没有礼物");
}

	}

}
