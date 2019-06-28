package diff05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem049 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		List<Integer> primes = PrimeCheck.primeList(1001, 10000);

		for (int i = 0; i < primes.size(); i++) {
			for (int j = i + 1; j < primes.size(); j++) {
				int k = primes.get(j) + primes.get(j) - primes.get(i);
				if (PrimeCheck.isPrime(k) && primes.get(i) != 1487) {
					if(permCheck(primes.get(i),primes.get(j),k)){
						System.out.println(primes.get(i)+""+primes.get(j)+""+k);
					}
				}
			}
		}
		timer.stopWatch();
	}

	private static boolean permCheck(int i, int j, int k) {

		if (sortedNumber(i).equals(sortedNumber(j)) && sortedNumber(i).equals(sortedNumber(k))) {
			return true;
		}
		return false;
	}

	private static String sortedNumber(int i) {
		List<Character> charsA = new ArrayList<Character>();
		for (Character character : String.valueOf(i).toCharArray()) {
			charsA.add(character);
		}
		charsA.sort(null);
		String sortedStr = "";
		for (Character character : charsA) {
			sortedStr += character;
		}

		return sortedStr;
	}

}