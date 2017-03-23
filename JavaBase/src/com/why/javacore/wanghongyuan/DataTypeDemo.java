package com.why.javacore.wanghongyuan;

public class DataTypeDemo {

	public static void main(String[] args) {
		int kingScore = 80;
		int sunScore;
		sunScore = kingScore;
		System.out.println("四胖的成绩是：" + sunScore);
		//关系运算符
		int a = 50;
		int b = 60;
		System.out.println("a > b:" + (a > b));
		System.out.println("a < b:" + (a < b));
		System.out.println("a >= b:" + (a >= b));
		System.out.println("a <= b:" + (a <= b));
		System.out.println("a != b:" + (a != b));
		System.out.println("a == b:" + (a == b));
		//逻辑运算符
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 && bn2:" + (bn1 && bn2));
		System.out.println("bn1 || bn2:" + (bn1 || bn2));
		System.out.println("!bn1:" + !bn1);
		System.out.println("(1<2) && (3<5):" + ((1<2) && (3<5)));
		System.out.println("(1<2) || (3>5):" + ((1<2)));
		//三目运算符
		int i = 5,j = 6;
		String result = i > j ? "i>j" : "i<j";
		System.out.println(result);
		
		//字符串操作符
		String address1 = "Anhui";
		String address2 = "Hefei";
		int code = 5;
		String result1 = address1 + " " + address2 + " " + code + " 号";
		System.out.println(result1);
		
		//类型转换操作符
		int b1 = 10;
		byte a1 = (byte)b1;
		System.out.println(a1);
		//递增递减运算符
		int c = 5;
		c++;System.out.println(c);
		c--;System.out.println(c);
		++c;System.out.println(c);
		--c;System.out.println(c);
		
		
		
		
		
		
		
	}

}
