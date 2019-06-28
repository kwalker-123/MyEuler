package diff05;

import java.io.IOException;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem027 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		// eq n^2 + an + b
		// |a| < 1000
		// |b| <= 1000

		int a;
		int b;
		int max = 0;
		int maxA = 0;
		int maxB = 0;

		for (a = -1000; a <= 1000; a++) {
			for (b = -1000; b <= 1000; b++) {
				int n = 0;
				while(PrimeCheck.isPrime(Math.abs((n*n+a*n+b)))){
					n++;
				}

				if (n > max) {
					max = n;
					maxA = a;
					maxB = b;
				}
			}
		}

		System.out.println(maxA);
		System.out.println(maxB);
		System.out.println(max);
		System.out.println(maxA*maxB);
		
		timer.stopWatch();
	}
}