package com.pack;

public class ReverseArry {
	       
	          public static void reverseArray(int [] arr) {	        	  
	        	  // create new array exact length of input array
	        	  int []reverseArray = new int [arr.length];
	        	  
	        	 // copy all element into new array in reverse manner 
	        	  for (int i=0; i<arr.length; i++) {
	        		  reverseArray[i]=arr[arr.length-i-1];
	        	  }       	  
	        	  // print reverse array    	  
	        	  for (int i=0; i<reverseArray.length-1; i++) {     		  
	        		  System.out.print(reverseArray[i]);     		  
	        	  }
	           }
	           
	          public static void main(String[] args) {		
	        	  int []inputArr = new int[]{1,2,3,4,5,6};
	        	  reverseArray(inputArr);	  
			}


}
