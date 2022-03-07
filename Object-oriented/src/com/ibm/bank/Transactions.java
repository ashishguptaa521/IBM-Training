package com.ibm.bank;

public class Transactions {
	private String type;
	private double amount;
	private double balance;

	public Transactions(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public String print() {
		// TODO Auto-generated method stub
		return type + "\t" + amount + "\t" + balance;
	}

}
