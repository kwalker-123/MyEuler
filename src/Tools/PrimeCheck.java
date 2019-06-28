package Tools;

import java.util.ArrayList;
import java.util.List;

public class PrimeCheck {

	public static boolean isPrime(long num) {
		int sqr = (int) Math.sqrt(num);
		for (int i = 2; i <= sqr; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> primeList(int upTo) {
		System.err.println("*WARNING* This is often slower than doing isPrime on each result");
		List<Integer> primes = new ArrayList<Integer>();
		if (upTo < 2) {
			return primes;
		}
		primes.add(2);
		for (int i = 3; i <= upTo; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static List<Integer> primeList(int start, int upTo) {
		if(start % 2 == 0){
			System.err.println("*WARNING* start must be an odd number");
		}
		
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = start; i <= upTo; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

}
