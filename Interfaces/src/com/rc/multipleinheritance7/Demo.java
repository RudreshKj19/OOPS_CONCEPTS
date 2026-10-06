package com.rc.multipleinheritance7;

public interface Demo {
	
	public default void m2() {
		System.out.println("m2 method in demo");
	}
	
	public default void m1() {
		System.out.println("m1 method in demo");
	}
}
