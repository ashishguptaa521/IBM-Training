package assignment;

import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccount {
	public static void main(String[] args) {
		Bank s = AccountFactory.openSavings("Charlie");

		try {
			s.withdraw(6000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); // For the developers - to troubleshoot errors
//			System.out.println(e); // For logging - to audit the behaviour of applications
			System.out.println(e.getMessage()); // for end users
		}
//		c.withdraw(6000);
//		c.deposit(3000);
//		c.deposit(5000);
//		s.statement();

		Bank s1 = AccountFactory.openSavings("Sean");

	}
}
