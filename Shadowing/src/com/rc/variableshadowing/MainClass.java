package com.rc.variableshadowing;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println(e1.id);
		Developer d1 = new Developer();
		System.out.println(d1.id);
		Employee e2 = new Developer();
		System.out.println(e2.id);
	}

}
