package com.rc.nonprimitivetypecasting4;

public class AIAssistant {
	
	String name;
	String lang;
	
	AIAssistant(String name,String lang){
		this.name=name;
		this.lang=lang;
	}
	
	public void generateResponse() {
		System.out.println("AI Assistant generates a response");
	}

}
