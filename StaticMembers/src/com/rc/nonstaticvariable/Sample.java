package com.rc.nonstaticvariable;

public class Sample {
	
	static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample().M1();

	}
	
	public void M1() {
		int a=20;
		System.out.println(a);
		System.out.println(Sample.a);
	}

}
