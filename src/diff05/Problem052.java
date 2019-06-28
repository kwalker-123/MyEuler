package diff05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Tools.Timer;

public class Problem052 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int start = 1;
		boolean found = false;
		int result = 0;
		 
		while (!found) {
		    start *= 10;
		    for (int i = start; i < start * 10 / 6; i++) {
		        found = true;
		        for (int j = 2; j <= 6; j++) {
		            if (!permCheck(i, j * i)) {
		                found = false;
		                break;
		            }
		        }
		        if (found) {
		            result = i;
		            break;
		        }
		    }
		}
			
		System.out.println(result);
		
		timer.stopWatch();
	}
	
	private static boolean permCheck(int i, int j) {

		if (sortedNumber(i).equals(sortedNumber(j))) {
			return true;
		}
		return false;
	}
	
	private static String sortedNumber(int i) {
		List<Character> charsA = new ArrayList<Character>();
		for (Character character : String.valueOf(i).toCharArray()) {
			charsA.add(character);
		}
		charsA.sort(null);
		String sortedStr = "";
		for (Character character : charsA) {
			sortedStr += character;
		}

		return sortedStr;
	}
}