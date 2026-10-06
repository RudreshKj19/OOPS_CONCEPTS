package com.rc.interface3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instagram i = new Instagram("rudresh_2k4","rudresh12@gmail.com",700,500);
		i.login();
		i.displayApplicationDetails();
		i.logout();
		System.out.println();
		PhonePay p = new PhonePay("Shashank H S","shashankhs123@gmail.com","Canara","ABD1237HGGUG");
		p.login();
		p.displayApplicationDetails();
		p.logout();
	}
}
