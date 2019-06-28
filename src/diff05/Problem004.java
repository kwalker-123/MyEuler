package diff05;
import Tools.Palindrome;
import Tools.Timer;

public class Problem004 {

	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		int max = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i*j;
				if(Palindrome.intPalcheck(prod)){
					if(prod > max){
						max = prod;
					}
				}
			}
		}
		
		System.out.println(max);
		
		timer.stopWatch();
	}
}
