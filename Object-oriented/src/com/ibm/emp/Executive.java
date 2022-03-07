package com.ibm.emp;

public class Executive extends Employee {
	public double incentives;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double incentives) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.incentives = incentives;
	}

	public void paySlip() {
		super.paySlip();
		System.out.println("Incentives : " + incentives);
	}

	public double getSalary() {
		return super.getSalary() + incentives;
	}

}
