package com.rc.constructoroverloading;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(){
		
	}
	
	Employee(int id){
		this.id=id;
	}
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee id: "+this.id);
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee salary: "+this.salary);
		System.out.println();
	}
	
	
}
