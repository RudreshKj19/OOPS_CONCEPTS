package com.rc.constructor;

public class Demo {
	
	public Demo() {
		System.out.println("User defined Contructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Demo d = new Demo();
		System.out.println(d);
		System.out.println("stop");

	}
	
	{
		System.out.println("Non-static blck");
	}
	
	static {
		System.out.println("Static blck");
	}

}
