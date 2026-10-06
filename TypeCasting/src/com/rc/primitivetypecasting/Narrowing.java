package com.rc.primitivetypecasting;

public class Narrowing {
	
	public static void main(String[] args) {
		
		float a = 25.5f;
		
		long b;
		
		b=(long)a;
		
		System.out.println("a:"+a);
		System.out.println("b: "+b);
		
		//double --> char(narrowing)
		
		double a1 = 65.0;
		
		char b1;
		
		b1 = (char) a1;
		
		System.out.println("a1: "+a1);
		System.out.println("b1: "+b1);
		
		//char --> byte
		
		char x = 'C';
		
		byte y;
		
		y =(byte) x;
		
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		
		//char -- short
		
		char c = 'D';
		
		short d;
		
		d =(short) c;
		
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		//char --> int
		
		char c1 = 'E';
		
		int d1;
		
		d1 =(int) c1;
		
		System.out.println("c1: "+c1);
		System.out.println("d1: "+d1);
		
		//byte --> char(explicitly)
		
		byte e1 = 67;
		
		char f1;
		
		f1 = (char)e1;
		
		System.out.println("e1: "+e1);
		System.out.println("f1: "+f1);
		
		
		//short -->char
		
		short r1 = 100;
		
		char s1;
		
		s1 = (char) r1;
		
		System.out.println("r1: "+r1);
		System.out.println("s1: "+s1);
		
		//int --> char
		
		int t1 = 234;
		
		char t2;
		
		t2 = (char) t1;
		
		System.out.println("t1: "+t1);
		System.out.println("t2: "+t2);
			
	}

}
