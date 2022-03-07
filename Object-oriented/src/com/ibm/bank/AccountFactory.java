package com.ibm.bank;

/** Final class so that it cannot be inherited. */
public final class AccountFactory {
	/** Private constructor so that no one can access it to instancify. */
	private AccountFactory() {
	};

	public static Account openSavings(String holder) {
		return new Savings(holder);
	}

	public static Account openCurrent(String holder) {
		return new Current(holder);
	}
}
