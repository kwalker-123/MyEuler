package Tools;

public class Timer {

	private float start;

	public Timer() {
		this.start = System.nanoTime();
	}

	public void stopWatch() {
		float end = System.nanoTime();
		float totalTime = (end - start);
		String out = "";
		if (totalTime < 1000) {
			out = String.format("%.0f",totalTime) + " ns";
		}
		else if (totalTime / 1000000 < 1000) {
			out = String.format("%.3f",(totalTime / 1000000)) + " ms";
		} else {
			out = String.format("%.3f",(totalTime / 1000000000)) + " s";
		}
		System.out.println("Completed in " + out);
	}
}
