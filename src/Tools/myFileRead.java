package Tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myFileRead {
	
	public static String readFileContent(String fileLoc) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(fileLoc));

		String line;
		String charString = "";
		while ((line = br.readLine()) != null) {
			charString += line;
		}
		br.close();
		
		return charString;
	}

}
