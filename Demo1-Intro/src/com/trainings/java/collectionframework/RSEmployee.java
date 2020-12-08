package com.trainings.java.collectionframework;

public class RSEmployee implements Comparable<RSEmployee>{

	long empid;
	String empName;
	long salary;
	double experience;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	

	public RSEmployee(long empid, String empName, long salary, double experience) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "RSEmployee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", experience="
				+ experience + "]";
	}

	@Override
	public int compareTo(RSEmployee o) {
		if(this.empName.compareTo(o.getEmpName()) == 0) {
			if(this.experience > o.getExperience()) {
				return -1;
			}
			if(this.experience < o.getExperience()) {
				return 1;
			}
			return 0;
		}
			return this.empName.compareTo(o.getEmpName());
	}

}
