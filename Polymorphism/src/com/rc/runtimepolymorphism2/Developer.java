package com.rc.runtimepolymorphism2;

public class Developer extends Employee {
	
	@Override
	public void work() {
		super.work();
		System.out.println("as a Developer");
	}

}
