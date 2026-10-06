package com.rc.scanner;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(int id1, double salary1, String name1) {
		this.id = id1;
		this.name = name1;
		this.salary = salary1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details:");

		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		System.out.println();

		System.out.print("Enter id: ");
		int id1 = sc.nextInt();
		System.out.print("Enter name: ");
		String name1 = sc.next();
		System.out.print("Enter salary: ");
		double salary1 = sc.nextDouble();
		System.out.println();

		Employee e = new Employee(id, name, salary);
		Employee e1 = new Employee(id1, name1, salary1);

		e.displayEmployeeDetails();
		e1.displayEmployeeDetails();

	}

	public void displayEmployeeDetails() {
		System.out.println("Employee id:" + this.id);
		System.out.println("Employee name:" + this.name);
		System.out.println("Employee salary:" + this.salary);
		System.out.println();
	}

}
