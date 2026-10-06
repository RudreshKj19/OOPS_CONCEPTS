package com.rc.methodoverloading4;

public class Employee {
	
	public void display(String name,int age) {
		System.out.println("Employee Name,Age: "+name+","+age);
	}
	
	public void display(String name,int age,double salary) {
		System.out.println("Employee Name,Age,salary: "+name+","+age+","+salary);
	}
	
	public void display(String name,int age,double salary,int id) {
		System.out.println("Employee Name,Age,salary,id: "+name+","+age+","+salary+","+id);
	}

}
