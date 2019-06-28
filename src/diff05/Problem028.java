package diff05;

import java.io.IOException;

import Tools.Timer;

public class Problem028 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int side = 1001;
		long Area = 0;
		long out = 1;

		for (long n = 1; n <= (side - 1) / 2; n++) {
			Area = (long) Math.pow(((2 * n) + 1), 2);
			out += Area * 4 - 12 * n;
		}

		System.out.println(out);

		timer.stopWatch();
	}
}