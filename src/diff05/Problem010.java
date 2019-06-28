package diff05;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem010 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		long sum = 2;
		for (long i = 3; i < 2000000; i+=2) {
			if(PrimeCheck.isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);

		timer.stopWatch();
	}
}