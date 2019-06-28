package diff05;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem007 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		int count = 1;
		int start = 3;
		int max = 0;
		while (count < 10001){
			if(PrimeCheck.isPrime(start)){
			count++;
			max = start;
			}
			start += 2;
		}
		System.out.println(max);
		
		timer.stopWatch();
	}
}