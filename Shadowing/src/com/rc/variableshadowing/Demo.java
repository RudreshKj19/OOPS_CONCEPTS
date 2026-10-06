package com.rc.variableshadowing;

public class Demo {
	
	int a = 10;
	
	public void m1() {
		int a = 20;
		System.out.println(a);//20
		System.out.println(this.a);//10
	}

}
