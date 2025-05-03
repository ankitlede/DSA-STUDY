package com.nt.pack;

import java.util.Arrays;

public class SortArrayFistToLastIndx {
	
	      public static void sort(int arr[]) {
	    	  
	    	  int i =0; 
	    	  
	    //	  System.err.println(arr[i]-1);  
	    	  while (i < arr.length) {      //  I < 6
	    		  
	    		  // finding the correct index 
	    		  
	    		  int correct = arr[i]-1;
	    		  
	    		  System.out.println(correct);
	    		  
	    		  // element index and value not matched the swapping 
	    		  
	    		  if (arr[correct] != arr[i]) {
	    			 // calling swap function 
	    			  swap(arr, i, correct);
	    		  }else {
	    			  
	    			  i++;
	    			  
	    		  }
	    		  
	    	  }   	  
	       }
		
	 public static void swap(int arr[] , int first , int second ) {
                int  temp = arr[first];
                arr[first]= arr[second];
                arr[second] = temp ;
	 }
	
	 public static void main(String[] args) {
		
            int[] arr = { 3, 2, 5, 6, 1, 4 }; 
          
          // Function call 
            sort(arr); 
  
        // Printing the answer 
        System.out.println(Arrays.toString(arr)); 	 		 
	 }
	 
}
