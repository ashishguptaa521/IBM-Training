package com.ibm.bank;

public class CurrentTransactions extends Transactions {

	private double overdraft;

	public CurrentTransactions(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}

	public String print() {
		return super.print() + "\t" + overdraft;
	}

}
