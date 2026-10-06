package com.rc.nonprimitivetypecasting4;

public class ChatGpt extends AIAssistant {
	
	String creator;
	
	ChatGpt(String name,String lang,String creator){
		super(name,lang);
		this.creator=creator;
		
	}
	
	public void writeCode() {
	    System.out.println("writes Java code");
	    System.out.println("Name: "+this.name);
		System.out.println("Language: "+this.lang);
	    System.out.println("ChatGpt Creator: "+this.creator);
	}

}
