package com.trainings.java.staticDemo;

public class Employee {

	int id;
	String name;
	
	{
		System.out.println("Instance Block!!");
		id = 11111;
		name = "NoName";
	}
	
	static int numberOfEmployees;
	
	static {
		String EmployerName="Training.com";
//		id =20; // can't use non-static  
		System.out.println("Static Block!! "+EmployerName);
		System.out.println("numberOfEmployees: "+numberOfEmployees);
		wishEmployees();
	}
	
	Employee(){
		System.out.println("Constructor Block!!!");
		numberOfEmployees++;
		System.out.println("numberOfEmployees: "+numberOfEmployees);
	}
	
	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("Main Method");
		
		Employee e1 = new Employee(123,"Sadiya");
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		System.out.println(e4.id);
		System.out.println(e4.salary(120000000));
		
	}
	
	int salary(int prevSalary) {
		System.out.println("Non-Static Method!!");
		int bonus = 50000;
		return prevSalary+bonus;
	}
	
	
	private static void wishEmployees() {
		System.out.println("Happy Diwali!!!!");
	}

	public Employee(int id, String name) {
		this();
		System.out.println("Param-Constructor!!!********");
		System.out.println("id: "+id + "Name: "+name);
		this.id = id;
		this.name = name;
		System.out.println("id: "+id + "Name: "+name);
	}
	
	

	
}
