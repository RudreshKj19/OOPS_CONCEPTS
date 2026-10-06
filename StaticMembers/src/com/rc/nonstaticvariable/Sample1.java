package com.rc.nonstaticvariable;

public class Sample1 {
	
	int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Sample1().M1();
		Sample1 s = new Sample1();
		s.M1();

	}
	
	public void M1() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}

}
