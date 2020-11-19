package com.trainings.java.inheritancedemo;

public class InheritanceDemo {

	public static void main(String[] args) {
		// Acquiring properties - for reusability
		// Single inheritance A - > B
		// Multi-level A -> B -> C
		// Hierarical --> A --> B, A--> D, A-->E
		// Multiple --> A,B -->C -- Not supported by Java - but this can be achieved thru Interface
		// Hybrid --> Consisting of all types ---> Not Supported by Java
		
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		
		C c = new C();
		c.m3();

	}

}

class A{
	{}
	static {}
	
	int i;
	void m1() {

	}

	void m2() {

	}
}

class B extends A{


	void m3() {

	}

	void m4() {

	}
}

class C extends B{
	

	void m5() {

	}

	void m6() {

	}
}