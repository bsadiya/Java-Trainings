package com.trainings.java.inheritancedemo;

public class InheritanceScenario {

	public static void main(String[] args) {
		
		ChildClass1 c1 = new ChildClass1();
		
		c1.assets();
		c1.marriage();
	}

}


class ParentClass1 {
	
	final void assets() {
		System.out.println("Assets Parent class have");
	}
	
	void marriage() {
		System.out.println("Marriage Parent class have");
	}
	
}


class ChildClass1 extends ParentClass1{
	
//	void assets(){
//		
//	}
	
	void marriage() {
		System.out.println("Child Class Marriage Method");
	}
	
}