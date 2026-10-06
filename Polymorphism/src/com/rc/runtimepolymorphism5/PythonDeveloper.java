package com.rc.runtimepolymorphism5;

public class PythonDeveloper extends Developer {
	
	String library;
	
	PythonDeveloper(String name,int age,int empId,String programingLang,String library){
		super(name,age,empId,programingLang);
		this.library=library;
	}
	
	@Override
	public void displayPersonDetails() {
		System.out.println("PythonDeveloper Name: "+this.name);
		System.out.println("PythonDeveloper Age: "+this.age);
		System.out.println("PythonDeveloper Id: "+this.empId);
		System.out.println("PythonDeveloper programingLang: "+this.programingLang);
		System.out.println("Library: "+this.library);
	}
	
	@Override
	public void work() {
		System.out.println("PythonDeveloper is working");
	}
	@Override
	public void writeCode() {
		System.out.println("PythonDeveloper writes code");
	}
	
	public void developPythonApplication() {
        System.out.println("Python Developer develops Python application");
    }

}
