package com.rc.nonprimitivetypecasting4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessObject(new ChatGpt("AI Chatbot","Natural Lang","OpenAI"));
		System.out.println();
		accessObject(new Gemini("AI Chatbot","Natural Lang","Gemini Pro"));
		System.out.println();
//		accessObject(new Claude("AI Chatbot","Natural Lang","Anthropic"));
//		System.out.println();
//		accessObject(new AIAssistant("AI Chatbot","Natural Lang"));
		
	}
	
	public static void accessObject(AIAssistant ai) {
		
		if(ai instanceof ChatGpt) {
			ChatGpt c = (ChatGpt) ai;
			System.out.println("ChatGpt Details: ");
			c.generateResponse();
			c.writeCode();
		}
		else if(ai instanceof Gemini) {
			Gemini g = (Gemini) ai;
			System.out.println("Gemini Details: ");
			g.generateResponse();
			g.searchInformation();
			
		}
		else if(ai instanceof Claude) {
			Claude cl = (Claude) ai;
			System.out.println("Claude Details: ");
			cl.generateResponse();
			cl.analyzeText();
		}
		else
			System.out.println("different Object,...");
		
	}

}
