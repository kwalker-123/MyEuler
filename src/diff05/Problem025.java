package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem025 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		BigDecimal a = new BigDecimal(1);
		BigDecimal b = new BigDecimal(1);
		int i = 2;
		int length = 0;
		
		for (i = 2; length < 1000; i++) {
			BigDecimal num = a.add(b);
			length = String.valueOf(num).length();
			a = b;
			b = num;
		}
		System.out.println(i);
		
		timer.stopWatch();
	}
}