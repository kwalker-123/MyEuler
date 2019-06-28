package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.MyMaths;
import Tools.Palindrome;
import Tools.Timer;

public class Problem055 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int count = 0;

		for (int i = 10; i < 10000; i++) {
			if (IsLychrel(i)) {
				count++;
			}
		}

		System.out.println(count);

		timer.stopWatch();
	}

	private static boolean IsLychrel(int number) {
		BigDecimal cur = new BigDecimal(number);
		for (int i = 0; i < 50; i++) {
			cur = cur.add(MyMaths.reverseNumber(cur));
			if (Palindrome.intPalcheckBD(cur)) {
				return false;
			}
		}
		return true;
	}
}