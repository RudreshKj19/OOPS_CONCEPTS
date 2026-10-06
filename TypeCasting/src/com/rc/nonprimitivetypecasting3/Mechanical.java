package com.rc.nonprimitivetypecasting3;

public class Mechanical extends Department {
	
	String type;
	
	Mechanical(double examFee,int noOfStudents,String type){
		super(examFee,noOfStudents);
		this.type = type;
	}
	
	public void conductCadLab() {
		System.out.println("Conducting CAD Lab,...");
		System.out.println("ExamFee: "+this.examFee);
		System.out.println("No of Students: "+this.noOfStudents);
		System.out.println(" CAED Model type: "+this.type);
	}
	
}
