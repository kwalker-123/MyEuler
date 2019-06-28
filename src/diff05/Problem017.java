package diff05;

import Tools.Timer;

public class Problem017 {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer();

		int oneToNine = 36;
		int tenToNineTeen = 70;
		int twentyToNinetyNine = 748;

		int smalls = oneToNine + tenToNineTeen + twentyToNinetyNine;

		int hundred = 7 * 9;
		int hundredAnd = 891 * 10;
		int oneThousand = 11;

		int out = smalls * 10 + oneToNine * 100 + hundred + hundredAnd + oneThousand;

		System.out.println(out);
		timer.stopWatch();
	}
}