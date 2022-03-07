package com.ibm.stock;

public class Stock implements Exchange {

	protected Stock() {
	}

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("Get Quote");
	}

	@Override
	public void viewQuote() {
		// TODO Auto-generated method stub
		System.out.println("View Quote");
	}

	@Override
	public void setQuote() {
		// TODO Auto-generated method stub
		System.out.println("Set Quote");
	}

	public static Stock getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
