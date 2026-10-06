package com.rc.multipleinheritance8;

public interface SuperInterface {
	
	void m2();
	
	default void m1() {
		System.out.println("default m1 method in superinterface");
	}

}
