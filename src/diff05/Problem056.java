package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.MyMaths;
import Tools.Timer;

public class Problem056 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		// Considering natural numbers of the form, a^b, where a, b < 100, what
		// is the maximum digital sum?

		BigDecimal out = new BigDecimal(0);

		for (int i = 11; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				BigDecimal bd = new BigDecimal(i).pow(j);
				if (MyMaths.sumOfNumbers(bd).compareTo(out) > 0) {
					out = MyMaths.sumOfNumbers(bd);

				}
			}
		}

		System.out.println(out);

		timer.stopWatch();
	}

}