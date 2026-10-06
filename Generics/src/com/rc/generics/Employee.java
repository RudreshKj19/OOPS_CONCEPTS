package com.rc.generics;

public class Employee<T> {
	T id;
	String name;
	
	Employee(T id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void displayDetails() {
		System.out.println("id: "+this.id);
		System.out.println("Name: "+this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101,"Ramesh");
		e1.displayDetails();
		Employee e2 = new Employee("123Abc","Suresh");
		e2.displayDetails();
		Employee e3 = new Employee(9887654389L,"Girish");
		e3.displayDetails();

	}

}
