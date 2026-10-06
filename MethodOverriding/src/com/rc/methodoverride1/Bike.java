package com.rc.methodoverride1;

public class Bike extends Vehicle {
	
	@Override
	public int start(int b) {
		System.out.println("Bike Started,...");
		return 10;
	}
	
	

}
