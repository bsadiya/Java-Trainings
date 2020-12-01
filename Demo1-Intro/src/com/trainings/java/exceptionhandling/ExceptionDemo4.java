package com.trainings.java.exceptionhandling;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		int claimType =3; // 0,1,2 -- 3
		try {
			
		if(claimType == 0) {
			System.out.println("Professional");
		}
		else if(claimType == 1) {
			System.out.println("Facility Inpatient");
		}
		else if(claimType == 2) {
			System.out.println("Facility Outpatient");
		}
		else {
			throw new InvalidClaimTypeException("Invalid Claim Type");
		}
		}
		catch(InvalidClaimTypeException myex) {
			claimType = 0;
			System.out.println(myex);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(claimType);
	}

}
