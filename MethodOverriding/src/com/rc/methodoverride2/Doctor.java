package com.rc.methodoverride2;

public class Doctor extends Employee {
	
	@Override
	public void eat() {
		System.out.println("Doctor eating Healthy Fruits,...");
	}

}
