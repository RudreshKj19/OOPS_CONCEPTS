package com.rc.functionalinterface3;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = (n)->{
			int res=1;
			for(int i=1;i<=n;i++) {
				res=res*i;
			}
			return res;
		};
		System.out.println(f.fact(4));

	}

}
