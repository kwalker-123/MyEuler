package diff05;

import java.io.IOException;

import Tools.MyMaths;
import Tools.Timer;
import Tools.XOR;
import Tools.myFileRead;

public class Problem059 {

	public static void main(String[] args) throws InterruptedException, IOException {

		Timer timer = new Timer();

/*		 String input = "KARL WALKER";
		 String key = "dog";
		
		 for (int i = 0; i < input.length(); i++) {
		 String inputBin = MyMaths.binaryString(input.charAt(i));
		 String keyBin = MyMaths.binaryString(key.charAt(i%key.length()));
		 System.out.print((char)XOR.valueFromBin(XOR.binary(inputBin,keyBin)));
		 }
		 System.out.println();
		 // The above works(KARL WALKER --> /.5(O0%#,!= --> KARL WALKER 
*/
		String file = "C:\\Users\\karl.walker\\JavaEclipseWorkspace\\123\\p059_cipher.txt";
		String charString = myFileRead.readFileContent(file);

		String[] characters = charString.split(",");
		int[] charVals = new int[characters.length];
		for (int i = 0; i < characters.length; i++) {
			charVals[i] = Integer.valueOf(characters[i]);
		}
		
		String pText = Decrypt(charVals);

		System.out.println("Decrypted Text: " + pText);

		int charTotal = 0;
		char[] plainTextChars = pText.toCharArray();
		for (char d : plainTextChars) {
			charTotal += d;
		}
		System.out.println("ASCII value total: " + charTotal);

		timer.stopWatch();
	}
	
	private static String Decrypt(int[] charVals){
		
		char a = 'a';
		char b = 'a';
		char c = 'a';
		String pText = "";
		String key = "";
			for (int x = 0; x < 26; x++) {
				b = 'a';
				for (int y = 0; y < 26; y++) {
					c = 'a';
					for (int z = 0; z < 26; z++) {
						StringBuilder keyB = new StringBuilder("");
						StringBuilder plainTextBuild = new StringBuilder("");
						key = keyB.append(a).append(b).append(c).toString();
						for (int i = 0; i < charVals.length; i++) {
							String inputBin = MyMaths.binaryString(charVals[i]);
							String keyBin = MyMaths.binaryString(key.charAt(i % key.length()));
							plainTextBuild.append((char) XOR.valueFromBin(XOR.binary(inputBin, keyBin)));
						}
						pText = plainTextBuild.toString();
						//most common English words > length 3
						if (pText.contains("that") && pText.contains("have")) {
							System.out.println("Encryption Key: " + key);
							return pText;
						}
						c++;
					}
					b++;
				}
				a++;
			}
			throw new Error("No sensible result found");
		}
				
}