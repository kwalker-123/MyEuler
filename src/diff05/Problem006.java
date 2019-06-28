package diff05;

import Tools.Timer;

public class Problem006 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		int sqTot = 0;
		for (int i = 1; i <= 100; i++) {
			sqTot += (i * i);
		}

		int runtot = 0;
		for (int i = 1; i <= 100; i++) {
			runtot += i;
		}
		int squareSum = runtot * runtot;

		System.out.println(squareSum - sqTot);
		
		timer.stopWatch();
	}
}