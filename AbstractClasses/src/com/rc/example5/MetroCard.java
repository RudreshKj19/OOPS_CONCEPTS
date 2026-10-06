package com.rc.example5;

public class MetroCard extends Card {
	
	String metroName;
	
	MetroCard(long no,double balance,String metroName){
		super(no,balance);
		this.metroName=metroName;
	}
	
	@Override
	public void swipe() {
		System.out.println("Swipr card to travel");
	}
	
	@Override
	public void displayCardDetails() {
		System.out.println("MetroCard No: "+this.no);
		System.out.println("Balance: "+this.balance);
		System.out.println("MetroName: "+this.metroName);
	}

}
