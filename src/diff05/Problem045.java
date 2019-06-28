package diff05;

import java.io.IOException;

import Tools.Timer;

public class Problem045 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();
		
		//Every hex number is a triag number (every other triag is a hex number)
		
		boolean running = true;
		long out = 0;
		int i = 143;
		
		
		while (running) {
		    i++;
		    out = i * (2 * i - 1);
		 
		    if (isPentagonal(out)) {
		    	running = false;
		    	System.out.println(out);
		    }
		}
		
		timer.stopWatch();
	}

	private static boolean isPentagonal(long number) {
		double penTest = (Math.sqrt(1 + 24 * number) + 1) / 6;
		return penTest == ((int) penTest);
	}

}