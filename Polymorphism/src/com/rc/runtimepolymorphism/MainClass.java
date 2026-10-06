package com.rc.runtimepolymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University u = new College();
		accessObject(u);
		
		u = new Student();
		accessObject(u);	
	}
	
	public static void accessObject(University u) {
		u.displayDetails();
	}

}
