package com.rc.multipleinheritance6;

public abstract class PaymentApp {
	
	String upiId;
	double balance;
	
	PaymentApp(String upiId,double balance){
		this.upiId=upiId;
		this.balance=balance;
	}
	
	public abstract void sendMessage();
	public abstract void doPayment();
	
	public void displayDetails() {
		System.out.println("Upi Id: "+this.upiId);
		System.out.println("Balance: "+this.balance);
	}

}
