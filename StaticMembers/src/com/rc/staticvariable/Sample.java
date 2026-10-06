package com.rc.staticvariable;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		m1();
		Sample.m1();
	
		s.m2();

	}
	public static void m1() {
		System.out.println("static Method");
	}
	
	public void m2() {
		System.out.println("Non-static Method");
	}

}
