package com.rc.constructor;

public class Student {
	
	int id;
	String name;
	double marks;
	
	Student(int id,String name,double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(25,"Rakesh",97.0);
		Student s2 = new Student(107,"Ramesh",65.0);
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		
	}
	
	public void displayStudentDetails() {
		System.out.println("Student id :"+this.id);
		System.out.println("Student name :"+this.name);
		System.out.println("Student marks :"+this.marks);
		System.out.println();
	}

}
