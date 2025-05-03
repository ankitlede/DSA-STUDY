package com.pack.recursion;

public class RecursionExample_02 {
	
	//  Here we find out Mean of Array Using recursion 
	         public static float findMean(int arr[] , int n) {
	        	 
					if (n == 1)
						return (float) arr[n - 1];
					else
						
						System.out.println( findMean(arr, n - 1) );
						
						return ((float) (findMean(arr, n - 1) * (n - 1) + arr[n - 1]) / n);	        	 

	         }

	        public static void main(String[] args) {
	
	        	   float Mean = 0; 
	               int arr[] = {1, 2, 3, 4, 5}; 
	               int n = arr.length; 
	               System.out.println(findMean(arr, n)); 
	        	
	        	
	        }
	
}
