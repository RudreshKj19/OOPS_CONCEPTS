package com.rc.constructoroverloading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee(12);
		Employee e3 = new Employee(13,"Rakesh");
		Employee e4 = new Employee(14,"Ramesh",25000.0);
		
		
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		e3.displayEmployeeDetails();
		e4.displayEmployeeDetails();
		
	

	}

}
