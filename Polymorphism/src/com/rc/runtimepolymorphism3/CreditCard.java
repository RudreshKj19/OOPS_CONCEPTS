package com.rc.runtimepolymorphism3;

public class CreditCard extends Card {
	
	@Override
	public void swipe() {
		System.out.println("For Money Transaction(CreditCard),...");
	}

}
