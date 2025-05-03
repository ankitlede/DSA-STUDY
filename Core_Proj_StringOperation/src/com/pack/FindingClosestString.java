package com.pack;

public class FindingClosestString {

public static int findingDistance(String list[] , String word1 , String word2) {

	    	          int a=-1 , b=-1;    
	    	          
	    	  // traverse the array, check which  index position word matched with given words
	    	   // pointed that difference.
	    	  
	    	  for(int i=0; i< list.length; i++) {
	    		  
	    		  if(list[i]== word1) {
	    			  a= i;
	    		  }else if( list[i]==word2) {
	    			  b=i;
	    		  }
	    		  }    	  
	    	  return b-a;
	      }


	public static void main(String[] args) {
		
		int  diff =  findingDistance(new String[] {"the", "quick", "brown", "fox", "quick" , "ankit","red"}, "quick" , "fox");
		
		System.out.println("Difference between the words  :: "+diff);
	
	}

}
