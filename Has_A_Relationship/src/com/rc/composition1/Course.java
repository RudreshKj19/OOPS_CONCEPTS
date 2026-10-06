package com.rc.composition1;

public class Course {
	
	String course;
	double fee;
	
	
	Course(String course,double fee){
		this.course = course;
		this.fee = fee;
	}
	
	public void displayCourseDetails() {
		System.out.println("Course Name: "+this.course);
		System.out.println("Course fee: "+this.fee);
	}

}
