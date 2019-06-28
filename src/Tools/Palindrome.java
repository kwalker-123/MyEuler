package Tools;

import java.math.BigDecimal;

public class Palindrome {

	public static boolean intPalcheck(int num){
		String input = String.valueOf(num);						
		return stringPalcheck(input);
	}
	
	public static boolean intPalcheckBD(BigDecimal cur) {
		String input = cur.toString();
		return stringPalcheck(input);
	} 
	
	public static boolean stringPalcheck(String s){
		String rev = "";
		for (int i = s.length()-1; i >= 0 ; i--) {
			rev += (s.charAt(i));
			if(rev.equals(s)){
				return true;
			}
		}						
		return false;
	}


	
	
}
