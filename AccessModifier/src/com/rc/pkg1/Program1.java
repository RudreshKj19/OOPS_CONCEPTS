package com.rc.pkg1;

public class Program1 {
	
	public void m1() {
		System.out.println("Public AccessModifier");
	}
	
	protected void m2() {
		System.out.println("Protected AccessModifier");
		
	}
	
	void m3() {
		System.out.println("Default AccessModifier");
	}
	
	private void m4() {
		System.out.println("Private AccessModifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		

	}

}
