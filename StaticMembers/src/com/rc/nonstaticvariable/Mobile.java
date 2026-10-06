package com.rc.nonstaticvariable;

public class Mobile {

	
	public void Call() {
		System.out.println("calling");
	}
	
	public void SendMessage() {
		System.out.println("send messages");
	}
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.Call();
		m.SendMessage();

	}

}
