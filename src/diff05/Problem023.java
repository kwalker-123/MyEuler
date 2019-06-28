package diff05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Tools.Divisors;
import Tools.Timer;

public class Problem023 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int limit = 28123;
		List<Integer> abundants = new ArrayList<Integer>();

		for (int i = 1; i <= limit; i++) {
			List<Integer> divs = Divisors.divisorList(i);
			int divTotal = 0;
			for (Integer integer : divs) {
				divTotal += integer;
			}
			if (divTotal > i) {
				abundants.add(i);
			}

		}

		Set<Integer> canBe = new HashSet<Integer>();

		for (int i = 0; i < abundants.size(); i++) {
			int cur = 0;
			for (int j = 0; cur < limit; j++) {
				cur = abundants.get(i)+abundants.get(j);
				canBe.add(cur);
			}
		}
		
		int total = 0;
		for (int i = 0; i < limit; i++) {
			if(!canBe.contains(i)){
				total += i;
			}
		}

		System.out.println(total);


		timer.stopWatch();
	}
}