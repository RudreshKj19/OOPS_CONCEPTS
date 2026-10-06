package com.rc.multipleinheritance3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer p = new Printer("Hp","color");
		p.displayPrinterDetails();
		System.out.println();
		p.scan();
		p.copy();
		p.print();
		p.performTask();
		

	}

}
