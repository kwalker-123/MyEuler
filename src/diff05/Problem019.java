package diff05;

import Tools.Timer;

public class Problem019 {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer();
		int sunCount = 0;
		int year = 1901;
		int day = 1 + 365;

		int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < 100; i++) {
			for (int j : months) {
				if (j == 28 && year % 4 == 0) {
					day++;
				}
				day += j;
				if (day % 7 == 0) {
					sunCount++;
				}
			}
			year++;
		}
		System.out.println("up to Jan 1 " + year);
		System.out.println(sunCount);
		System.out.println(day % 7);

		timer.stopWatch();
	}
}