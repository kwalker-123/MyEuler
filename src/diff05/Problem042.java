package diff05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Tools.Timer;

public class Problem042 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();
		int total = 0;

		List<Integer> triags = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			triags.add((int) (0.5*i*(i+1)));
		}
				
		String file = "C:\\Users\\karl.walker\\JavaEclipseWorkspace\\123\\42.txt";

		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line;
		String namesString = "";
		while ((line = br.readLine()) != null) {
			namesString += line;
		}

		namesString = namesString.replace("\"", "");
		String[] names = namesString.split(",");
		br.close();
		
		Map<Character, Integer> scores = new HashMap<Character, Integer>();
		char ca = 'A';
		int sc = 1;
		for (int i = 0; i < 26; i++) {
			scores.put(ca, sc);
			ca++;
			sc++;
		}
		
		for (String s : names) {	
			int out = 0;
			char[] chars = s.toCharArray();
			for (char c : chars) {
				out += scores.get(c);
			}
			if(triags.contains(out)){
				total ++;
			}
		}
		System.out.println(total);
	
		
		timer.stopWatch();
	}
}