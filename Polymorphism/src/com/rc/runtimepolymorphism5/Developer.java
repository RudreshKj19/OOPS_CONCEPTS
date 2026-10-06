package com.rc.runtimepolymorphism5;

public class Developer extends Employee {
	
	String programingLang;
	
	Developer(String name,int age,int empId,String programingLang){
		super(name,age,empId);
		this.programingLang=programingLang;
	}
	
	@Override
	public void displayPersonDetails() {
		System.out.println("Developer Name: "+this.name);
		System.out.println("Developer Age: "+this.age);
		System.out.println("Developer Id: "+this.empId);
		System.out.println("Developer programingLang: "+this.programingLang);
	}
	
	@Override
	public void work() {
		System.out.println("Developer is working");
	}
	
	public void writeCode() {
		System.out.println("Developer writes code");
	}

}
