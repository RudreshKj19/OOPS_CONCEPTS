package com.rc.multipleinheritance1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile(40000.0,"Samsung");
		m.buyProduct();
		m.displayMobileDetails();
		m.switchOn();
		m.switchOff();
//		Mobile m1 = new Mobile(50000.0);
//		m1.displayMobileDetails();
	}
}
