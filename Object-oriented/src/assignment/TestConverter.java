package assignment;

import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.Dollar;
import com.ibm.xe.Rupee;

public class TestConverter {
	public static void main(String[] args) {
		Rupee r = new Rupee();
		Dollar d = new Dollar();
		CurrencyConverter c1 = new CurrencyConverter();
		c1.convert(d,r, 10);

	}
}
