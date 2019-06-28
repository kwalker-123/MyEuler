package Tools;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MyMaths {

	public static int sumOfList(ArrayList<Integer> c) {
		int sum = 0;
		for (Integer e : c)
			sum += e;
		return sum;
	}

	// Euclidean Algorithm
	public static long highComDenom(long n1, long n2) {
		if (n1 > n2) {
			long temp = n1;
			n1 = n2;
			n2 = temp;
		}
		long lastRem = n1;
		long remander = 1;
		while (remander != 0) {
			remander = n2 % n1;
			if (remander != 0) {
				lastRem = remander;
				n2 = n1;
				n1 = remander;
			} else {
				return lastRem;
			}
		}
		return 0;
	}

	public static long factorial(int a) {
		if (a > 20) {
			throw new Error("factorial method warning: If a > 20 the use factorialBD");
		}
		long out = 1;
		for (int i = a; i > 0; i--) {
			out *= i;
		}
		return out;
	}

	public static BigDecimal factorialBD(int a) {
		BigDecimal out = new BigDecimal(1);
		for (int i = a; i > 0; i--) {
			out = out.multiply(new BigDecimal(i));
		}
		return out;
	}

	public static long combinometrics(int n, int r) {
		return MyMaths.factorial(n) / (MyMaths.factorial(r) * MyMaths.factorial(n - r));
	}

	public static BigDecimal combinometricsBD(int n, int r) {
		return MyMaths.factorialBD(n).divide((MyMaths.factorialBD(r).multiply(MyMaths.factorialBD(n - r))));
	}

	public static BigDecimal reverseNumber(BigDecimal a) {
		String asString = a.toString();
		String reverse = "";
		for (int i = asString.length() - 1; i >= 0; i--) {
			reverse += asString.charAt(i);
		}
		return new BigDecimal(reverse);
	}

	public static BigDecimal sumOfNumbers(BigDecimal a){
		char[] nums = a.toString().toCharArray();
		BigDecimal total = new BigDecimal(0);
		
		for (char c : nums) {
			int charVal = c - '0';
			total = total.add(new BigDecimal(charVal));
		}
		return total;	
	}
	
	public static String binaryString(char a){
		String out = Integer.toBinaryString((int)a);
		while (out.length() < 7){
			out = "0" + out;
		}
		return out;
	}
	
	public static String binaryString(int a){
		String out = Integer.toBinaryString(a);
		while (out.length() < 7){
			out = "0" + out;
		}
		return out;
	}
}
