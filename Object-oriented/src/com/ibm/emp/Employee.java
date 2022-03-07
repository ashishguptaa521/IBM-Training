package com.ibm.emp;

public abstract class Employee {
	public  int empNo;
	private String empName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public static int count = 1001;
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
		count++;
	}

	public void paySlip() {
		System.out.println("Emp no: " + empNo);
		System.out.println("Emp name: " + empName);
		System.out.println("Emp Salary: " + salary);

	}

	public double getSalary() {
		return salary;
	}

}
