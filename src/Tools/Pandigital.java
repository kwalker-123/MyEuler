package Tools;

import java.util.ArrayList;
import java.util.List;

public class Pandigital {

	public static boolean isPandigital(long input, int upto) {
		List<Integer> nums = new ArrayList<Integer>();

		while (input >= 1) {
			int rem = (int) (input % 10);
			if(!nums.contains(rem)){
				nums.add(rem);
			
			}else{
				return false;
			}
			input /= 10;
		}
		nums.sort(null);
		String total = "";
		for (Integer i : nums) {
			total += i ;
		}

		String compare = "";
		for (int i = 1; i <= upto; i++) {
			compare += i;
		}
		
		if(total.equals(compare)){
			return true;
		}
		return false;
	}

}
