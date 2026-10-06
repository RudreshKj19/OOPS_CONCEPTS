package com.rc.constructorchaining5hieararchial;

public class PythonDeveloper extends Developer {
	
	String library;
	
	PythonDeveloper(String name,String library){
		super(name);
		this.library=library;
	}
	
	public void developPythonApplication() {
	    System.out.println("Python Developer develops Python applications");
	    System.out.println("Library: "+this.library);
	}

}
