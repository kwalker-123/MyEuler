package diff05;

import java.io.IOException;
import java.util.List;

import Tools.PrimeCheck;
import Tools.Timer;

public class Problem046 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();
		
		List<Integer> primes = PrimeCheck.primeList(10000);
		int result = 1;
		boolean running = true;
		 
		while(running){
		    result += 2;
		 
		    int j = 0;
		    running = false;
		    while (result >= primes.get(j)) {
		        if(isTwiceSquare(result-primes.get(j))){
		        	running = true;
		            break;
		        }
		        j++;
		    }
		}
		
		System.out.println(result);
		timer.stopWatch();
	}

	private static boolean isTwiceSquare(long number) {
	    double squareTest = Math.sqrt(number/2);
	    return squareTest == ((int)squareTest);
	}

}