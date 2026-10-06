package com.rc.methodoverloading2;

public class Application {
	
	public void doPayment(String upi) {
		
		System.out.println("Payment done via upi");
		System.out.println("UpiId: "+upi);
		System.out.println();
	}
	public void doPayment() {
		System.out.println("Payment done via Cash on Delievery");
		System.out.println();
	}
	 
    public void doPayment(double wallet) {
		
		System.out.println("Payment done via Wallet");
		System.out.println("Amount: "+wallet);
		System.out.println();
		
	}
    
    public void doPayment(long cardNo) {
		
		System.out.println("Payment done via Card");
		System.out.println("Card Number: "+cardNo);
		
	}

}
