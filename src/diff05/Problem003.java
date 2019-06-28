package diff05;
import Tools.PrimeCheck;
import Tools.Timer;

public class Problem003 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		int max = 0;

		long in = 600851475143l;
		double sqrt = Math.sqrt(in);
		for (int i = 2; i < sqrt; i++) {
			if (in % i == 0) {
				if (PrimeCheck.isPrime(i)) {
					max = i;
				}
			}
		}
		System.out.println(max);
		timer.stopWatch();
	}
}
