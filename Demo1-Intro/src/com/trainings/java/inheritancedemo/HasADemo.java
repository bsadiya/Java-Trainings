package com.trainings.java.inheritancedemo;

public class HasADemo {

	public static void main(String[] args) {
		Org org = new Org();
		org.createDept();
		org.updateDept();
	}

}

//Org-Dept ---> Composition relationship 
class Org{
	final Dept dept = new Dept();
	
	void createDept() {
		dept.deptId =123;
		System.out.println("Department created with id : "+dept.deptId);
	}
	
	void updateDept() {
		dept.deptId =234;
		System.out.println("Department Updated with id : "+dept.deptId);
	}
}


// Dept-Prof -->Aggregation
class Dept{
	int deptId;
	Professor prof;
}

class Professor{
	
}