package com.why.javacore.work;
import java.util.Scanner;
public class Work1 {
public static Scanner input;
	public static void main(String[] args) {
		//输入小明的考试成绩，显示所获奖励
		//成绩=100分，爸爸给他买辆车，成绩为90分以上，妈妈给他买MP4
//成绩在90分和60分之间，妈妈给他买本参考书，成绩小于60分，什么都不买
		input = new Scanner(System.in);
		System.out.println("请输入小明的考试成绩：");
		int score = input.nextInt();
		if (score == 100){
			System.out.println("爸爸给他买辆车");
		} else if (score >= 90){
			System.out.println("妈妈给他买MP4");
		} else if ((score >= 60) && (score < 90)){
			System.out.println("妈妈给他买本参考书");
		} else if (score < 60){
			System.out.println("什么都不买");
		}
	}

}
