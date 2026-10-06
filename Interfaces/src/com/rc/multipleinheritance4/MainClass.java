package com.rc.multipleinheritance4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer("Rudresh",50000.0,"java",2);
		d.displayDetails();
		System.out.println();
		d.work();
		d.calculateSalary();
		d.attendMeeting();
		System.out.println();
		
		TestEngineer t = new TestEngineer("Sanjay",30000.0,"Selenium");
		t.displayDetails();
		System.out.println();
		t.work();
		t.calculateSalary();
		t.attendMeeting();
		

	}

}
