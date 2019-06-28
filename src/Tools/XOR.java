package Tools;

public class XOR {

	public static String binary(String a, String b){
		String encrypted = "";
		for (int i = 0; i < 7; i++) {
			if(a.charAt(i) == b.charAt(i)){
				encrypted += '0';
			}else{
				encrypted += '1';
			}
		}
		return encrypted;
	}
	
	public static int valueFromBin(String a){
		int positionVal = 1;
		int output = 0;
		for (int i = a.length()-1; i >= 0; i--) {
			if(a.charAt(i) == '1'){
				output += positionVal;
			}
			positionVal *= 2;
		}
		
		return output;
	}
}
