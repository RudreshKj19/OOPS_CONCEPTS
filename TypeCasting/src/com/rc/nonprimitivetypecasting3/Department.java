package com.rc.nonprimitivetypecasting3;

public class Department {
	
	double examFee;
	int noOfStudents;
	
	Department(double examFee,int noOfStudents ){
		this.examFee = examFee;
		this.noOfStudents = noOfStudents;
	}
	
	public void ConductExam() {
		System.out.println("Conducting Exam,...");
	}

}
