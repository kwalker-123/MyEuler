package diff05;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import Tools.Timer;

public class Problem026 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		boolean running = true;

		int max = 0;
		int maxD = 0;

		for (int j = 1; j < 1000; j++) {
			Set<Integer> remanders = new HashSet<Integer>();
			running = true;
			int rem = 1;
			while (running) {
				rem = (rem * 10) % j;
				if (!remanders.contains(rem)) {
					remanders.add(rem);
				} else {
					running = false;
				}
			}
			if (remanders.size() > max) {
				max = remanders.size();
				maxD = j;
			}
		}

		System.out.println("number " + maxD);
		System.out.println("recuring seq " + max);

		timer.stopWatch();
	}
}