package com.rc.methodshadowing;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		s1.m1();
		Demo d1 = new Demo();
		d1.m1();
		Sample s2 = new Demo();
		s2.m1();

	}

}
