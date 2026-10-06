package com.rc.constructoroverloading2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12, "Rakesh", 2345678956l, "Java");
		Student s2 = new Student(13, "Ramesh");
		Student s3 = new Student(14, "Ranjith", 6578453657l);
		Student s4 = new Student(15, 6598653489l, "Python");

		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s3.displayStudentDetails();
		s4.displayStudentDetails();

	}

}
