package com.why.javacore.oob;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

class Student {

	/**这是JavaCore中面向对象
	 * 有参方法
	 * 1、在实现增加一个学生姓名的基础上，增加学生的学号、年龄、成绩，并显示
	 * 学号10，姓名王紫，年龄18，成绩99
	 * 学号11，姓名郝田，年龄19，成绩60
	 */
	
	public int studentID;
	public String name;
	public int age;
	public int score;
	public int length;
	public void showInfo(){
		System.out.println(studentID+"\t"+name+"\t"+age
				+"\t"+score);
		
	}
        //上面这是一个学生类的方法
}
