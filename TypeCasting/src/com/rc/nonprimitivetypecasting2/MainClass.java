package com.rc.nonprimitivetypecasting2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accessObject(new Employee("Ramesh",123));
//		accessObject(new Student("Ramesh",7756));
//		accessObject(new Person("Ramesh"));
	}
	
	public static void accessObject(Person p) {
		
		if(p instanceof Employee) {
			System.out.println("Employee details: ");
			Employee e = (Employee) p;
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee id: "+e.id);
		}
		else if(p instanceof Student) {
			System.out.println("Student details: ");
			Student s = (Student) p;
			System.out.println("Student Name: "+s.name);
			System.out.println("Student id: "+s.rollNo);
		}
		else
			System.out.println("Different Object,...");
		
	}

}
