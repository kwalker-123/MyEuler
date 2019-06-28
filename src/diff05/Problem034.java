package diff05;

import java.io.IOException;

import Tools.MyMaths;
import Tools.Timer;

public class Problem034 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();
		int out = 0;
		
		for (int i = 3; i < 10000000; i++) {
			int cur = 9;
			int tot = 0;
			int temp = i;
			while (temp >= 1) {
				cur = temp % 10;
				tot += MyMaths.factorial(cur);
				temp /= 10;
			}
			
			if(tot == i){
				out += i;
			}
		}
		System.out.println(out);

		timer.stopWatch();

	}
}