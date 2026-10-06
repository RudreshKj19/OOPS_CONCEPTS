package com.rc.methodoverride1;

public class Vehicle {
	
	public int start(int c) {  //public->public
							   //default->default,public,protected
							   //protected->protected,public.
							   //return Type,and method signature should be same.
							   //@override annotation is optional
		System.out.println("Vehicle Started,...");
		return 10;
	}

}
