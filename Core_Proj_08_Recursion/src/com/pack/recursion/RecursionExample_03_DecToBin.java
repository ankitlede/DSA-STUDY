package com.pack.recursion;

public class RecursionExample_03_DecToBin {

	
	
	
	
	
	      public static int decToBin(int  no) {
	        	 
	        	
	    	  if(no ==0)
	    		  return 0;
	    	  
	        	 return   ( no % 2 +10 *    decToBin(no/2));
	         }
	

	
	public static void main(String[] args) {

		
		    int decimal_number = 7;
		    System.out.println(decToBin(decimal_number));		
		
		
		
	}

}
