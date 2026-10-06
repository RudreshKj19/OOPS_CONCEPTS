package com.rc.instancemethod;



public class Employee {
	
	int eid;
	String ename;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eid=25;
		e1.ename="Ramesh";
		e1.salary=5000.0;
		
		e2.eid=21;
		e2.ename="Suresh";
		e2.salary=12000.0;
		
		e1.displayEmployeedetails();
		e2.displayEmployeedetails();
	

	}
	
	public void displayEmployeedetails() {
		System.out.println("Employee id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee salary : "+salary);
		System.out.println();
	}


}
