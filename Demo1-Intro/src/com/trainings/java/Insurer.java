package com.trainings.java;

public class Insurer {

	String insName;
	
	int insId;
	
	Member member;
	
	Provider provider;
	
	public Insurer() {
		System.out.println("No-arg constructor");
	}
	
	//Construcor
	public Insurer(String insName) {
		this();
		System.out.println("arg constructor");
		this.insName = insName;
	}

	String getMemberInfo() {
		return member.getName();
	}
	
	void addMember(Member member) {
		this.member = member;
		System.out.println("Member Added Succesfully!!");
	}
	
}
