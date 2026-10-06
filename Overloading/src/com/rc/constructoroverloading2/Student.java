package com.rc.constructoroverloading2;

public class Student {
	int rollNo;
	String name;
	long mobileNo;
	String course;

	Student(int rollNo, String name, long mobileNo, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.mobileNo = mobileNo;
		this.course = course;

	}

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;

	}

	Student(int rollNo, String name, long mobileNo) {
		this.rollNo = rollNo;
		this.name = name;
		this.mobileNo = mobileNo;

	}

	Student(int rollNo, long mobileNo, String course) {
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
		this.course = course;

	}

	public void displayStudentDetails() {
		System.out.println("Student rollNo: "+this.rollNo);
		System.out.println("Student name: "+this.name);
		System.out.println("Student MobileNo: "+this.mobileNo);
		System.out.println("Student course: "+this.course);
		System.out.println();
	}

}
