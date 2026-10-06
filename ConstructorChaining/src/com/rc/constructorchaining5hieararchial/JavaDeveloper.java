package com.rc.constructorchaining5hieararchial;

public class JavaDeveloper extends Developer {
	
	String frameWork;
	
	JavaDeveloper(String name,String frameWork){
		super(name);
		this.frameWork= frameWork;
		
	}
	
	public void developJavaApplication() {
	    System.out.println("Java Developer develops Java applications");
	    System.out.println("FrameWork: "+this.frameWork);
	}

}
