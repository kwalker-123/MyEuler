package diff05;
import Tools.Timer;

public class Problem002 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		int a = 1;
		int b = 2;
		int c = 0;
		int sum = 2;
		while (c <= 4000000) {
			c = a + b;
			if (c % 2 == 0) {
				sum += c;
			}
			a = b;
			b = c;
		}
		
		System.out.println(sum);

		timer.stopWatch();

	}

}
