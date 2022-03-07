package com.ibm.emp;

public class Manager extends Employee {
	public double commision;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double commision) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commision = commision;
	}

	public void paySlip() {
		super.paySlip();
		System.out.println("Comission : " + commision);
	}

	public double getSalary() {
		return super.getSalary() + commision;
	}
}
