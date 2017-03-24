package com.why.javacore.oob;

public class AddStudent {

	public  void addStudent(Student stu) {
		Student students =new Student();
		
		
		for(int i=0;i<students.length;i++){
			if(students[i]==null){
				students[i]=stu;
				
			}
		}

	}

}
