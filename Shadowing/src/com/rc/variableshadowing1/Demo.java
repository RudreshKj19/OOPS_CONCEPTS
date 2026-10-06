package com.rc.variableshadowing1;

public class Demo extends Sample {
	
	int x=20;
	
	public void m1() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1();
		
	}

}
