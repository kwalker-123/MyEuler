package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem057 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		// Nn = Nn-1 + 2Dn-1
		// Dn = Nn-1 + Dn-1

		BigDecimal numer = new BigDecimal(3);
		BigDecimal denom = new BigDecimal(2);
		int count = 0;

		for (int i = 2; i <= 1000; i++) {
			BigDecimal lastNum = numer;
			numer = numer.add((denom.multiply(new BigDecimal(2))));
			denom = denom.add(lastNum);
			if (numer.toString().length() > denom.toString().length()) {
				count++;
			}
		}

		System.out.println(count);

		timer.stopWatch();
	}

}