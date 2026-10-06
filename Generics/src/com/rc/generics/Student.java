package com.rc.generics;

public class Student<T> {
	
	T x;
	Student(T x){
		this.x=x;
	}
	
	public T returnValue() {
		return x;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Integer> s1 = new Student<Integer>(100);
		Integer res = s1.returnValue();
		System.out.println(res);
		Student<String> s2 = new Student<String>("123Abc");
		String res2 = s2.returnValue();
		System.out.println(res2);
		
		

	}

}
