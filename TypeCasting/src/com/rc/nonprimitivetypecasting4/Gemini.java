package com.rc.nonprimitivetypecasting4;

public class Gemini extends AIAssistant {
	String modelType;
	
	Gemini(String name,String lang,String modelType){
		super(name,lang);
		this.modelType = modelType;	
	}
	
	public void searchInformation() {
	    System.out.println("Gemini provides information");
	    System.out.println("Name: "+this.name);
		System.out.println("Language: "+this.lang);
		System.out.println("Gemini modelType: "+this.modelType);
	}

}
