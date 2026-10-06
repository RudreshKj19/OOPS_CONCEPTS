package com.rc.multilevel1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GooglePay g = new GooglePay();
		g.logIn();
		g.doPayemnt();
		g.scanQr();
		g.logOut();
		
		System.out.println();
		
		Application a = new Application();
		a.logIn();
		a.logOut();
		
		System.out.println();
		
		PaymentApp p = new PaymentApp();
		p.logIn();
		p.doPayemnt();
		p.logOut();
		

	}

}
