package diff05;

import java.io.IOException;
import java.util.List;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem037 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();
		List<Integer> primes = PrimeCheck.primeList(1000000);

		int count = 0;
		int sum = 0;
		int i = 4;

		while (count < 11) {
			int num = primes.get(i);
			if (leftTrunk(num, primes) && rightTrunk(num, primes)) {
				count++;
				sum += num;
			}
			i++;
		}
		System.out.println(sum);
		timer.stopWatch();

	}

	static boolean leftTrunk(int i, List<Integer> primes) {

		String asStr = String.valueOf(i);
		int templength = asStr.length();
		for (int j = 0; j < templength - 1; j++) {
			String temp = asStr.substring(j + 1, templength);
			if (!primes.contains(Integer.valueOf(temp))) {
				return false;
			}
		}
		return true;
	}

	static boolean rightTrunk(int i, List<Integer> primes) {
		int cur = i;
		while (primes.contains(cur) && cur >= 10) {
			cur /= 10;

		}
		if (primes.contains(cur)) {
			return true;
		} else {
			return false;
		}
	}

}