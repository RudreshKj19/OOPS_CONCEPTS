package com.rc.runtimepolymorphism5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Employee("Darshan",22,44321);
		accessObject(p);
		
		p=new Developer("Rakesh",23,14878,"Java");
		accessObject(p);
		
		p=new JavaDeveloper("Ranjith",24,77956,"Java","Spring Boot");
		accessObject(p);
		
		p=new PythonDeveloper("Suhil",23,4321,"Python","NumPy");
		accessObject(p);
	}
	
	public static void accessObject(Person p) {
		p.displayPersonDetails();
//		System.out.println();
		 if(p instanceof JavaDeveloper) {
			JavaDeveloper j = (JavaDeveloper) p;
			j.work();
			j.writeCode();
			j.developJavaApplication();
		}
		 else if(p instanceof PythonDeveloper) {
				PythonDeveloper p1 = (PythonDeveloper) p;
				p1.work();
				p1.writeCode();
				p1.developPythonApplication();
			}
		 else if(p instanceof Developer) {
				Developer d = (Developer) p;
				d.work();
				d.writeCode();
			}
		 else if(p instanceof Employee) {
			Employee e = (Employee) p;
			e.work();
		   }	
	 }

}
