package com.rc.nonstaticvariable;

public class Employee {
	int id;
	String name;
	double sal;
	static String cName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		 
		e1.id=25;
		e1.name="Ramesh";
		e1.sal=25000.0;
		e1.cName="TCS";
		
		e2.id=31;
		e2.cName="HCL";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.sal);
		System.out.println(cName);
		System.out.println();
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.sal);
		System.out.println(cName);

	}

}
