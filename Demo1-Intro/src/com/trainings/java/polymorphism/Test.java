package com.trainings.java.polymorphism;

class Animal {
}

class Monkey extends Animal {
}

class Test {
	
	// Constructor Overloading
	Test(){
		
	}
	
	Test(int a){
		
	}
	
	Test(int a , int b){
		
	}
	
	
	// Method Overloading
	
//	until 1.4 ---> return type cannot be changed, bt later ...frm 1.5 --> we can have different return type
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}

	public int methodOne(Monkey m) {
		System.out.println("Monkey version");
		return 10;
	}

	public static void main(String[] args) {
		Test t = new Test();
		Animal a = new Animal();
		t.methodOne(a);// Animal version
		Monkey m = new Monkey();
		t.methodOne(m);// Monkey version
		
		//    Ref --> Object
		Animal a1 = new Monkey();
		t.methodOne(a1); // CTP depends on Ref, not on the runtime Object
	}
}
