package com.nt.pack;

import java.util.Arrays;

public class CountPossibleTriangles {
	
	
	// Function to count all possible triangles with array  element 
	public static int countPossibleTriangle(int arr[] , int n ) {
		
		Arrays.sort(arr);
	
		// counter for trangles
		int count =0;
			
		for(int i=0; i< n ; i++) 
			for(int j=i+1 ; j < n ; j++) 
				for (int k=j+1; k < n; k++) 
			    	if(arr[i] + arr[j] > arr[k]) 
					                    count++;
					
				return count;				
	}

	
	public static void main(String[] args) {
		
     int  arr[] = {4,6,3,7};
     int n = arr.length;
     
     int t = countPossibleTriangle(arr, n);
     
    System.out.println("The Possible Triangle is :   :  "+t);
	
	}

}
