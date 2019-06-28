package diff05;

import Tools.Timer;

public class Problem014 {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer();

		long in = 0;
		long max = 0;
		long maxNo = 0;
		long count = 0;

		for (long i = 1; i < 1000000; i++) {
			
			count = 0;
			in = i;
			while (in != 1) {
				count++;
				if (in % 2 == 0) {
					in = in / 2;
				} else {
					in = 3 * in + 1;
				}
			}
			if(count > max){
				max = count;
				maxNo = i;
			}

		}
		System.out.println(maxNo);
		timer.stopWatch();
	}
}