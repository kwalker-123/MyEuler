package diff05;

import Tools.Divisors;
import Tools.Timer;

public class Problem012 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		long triag = 0;
		for (int i = 0; i < 100000; i++) {
			triag += i;
			if(Divisors.numberOfDivisors(triag) > 500){
				System.out.println(triag);
				i += 999999999;
			}
		}


		
		timer.stopWatch();
	}
}