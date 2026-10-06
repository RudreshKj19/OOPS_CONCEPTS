package com.rc.runtimepolymorphism2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Developer();
		e.work();
		
		e=new TestEngg();
		e.work();

	}

}
