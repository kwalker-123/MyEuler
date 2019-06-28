package diff05;

import java.io.IOException;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem058 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int primecount = 0;

		for (int i = 1; i <= 10000000; i++) {
			int diagNums = i * 4 + 1;
			int side = 2 * i + 1;
			int br = (int) Math.pow(2 * i + 1, 2);
			for (int j = 1; j <= 3; j++) {
				if (PrimeCheck.isPrime((long) br - (j * (side - 1)))) {
					primecount++;
				}
			}
			double ratio = (double)primecount / diagNums; 
			if(ratio < 0.1){
				System.out.println("Side length = " + side);
				break;
			}
		}

		timer.stopWatch();
	}

}