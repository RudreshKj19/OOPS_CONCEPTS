package com.rc.fever;

public class Person {
	
	String name;
	
	public void treat() {
		Treat t = new Treat();
		t.name = "Suresh";
		t.disease = "Fever";
		System.out.println("Dr."+this.name+" is "+"treating "+t.name+" for "+t.disease);
	}

}
