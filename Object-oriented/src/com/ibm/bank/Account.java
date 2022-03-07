package com.ibm.bank;

/**
 * This class represents generalized bank accounts
 * 
 * @author Ashish
 * @version 1.0
 * 
 *
 */
public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	private static int autogen = INIT_ACNT_NO;
	protected Transactions[] txns;
	protected int idx;

	/** This is the default constructor */
	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the parameterized constructor
	 * 
	 * @param holder
	 * @param balance
	 */
	public Account(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		txns = new Transactions[10];
	}

	/** Method to print summary of a bank account. */

	public void summary() {
		System.out.println("Account no: " + acntNo);
		System.out.println("Holder name: " + holder);
		System.out.println("Holder balance: " + balance);
	}

	// BL Methods
	/** Deposit method. */
	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transactions("Cr", amount, balance);
	}

	/** Method that shows account statement. */
	public void statement() {
		System.out.println("Statement : " + acntNo);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i].print());
	}

}
