package com.rc.functionalinterface2;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = (a,b)->a+b;
		System.out.println("Sum of a+b: "+c.add(10, 20));

	}

}
