package diff05;

import java.io.IOException;

import Tools.Timer;

public class Problem043 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		// 6 must be 0,5
		// 678 % 11 == 0 -> d6 must be 5 to avoid repeat numbers
		// 678 must be 506,517,528,539,561,572,583,594
		// 789 % 13 == 0 -> 6789 must be 5286,5390,5728,5832
		// 8910 % 17 == 0 -> 678910 must be 52867,53901,57289
		// 567 % 7 == 0 -> 5678910 must be 952867,357289
		// 234 % 2 == 0 -> 45678910 must be
		// 0952867,4952867,0357289,4357289,6357289
		// 345 % 3 == 0 -> 345678910 must be 30952867,60357289,06357289

		// 12 can be either 14 or 41 for each of the possible 3-10

		long out = 0;
		out += 4130952867l + 4160357289l + 4106357289l;
		out += 1430952867l + 1460357289l + 1406357289l;

		System.out.println(out);
		
		timer.stopWatch();
	}
}