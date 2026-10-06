package com.rc.multilevel2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount();
		s.openAccount();
		s.deposit();
		s.withdraw();
		s.checkBalance();
		s.closeAccount();
		
		System.out.println();
		
		BankAccount b = new BankAccount();
		b.openAccount();
		b.deposit();
		b.withdraw();
		b.closeAccount();
		
		System.out.println();
		
		Account a = new Account();
		a.openAccount();
		a.closeAccount();
		
		

	}

}
