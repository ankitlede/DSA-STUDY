package com.pack.recursion;

public class RecursionExample_01 {
	
	
    	//   print  1 to 10 number Without using Loop
	     public static void print(int n) {
	    	 
	    	 if (n > 0) {
	    		 print(n-1);
	    		 System.out.print(n+" ");
               }
	    	 return ;
	     }
	
	     
	    // print N to 1 without loop
	     public static void printend(int n) {
	    	 if (n>0) {
	    		 System.out.print(n + " ");
	    		 printend(n-1);  
               }  
	    	 return ; 
	     }
	     
	     
	     
	 public static void main(String[] args) {
	
		 int n =10;
	     print(n);
 
	}
}
