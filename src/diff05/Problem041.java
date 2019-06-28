package diff05;

import java.io.IOException;
import java.util.List;

import Tools.Pandigital;
import Tools.PrimeCheck;
import Tools.Timer;

public class Problem041 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		List<Integer> primes = PrimeCheck.primeList(7654321);

		for (int i = primes.size() - 1; i >= 0; i--) {
			int cur = primes.get(i);
			if (Pandigital.isPandigital(cur, String.valueOf(cur).length())) {
				System.out.println(cur);
				break;
			}
		}

		timer.stopWatch();
	}
}