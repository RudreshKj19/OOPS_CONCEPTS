package com.rc.runtimepolymorphism3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new MetroCard();
		accessObject(c);
		
		c = new CreditCard();
		accessObject(c);
		
		c = new DebitCard();
		accessObject(c);	
	}
	
	public static void accessObject(Card c) {
		c.swipe();
	}

}
