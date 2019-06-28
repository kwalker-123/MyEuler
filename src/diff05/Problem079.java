package diff05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Tools.Timer;

public class Problem079 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int[] nums = { 319, 680, 180, 690, 129, 620, 762, 689, 762, 318, 368, 710, 720, 710, 629, 168, 160, 689, 716,
				731, 736, 729, 316, 729, 729, 710, 769, 290, 719, 680, 318, 389, 162, 289, 162, 718, 729, 319, 790, 680,
				890, 362, 319, 760, 316, 729, 380, 319, 728, 716 };

		String[] strings = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strings[i] = String.valueOf(nums[i]);
		}

		List<Integer> possibles = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		//removing numbers not seen at all
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (String j : strings) {
				if (j.contains(String.valueOf(i))) {
					count++;
				}
			}
			if (count == 0) {
				possibles.remove(possibles.indexOf(i));
			}
		}

		String key = "";

		while (possibles.size() != 0) {
			String curChar = "";
			for (int i : possibles) {
				int count = 0;
				int startCount = 0;
				for (String j : strings) {
					if (j.contains(String.valueOf(i))) {
						count++;
						if (j.substring(0, 1).equals(String.valueOf(i))) {
							startCount++;
						}
					}
				}
				if (count == startCount) {
					curChar += i;
				}
			}

			if (!curChar.equals("")) {

				possibles.remove(possibles.indexOf(Integer.valueOf(curChar)));
				key += curChar;

				for (int j = 0; j < strings.length; j++) {
					strings[j] = strings[j].replace(curChar, "");
				}
			}
		}

		System.out.println("Shortest possible key: " + key);

		timer.stopWatch();
	}

}