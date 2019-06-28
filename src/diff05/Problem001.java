package diff05;
import Tools.Timer;

public class Problem001 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		timer.stopWatch();

	}

}
