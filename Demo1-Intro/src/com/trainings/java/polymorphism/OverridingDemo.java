package com.trainings.java.polymorphism;

/**
 * 
 * Parent-Child
 * @author sadbegum
 *
 */
public class OverridingDemo {

	public static void main(String[] args) {
		
		Bike bike = new Bike();
		
		Pulsar pulsar = new Pulsar();
		
		// Ref --> Object
		Bike myBike = new Pulsar();
		myBike.model(); // --Child Model // Runtime Polymorphism -- JVM decides -- Dynamic binding / Late Binding

//		 MethodName(Arguments) - Method Signature
		
	}

}

class Bike{
	
	 void model() {
		System.out.println("Parent Model");
	}
	 
//	 abstract void seatCapacity();
	
	protected void color() {
		System.out.println("Black");
	}
	
	private void design() {
		System.out.println(" Internal Design");
	}
}

// Private --> default --> protected --> public // we cannot reduce scope

// Method Hiding --> Overriding: Non-static Methods. whras in Method hiding: both methods shud be static

//final-->Non-final : not Applicable in overriding ; bt Non-Final to Final -->Applicable
//abstract-->Non-abstract : not Applicable in overriding ; bt Non-abstract to abstract -->Applicable

class Pulsar extends Bike{
	// Overriding
	final void model() {
		System.out.println("Child Model");
	}
	
	@Override
	public void color() {
		System.out.println("Red");
	}
	
	void cc() {
		System.out.println("180cc");
	}
	
	private void design() {
		System.out.println("Pulsar Design");
	}

	
	
	
}

abstract class PulsarNs extends Pulsar{
//	void model() {
//		System.out.println("Child Model");
//	}
	
	abstract  void cc();
}
