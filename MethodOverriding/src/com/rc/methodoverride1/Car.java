package com.rc.methodoverride1;

public class Car extends Vehicle {
	
	@Override
	public int start(int a) {
		System.out.println("Car started,...");
		return 10;
	}

}
