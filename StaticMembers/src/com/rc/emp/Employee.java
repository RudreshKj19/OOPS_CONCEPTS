package com.rc.emp;

public class Employee {
	
	int id=10;
	
	public void work() {
		int id = 20;
		Employee e2 = new Employee();
		id = 40;
		eat();
		
	}
	
	public void eat() {
		int id = 30;
		System.out.println(this.id);
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.work();
		System.out.println(e1.id);
		
	}

}
