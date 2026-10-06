package com.rc.compiletimepolymorphism;

	public class Application {
		
		public void doPayment(String upi) {
			
			System.out.println("Payment done via upi");
			System.out.println("UpiId: "+upi);
			System.out.println();
		}
		
		public void doPayment(long cardNo) {
				
			System.out.println("Payment done via Card");
			System.out.println("Card Number: "+cardNo);
			System.out.println();
				
			}

	    public void doPayment(double walletAmount) {
			
			System.out.println("Payment done via Wallet");
			System.out.println("Amount: "+walletAmount);
			
			
		}
	    
	  
	}


