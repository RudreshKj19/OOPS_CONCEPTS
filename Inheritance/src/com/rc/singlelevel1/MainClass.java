package com.rc.singlelevel1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AiApplication a = new AiApplication();
		a.logIn();
		a.generateResponse();
		
		System.out.println();
		
		Chatgpt c = new Chatgpt();
		c.logIn();
		c.generateResponse();
		c.translate();
		c.generateImage();
		
		
		
		

	}

}
