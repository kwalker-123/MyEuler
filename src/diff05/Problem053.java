package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.MyMaths;
import Tools.Timer;

public class Problem053 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		// nCr
		// 1<=n<=100
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = i; j > 1; j--) {
				if (MyMaths.combinometricsBD(i, j).compareTo(new BigDecimal(1000000)) > 0) {
					count++;
				}
			}
		}

		System.out.println(count);

		timer.stopWatch();
	}
}