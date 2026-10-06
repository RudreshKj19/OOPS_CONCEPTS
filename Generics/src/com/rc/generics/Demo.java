package com.rc.generics;

public class Demo <T> {
	
	public void m1(T a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.m1(10);
		d.m1(10.5);
		d.m1("String");
		d.m1('a');
		d.m1(true);
		d.m1(10.25f);

	}
}
