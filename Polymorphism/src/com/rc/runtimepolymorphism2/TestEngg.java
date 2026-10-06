package com.rc.runtimepolymorphism2;

public class TestEngg extends Employee {
	
	@Override
	public void work() {
		super.work();
		System.out.println("as a Test Engineer,...");
	}

}
