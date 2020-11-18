package com.trainings.java.staticDemo;

public class StaticKeywordDemo {

	// Instance Variable - Object level Variables
	int i;

	// Static Variable - Class level Variables
	static int j;

//	instance Block
	{
		i = 10;
		System.out.println("Instance Block!");
	}

	// Static Block
	static {
		System.out.println("Static Block!");
//		i=20; // Cannot make a static reference to the non-static field ic
		j = 30;
	}
	
	public StaticKeywordDemo() {
		System.out.println("Constructor..");
	}
	

	public static void main(String[] args) {
		System.out.println("main Method!");
	}

	void nonStaticMethod(){
		System.out.println("nonStaticMethod !!!");
		System.out.println("Instance Variable: "+i);
		
	}

}
