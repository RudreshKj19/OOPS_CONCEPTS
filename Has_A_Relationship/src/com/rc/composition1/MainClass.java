package com.rc.composition1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Java",25000);
		Student student = new Student("Ramesh",8765456789l,course);
		student.displayStudentDetails();
		student.course.displayCourseDetails();

	}

}
