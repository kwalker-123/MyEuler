package diff05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem035 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		List<Integer> roPrimes = new ArrayList<Integer>();
		roPrimes.add(2);

		for (int i = 3; i < 1000000; i++) {
			if (PrimeCheck.isPrime(i)) {
				if (i / 10 < 1) {
					roPrimes.add(i);
				} else {
					String temp = String.valueOf(i);
					for (int j = 1; j < temp.length(); j++) {
						if (!PrimeCheck
								.isPrime(Long.valueOf(temp.substring(j, temp.length()) + temp.substring(0, j)))) {
							break;
						}
						if (j == temp.length() - 1) {
							roPrimes.add(i);
						}
					}
				}
			}
		}

		System.out.println(roPrimes.size());

		timer.stopWatch();

	}
}