package diff05;

import Tools.Timer;

public class Problem005 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		int max = 0;
		int i = 2520;

		boolean poss = true;
		while (max == 0) {
			poss = true;
			int j = 1;
			while (poss && j <= 20) {
				if (i % j != 0) {
					poss = false;
				}
				j++;
			}
			if (poss) {
				max = i;
			}
			i += 2520;
		}
		System.out.println(max);
		timer.stopWatch();
	}
}