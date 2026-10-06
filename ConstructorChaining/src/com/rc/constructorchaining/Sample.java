package com.rc.constructorchaining;

public class Sample {
	
	Sample(int a){
		this();
		System.out.println("Constructor-1");
	}
	
	Sample(){
		System.out.println("Constructor-2");
	}
	
	Sample(double b){
		System.out.println("Constructor-3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
		Sample s3 = new Sample(10.0);

	}

}
