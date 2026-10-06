package com.rc.compiletimepolymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application a = new Application();
		a.doPayment("ABC123");
		a.doPayment(87965343598L);
		a.doPayment(2000.0);

	}

}
