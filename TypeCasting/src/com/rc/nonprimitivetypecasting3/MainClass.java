package com.rc.nonprimitivetypecasting3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accessObject(new ComputerScience(2500.0,25,"DSA"));
		System.out.println();
		accessObject(new Civil(2600.0,15,"Telescope"));
		System.out.println();
		accessObject(new Mechanical(2000.0,50,"3D"));
		System.out.println();
		accessObject(new Department(3000.0,50));
		
	}
	
	public static void accessObject(Department d) {
		
		if(d instanceof ComputerScience) {
			System.out.println("ComputerScience Dept Details: ");
			ComputerScience cs = (ComputerScience) d;
			cs.conductProgrammingLab();
			cs.ConductExam();
			
		}
		else if(d instanceof Civil) {
			System.out.println("Civil Dept Details: ");
			Civil c = (Civil) d;
			c.conductSurveyLab();
			c.ConductExam();
		}
		else if(d instanceof Mechanical) {
			System.out.println("Mechanical Dept Details: ");
			Mechanical m = (Mechanical) d;
			m.conductCadLab();
			m.ConductExam();
		}
		else
			System.out.println("Different Object,....");
	}


}
