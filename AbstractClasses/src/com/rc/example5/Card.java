package com.rc.example5;

 abstract public class Card {
	
	long no;
	double balance;
	
	Card(long no,double balance){
		this.no=no;
		this.balance=balance;
	}
	
	 abstract public void swipe();
	 
	 public void displayCardDetails() {
		 System.out.println("Card No: "+this.no);
		 System.out.println("Balance: "+this.balance);
	 }

}
