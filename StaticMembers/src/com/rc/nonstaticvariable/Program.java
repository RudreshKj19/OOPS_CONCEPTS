package com.rc.nonstaticvariable;

public class Program {
	
	int a=10;
	
	public void m1() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		p.m1();

	}

}
