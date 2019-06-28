package diff05;

import java.util.ArrayList;

import Tools.Divisors;
import Tools.Timer;
import Tools.MyMaths;

public class Problem021 {

	public static void main(String[] args) {

		Timer timer = new Timer();

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i < 10000; i++) {
			int a = MyMaths.sumOfList((Divisors.divisorList((i))));
			;
			int b = MyMaths.sumOfList((Divisors.divisorList((a))));
			;
			if (i == b && i != a) {
				if (!nums.contains(i))
					nums.add(i);
				if (!nums.contains(b))
					nums.add(b);
			}
		}
		System.out.println("Pairs: " + nums);
		System.out.println("Sum: " + MyMaths.sumOfList(nums));

		timer.stopWatch();
	}
}