package com.trainings.java.java8;

public class Java8Intro {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.method();
		System.out.println("-----Anonymous -No name----------");
		
		new TestInterface() {
			@Override
			public void method() {
				System.out.println("Anonymous impltn method 1");
			}

			@Override
			public void method1() {
				System.out.println("Anonymous impltn method 2");
				
			}
		}
		.method();
		

	}

}

class TestClass implements TestInterface{

	@Override
	public void method() {
		System.out.println("Method Implementation");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}


interface TestInterface{
	void method();
	void method1();
}