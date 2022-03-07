package com.ibm.bank;

public interface Bank {
	// Application constants
	public int INIT_ACNT_NO = 10001;
	public double MIN_SAVINGS_BAL = 1000;
	public double OVERDRAFT_LIMIT = 10000;
	public double MIN_CURRENT_BAL = 0;
	public double INIT_CURRENT_BAL = 5000;

	// Application interface
	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;

	void summary();

	void statement();
}
