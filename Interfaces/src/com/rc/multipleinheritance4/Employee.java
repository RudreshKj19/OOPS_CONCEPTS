package com.rc.multipleinheritance4;

public abstract class Employee implements Workable,Payable {
	
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Salary: "+this.salary);
	}
	public abstract void attendMeeting();

}
