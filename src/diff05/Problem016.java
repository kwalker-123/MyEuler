package diff05;

import java.math.BigDecimal;

import Tools.Timer;

public class Problem016 {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer();

		BigDecimal o = new BigDecimal(2);
		o = o.pow(1000);
		String asString = String.valueOf(o);
		
		int total = 0;
		for (int i = 0; i < asString.length(); i++) {
			total += (asString.charAt(i) - '0');
		}
		
		System.out.println(total);
		
		timer.stopWatch();
	}
}