package com.trainings.java;

/**
 * @author sadbegum
 *
 */
public class Member {

	String name;
	Provider provider;
	
	
	public Member() {
		
	}

	/**
	 * This is my constructor used to initialize members name and provider service taken by member.
	 * @param name
	 * @param provider
	 * 
	 * @return nothing
	 */
	public Member(String name, Provider provider) {
		super();
		this.name = name;
		this.provider = provider;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	
}