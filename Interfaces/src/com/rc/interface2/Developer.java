package com.rc.interface2;

public class Developer implements Employee {
	
	@Override
	public void work() {
		System.out.println("Working as a Developer,..");
	}
	
	@Override
	public void eat() {
		System.out.println("Developer eating dosa,..");
	}

}
