package diff05;

import Tools.Timer;

public class Problem009 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();

		int a = 1;
		int b = 1;
		double c = 1;
		int out = 0;
		
		for (a = 1; a < 1000; a++) {
			for(b = 1; b < 1000; b++){
				c = Math.sqrt((a*a) + (b*b));
				if (c % 1 == 0 ){
					if(a+b+c == 1000){
						out = (int) (a*b*c);
					}
				}
			}
		}
		System.out.println(String.valueOf(out));

		timer.stopWatch();
	}
}