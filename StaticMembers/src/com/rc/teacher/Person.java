package com.rc.teacher;

public class Person {
	
	String name;
	
	public void teach() {
		Program pp = new Program();
		pp.lang="JAVA";
		pp.to="students";
		System.out.println("Teacher "+this.name+" is teaching "+pp.lang+" Programming to "+pp.to+".");
	}

}
