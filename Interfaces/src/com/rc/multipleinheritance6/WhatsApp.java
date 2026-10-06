package com.rc.multipleinheritance6;

public class WhatsApp extends PaymentApp implements CommunicationApp{
	
	int noOfContacts;
	
	WhatsApp(String upiId,double balance,int noOfContacts){
		super(upiId,balance);
		this.noOfContacts=noOfContacts;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("Send messages through WhatsApp");
	}
	
	@Override
	public void doPayment() {
		System.out.println("Make payment through WhatsApp");
	}
	
	@Override
	public void doCalls() {
		System.out.println("Make calls through whatsapp");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Upi Id: "+this.upiId);
		System.out.println("Balance: "+this.balance);
		System.out.println("no of Contacts: "+this.noOfContacts);
	}

}
