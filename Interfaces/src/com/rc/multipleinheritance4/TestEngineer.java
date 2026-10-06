package com.rc.multipleinheritance4;

public class TestEngineer extends Employee {
	
	String testingTool;
	
	TestEngineer(String name,double salary,String testingTool){
		super(name,salary);
		this.testingTool=testingTool;
	}
	
	@Override
	public void work() {
		System.out.println("TestEngineer is Working");
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Calculating TestEngineer Salary");
	}
	
	@Override
	public void attendMeeting() {
		System.out.println("TestEngineer Attending a Meeting");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("TestEngineer name: "+this.name);
		System.out.println("TestEngineer salary: "+this.salary);
		System.out.println("TestingTool: "+this.testingTool);
	}
	

}
