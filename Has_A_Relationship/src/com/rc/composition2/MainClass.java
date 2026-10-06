package com.rc.composition2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen = new Pen("Montex",10,"Ball pen");
		pen.displayPenDetails();
		System.out.println();
		pen.ink.InkDetails();

	}

}
