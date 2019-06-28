package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem206 {

	public static void main(String[] args) throws InterruptedException, IOException {

		//1_2_3_4_5_6_7_8_9_0
		
		Timer timer = new Timer();

		
			
		long min = 1010101010;
		long max = 1389026620;
		
		System.out.println("1_2_3_4_5_6_7_8_9_0");
		
		for (long i = max; i > min; i-=10) {
			BigDecimal bd = new BigDecimal(i).pow(2);
			String asStr = bd.toString();
			if(asStr.charAt(16) == '9' && asStr.charAt(14) == '8' &&
					asStr.charAt(12) == '7' && asStr.charAt(10) == '6' &&
					asStr.charAt(8) == '5' && asStr.charAt(6) == '4' &&
					asStr.charAt(4) == '3' && asStr.charAt(2) == '2'){
				System.out.println(i);
				System.out.println(asStr);
				break;
			}
		}
		
		timer.stopWatch();
	}

}