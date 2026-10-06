package com.rc.constructor;

public class BankAccount {

	String accHolder;
	long accNumber;
	String bankName;
	double balance;
	String accType;

	BankAccount(String accHolder, long accNumber, String bankName, double balance, String accType) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
		this.accType = accType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount("Laxman", 1562872383839l, "Canara", 60000.0, "Savings");
		BankAccount b2 = new BankAccount("Harshith", 1457632927518l, "SBI", 120000.0, "Current");

		b1.displayAccountDetails();
		b2.displayAccountDetails();

	}

	public void displayAccountDetails() {
		System.out.println("AccountHolder Name: " + this.accHolder);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Bank Name: " + this.bankName);
		System.out.println("Bank balance: " + this.balance);
		System.out.println("AccountType: " + this.accType);
		System.out.println();
	}

}
