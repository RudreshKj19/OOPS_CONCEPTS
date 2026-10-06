package com.rc.nonprimitivetypecastin1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Employee("Ramesh",123);  //upcasting
		Employee e = (Employee) p;  // downcasting
		System.out.println("Employee Name: "+e.name);
		System.out.println("Employee id: "+e.id);
		
		p = new Student("Darshan",771); // upcasting
		Student s = (Student) p; //downcasting
		System.out.println("Student Name: "+s.name);
		System.out.println("Student rollNo: "+s.rollNo);
		
		boolean res = new Person() instanceof Person;
		boolean res1 = new Employee() instanceof Employee;
		boolean res2 = new Student() instanceof Student;
		boolean res3 = new Employee() instanceof Person;
		boolean res4 = new Student() instanceof Person;
		boolean res5 = new Person() instanceof Employee;
		boolean res6 = new Person() instanceof Student;
//		boolean res7 = new Employee() instanceof Student;
//		boolean res8 = new Student() instanceof Employee;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
//		System.out.println(res7);
//		System.out.println(res8);

	}

}
