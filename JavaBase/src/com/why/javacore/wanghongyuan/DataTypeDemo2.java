package com.why.javacore.wanghongyuan;
import java.util.Scanner;
public class DataTypeDemo2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入奥巴马的考试成绩");
	int score = input.nextInt();
	if (score==100){
		System.out.println("奥巴马的父亲给她买辆车");
		}else if (score>=90){
			System.out.println("奥巴马的母亲给她买台笔记本电脑");
		}else if (score>=60){
			System.out.println("奥巴马的母亲给她买部手机");
		}else if (score<60){
			System.out.println("没有礼物");
		}else if (score<30){
			System.out.println("赏赐30大板");
		}

	}

}
