package com.rc.multipleinheritance6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatsApp w =new WhatsApp("ABC124484849",25000.0,700);
		w.sendMessage();
		w.doCalls();
		w.doPayment();
		System.out.println();
		w.displayDetails();
		

	}

}
