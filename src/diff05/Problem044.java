package diff05;

import java.io.IOException;

import Tools.Timer;

public class Problem044 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int d = 0;
		boolean running = true;
		int i = 1;
		 
		while (running) {
		    i++;
		    int first = i * (3 * i - 1) / 2;
		 
		    for (int j = i-1; j > 0; j--) {
		        int second = j * (3 * j - 1) / 2;
		        if (isPentagonal(first - second) && isPentagonal(first + second)) {
		            d = first-second;
		            running = false;
		            break;
		        }
		    }
		}
		System.out.println(d);
		
		timer.stopWatch();
	}
	
	
	private static boolean isPentagonal(int number) {
	    double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
	    return penTest == ((int)penTest);
	}
	
	
	
}