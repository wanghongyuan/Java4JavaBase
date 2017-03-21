package com.why.javacore.wanghongyuan;
import java.util.Scanner;
public class ScoreStat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String STB = input.nextLine();
		System.out.print("STB的成绩是：" + STB);
		String Java = input.nextLine();
		System.out.print("Java的成绩是：" + Java);
		String SQL = input.nextLine();
		System.out.print("SQL的成绩是：" + SQL);
	}

}
