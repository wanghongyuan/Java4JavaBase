package com.ddb.javacore.helloworld;

public class Person {

	private String name = "Jack";
	private int age = 35;
	private boolean married = true;
	
	// 无参构造函数
	public Person(){
		
	}
	// 有参构造函数
	public Person(String str,int i,boolean flag){
		name = str;
		age = i;
		married = flag;
	}
	public void display(){
		System.out.println(name+" "+age+" "+married);
		}
	public static void main(String[] args){
		
		// 不使用引用类型的方式
		System.out.println("不使用引用类型的方式：");
		String name = "Jack";
		int age = 35;
		boolean married = true;
		System.out.println(name + " " + age + " " + married );
		
		//使用引用类型的方式
		System.out.println("使用引用类型的方式：");
		Person person = new Person("Rose",20,false);
		//Person person = new Person();
		person.display();
	}
}
