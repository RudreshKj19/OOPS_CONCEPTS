package com.rc.staticvariable;

public class StaticBlock {
	
	static int a=10;
	static {
		System.out.println("static block-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		System.out.println(a);

	}
	static {
		System.out.println("static block 1");
		System.out.println(a);
	}
	
	static {
		System.out.println("static block 3");
		a=20;
	}

}
