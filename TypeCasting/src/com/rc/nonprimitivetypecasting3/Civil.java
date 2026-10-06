package com.rc.nonprimitivetypecasting3;

public class Civil extends Department{
	
	String instrumentName;
	
	Civil(double examFee,int noOfStudents,String instrumentName){
		super(examFee,noOfStudents);
		this.instrumentName = instrumentName;
	}
	
	public void conductSurveyLab() {
		System.out.println("Conducting SurveyLab,...");
		System.out.println("ExamFee: "+this.examFee);
		System.out.println("No of Students: "+this.noOfStudents);
		System.out.println("InstrumentName: "+this.instrumentName);
	}
	
}
