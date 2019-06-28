package diff05;

import java.io.IOException;

import Tools.Pandigital;
import Tools.Timer;

public class Problem038 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		long min = 9234;
		long max = 9487;

		for (long i = max; i >= min; i--) {
			long current = Long.valueOf(i + "" + i * 2);
			if (Pandigital.isPandigital(current,9)) {
				System.out.println(current);
				break;
			}
		}
		timer.stopWatch();
	}
}