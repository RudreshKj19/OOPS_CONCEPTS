package com.rc.constructor;

public class Pen {
	
	public Pen() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Non-static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Pen());

	}

}
