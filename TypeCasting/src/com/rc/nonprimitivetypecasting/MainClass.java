package com.rc.nonprimitivetypecasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentApp p = new GooglePay();  // upcasting
		GooglePay gp = (GooglePay) p;   // downcasting
		gp.doPayment();
		gp.enterNumber();
		
		p = new PhonePay();
		PhonePay pp = (PhonePay) p;
		pp.doPayment();
		pp.scanQR();
		

	}

}
