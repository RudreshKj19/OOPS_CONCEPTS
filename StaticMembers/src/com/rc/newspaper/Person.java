package com.rc.newspaper;


public class Person {
	
	String name;
	
	public void read() {
		Paper pp = new Paper();
		pp.type="news";
		System.out.println(this.name+ " reading "+pp.type+ " Paper. ");
	}

}
