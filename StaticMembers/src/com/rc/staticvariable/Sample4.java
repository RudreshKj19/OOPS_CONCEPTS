package com.rc.staticvariable;

public class Sample4 {
	
	int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1();

	}
	
	public static void M1() {
		int a=20;
		System.out.println(a);
		Sample4 s = new Sample4();
		System.out.println(s.a);
	}

}
