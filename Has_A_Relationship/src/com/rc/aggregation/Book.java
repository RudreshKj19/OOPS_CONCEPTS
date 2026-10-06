package com.rc.aggregation;

public class Book {
	
	String name;
	int nop;
	
	Book(String name,int nop){
		this.name = name;
		this.nop = nop;
	}
	
	public void displayBookDetails() {
		System.out.println("Book Name: "+this.name);
		System.out.println("Number of Pages: "+this.nop);
	}
}
