package com.nt.pack;

import java.util.Arrays;

public class PrintUniqueNumber {
	
	
	
	       //   Time Complexity: O(n2). 
	           public static void printDistinct(int arr[], int n) {
	      
	        	   // Pick all elements one by one      	   
	        	   for(int i = 0 ; i< n ; i++) {
	        		   
	        		   // if picked element already printed
	        		   int  j;
	        		   
	        		 for( j =0; j< i; j++) 
	        			 if (arr[i]== arr[j])
	        				 break;	 
	        		   // if not printed early the print now 
	        		 
	        		 if (i==j)
	        			 System.out.print(arr[i]+"  ");
                       }
               }
	
	           
	           //  Time Complexity: O(n log n)
	           // Function for print distinct using sort algorithm
	           public static void printDist(int arr[], int n ) {
	        	   
	        	   // we have to need sort an array.
	        	   Arrays.sort(arr);
	        	   
	        	for (int i=0 ; i< n ; i++) {
	        		
	        		// move the index ahead while  there are duplicates
	        		
	        		while (i < n-1 && arr[i] == arr[i+1]) 
	        			         i++;	
	        		System.out.print( arr[i]+"   ");
	        			
	        	}      
	           }

	              public static void main(String[] args) {
            	  
	            	  int arr[]= {1,2,1,2,1,2,3,3,5};
	            	  int n = arr.length; 	  
	            	 // printDistinct(arr, n);
	            	  
	            	  printDist(arr, n);
	            	  
	              }

  }
