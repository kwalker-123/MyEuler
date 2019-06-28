package diff05;

import java.math.BigDecimal;

import Tools.Timer;

public class Problem020 {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer();

		int input = 100;
		BigDecimal factorial = new BigDecimal(1);

		for (int i = input; i > 0; i--) {
			factorial = factorial.multiply(new BigDecimal(i));
		}

		String numAsString = String.valueOf(factorial);
		int out = 0;
		
		for (int i = 0; i < numAsString.length(); i++) {
			out += numAsString.charAt(i) - '0';
		}
		
		System.out.println(out);
		
		timer.stopWatch();
	}
}