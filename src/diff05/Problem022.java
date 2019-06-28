package diff05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Tools.Timer;

public class Problem022 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

		String file = "C:\\Users\\karl.walker.FDMGROUP\\Documents\\names.txt";

		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;
		String namesString = "";
		while ((line = br.readLine()) != null) {
			namesString += line;
		}

		namesString = namesString.replace("\"", "");
		String[] names = namesString.split(",");
		List<String> nnn = Arrays.asList(names);
		nnn.sort(null);

		Map<Character, Integer> scores = new HashMap<Character, Integer>();
		char ca = 'A';
		int sc = 1;
		for (int i = 0; i < 26; i++) {
			scores.put(ca, sc);
			ca++;
			sc++;
		}

		int total = 0;
		int thisWord = 0;

		for (int i = 0; i < nnn.size(); i++) {
			thisWord = 0;
			char[] chars = nnn.get(i).toCharArray();
			for (int j = 0; j < chars.length; j++) {
				thisWord += scores.get(chars[j]);
			}
			total += thisWord * (i + 1);
		}

		System.out.println(total);
		
		br.close();

		timer.stopWatch();
	}
}