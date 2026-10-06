package com.rc.staticvariable;

public class Demo {
	
	static int a=10;
	static {
		System.out.println("static block");
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		System.out.println(a);
		System.out.println("stop");

	}
	
	public static void m1() {
		a=20;
		System.out.println("Static method");
	}

}
