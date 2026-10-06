package com.rc.staticvariable;

public class Sample3 {
	
	static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1();
	}
	public static void M1() {
		int a=20;
		System.out.println(a);
		System.out.println(Sample3.a);
	}

}
