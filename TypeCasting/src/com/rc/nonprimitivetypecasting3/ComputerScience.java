package com.rc.nonprimitivetypecasting3;

public class ComputerScience extends Department {
	
	String language;
	
	ComputerScience(double examFee,int noOfStudents,String language){
		super(examFee,noOfStudents);
		this.language = language;
	}
	
	public void conductProgrammingLab() {
		System.out.println("Conducting DSA Lab...");
		System.out.println("ExamFee: "+this.examFee);
		System.out.println("No of Students: "+this.noOfStudents);
		System.out.println("Programming Language: "+this.language);
	}
	

}
