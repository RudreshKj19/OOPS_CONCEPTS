package com.rc.runtimepolymorphism5;

public class JavaDeveloper extends Developer {
	
	String framework;
	
	JavaDeveloper(String name,int age,int empId,String programingLang,String framework){
		super(name,age,empId,programingLang);
		this.framework=framework;
	}
	
	@Override
	public void displayPersonDetails() {
		System.out.println("JavaDeveloper Name: "+this.name);
		System.out.println("JavaDeveloper Age: "+this.age);
		System.out.println("JavaDeveloper Id: "+this.empId);
		System.out.println("programingLang: "+this.programingLang);
		System.out.println("FrameWork: "+this.framework);
	}
	
	@Override
	public void work() {
		System.out.println("JavaDeveloper is working");
	}
	@Override
	public void writeCode() {
		System.out.println("JavaDeveloper writes code");
	}
	
	public void developJavaApplication() {
        System.out.println("Java Developer develops Java application");
    }
	
}
