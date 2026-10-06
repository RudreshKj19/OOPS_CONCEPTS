package com.rc.example5;

public class CreditCard extends Card {
	
	String bankName;
	
	CreditCard(long no,double balance,String bankName){
		super(no,balance);
		this.bankName=bankName;
	}
	@Override
	public void swipe() {
		System.out.println("Swipe card for money Transaction");
	}
	
	public void displayCardDetails() {
		System.out.println("CreditCard No: "+this.no);
		System.out.println("Balance: "+this.balance);
		System.out.println("BankName: "+this.bankName);
	}

}
