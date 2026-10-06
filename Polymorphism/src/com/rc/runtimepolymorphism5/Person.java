package com.rc.runtimepolymorphism5;

public class Person {
	
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public void displayPersonDetails() {
		System.out.println("Person Name: "+this.name);
		System.out.println("Person Age: "+this.age);
	}
	

}
