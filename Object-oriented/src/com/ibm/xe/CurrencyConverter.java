package com.ibm.xe;

public class CurrencyConverter {
	Currency source, target;
	double amount;

	public void convert(Currency source, Currency target, double amount) {
		double x =  (target.dollarValue() / source.dollarValue()) * amount;
		System.out.println(x);
	}
}
