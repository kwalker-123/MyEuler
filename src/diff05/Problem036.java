package diff05;

import java.io.IOException;

import Tools.Palindrome;
import Tools.Timer;

public class Problem036 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		int out = 0;
		
		for (int i = 1; i < 1000000; i++) {
			if(Palindrome.intPalcheck(i)){
				if(Palindrome.stringPalcheck(Integer.toBinaryString(i))){
					out += i;
				}
			}
		}
		System.out.println(out);
		
		timer.stopWatch();

	}
}