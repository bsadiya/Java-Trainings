package com.trainings.java.interfaces;

public interface RBI {

	public static final int baseInterest = 1;
	
	abstract void guidelines();
	
}

interface AInterface{
	void Specs1();
}
interface BInterface extends AInterface{
	void Specs2();
}



class HDFC extends HDFCAdaptor implements RBI{

	/*
	 * RBI rbi = new RBI() {
	 * 
	 * @Override public void guidelines() {
	 * 
	 * System.out.println("HDFC Guidelines with Interest rate: "+ baseInterest);
	 * System.out.println(RBI.baseInterest); } };
	 */
	
	@Override
	public void guidelines() {
		
		System.out.println("HDFC Guidelines with Interest rate: "+ baseInterest);
		System.out.println(RBI.baseInterest);
	}

	@Override
	public void Specs1() {
		System.out.println("Defining My Specifications ");
	}
	
}

class HDFCAdaptor implements BInterface{

	@Override
	public void Specs1() {
	}

	@Override
	public void Specs2() {
	}
	
}


