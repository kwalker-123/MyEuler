package diff05;

import java.io.IOException;

import Tools.Timer;

public class Problem092 {

	public static void main(String[] args) throws InterruptedException, IOException {

		// 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89

		Timer timer = new Timer();

		int count = 0;
		int input = 85;
		int next = 0;

		for(int i = 1; i < 10000000; i ++){
			input = i;
			next = 0;
			while (next != 1 && next != 89) {
				if (next != 0) {
					input = next;
				}
				next = 0;
				while (input >= 1) {
					next += ((input % 10) * (input % 10));
					input /= 10;
				}
			}
			if (next == 89) {
				count++;
			}
		}
		
		System.out.println("Ending in 89: " + count);
		System.out.println("Ending in 1: " + (9999999 - count));

		timer.stopWatch();
	}

}