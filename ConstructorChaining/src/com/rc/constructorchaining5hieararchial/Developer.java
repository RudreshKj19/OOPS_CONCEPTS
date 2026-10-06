package com.rc.constructorchaining5hieararchial;

public class Developer {
	
	String name;
	
	Developer(String name){
		this.name=name;
	}
	
	public void writeCode() {
		System.out.println("Developer Writes code");
		System.out.println("Developer Name: "+this.name);
	}
	
}
