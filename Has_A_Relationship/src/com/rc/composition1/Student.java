package com.rc.composition1;

public class Student {
	
	String name;
	long mobileNo;
	Course course;
	
	Student(String name,long mobileNo,Course course){
		this.name = name;
		this.mobileNo = mobileNo;
		this.course = course;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student name: "+this.name);
		System.out.println("Student mobileNo: "+this.mobileNo);
		System.out.println();
	}
	

}
