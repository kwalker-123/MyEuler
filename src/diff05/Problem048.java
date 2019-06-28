package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem048 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		BigDecimal total = new BigDecimal(0);

		for (int i = 1; i <= 1000; i++) {
			BigDecimal temp = new BigDecimal(i);
			temp = temp.pow(i);
			total = total.add(temp);
		}

		String output = total.toString();

		System.out.println(output.substring(output.length() - 10));

		timer.stopWatch();
	}
}