package com.rc.multipleinheritance4;

public class Developer extends Employee {
	
	String programmingLanguage;
	int experience;
	
	Developer(String name,double salary,String programmingLanguage,int experience){
		super(name,salary);
		this.programmingLanguage=programmingLanguage;
		this.experience=experience;
	}
	
	@Override
	public void work() {
		System.out.println("Developer is Working");
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Calculating Developer Salary");
	}
	
	@Override
	public void attendMeeting() {
		System.out.println("Developer Attending a Meeting");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Developer name: "+this.name);
		System.out.println("Developer salary: "+this.salary);
		System.out.println("ProgrammingLang: "+this.programmingLanguage);
		System.out.println("Experience: "+this.experience);
	}
			

}
