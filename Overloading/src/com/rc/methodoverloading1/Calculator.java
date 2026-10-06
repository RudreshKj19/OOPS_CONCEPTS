package com.rc.methodoverloading1;

public class Calculator {
	
	public void add(int a,int b) {
		System.out.println("Addithion of a+b is: "+(a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Addithion of a+b+c is: "+(a+b+c));
	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println("Addithion of a+b+c+d is: "+(a+b+c+d));
	}

}
