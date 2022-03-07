package assignment;

import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1;

		Executive exec = new Executive("Mona", 5000, 2000);
		Manager mgr = new Manager("Jack", 7000, 3000);

		showSalary(exec);
		showSalary(mgr);

	}

	private static void showSalary(Employee emp) { // Using instanceof method to keep the polymorfic nature intact
		if (emp instanceof Manager)
			System.out.println("Manager salary : " + emp.getSalary());
		else
			System.out.println("Executive salary : " + emp.getSalary());
	}

	// public static void showSalary(Manager mgr) {
	// System.out.println("Manager salary : " + mgr.getSalary());
	// }

	// public static void showSalary(Executive exec) {
	// System.out.println("Executive salary : " + exec.getSalary());
	// }
}
