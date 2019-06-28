package diff05;

import java.io.IOException;
import java.math.BigDecimal;

import Tools.Timer;

public class Problem097 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		//28433×2^7830457+1. 
		//Find the last ten digits of this prime number.
		
		BigDecimal BD = new BigDecimal(2);
		BD = BD.pow(7830457);
		//BD = BD.multiply(28433)
		
		String BDs = BD.toString();
		String lastTen = BDs.substring(BDs.length()-10);
		BigDecimal out = new BigDecimal(lastTen);
		out = out.multiply(new BigDecimal(28433)).add(new BigDecimal(1));
		String outS= out.toString();
		String lastTenOut = outS.substring(outS.length()-10);
		
		System.out.println(lastTenOut);
		
		
		timer.stopWatch();
	}

}