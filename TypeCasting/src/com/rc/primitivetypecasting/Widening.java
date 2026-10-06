package com.rc.primitivetypecasting;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int --> double (widening)
		int a = 100;
		
		double b;
		
		 b = a;// implicitly-compiler
		 System.out.println(a);
		 System.out.println(b);
		 
		 
		 // int --> double (explicitly-programmer-typecast operator)
		 int x = 25;
		 
		 double y;
		 
		 y = (double)x; // explicitly - programmer
		 System.out.println(x);
		 System.out.println(y);
		 
		 

	}

}
