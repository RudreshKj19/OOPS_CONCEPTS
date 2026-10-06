package com.rc.multipleinheritance8;

public class SubClass extends SuperClass implements SuperInterface {
	
	public void displayBoth() {
		super.m1();
//		super.m2();
		SuperInterface.super.m1();
	}
}
