package com.rc.multipleinheritance3;

public class Printer implements AllInOne {
	
	String brand;
	String type;
	
	Printer(String brand,String type){
		this.brand=brand;
		this.type=type;
	}
	
	@Override
	public void print() {
		System.out.println("Printer is Printing");
	}
	
	@Override
	public void scan() {
		System.out.println("Printer is Scanning");
	}
	
	@Override
	public void copy() {
		System.out.println("Printer is Copying");
	}
	
	@Override
	public void performTask() {
		System.out.println("Printer is Performing multiple Tasks");
	}
	
	public void displayPrinterDetails() {
		System.out.println("Printer brand name: "+this.brand);
		System.out.println("Printer type: "+this.type);
	}

}
