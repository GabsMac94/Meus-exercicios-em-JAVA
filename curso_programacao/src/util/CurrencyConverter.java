package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dollars;
	public static double price;
	
	public static double converter() {
		return price * dollars ;
	}
	
	public static double total() {
		return converter() * IOF + converter();
	}
}
