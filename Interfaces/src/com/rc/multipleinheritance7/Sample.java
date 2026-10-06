package com.rc.multipleinheritance7;

public interface Sample {
	
	public default void m1() {
		System.out.println("M1 method in sample");
	}

}
