package new_features;

@FunctionalInterface
public interface Currency {
	double dollarValue();

	Currency USD = () -> 1.00;
	Currency INR = () -> 74.50;
	Currency GBP = () -> .80;

	static double convert(Currency source, Currency target, double amount) {
		return (target.dollarValue() / source.dollarValue()) * 100;
	}
}
