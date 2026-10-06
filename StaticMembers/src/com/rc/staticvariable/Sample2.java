package com.rc.staticvariable;

public class Sample2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		new Sample2();
		new Sample2();
		new Sample2();
		System.out.println("stop");

	}
	
	static {
		new Sample2();
		System.out.println("static block");
	}

	
	{
		System.out.println("Non-static block");
	}

}
