package com.rc.constructorchaining5hieararchial;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDeveloper j = new JavaDeveloper("Darshan","Spring Boot");
		j.writeCode();
		j.developJavaApplication();
		System.out.println();
		
		PythonDeveloper p = new PythonDeveloper("Suhail","NumPy");
		p.writeCode();
		p.developPythonApplication();
		

	}

}
