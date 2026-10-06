package com.rc.nonprimitivetypecasting4;

public class Claude extends AIAssistant {
	
	String company;
	
	Claude(String name,String lang,String company){
		super(name,lang);
		this.company=company;
	}
	
	public void analyzeText() {
	    System.out.println("Claude analyzes text");
	    System.out.println("Name: "+this.name);
		System.out.println("Language: "+this.lang);
		System.out.println("Claude Company Name: "+this.company);
	}

}
