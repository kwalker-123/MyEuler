package diff05;

import Tools.Timer;

public class Problem015 {

	public static void main(String[] args) throws InterruptedException {

		//https://www.mathblog.dk/project-euler-15/
		Timer timer = new Timer();
		
		int gridSize = 20;
		long paths = 1;
		 
		for (int i = 0; i < gridSize; i++) {
		    paths *= (2 * gridSize) - i;
		    paths /= i + 1;
		}
		System.out.println(paths);
		
		timer.stopWatch();
	}
}