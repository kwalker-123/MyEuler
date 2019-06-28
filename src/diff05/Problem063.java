package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem063 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int count = 1;
		for (int i = 2; i < 10; i++) {
			int pow = 1;
			String asString = "";
			while (asString.length() <= pow && pow < 25) {
				BigDecimal out = new BigDecimal(i).pow(pow);
				asString = out.toString();
				if (asString.length() == pow) {
					count++;
				}
				pow++;
			}
		}

		System.out.println(count);

		timer.stopWatch();
	}

}