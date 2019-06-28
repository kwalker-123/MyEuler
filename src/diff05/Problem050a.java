package diff05;

import java.io.IOException;
import java.util.List;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem050a {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int limit = 1000000;
		long result = 0;
		int numberOfPrimes = 0;
		List<Integer> primes = PrimeCheck.primeList(limit);
		long[] primeSum = new long[primes.size()+1];
		 
		primeSum[0] = 0;
		for (int i = 0; i < primes.size(); i++) {
		    primeSum[i+1] = primeSum[i] + primes.get(i);
		}
		 
		for (int i = numberOfPrimes; i < primeSum.length; i++) {
		    for (int j = i-(numberOfPrimes+1); j >= 0; j--) {
		        if (primeSum[i] - primeSum[j] > limit) break;
		 
		        if (primeSum[i] - primeSum[j] >= 0) {
		            numberOfPrimes = i - j;
		            result = primeSum[i] - primeSum[j];
		        }
		    }
		}
		
		System.out.println(result);
		
		timer.stopWatch();
	}
}