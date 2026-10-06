package com.rc.constructorchaining1;

public class Employee {
	
	int id;
	String name;
	double sal;
	
	Employee(int id){
		this.id =id;
	}
	
	Employee(int id,String name){
		this(id);
		this.name = name;
	}
	
	Employee(int id,String name,double sal){
		this(id,name);
		this.sal = sal;
	}

	public void displayEmployeedetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sal);
	}

}
