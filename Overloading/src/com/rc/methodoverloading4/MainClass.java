package com.rc.methodoverloading4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.display("Girish", 29);
		e.display("Girish", 29,25000.0);
		e.display("Girish", 29,25000.0,101);

	}

}
