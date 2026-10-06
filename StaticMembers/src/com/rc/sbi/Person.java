package com.rc.sbi;

public class Person {
	
	String name;
	
	public void deposit() {
		Account ac = new Account();
		ac.amount = 10000.0;
		ac.type = "savings";
		ac.bank = "SBI";
		System.out.println(this.name+" is depositing "+ac.amount+" into his "+ac.type+" account at "+ac.bank+".");
	}

}
