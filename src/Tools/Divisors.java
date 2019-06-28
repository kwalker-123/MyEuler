package Tools;

import java.util.ArrayList;

public class Divisors {
	
	public static int numberOfDivisors(long triag) {
	    int nod = 0;
	    int sqrt = (int) Math.sqrt(triag);
	 
	    for(int i = 1; i<= sqrt; i++){
	        if(triag % i == 0){
	            nod += 2;
	        }
	    }
	    //Correction if the number is a perfect square
	    if (sqrt * sqrt == triag) {
	        nod--;
	    }
	 
	    return nod;
	}	
	
	   public static ArrayList<Integer> divisorList(int n) {
		      ArrayList<Integer> list = new ArrayList<Integer>();
		      list.add(1);
		      for(int i = 2; i < (n/2+1); i++){
		         if(n % i == 0){
		            list.add(i);
		         }
		      }
		      return list;
		   }
	
}
