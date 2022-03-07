package assignment;

import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {

		Holder h = StockSingleton.getStock();
		h.viewQuote();

		Broker b = StockSingleton.getStock();
		b.viewQuote();
		b.getQuote();

		Exchange e = StockSingleton.getStock();
		e.viewQuote();
		e.getQuote();
		e.setQuote();

		System.out.println(h == b);
		System.out.println(b == e);
	}

}
