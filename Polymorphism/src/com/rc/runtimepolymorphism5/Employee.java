package com.rc.runtimepolymorphism5;

public class Employee extends Person {
	
	int empId;
	
	Employee(String name,int age,int empId){
		super(name,age);
		this.empId=empId;
	}
	
	@Override
	public void displayPersonDetails() {
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Age: "+this.age);
		System.out.println("Employee Id: "+this.empId);
	}
	
	public void work() {
		System.out.println("Employee is working");
	}

}
