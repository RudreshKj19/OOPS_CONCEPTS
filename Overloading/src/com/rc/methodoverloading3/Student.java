package com.rc.methodoverloading3;

public class Student {
	
	public void marks(int m1,int m2){
		
		System.out.println("Sum of m1 and m2: "+(m1+m2));
	}
	public void marks(int m1,int m2,int m3){
		
		System.out.println("Sum of m1,m2,m3: "+(m1+m2+m3));
	}
	public void marks(int m1,int m2,int m3,int m4){
		
		System.out.println("Sum of m1,m2,m3,m4: "+(m1+m2+m3));
	}

}
