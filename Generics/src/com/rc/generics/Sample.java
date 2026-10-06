package com.rc.generics;

public class Sample {
	
	public static <T> void m1(T a,T b) {
		System.out.println(a+","+b);
//		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(10,20);
		m1(20.5,12.5);
		m1(true,false);
		m1("abc","ab");
		m1('a','b');
	}

}
