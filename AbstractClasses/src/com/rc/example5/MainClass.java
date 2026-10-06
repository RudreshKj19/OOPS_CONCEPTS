package com.rc.example5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MetroCard m = new MetroCard(897866345,1000.0,"Namma Metro");
		m.swipe();
		m.displayCardDetails();
		System.out.println();
		CreditCard c = new CreditCard(7709874567L,20000.0,"Canara");
		c.swipe();
		c.displayCardDetails();

	}

}
